// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.json.serialization;

import java.util.Map;

import com.microsoft.alm.client.entitytypes.AttributedEntityClass;
import com.microsoft.alm.client.utils.JsonHelper;

import junit.framework.TestCase;

/**
 * Created by arukhlin on 6/22/2015.
 */
public class JsonHelperTest extends TestCase {

    public void testQueryParametersMap() {

        final AttributedEntityClass m = new AttributedEntityClass(1, 2);
        final Map<String, String> q = JsonHelper.toQueryParametersMap(m);

        assertNotNull(q);
        assertEquals(2, q.size());

        assertEquals("1", q.get("aField")); //$NON-NLS-1$ //$NON-NLS-2$
        assertEquals("2", q.get("bField")); //$NON-NLS-1$ //$NON-NLS-2$
    }
}
