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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.ArrayList;

/** 
 * Card settings, such as fields and rules
 * 
 */
public class CardSettings {

    /**
    * A collection of settings related to rendering of fields on cards
    */
    private ArrayList<FieldSetting> fields;

    /**
    * A collection of settings related to rendering of fields on cards
    */
    public ArrayList<FieldSetting> getFields() {
        return fields;
    }

    /**
    * A collection of settings related to rendering of fields on cards
    */
    public void setFields(final ArrayList<FieldSetting> fields) {
        this.fields = fields;
    }
}
