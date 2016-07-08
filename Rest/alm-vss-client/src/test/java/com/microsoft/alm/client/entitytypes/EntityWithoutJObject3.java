// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.entitytypes;

import com.microsoft.alm.client.TestUtil;

public class EntityWithoutJObject3 {

    private int fieldA;
    private JObjectSample3 fieldB;
    private String fieldC;

    public EntityWithoutJObject3() {}

    private EntityWithoutJObject3(final int fieldA, final JObjectSample3 fieldB, final String fieldC) {
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

    public JObjectSample3 getFieldB() {
        return fieldB;
    }

    public void setFieldB(final JObjectSample3 fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldC() {
        return fieldC;
    }

    public void setFieldC(final String fieldC) {
        this.fieldC = fieldC;
    }

    public static EntityWithoutJObject3 getRandomSample() {
        final int i = TestUtil.getRandomInt();
        final JObjectSample3 j = JObjectSample3.getRandomSample();
        final String s = TestUtil.getRandomString();

        final EntityWithoutJObject3 o = new EntityWithoutJObject3(i, j, s);
        return o;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof EntityWithoutJObject3)) {
            return false;
        }

        final EntityWithoutJObject3 o = (EntityWithoutJObject3) obj;

        if (fieldA != o.getFieldA()) {
            return false;
        }

        if (!fieldB.equals(o.getFieldB())) {
            return false;
        }

        return fieldC.equals(o.getFieldC());
    }
}
