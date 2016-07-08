// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.entitytypes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttributedEntityClass {
    private int fieldA;
    private int fieldB;

    public AttributedEntityClass() {}

    public AttributedEntityClass(final int a, final int b) {
        setFieldA(a);
        setFieldB(b);
    }

    @JsonProperty("aField")
    public int getFieldA() {
        return fieldA;
    }

    @JsonProperty("aField")
    public void setFieldA(final int fieldA) {
        this.fieldA = fieldA;
    }

    @JsonProperty("bField")
    public int getFieldB() {
        return fieldB;
    }

    @JsonProperty("bField")
    public void setFieldB(final int fieldB) {
        this.fieldB = fieldB;
    }

    @Override
    public boolean equals(Object obj) {
        final AttributedEntityClass o = (AttributedEntityClass) obj;
        return fieldA == o.getFieldA() && fieldB == o.getFieldB();
    }
}
