package com.microsoft.alm.client.entitytypes;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.alm.client.TestUtil;

public class JObjectSample3 {
    private List<String> fieldA;
    private String fieldB;
    private int[] fieldC;

    public JObjectSample3() {}

    private JObjectSample3(final List<String> fieldA, final String fieldB, final int[] fieldC) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    public List<String> getFieldA() {
        return fieldA;
    }

    public void setFieldA(final List<String> fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(final String fieldB) {
        this.fieldB = fieldB;
    }

    public int[] getFieldC() {
        return fieldC;
    }

    public void setFieldC(final int[] fieldC) {
        this.fieldC = fieldC;
    }

    public static JObjectSample3 getRandomSample() {
        final int n = TestUtil.getRandomInt(1, 3);
        final List<String> l = new ArrayList<String>(n);
        final String s = TestUtil.getRandomString();
        final int m = TestUtil.getRandomInt(1, 3);
        final int[] a = new int[m];

        final JObjectSample3 o = new JObjectSample3(l, s, a);

        for (int i = 1; i < n; i++) {
            o.getFieldA().add(TestUtil.getRandomString());
        }

        for (int i = 1; i < m; i++) {
            a[i] = TestUtil.getRandomInt();
        }

        return o;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof JObjectSample3)) {
            return false;
        }

        final JObjectSample3 o = (JObjectSample3) obj;

        if (fieldA.size() != o.getFieldA().size()) {
            return false;
        }

        for (int i = 0; i < fieldA.size(); i++) {
            if (!fieldA.get(i).equals(o.getFieldA().get(i))) {
                return false;
            }
        }

        if (!fieldB.equals(o.getFieldB())) {
            return false;
        }

        for (int i = 0; i < fieldC.length; i++) {
            if (fieldC[i] != o.getFieldC()[i]) {
                return false;
            }
        }

        return true;
    }
}
