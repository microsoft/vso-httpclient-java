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

import com.microsoft.alm.client.json.JObject;

/** 
 */
public class AccountPreferencesInternal {

    private JObject culture;
    private JObject language;
    private JObject timeZone;

    public JObject getCulture() {
        return culture;
    }

    public void setCulture(final JObject culture) {
        this.culture = culture;
    }

    public JObject getLanguage() {
        return language;
    }

    public void setLanguage(final JObject language) {
        this.language = language;
    }

    public JObject getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(final JObject timeZone) {
        this.timeZone = timeZone;
    }
}
