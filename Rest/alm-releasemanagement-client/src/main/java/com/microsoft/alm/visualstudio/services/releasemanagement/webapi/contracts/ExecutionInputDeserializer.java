package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExecutionInputDeserializer extends JsonDeserializer<ExecutionInput> {

    @Override
    public ExecutionInput deserialize(JsonParser parser, DeserializationContext context)
        throws IOException,
            JsonProcessingException {
        final ObjectMapper mapper = (ObjectMapper) parser.getCodec();
        final JsonNode rootNode = (JsonNode) mapper.readTree(parser);

        final JsonNode typeNode = rootNode.findValue("ParallelExecutionType"); //$NON-NLS-1$
        ExecutionInput result = null;

        if (typeNode != null) {

            if (typeNode.isInt() && typeNode.asInt() == ParallelExecutionTypes.MULTI_CONFIGURATION.getValue()) {
                result = rootNode.traverse(mapper).readValueAs(MultiConfigInput.class);
                result.setParallelExecutionType(ParallelExecutionTypes.MULTI_CONFIGURATION);
            } else if (typeNode.isInt() && typeNode.asInt() == ParallelExecutionTypes.MULTI_MACHINE.getValue()) {
                result = rootNode.traverse(mapper).readValueAs(MultiMachineInput.class);
                result.setParallelExecutionType(ParallelExecutionTypes.MULTI_MACHINE);
            } else if (typeNode.isInt() && typeNode.asInt() == ParallelExecutionTypes.NONE.getValue()) {
                result = rootNode.traverse(mapper).readValueAs(ExecutionInput.class);
                result.setParallelExecutionType(ParallelExecutionTypes.NONE);
            } else if (typeNode.isTextual()
                && ParallelExecutionTypes.MULTI_CONFIGURATION.toString().equalsIgnoreCase(typeNode.asText())) {
                result = rootNode.traverse(mapper).readValueAs(MultiConfigInput.class);
                result.setParallelExecutionType(ParallelExecutionTypes.MULTI_CONFIGURATION);
            } else if (typeNode.isTextual()
                && ParallelExecutionTypes.MULTI_MACHINE.toString().equalsIgnoreCase(typeNode.asText())) {
                result = rootNode.traverse(mapper).readValueAs(MultiMachineInput.class);
                result.setParallelExecutionType(ParallelExecutionTypes.MULTI_MACHINE);
            } else if (typeNode.isTextual()
                && ParallelExecutionTypes.NONE.toString().equalsIgnoreCase(typeNode.asText())) {
                result = rootNode.traverse(mapper).readValueAs(ExecutionInput.class);
                result.setParallelExecutionType(ParallelExecutionTypes.NONE);
            }
        }

        return result;
    }
}
