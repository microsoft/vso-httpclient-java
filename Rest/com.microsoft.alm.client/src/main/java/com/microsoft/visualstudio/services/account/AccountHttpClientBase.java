// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.visualstudio.services.account;

import com.microsoft.alm.client.AlmHttpClientBase;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Placeholder class
 *
 * Should convert to generated class in the future
 */
public class AccountHttpClientBase
        extends AlmHttpClientBase {

    private static final  Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
     * Create a new instance of DelegatedAuthorizationHttpClientBase
     *
     * @param jaxrsClient
     *            an initialized instance of a JAX-RS Client implementation
     * @param baseUrl
     *            a TFS project collection URL
     */
    protected AccountHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
     * Create a new instance of DelegatedAuthorizationHttpClientBase
     *
     * @param tfsConnection
     *            an initialized instance of a TfsTeamProjectCollection
     */
    protected AccountHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }
}
