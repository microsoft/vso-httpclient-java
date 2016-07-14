// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.entitytypes;

import com.microsoft.alm.teamfoundation.build.webapi.Demand;

public class EntityWithBuildDemands {
    private String fieldA;
    private Demand demand1;
    private boolean fieldB;
    private Demand demand2;
    private int fieldC;

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(final String fieldA) {
        this.fieldA = fieldA;
    }

    public Demand getDemand1() {
        return demand1;
    }

    public void setDemand1(final Demand demand1) {
        this.demand1 = demand1;
    }

    public boolean isFieldB() {
        return fieldB;
    }

    public void setFieldB(final boolean fieldB) {
        this.fieldB = fieldB;
    }

    public Demand getDemand2() {
        return demand2;
    }

    public void setDemand2(final Demand demand2) {
        this.demand2 = demand2;
    }

    public int getFieldC() {
        return fieldC;
    }

    public void setFieldC(final int fieldC) {
        this.fieldC = fieldC;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof EntityWithBuildDemands)) {
            return false;
        }

        final EntityWithBuildDemands o = (EntityWithBuildDemands) obj;

        if (!fieldA.equals(o.getFieldA())) {
            return false;
        }

        if (fieldB != o.isFieldB()) {
            return false;
        }
        if (fieldC != o.getFieldC()) {
            return false;
        }

        if (!demand1.equals(o.getDemand1())) {
            return false;
        }
        return demand2.equals(o.getDemand2());
    }
}
