package com.microsoft.alm.client.json.serialization;

import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Test;

import com.microsoft.alm.client.TestUtil;
import com.microsoft.alm.client.entitytypes.EntityWithJObject;
import com.microsoft.alm.client.entitytypes.EntityWithoutJObject1;
import com.microsoft.alm.client.entitytypes.EntityWithoutJObject2;
import com.microsoft.alm.client.entitytypes.EntityWithoutJObject3;

public class JObjectTest
    extends TestCase {

    @Test
    public void testJObject1()
        throws IOException {
        final EntityWithoutJObject1 e1 = EntityWithoutJObject1.getRandomSample();

        final String s1 = TestUtil.toJsonString(e1);
        final Object e2 = TestUtil.fromJsonString(s1, EntityWithJObject.class);

        final String s2 = TestUtil.toJsonString(e2);
        final Object e3 = TestUtil.fromJsonString(s2, EntityWithoutJObject1.class);

        assertTrue("Returned type is EntityWithoutJObject1", e3 instanceof EntityWithoutJObject1); //$NON-NLS-1$
        assertEquals("Submitted and returned values", e1, e3); //$NON-NLS-1$
    }

    @Test
    public void testJObject2()
        throws IOException {
        final EntityWithoutJObject2 e1 = EntityWithoutJObject2.getRandomSample();

        final String s1 = TestUtil.toJsonString(e1);
        final Object e2 = TestUtil.fromJsonString(s1, EntityWithJObject.class);

        final String s2 = TestUtil.toJsonString(e2);
        final Object e3 = TestUtil.fromJsonString(s2, EntityWithoutJObject2.class);

        assertTrue("Returned type is EntityWithoutJObject2", e3 instanceof EntityWithoutJObject2); //$NON-NLS-1$
        assertEquals("Submitted and returned values", e1, e3); //$NON-NLS-1$
    }

    @Test
    public void testJObject3()
        throws IOException {
        final EntityWithoutJObject3 e1 = EntityWithoutJObject3.getRandomSample();

        final String s1 = TestUtil.toJsonString(e1);
        final Object e2 = TestUtil.fromJsonString(s1, EntityWithJObject.class);

        final String s2 = TestUtil.toJsonString(e2);
        final Object e3 = TestUtil.fromJsonString(s2, EntityWithoutJObject3.class);

        assertTrue("Returned type is EntityWithoutJObject3", e3 instanceof EntityWithoutJObject3); //$NON-NLS-1$
        assertEquals("Submitted and returned values", e1, e3); //$NON-NLS-1$
    }
}
