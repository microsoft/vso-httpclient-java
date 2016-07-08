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

import java.util.List;
import java.util.Map;

/** 
 */
public class BoardCardSettings {

    private Map<String, List<FieldSetting>> cards;

    public Map<String, List<FieldSetting>> getCards() {
        return cards;
    }

    public void setCards(final Map<String, List<FieldSetting>> cards) {
        this.cards = cards;
    }
}
