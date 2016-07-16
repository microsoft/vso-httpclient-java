// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.build.webapi;

public class DemandExists extends Demand {

    public DemandExists(final String name) {
        super(name, null);
    }

    @Override
    public Demand clone() {
        return new DemandExists(this.getName());
    }

    @Override
    protected String getExpression() {
        return this.getName();
    }
}
