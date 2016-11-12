package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.microsoft.alm.client.Messages;

public class ExecutionInputSerializer extends JsonSerializer<ExecutionInput> {

    @Override
    public void serialize(ExecutionInput value, JsonGenerator writer, SerializerProvider serializer) {
        throw new UnsupportedOperationException(
            MessageFormat.format(
                Messages.getString("Serializer.NotImplementedFormat"), //$NON-NLS-1$
                value.getClass().getName()));
    }
}
