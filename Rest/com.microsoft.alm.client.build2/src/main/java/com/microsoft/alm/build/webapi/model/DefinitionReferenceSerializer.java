package com.microsoft.alm.build.webapi.model;

import java.io.IOException;
import java.text.MessageFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.microsoft.alm.client.Messages;

/**
 * 
 * 
 * @author arukhlin
 */
public class DefinitionReferenceSerializer
    extends JsonSerializer<DefinitionReference>
{

    /**
     * {@inheritDoc}
     */
    @Override
    public void serialize(DefinitionReference value, JsonGenerator writer, SerializerProvider provider)
        throws IOException,
            JsonProcessingException
    {
        if (value instanceof XamlBuildDefinition)
        {
            final XamlBuildDefinition v = (XamlBuildDefinition) value;
            writer.writeObject(v);
        }
        else if (value instanceof BuildDefinition)
        {
            final BuildDefinition v = (BuildDefinition) value;
            writer.writeObject(v);
        }
        else if (value instanceof BuildDefinitionReference)
        {
            final BuildDefinitionReference v = (BuildDefinitionReference) value;
            writer.writeObject(v);
        }
        else
        {
            throw new UnsupportedOperationException(MessageFormat.format(
                Messages.getString("Serializer.NotImplementedFormat"), //$NON-NLS-1$
                value.getClass().getName()));
        }
    }
}
