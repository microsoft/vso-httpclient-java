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
 * An ExtensionQuery is used to search the gallery for a set of extensions that match one of many filter values.
 * 
 */
public class ExtensionQuery {

    /**
    * When retrieving extensions with a query; frequently the caller only needs a small subset of the assets. The caller may specify a list of asset types that should be returned if the extension contains it. All other assets will not be returned.
    */
    private ArrayList<String> assetTypes;
    /**
    * Each filter is a unique query and will have matching set of extensions returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
    private ArrayList<QueryFilter> filters;
    /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched extensions.
    */
    private ExtensionQueryFlags flags;

    /**
    * When retrieving extensions with a query; frequently the caller only needs a small subset of the assets. The caller may specify a list of asset types that should be returned if the extension contains it. All other assets will not be returned.
    */
    public ArrayList<String> getAssetTypes() {
        return assetTypes;
    }

    /**
    * When retrieving extensions with a query; frequently the caller only needs a small subset of the assets. The caller may specify a list of asset types that should be returned if the extension contains it. All other assets will not be returned.
    */
    public void setAssetTypes(final ArrayList<String> assetTypes) {
        this.assetTypes = assetTypes;
    }

    /**
    * Each filter is a unique query and will have matching set of extensions returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
    public ArrayList<QueryFilter> getFilters() {
        return filters;
    }

    /**
    * Each filter is a unique query and will have matching set of extensions returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
    public void setFilters(final ArrayList<QueryFilter> filters) {
        this.filters = filters;
    }

    /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched extensions.
    */
    public ExtensionQueryFlags getFlags() {
        return flags;
    }

    /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched extensions.
    */
    public void setFlags(final ExtensionQueryFlags flags) {
        this.flags = flags;
    }
}
