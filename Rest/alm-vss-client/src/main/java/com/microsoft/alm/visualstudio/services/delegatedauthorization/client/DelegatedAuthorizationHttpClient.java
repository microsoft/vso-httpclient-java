// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.delegatedauthorization.client;

import java.net.URI;
import java.util.Arrays;
import java.util.UUID;

import com.microsoft.alm.client.VssRestClientHandler;
import com.microsoft.alm.client.utils.ArgumentUtility;
import com.microsoft.alm.visualstudio.services.delegatedauthorization.SessionToken;
import com.microsoft.alm.visualstudio.services.delegatedauthorization.SessionTokenScope;
import com.microsoft.alm.visualstudio.services.delegatedauthorization.SessionTokenType;

/**
 * Placeholder class
 *
 * Should convert to generated class in the future
 */
public class DelegatedAuthorizationHttpClient extends DelegatedAuthorizationHttpClientBase {

    public DelegatedAuthorizationHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    /**
     * Create new Personal Access Token
     */
    public SessionToken createSessionToken(final SessionToken sessionToken) {
        ArgumentUtility.checkForNull(sessionToken, "sessionToken"); //$NON-NLS-1$

        return super.createSessionToken(sessionToken, SessionTokenType.COMPACT, null);
    }

    public SessionToken createAccountSessionToken(
        final String displayName,
        final UUID accountId,
        final SessionTokenScope... scopes) {

        final SessionToken token = new SessionToken();

        token.setDisplayName(displayName);
        token.setScope(SessionTokenScope.combine(scopes));
        token.setTargetAccounts(Arrays.asList(new UUID[] {
            accountId
        }));

        return createSessionToken(token);
    }

}
