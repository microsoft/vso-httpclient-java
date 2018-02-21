// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.webapi;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.alm.client.Messages;
import com.microsoft.alm.client.utils.StringUtil;

public class PropertiesCollectionDeserializer extends JsonDeserializer<PropertiesCollection> {

    /**
     * Deserializes JSON to PropertiesCollection
     * 
     * @param parser
     * @param context
     * @return PropertiesCollection
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
    public PropertiesCollection deserialize(final JsonParser parser, final DeserializationContext context)
        throws IOException,
            JsonProcessingException {

        final PropertiesCollection result = new PropertiesCollection();

        if (parser.getCurrentToken().equals(JsonToken.START_OBJECT)) {

            while (parser.nextToken() != JsonToken.END_OBJECT) {
                // Read the property collection key. We know this is a string
                // because the JsonReader validates that the first token
                // is a property name, and it has to be a string.
                final String propertyKey = parser.getCurrentName();

                if (StringUtil.isNullOrEmpty(propertyKey)) {
                    throw new IOException(
                        Messages.getString("PropertiesCollectionDeserializer.InvalidPropertiesCollection")); //$NON-NLS-1$
                }

                // Now read the typed value
                parser.nextToken();
                TypedValue typedValue = parser.readValueAs(TypedValue.class);
                result.put(propertyKey, typedValue.value);
            }

        } else {
            // consume this stream
            final ObjectMapper mapper = (ObjectMapper) parser.getCodec();
            mapper.readTree(parser);
        }

        return result;
    }

    public static class TypedValue {
        @JsonProperty("$type")
        public String type;
        @JsonProperty("$value")
        public String value;
    }
}
