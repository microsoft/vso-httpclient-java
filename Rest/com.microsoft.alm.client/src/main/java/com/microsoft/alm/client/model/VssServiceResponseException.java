package com.microsoft.alm.client.model;

import javax.ws.rs.core.Response;

public class VssServiceResponseException
    extends VssServiceException {

    final Response.StatusType statusCode;

    public VssServiceResponseException(final Response.StatusType statusCode, final String message,
        final Exception innerException) {
        super(message, innerException);
        this.statusCode = statusCode;
    }
}
