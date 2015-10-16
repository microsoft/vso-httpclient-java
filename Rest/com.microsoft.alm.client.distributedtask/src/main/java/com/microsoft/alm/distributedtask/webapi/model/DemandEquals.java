package com.microsoft.alm.distributedtask.webapi.model;

import java.util.Map;

import com.microsoft.alm.client.utils.ArgumentUtility;

public class DemandEquals
    extends Demand {
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

    @Override
    public boolean IsSatisfied(final Map<String, String> capabilities) {
        final String value = capabilities.get(this.getName());
        return value != null && this.getValue().equalsIgnoreCase(value);
    }
}
