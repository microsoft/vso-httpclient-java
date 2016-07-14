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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.util.ArrayList;
import java.util.HashMap;

/** 
 * Result structure from calls to GetDataProviderData
 * 
 */
public class DataProviderResult {

    /**
    * Property bag of data keyed off of the data provider contribution id
    */
    private HashMap<String, Object> data;
    /**
    * List of data providers resolved in the data-provider query
    */
    private ArrayList<ResolvedDataProvider> resolvedProviders;

    /**
    * Property bag of data keyed off of the data provider contribution id
    */
    public HashMap<String, Object> getData() {
        return data;
    }

    /**
    * Property bag of data keyed off of the data provider contribution id
    */
    public void setData(final HashMap<String, Object> data) {
        this.data = data;
    }

    /**
    * List of data providers resolved in the data-provider query
    */
    public ArrayList<ResolvedDataProvider> getResolvedProviders() {
        return resolvedProviders;
    }

    /**
    * List of data providers resolved in the data-provider query
    */
    public void setResolvedProviders(final ArrayList<ResolvedDataProvider> resolvedProviders) {
        this.resolvedProviders = resolvedProviders;
    }
}
