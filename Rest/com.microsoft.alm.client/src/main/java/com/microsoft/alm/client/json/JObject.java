package com.microsoft.alm.client.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.microsoft.alm.client.json.serialization.JObjectDeserializer;
import com.microsoft.alm.client.json.serialization.JObjectSerializer;

@JsonDeserialize(using = JObjectDeserializer.class)
@JsonSerialize(using = JObjectSerializer.class)
public class JObject {

    JsonNode root;

    public JsonNode getRoot() {
        return root;
    }

    public void setRoot(final JsonNode root) {
        this.root = root;
    }
}
