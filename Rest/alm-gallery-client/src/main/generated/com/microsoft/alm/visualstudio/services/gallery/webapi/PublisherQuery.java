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
 * An PublisherQuery is used to search the gallery for a set of publishers that match one of many filter values.
 * 
 */
public class PublisherQuery {

    /**
    * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
    private ArrayList<QueryFilter> filters;
    /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
    */
    private PublisherQueryFlags flags;

    /**
    * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
    public ArrayList<QueryFilter> getFilters() {
        return filters;
    }

    /**
    * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
    public void setFilters(final ArrayList<QueryFilter> filters) {
        this.filters = filters;
    }

    /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
    */
    public PublisherQueryFlags getFlags() {
        return flags;
    }

    /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
    */
    public void setFlags(final PublisherQueryFlags flags) {
        this.flags = flags;
    }
}
