// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

public class DemandExists extends Demand {

    public DemandExists(final String name) {
        super(name, null);
    }

    @Override
    protected String getExpression() {
        return this.getName();
    }
}
