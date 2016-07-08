// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.json.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.microsoft.alm.client.json.JObject;

public class JObjectSerializer
    extends JsonSerializer<JObject> {

    @Override
    public void serialize(JObject value, JsonGenerator writer, SerializerProvider serializer)
        throws IOException,
            JsonProcessingException {
        writer.writeTree(value.getRoot());
    }

}
