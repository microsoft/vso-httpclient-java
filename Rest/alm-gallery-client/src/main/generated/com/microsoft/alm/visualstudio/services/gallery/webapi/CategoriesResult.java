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

import java.util.ArrayList;

/** 
 * This is the set of categories in response to the get category query
 * 
 */
public class CategoriesResult {

    private ArrayList<ExtensionCategory> categories;

    public ArrayList<ExtensionCategory> getCategories() {
        return categories;
    }

    public void setCategories(final ArrayList<ExtensionCategory> categories) {
        this.categories = categories;
    }
}
