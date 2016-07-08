// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.model;

import com.microsoft.alm.client.Messages;

public class ProxyAuthenticationRequiredException
    extends VssException {

    public ProxyAuthenticationRequiredException() {
        super(Messages.getString("ProxyAuthenticationRequiredException.ErrorMessage")); //$NON-NLS-1$
        setHelpLink("http://go.microsoft.com/fwlink/?LinkID=324097"); //$NON-NLS-1$
    }
}
