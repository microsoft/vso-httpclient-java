// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.jaxrs;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.MessageBodyReader;

import junit.framework.TestCase;

import org.junit.Test;

import com.microsoft.alm.client.TestUtil;
import com.microsoft.alm.client.entitytypes.AttributedEntityClass;
import com.microsoft.alm.client.entitytypes.EnumFieldClass;
import com.microsoft.alm.client.entitytypes.EnumerationSample;
import com.microsoft.alm.client.entitytypes.SimpleEntityClass;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public class EntityProviderTests extends TestCase {

    @Override
    protected void setUp() throws Exception {
        TestUtil.setUp(getName());
    }

    @Override
    protected void tearDown() throws Exception {
        TestUtil.tearDown(getName());
    }

    @Test
    public void testIsReadable() {
        final MessageBodyReader<Object> bodyProvider = new ApiResourceEntityProvider();

        final String applicationZip = "application/zip"; //$NON-NLS-1$
        final MediaType applicationZipType = new MediaType("application", "zip"); //$NON-NLS-1$ //$NON-NLS-2$

        assertTrue(
            MediaType.APPLICATION_JSON,
            bodyProvider.isReadable(null, null, null, MediaType.APPLICATION_JSON_TYPE));
        assertFalse(applicationZip, bodyProvider.isReadable(null, null, null, applicationZipType));
        assertFalse(
            MediaType.APPLICATION_ATOM_XML,
            bodyProvider.isReadable(null, null, null, MediaType.APPLICATION_ATOM_XML_TYPE));
        assertFalse(
            MediaType.APPLICATION_FORM_URLENCODED,
            bodyProvider.isReadable(null, null, null, MediaType.APPLICATION_FORM_URLENCODED_TYPE));
        assertFalse(
            MediaType.APPLICATION_OCTET_STREAM,
            bodyProvider.isReadable(null, null, null, MediaType.APPLICATION_OCTET_STREAM_TYPE));
        assertFalse(
            MediaType.APPLICATION_SVG_XML,
            bodyProvider.isReadable(null, null, null, MediaType.APPLICATION_SVG_XML_TYPE));
        assertFalse(
            MediaType.APPLICATION_XHTML_XML,
            bodyProvider.isReadable(null, null, null, MediaType.APPLICATION_XHTML_XML_TYPE));
        assertFalse(
            MediaType.MULTIPART_FORM_DATA,
            bodyProvider.isReadable(null, null, null, MediaType.MULTIPART_FORM_DATA_TYPE));
        assertFalse(MediaType.TEXT_HTML, bodyProvider.isReadable(null, null, null, MediaType.TEXT_HTML_TYPE));
        assertFalse(MediaType.TEXT_PLAIN, bodyProvider.isReadable(null, null, null, MediaType.TEXT_PLAIN_TYPE));
        assertFalse(MediaType.TEXT_XML, bodyProvider.isReadable(null, null, null, MediaType.TEXT_XML_TYPE));
        assertFalse(MediaType.WILDCARD, bodyProvider.isReadable(null, null, null, MediaType.WILDCARD_TYPE));
    }

    @Test
    public void testClassEntityReading() throws WebApplicationException, IOException {
        MessageBodyReader<Object> bodyProvider = new ApiResourceEntityProvider();
        final Object v1 = new SimpleEntityClass(1, true, "abc"); //$NON-NLS-1$

        final String s = TestUtil.toJsonString(v1);

        @SuppressWarnings("unchecked")
        final Object v2 = bodyProvider.readFrom(
            (Class<Object>) v1.getClass(),
            (Class<Object>) v1.getClass(),
            null,
            MediaType.APPLICATION_JSON_TYPE,
            null,
            TestUtil.toInputStream(s));

        assertTrue("Returned type is SimpleEntityClass", v2 instanceof SimpleEntityClass); //$NON-NLS-1$
        assertEquals("Submitted and returned values", v1, v2); //$NON-NLS-1$
    }

    @Test
    public void testAttributedClassEntityReading() throws WebApplicationException, IOException {
        MessageBodyReader<Object> bodyProvider = new ApiResourceEntityProvider();
        final Object v1 = new AttributedEntityClass(1, 2);

        final String s = "{\"aField\": 1, \"bField\": 2}"; //$NON-NLS-1$

        @SuppressWarnings("unchecked")
        final Object v2 = bodyProvider.readFrom(
            (Class<Object>) v1.getClass(),
            (Class<Object>) v1.getClass(),
            null,
            MediaType.APPLICATION_JSON_TYPE,
            null,
            TestUtil.toInputStream(s));

        assertTrue("Returned type is AttributedEntityClass", v2 instanceof AttributedEntityClass); //$NON-NLS-1$
        assertEquals("Submitted and returned values", v1, v2); //$NON-NLS-1$
    }

    @Test
    public void testEntityListReading() throws WebApplicationException, IOException {
        MessageBodyReader<Object> bodyProvider = new ApiResourceEntityProvider();

        final List<SimpleEntityClass> l = new ArrayList<SimpleEntityClass>();
        l.add(new SimpleEntityClass(1, true, "abc")); //$NON-NLS-1$
        l.add(new SimpleEntityClass(2, false, "xyz")); //$NON-NLS-1$

        final Object v1 = l;

        final String s = TestUtil.toJsonString(new VssJsonCollectionWrapper<List<SimpleEntityClass>>(l));

        Type genericType = new ParameterizedType() {

            @Override
            public Type getRawType() {
                return List.class;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }

            @Override
            public Type[] getActualTypeArguments() {
                return new Type[] {
                    SimpleEntityClass.class
                };
            }
        };

        @SuppressWarnings("unchecked")
        final Object v2 = bodyProvider.readFrom(
            (Class<Object>) v1.getClass(),
            genericType,
            null,
            MediaType.APPLICATION_JSON_TYPE,
            null,
            TestUtil.toInputStream(s));

        assertTrue("Returned type is List", v2 instanceof List<?>); //$NON-NLS-1$
        assertEquals("Submitted and returned values", v1, v2); //$NON-NLS-1$
    }

    @Test
    public void testEnumEntityReading() throws WebApplicationException, IOException {
        MessageBodyReader<Object> bodyProvider = new ApiResourceEntityProvider();
        final Object v1 = new EnumFieldClass();

        final String s = "{\"fieldA\": \"ofsDelta\", \"fieldB\": \"refDelta\"}"; //$NON-NLS-1$

        @SuppressWarnings("unchecked")
        final Object v2 = bodyProvider.readFrom(
            (Class<Object>) v1.getClass(),
            (Class<Object>) v1.getClass(),
            null,
            MediaType.APPLICATION_JSON_TYPE,
            null,
            TestUtil.toInputStream(s));

        assertTrue("Returned type is AttributedEntityClass", v2 instanceof EnumFieldClass); //$NON-NLS-1$
        assertEquals("Submitted and returned values", EnumerationSample.OFS_DELTA, ((EnumFieldClass) v2).getFieldA()); //$NON-NLS-1$
        assertEquals("Submitted and returned values", EnumerationSample.REF_DELTA, ((EnumFieldClass) v2).getFieldB()); //$NON-NLS-1$
    }
}
