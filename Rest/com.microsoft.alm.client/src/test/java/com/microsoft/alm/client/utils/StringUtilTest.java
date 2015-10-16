package com.microsoft.alm.client.utils;

import junit.framework.TestCase;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by arukhlin on 6/19/2015.
 */
public class StringUtilTest
        extends TestCase {

    public void testIsNullOrEmpty() {
        assertTrue(StringUtil.isNullOrEmpty(null));
        assertTrue(StringUtil.isNullOrEmpty(""));
        assertFalse(StringUtil.isNullOrEmpty("abc"));
    }

    public void testJoin() {
        final List<String> v1 = Arrays.asList("abc", "cde", "fgh");
        final String r1 = StringUtil.join(",", v1);
        assertTrue("abc,cde,fgh".equals(r1));

        final String r2 = StringUtil.join("...", v1);
        assertTrue("abc...cde...fgh".equals(r2));

        final List<Integer> v2 = Arrays.asList(1, 2, 3);
        final String r3 = StringUtil.join(",", v2);
        assertTrue("1,2,3".equals(r3));

        final List<?> v3 = Arrays.asList(1, "abc", true);
        final String r4 = StringUtil.join(",", v3);
        assertTrue("1,abc,true".equals(r4));
    }

    public void testScrubPassword() {
        testScrubPassword("message1 with password: Password={0}");
        testScrubPassword("message2 with password: Password=''{0}''");
        testScrubPassword("message3 with password: Password=\"{0}\"");
        testScrubPassword("message4 with password: Password={0};");
        testScrubPassword("message5 with password: Password=''{0}'';");
        testScrubPassword("message6 with password: Password=\"{0}\";");
        testScrubPassword("message7 with password: Password={0};xxx");
        testScrubPassword("message8 with password: Password=''{0}'';xxx");
        testScrubPassword("message9 with password: Password=\"{0}\";xxx");
        testScrubPassword("message11 with password: AccountKey={0}");
        testScrubPassword("message12 with password: AccountKey=''{0}''");
        testScrubPassword("message13 with password: AccountKey=\"{0}\"");
        testScrubPassword("message14 with password: AccountKey={0};");
        testScrubPassword("message15 with password: AccountKey=''{0}'';");
        testScrubPassword("message16 with password: AccountKey=\"{0}\";");
        testScrubPassword("message17 with password: AccountKey={0};xxx");
        testScrubPassword("message18 with password: AccountKey=''{0}'';xxx");
        testScrubPassword("message19 with password: AccountKey=\"{0}\";xxx");
        testScrubPassword("message21 with password: Pwd={0}");
        testScrubPassword("message22 with password: Pwd=''{0}''");
        testScrubPassword("message23 with password: Pwd=\"{0}\"");
        testScrubPassword("message24 with password: Pwd={0};");
        testScrubPassword("message25 with password: Pwd=''{0}'';");
        testScrubPassword("message26 with password: Pwd=\"{0}\";");
        testScrubPassword("message27 with password: Pwd={0};xxx");
        testScrubPassword("message28 with password: Pwd=''{0}'';xxx");
        testScrubPassword("message29 with password: Pwd=\"{0}\";xxx");
    }

    private void testScrubPassword(final String msgFormat) {
        final String s1 = MessageFormat.format(msgFormat, "aaa bbb");
        final String s2 = StringUtil.scrubPassword(s1, false);

        assertTrue(s2.indexOf("aaa bbb") < 0);
    }

    public void testNewString() {
        assertEquals(StringUtil.newString('a', 3), "aaa");
        assertEquals(StringUtil.newString('Щ', 5), "ЩЩЩЩЩ");
        assertEquals(StringUtil.newString('b', 0), StringUtil.EMPTY);
    }

    public void testPad() {
        String s;

        s = StringUtil.pad("abc", 10, true, '*');
        assertEquals("abc*******", s);

        s = StringUtil.pad("abc", 10, false, '*');
        assertEquals("*******abc", s);

        s = StringUtil.pad(123, 10);
        assertEquals("       123", s);

        s = StringUtil.pad(123, 10, '*');
        assertEquals("*******123", s);
    }
}
