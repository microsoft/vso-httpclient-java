// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.DeployPhaseTypes;

public class DeployPhaseDeserializer extends JsonDeserializer<DeployPhase> {

    @Override
    public DeployPhase deserialize(JsonParser parser, DeserializationContext context)
        throws IOException,
            JsonProcessingException {
        final ObjectMapper mapper = (ObjectMapper) parser.getCodec();
        final JsonNode rootNode = (JsonNode) mapper.readTree(parser);

        final JsonNode typeNode = rootNode.findValue("PhaseType"); //$NON-NLS-1$

        if (typeNode != null) {
            DeployPhaseTypes triggerType = null;

            if (typeNode.isInt() && typeNode.asInt() == DeployPhaseTypes.AGENT_BASED_DEPLOYMENT.getValue()) {
                triggerType = DeployPhaseTypes.AGENT_BASED_DEPLOYMENT;
            } else if (typeNode.isInt() && typeNode.asInt() == DeployPhaseTypes.RUN_ON_SERVER.getValue()) {
                triggerType = DeployPhaseTypes.RUN_ON_SERVER;
            } else if (typeNode.isInt()
                && typeNode.asInt() == DeployPhaseTypes.MACHINE_GROUP_BASED_DEPLOYMENT.getValue()) {
                triggerType = DeployPhaseTypes.MACHINE_GROUP_BASED_DEPLOYMENT;
            } else if (typeNode.isTextual()
                && DeployPhaseTypes.AGENT_BASED_DEPLOYMENT.toString().equalsIgnoreCase(typeNode.asText())) {
                triggerType = DeployPhaseTypes.AGENT_BASED_DEPLOYMENT;
            } else if (typeNode.isTextual()
                && DeployPhaseTypes.RUN_ON_SERVER.toString().equalsIgnoreCase(typeNode.asText())) {
                triggerType = DeployPhaseTypes.RUN_ON_SERVER;
            } else if (typeNode.isTextual()
                && DeployPhaseTypes.MACHINE_GROUP_BASED_DEPLOYMENT.toString().equalsIgnoreCase(typeNode.asText())) {
                triggerType = DeployPhaseTypes.MACHINE_GROUP_BASED_DEPLOYMENT;
            }

            if (DeployPhaseTypes.AGENT_BASED_DEPLOYMENT == triggerType) {
                return rootNode.traverse(mapper).readValueAs(AgentBasedDeployPhase.class);
            }

            if (DeployPhaseTypes.RUN_ON_SERVER == triggerType) {
                return rootNode.traverse(mapper).readValueAs(RunOnServerDeployPhase.class);
            }

            if (DeployPhaseTypes.MACHINE_GROUP_BASED_DEPLOYMENT == triggerType) {
                return rootNode.traverse(mapper).readValueAs(MachineGroupBasedDeployPhase.class);
            }
        }

        return null;
    }
}
