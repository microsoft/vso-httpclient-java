// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.Map;

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

    @Override
    public boolean IsSatisfied(Map<String, String> capabilities) {
        return capabilities.containsKey(this.getName());
    }
}
