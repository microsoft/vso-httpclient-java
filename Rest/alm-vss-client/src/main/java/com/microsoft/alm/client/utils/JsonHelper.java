// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.microsoft.alm.client.model.VssServiceException;

public class JsonHelper {
    private final static ObjectMapper objectMapper;
    private final static SimpleDateFormat dateFormat;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        objectMapper.disable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);

        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);

        objectMapper.setSerializationInclusion(Include.NON_NULL);

        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); //$NON-NLS-1$
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC")); //$NON-NLS-1$

        objectMapper.setDateFormat(dateFormat);
    }

    /**
     * Get DateFormat
     * @return DateFormat
     */
    public static DateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * Get ObjectMapper
     * @return ObjectMapper
     */
    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    /**
     * Map to QueryParameters
     * @param model
     * @return
     */
    public static Map<String, String> toQueryParametersMap(final Object model) {
        final ObjectMapper objectMapper = getObjectMapper();

        try {
            return objectMapper.readValue(objectMapper.writeValueAsString(model),
                new TypeReference<Map<String, String>>() {});
        } catch (final Exception e) {
            throw new VssServiceException(e.getMessage(), e);
        }
    }
}
