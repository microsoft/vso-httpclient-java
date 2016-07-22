// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReleaseTriggerBaseDeserializer extends JsonDeserializer<ReleaseTriggerBase> {

    @Override
    public ReleaseTriggerBase deserialize(JsonParser parser, DeserializationContext context)
        throws IOException,
            JsonProcessingException {
        final ObjectMapper mapper = (ObjectMapper) parser.getCodec();
        final JsonNode rootNode = (JsonNode) mapper.readTree(parser);

        final JsonNode typeNode = rootNode.findValue("TriggerType"); //$NON-NLS-1$

        if (typeNode != null) {
            ReleaseTriggerType triggerType = null;

            if (typeNode.isInt() && typeNode.asInt() == ReleaseTriggerType.ARTIFACT_SOURCE.getValue()) {
                triggerType = ReleaseTriggerType.ARTIFACT_SOURCE;
            } else if (typeNode.isInt() && typeNode.asInt() == ReleaseTriggerType.SCHEDULE.getValue()) {
                triggerType = ReleaseTriggerType.SCHEDULE;
            } else if (typeNode.isTextual()
                && ReleaseTriggerType.ARTIFACT_SOURCE.toString().equalsIgnoreCase(typeNode.asText())) {
                triggerType = ReleaseTriggerType.ARTIFACT_SOURCE;
            } else if (typeNode.isTextual()
                && ReleaseTriggerType.SCHEDULE.toString().equalsIgnoreCase(typeNode.asText())) {
                triggerType = ReleaseTriggerType.SCHEDULE;
            }

            if (ReleaseTriggerType.SCHEDULE == triggerType) {
                return rootNode.traverse(mapper).readValueAs(ScheduledReleaseTrigger.class);
            }

            if (ReleaseTriggerType.ARTIFACT_SOURCE == triggerType) {
                return rootNode.traverse(mapper).readValueAs(ArtifactSourceTrigger.class);
            }
        }

        return null;
    }
}
