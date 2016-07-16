// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.build.webapi;

import com.microsoft.alm.client.utils.ArgumentUtility;

public class DemandEquals extends Demand {

    public DemandEquals(final String name, final String value) {
        super(name, value);
        ArgumentUtility.checkStringForNullOrEmpty(value, "value"); //$NON-NLS-1$
    }

    @Override
    public Demand clone() {
        return new DemandEquals(this.getName(), this.getValue());
    }

    @Override
    protected String getExpression() {
        return this.getName() + " -equals " + this.getValue(); //$NON-NLS-1$
    }
}
