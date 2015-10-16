package com.microsoft.alm.client.entitytypes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.microsoft.alm.client.TestUtil;

public class JObjectSample2 {
    private Map<String, Integer> fieldA;
    private String fieldB;

    public JObjectSample2() {}

    private JObjectSample2(final Map<String, Integer> fieldA, final String fieldB) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
    }

    public Map<String, Integer> getFieldA() {
        return fieldA;
    }

    public void setFieldA(final Map<String, Integer> fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(final String fieldB) {
        this.fieldB = fieldB;
    }

    public static JObjectSample2 getRandomSample() {
        final int n = TestUtil.getRandomInt(1, 3);
        final Map<String, Integer> m = new HashMap<String, Integer>(n);
        final String s = TestUtil.getRandomString();

        final JObjectSample2 o = new JObjectSample2(m, s);

        for (int i = 1; i < n; i++) {
            o.getFieldA().put(TestUtil.getRandomString(), TestUtil.getRandomInt());
        }

        return o;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof JObjectSample2)) {
            return false;
        }

        final JObjectSample2 o = (JObjectSample2) obj;

        if (fieldA.size() != o.getFieldA().size()) {
            return false;
        }

        for (final Entry<String, Integer> e : o.getFieldA().entrySet()) {
            if (!fieldA.containsKey(e.getKey()) || !fieldA.get(e.getKey()).equals(e.getValue())) {
                return false;
            }
        }

        return fieldB.equals(o.getFieldB());
    }
}
