// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.UUID;

/** 
 */
public class EmailRecipients {

    private String[] emailAddresses;
    private UUID[] tfsIds;

    public String[] getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(final String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public UUID[] getTfsIds() {
        return tfsIds;
    }

    public void setTfsIds(final UUID[] tfsIds) {
        this.tfsIds = tfsIds;
    }
}
