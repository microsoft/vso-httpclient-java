// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.io.IOException;
import java.text.MessageFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.microsoft.alm.client.Messages;

public class TaskOrchestrationItemSerializer extends JsonSerializer<TaskOrchestrationItem> {

    /**
     * {@inheritDoc}
     */
    @Override
    public void serialize(TaskOrchestrationItem value, JsonGenerator writer, SerializerProvider provider)
        throws IOException,
            JsonProcessingException {
        if (value instanceof TaskOrchestrationContainer) {
            final TaskOrchestrationContainer v = (TaskOrchestrationContainer) value;
            writer.writeObject(v);
        } else if (value instanceof TaskOrchestrationJob) {
            final TaskOrchestrationJob v = (TaskOrchestrationJob) value;
            writer.writeObject(v);
        } else {
            throw new UnsupportedOperationException(
                MessageFormat.format(
                    Messages.getString("Serializer.NotImplementedFormat"), //$NON-NLS-1$
                    value.getClass().getName()));
        }
    }

}
