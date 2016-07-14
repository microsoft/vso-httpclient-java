// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.io.IOException;
import java.text.MessageFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import com.microsoft.alm.client.Messages;

public class ReleaseTriggerBaseSerializer
    extends JsonSerializer<ReleaseTriggerBase> {

    @Override
    public void serialize(ReleaseTriggerBase value, JsonGenerator writer, SerializerProvider serializer)
        throws IOException,
            JsonProcessingException {
        throw new UnsupportedOperationException(MessageFormat.format(
            Messages.getString("Serializer.NotImplementedFormat"), //$NON-NLS-1$
            value.getClass().getName()));
    }
}
