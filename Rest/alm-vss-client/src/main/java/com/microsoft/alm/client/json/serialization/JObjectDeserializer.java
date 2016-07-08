// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.json.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.alm.client.json.JObject;

public class JObjectDeserializer
    extends JsonDeserializer<JObject> {

    @Override
    public JObject deserialize(JsonParser parser, DeserializationContext context)
        throws IOException,
            JsonProcessingException {

        final JObject result = new JObject();

        final ObjectMapper mapper = (ObjectMapper) parser.getCodec();
        result.setRoot((JsonNode) mapper.readTree(parser));

        return result;
    }

}
