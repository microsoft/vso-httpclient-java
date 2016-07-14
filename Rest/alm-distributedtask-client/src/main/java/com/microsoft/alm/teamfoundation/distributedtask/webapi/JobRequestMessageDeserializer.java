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

public class JobRequestMessageDeserializer
    extends JsonDeserializer<JobRequestMessage>
{
    public final static String  AGENT_JOB_REQUEST = "JobRequest"; //$NON-NLS-1$
    public final static String  SERVER_JOB_REQUEST = "ServerJobRequest"; //$NON-NLS-1$

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRequestMessage deserialize(JsonParser parser, DeserializationContext context)
        throws IOException,
            JsonProcessingException
    {

        final ObjectMapper mapper = (ObjectMapper) parser.getCodec();
        final JsonNode rootNode = (JsonNode) mapper.readTree(parser);

        if (rootNode == null) {
            return null;
        }

        Object newValue = null;

        final JsonNode messageTypeNode = rootNode.findValue("MessageType"); //$NON-NLS-1$

        if (messageTypeNode != null && messageTypeNode.isTextual())
        {
            final String messageType =  messageTypeNode.asText();

            if (AGENT_JOB_REQUEST.equalsIgnoreCase(messageTypeNode.asText()))
            {
                return rootNode.traverse(mapper).readValueAs(AgentJobRequestMessage.class);
            }
            else if (SERVER_JOB_REQUEST.equalsIgnoreCase(messageTypeNode.asText()))
            {
                return rootNode.traverse(mapper).readValueAs(ServerJobRequestMessage.class);
            }
        }

        if (rootNode.findValue("RequestId") != null) { //$NON-NLS-1$
            
            return rootNode.traverse(mapper).readValueAs(AgentJobRequestMessage.class);
        }

        return null;
    }
}
