// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.model;

import java.net.URI;
import java.text.MessageFormat;
import java.util.UUID;

import com.microsoft.alm.client.Messages;
import com.microsoft.alm.client.utils.StringUtil;

public class VssResourceNotFoundException
    extends VssServiceException {

    public VssResourceNotFoundException(final UUID locationId) {
        super(MessageFormat.format(Messages.getString("VssResourceNotFoundException.NotRegisteredFormat"), locationId)); //$NON-NLS-1$
    }

    public VssResourceNotFoundException(final UUID locationId, final Exception innerException) {
        super(MessageFormat.format(Messages.getString("VssResourceNotFoundException.NotRegisteredFormat"), locationId) //$NON-NLS-1$
                        + " "   //$NON-NLS-1$
                        + (innerException != null ? innerException.getMessage() : StringUtil.EMPTY),
                innerException);
    }

    public VssResourceNotFoundException(final UUID locationId, final URI serverBaseUri) {
        super(MessageFormat.format(
            Messages.getString("VssResourceNotFoundException.NotRegisteredOnFormat"), locationId, serverBaseUri)); //$NON-NLS-1$
    }

    public VssResourceNotFoundException(final UUID locationId, final URI serverBaseUri, final Exception innerException) {
        super(MessageFormat.format(
            Messages.getString("VssResourceNotFoundException.NotRegisteredOnFormat"), locationId, serverBaseUri)  //$NON-NLS-1$
                        + " "   //$NON-NLS-1$
                        + (innerException != null ? innerException.getMessage() : StringUtil.EMPTY),
            innerException);
    }
}
