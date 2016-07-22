// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.model;

@SuppressWarnings("serial")
public class VssServiceResponseException extends VssServiceException {

    final int statusCode;

    public VssServiceResponseException(final int statusCode, final String message, final Exception innerException) {
        super(message, innerException);
        this.statusCode = statusCode;
    }
}
