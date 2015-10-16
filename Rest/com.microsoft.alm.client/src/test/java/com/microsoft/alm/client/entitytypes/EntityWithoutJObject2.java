package com.microsoft.alm.client.entitytypes;

import com.microsoft.alm.client.TestUtil;

public class EntityWithoutJObject2 {

    private int fieldA;
    private JObjectSample2 fieldB;
    private String fieldC;

    public EntityWithoutJObject2() {}

    private EntityWithoutJObject2(final int fieldA, final JObjectSample2 fieldB, final String fieldC) {
        super();
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(final int fieldA) {
        this.fieldA = fieldA;
    }

    public JObjectSample2 getFieldB() {
        return fieldB;
    }

    public void setFieldB(final JObjectSample2 fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldC() {
        return fieldC;
    }

    public void setFieldC(final String fieldC) {
        this.fieldC = fieldC;
    }

    public static EntityWithoutJObject2 getRandomSample() {
        final int i = TestUtil.getRandomInt();
        final JObjectSample2 j = JObjectSample2.getRandomSample();
        final String s = TestUtil.getRandomString();

        final EntityWithoutJObject2 o = new EntityWithoutJObject2(i, j, s);
        return o;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof EntityWithoutJObject2)) {
            return false;
        }

        final EntityWithoutJObject2 o = (EntityWithoutJObject2) obj;

        if (fieldA != o.getFieldA()) {
            return false;
        }

        if (!fieldB.equals(o.getFieldB())) {
            return false;
        }

        return fieldC.equals(o.getFieldC());
    }
}
