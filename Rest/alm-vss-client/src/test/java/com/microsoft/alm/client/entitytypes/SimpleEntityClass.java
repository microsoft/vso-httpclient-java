// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.entitytypes;

import java.util.Date;

public class SimpleEntityClass {
    public int intField;
    public boolean boolField;
    public String stringField;
    public Date dateField;

    public SimpleEntityClass() {}

    public SimpleEntityClass(final int intField, final boolean boolField, final String stringField) {
        this(intField, boolField, stringField, new Date());
    }

    public SimpleEntityClass(final int intField, final boolean boolField, final String stringField, Date dateField) {
        this.intField = intField;
        this.boolField = boolField;
        this.stringField = stringField;
        this.dateField = dateField;
    }

    public boolean equals(final SimpleEntityClass s2) {
        return intField == s2.intField && boolField == s2.boolField && stringField.equals(s2.stringField);
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals((SimpleEntityClass) obj);
    }
}
