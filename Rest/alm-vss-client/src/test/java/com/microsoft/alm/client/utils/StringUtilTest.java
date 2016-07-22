// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.utils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

/**
 * Created by arukhlin on 6/19/2015.
 */
public class StringUtilTest extends TestCase {

    public void testIsNullOrEmpty() {
        assertTrue(StringUtil.isNullOrEmpty(null));
        assertTrue(StringUtil.isNullOrEmpty("")); //$NON-NLS-1$
        assertFalse(StringUtil.isNullOrEmpty("abc")); //$NON-NLS-1$
    }

    public void testJoin() {
        final List<String> v1 = Arrays.asList("abc", "cde", "fgh"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        final String r1 = StringUtil.join(",", v1); //$NON-NLS-1$
        assertTrue("abc,cde,fgh".equals(r1)); //$NON-NLS-1$

        final String r2 = StringUtil.join("...", v1); //$NON-NLS-1$
        assertTrue("abc...cde...fgh".equals(r2)); //$NON-NLS-1$

        final List<Integer> v2 = Arrays.asList(1, 2, 3);
        final String r3 = StringUtil.join(",", v2); //$NON-NLS-1$
        assertTrue("1,2,3".equals(r3)); //$NON-NLS-1$

        final List<Object> v3 = new ArrayList<Object>();
        v3.add(1);
        v3.add("abc"); //$NON-NLS-1$
        v3.add(true);
        final String r4 = StringUtil.join(",", v3); //$NON-NLS-1$
        assertTrue("1,abc,true".equals(r4)); //$NON-NLS-1$
    }

    public void testScrubPassword() {
        testScrubPassword("message1 with password: Password={0}"); //$NON-NLS-1$
        testScrubPassword("message2 with password: Password=''{0}''"); //$NON-NLS-1$
        testScrubPassword("message3 with password: Password=\"{0}\""); //$NON-NLS-1$
        testScrubPassword("message4 with password: Password={0};"); //$NON-NLS-1$
        testScrubPassword("message5 with password: Password=''{0}'';"); //$NON-NLS-1$
        testScrubPassword("message6 with password: Password=\"{0}\";"); //$NON-NLS-1$
        testScrubPassword("message7 with password: Password={0};xxx"); //$NON-NLS-1$
        testScrubPassword("message8 with password: Password=''{0}'';xxx"); //$NON-NLS-1$
        testScrubPassword("message9 with password: Password=\"{0}\";xxx"); //$NON-NLS-1$
        testScrubPassword("message11 with password: AccountKey={0}"); //$NON-NLS-1$
        testScrubPassword("message12 with password: AccountKey=''{0}''"); //$NON-NLS-1$
        testScrubPassword("message13 with password: AccountKey=\"{0}\""); //$NON-NLS-1$
        testScrubPassword("message14 with password: AccountKey={0};"); //$NON-NLS-1$
        testScrubPassword("message15 with password: AccountKey=''{0}'';"); //$NON-NLS-1$
        testScrubPassword("message16 with password: AccountKey=\"{0}\";"); //$NON-NLS-1$
        testScrubPassword("message17 with password: AccountKey={0};xxx"); //$NON-NLS-1$
        testScrubPassword("message18 with password: AccountKey=''{0}'';xxx"); //$NON-NLS-1$
        testScrubPassword("message19 with password: AccountKey=\"{0}\";xxx"); //$NON-NLS-1$
        testScrubPassword("message21 with password: Pwd={0}"); //$NON-NLS-1$
        testScrubPassword("message22 with password: Pwd=''{0}''"); //$NON-NLS-1$
        testScrubPassword("message23 with password: Pwd=\"{0}\""); //$NON-NLS-1$
        testScrubPassword("message24 with password: Pwd={0};"); //$NON-NLS-1$
        testScrubPassword("message25 with password: Pwd=''{0}'';"); //$NON-NLS-1$
        testScrubPassword("message26 with password: Pwd=\"{0}\";"); //$NON-NLS-1$
        testScrubPassword("message27 with password: Pwd={0};xxx"); //$NON-NLS-1$
        testScrubPassword("message28 with password: Pwd=''{0}'';xxx"); //$NON-NLS-1$
        testScrubPassword("message29 with password: Pwd=\"{0}\";xxx"); //$NON-NLS-1$
    }

    private void testScrubPassword(final String msgFormat) {
        final String s1 = MessageFormat.format(msgFormat, "aaa bbb"); //$NON-NLS-1$
        final String s2 = StringUtil.scrubPassword(s1, false);

        assertTrue(s2.indexOf("aaa bbb") < 0); //$NON-NLS-1$
    }

    public void testNewString() {
        assertEquals(StringUtil.newString('a', 3), "aaa"); //$NON-NLS-1$
        assertEquals(StringUtil.newString('Щ', 5), "ЩЩЩЩЩ"); //$NON-NLS-1$
        assertEquals(StringUtil.newString('b', 0), StringUtil.EMPTY);
    }

    public void testPad() {
        String s;

        s = StringUtil.pad("abc", 10, true, '*'); //$NON-NLS-1$
        assertEquals("abc*******", s); //$NON-NLS-1$

        s = StringUtil.pad("abc", 10, false, '*'); //$NON-NLS-1$
        assertEquals("*******abc", s); //$NON-NLS-1$

        s = StringUtil.pad(123, 10);
        assertEquals("       123", s); //$NON-NLS-1$

        s = StringUtil.pad(123, 10, '*');
        assertEquals("*******123", s); //$NON-NLS-1$
    }
}
