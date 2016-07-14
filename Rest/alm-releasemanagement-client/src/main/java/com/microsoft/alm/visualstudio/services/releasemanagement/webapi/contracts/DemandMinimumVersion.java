// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import com.microsoft.alm.client.utils.ArgumentUtility;

public class DemandMinimumVersion
    extends Demand {

    public DemandMinimumVersion(final String name, final String value) {
        super(name, value);
        ArgumentUtility.checkStringForNullOrEmpty(value, "value"); //$NON-NLS-1$
    }

    @Override
    protected String getExpression() {
        return this.getName() + " -gtVersion " + this.getValue(); //$NON-NLS-1$
    }
}
