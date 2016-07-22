// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.entitytypes;

import com.microsoft.alm.client.TestUtil;

public class EntityWithoutJObject1 {

    private int fieldA;
    private JObjectSample1 fieldB;
    private String fieldC;

    public EntityWithoutJObject1() {
    }

    private EntityWithoutJObject1(final int fieldA, final JObjectSample1 fieldB, final String fieldC) {
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

    public JObjectSample1 getFieldB() {
        return fieldB;
    }

    public void setFieldB(final JObjectSample1 fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldC() {
        return fieldC;
    }

    public void setFieldC(final String fieldC) {
        this.fieldC = fieldC;
    }

    public static EntityWithoutJObject1 getRandomSample() {
        final int i = TestUtil.getRandomInt();
        final JObjectSample1 j = JObjectSample1.getRandomSample();
        final String s = TestUtil.getRandomString();

        final EntityWithoutJObject1 o = new EntityWithoutJObject1(i, j, s);
        return o;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof EntityWithoutJObject1)) {
            return false;
        }

        final EntityWithoutJObject1 o = (EntityWithoutJObject1) obj;

        if (fieldA != o.getFieldA()) {
            return false;
        }

        if (!fieldB.equals(o.getFieldB())) {
            return false;
        }

        return fieldC.equals(o.getFieldC());
    }
}
