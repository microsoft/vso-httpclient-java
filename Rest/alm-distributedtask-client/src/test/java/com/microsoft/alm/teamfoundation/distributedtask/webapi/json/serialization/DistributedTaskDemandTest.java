// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.distributedtask.webapi.json.serialization;

import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Test;

import com.microsoft.alm.teamfoundation.distributedtask.webapi.DemandEquals;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.DemandExists;
import com.microsoft.alm.client.TestUtil;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.entitytypes.EntityWithDistributedTaskDemands;

public class DistributedTaskDemandTest extends TestCase {

    @Test
    public void testBuildDemandDeserialization1() throws IOException {
        final DemandExists dl = new DemandExists("abc"); //$NON-NLS-1$
        final DemandEquals d2 = new DemandEquals("abc", "xyz"); //$NON-NLS-1$ //$NON-NLS-2$

        final EntityWithDistributedTaskDemands e1 = new EntityWithDistributedTaskDemands();
        e1.setFieldA("aaa"); //$NON-NLS-1$
        e1.setDemand1(dl);
        e1.setFieldB(true);
        e1.setDemand2(d2);
        e1.setFieldC(1);

        final String s = TestUtil.toJsonString(e1);

        final Object e2 = TestUtil.fromJsonString(s, EntityWithDistributedTaskDemands.class);

        assertTrue("Returned type is EntityWithDistributedTaskDemands", e2 instanceof EntityWithDistributedTaskDemands); //$NON-NLS-1$
        assertEquals("Submitted and returned values", e1, e2); //$NON-NLS-1$
    }
}
