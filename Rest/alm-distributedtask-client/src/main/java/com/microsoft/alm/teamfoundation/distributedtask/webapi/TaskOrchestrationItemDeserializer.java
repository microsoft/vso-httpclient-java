// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TaskOrchestrationItemDeserializer
    extends JsonDeserializer<TaskOrchestrationItem>
{

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskOrchestrationItem deserialize(JsonParser parser, DeserializationContext context)
        throws IOException,
            JsonProcessingException
    {

        final ObjectMapper mapper = (ObjectMapper) parser.getCodec();
        final JsonNode rootNode = (JsonNode) mapper.readTree(parser);

        final JsonNode itemTypeNode = rootNode.findValue("ItemType"); //$NON-NLS-1$

        if (itemTypeNode != null)
        {
            TaskOrchestrationItemType itemType = null;

            if (itemTypeNode.isInt() && itemTypeNode.asInt() == TaskOrchestrationItemType.CONTAINER.getValue())
            {
                itemType = TaskOrchestrationItemType.CONTAINER;
            }
            else if (itemTypeNode.isInt() && itemTypeNode.asInt() == TaskOrchestrationItemType.JOB.getValue())
            {
                itemType = TaskOrchestrationItemType.JOB;
            }
            else if (itemTypeNode.isTextual()
                && TaskOrchestrationItemType.CONTAINER.toString().equalsIgnoreCase(itemTypeNode.asText()))
            {
                itemType = TaskOrchestrationItemType.CONTAINER;
            }
            else if (itemTypeNode.isTextual()
                && TaskOrchestrationItemType.JOB.toString().equalsIgnoreCase(itemTypeNode.asText()))
            {
                itemType = TaskOrchestrationItemType.JOB;
            }

            if (TaskOrchestrationItemType.JOB == itemType)
            {
                return rootNode.traverse(mapper).readValueAs(TaskOrchestrationJob.class);
            }

            if (TaskOrchestrationItemType.CONTAINER == itemType)
            {
                return rootNode.traverse(mapper).readValueAs(TaskOrchestrationContainer.class);
            }
        }

        return null;
    }
}
