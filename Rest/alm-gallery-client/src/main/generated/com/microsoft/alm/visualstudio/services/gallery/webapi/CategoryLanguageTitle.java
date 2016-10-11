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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 * Definition of one title of a category
 * 
 */
public class CategoryLanguageTitle {

    /**
    * The language for which the title is applicable
    */
    private String lang;
    /**
    * The language culture id of the lang parameter
    */
    private int lcid;
    /**
    * Actual title to be shown on the UI
    */
    private String title;

    /**
    * The language for which the title is applicable
    */
    public String getLang() {
        return lang;
    }

    /**
    * The language for which the title is applicable
    */
    public void setLang(final String lang) {
        this.lang = lang;
    }

    /**
    * The language culture id of the lang parameter
    */
    public int getLcid() {
        return lcid;
    }

    /**
    * The language culture id of the lang parameter
    */
    public void setLcid(final int lcid) {
        this.lcid = lcid;
    }

    /**
    * Actual title to be shown on the UI
    */
    public String getTitle() {
        return title;
    }

    /**
    * Actual title to be shown on the UI
    */
    public void setTitle(final String title) {
        this.title = title;
    }
}
