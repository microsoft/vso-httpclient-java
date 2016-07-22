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

package com.microsoft.alm.visualstudio.services.account.client;

import com.fasterxml.jackson.databind.node.ObjectNode;

/** 
 */
public class AccountPreferencesInternal {

    private ObjectNode culture;
    private ObjectNode language;
    private ObjectNode timeZone;

    public ObjectNode getCulture() {
        return culture;
    }

    public void setCulture(final ObjectNode culture) {
        this.culture = culture;
    }

    public ObjectNode getLanguage() {
        return language;
    }

    public void setLanguage(final ObjectNode language) {
        this.language = language;
    }

    public ObjectNode getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(final ObjectNode timeZone) {
        this.timeZone = timeZone;
    }
}
