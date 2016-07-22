package com.microsoft.alm.client;

public enum HttpMethod {
    PATCH("PATCH", true), //$NON-NLS-1$
    GET("GET", false), //$NON-NLS-1$
    POST("POST", false), //$NON-NLS-1$
    PUT("PUT", true), //$NON-NLS-1$
    DELETE("DELETE", true), //$NON-NLS-1$
    HEAD("HEAD", false), //$NON-NLS-1$
    OPTIONS("OPTIONS", true); //$NON-NLS-1$

    private String verb;
    private boolean overrideable;

    private HttpMethod(final String verb, final boolean overrideable) {
        this.verb = verb;
        this.overrideable = overrideable;
    }

    public boolean isOverrideable() {
        return this.overrideable;
    }

    public String getVerb() {
        return this.verb;
    }
}