// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.json.serialization;

import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Test;

import com.microsoft.alm.teamfoundation.build.webapi.DemandEquals;
import com.microsoft.alm.teamfoundation.build.webapi.DemandExists;
import com.microsoft.alm.client.TestUtil;
import com.microsoft.alm.client.entitytypes.EntityWithBuildDemands;

public class BuildDemandTest
    extends TestCase {

    @Test
    public void testBuildDemandDeserialization1()
        throws IOException {
        final DemandExists dl = new DemandExists("abc"); //$NON-NLS-1$
        final DemandEquals d2 = new DemandEquals("abc", "xyz"); //$NON-NLS-1$ //$NON-NLS-2$

        final EntityWithBuildDemands e1 = new EntityWithBuildDemands();
        e1.setFieldA("aaa"); //$NON-NLS-1$
        e1.setDemand1(dl);
        e1.setFieldB(true);
        e1.setDemand2(d2);
        e1.setFieldC(1);

        final String s = TestUtil.toJsonString(e1);

        final Object e2 = TestUtil.fromJsonString(s, EntityWithBuildDemands.class);

        assertTrue("Returned type is EntityWithBuildDemands", e2 instanceof EntityWithBuildDemands); //$NON-NLS-1$
        assertEquals("Submitted and returned values", e1, e2); //$NON-NLS-1$
    }
}
