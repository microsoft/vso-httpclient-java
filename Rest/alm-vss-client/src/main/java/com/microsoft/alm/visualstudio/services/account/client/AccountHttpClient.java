// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.account.client;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.microsoft.alm.client.VssRestClientHandler;
import com.microsoft.alm.visualstudio.services.account.Account;

public class AccountHttpClient extends AccountHttpClientBase {

    public AccountHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    public List<Account> getAccounts(final UUID memberId) {
        return super.getAccounts(null, null, memberId, null, null, null);
    }
}
