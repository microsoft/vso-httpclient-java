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
 * This is the set of publishers that matched a supplied query through the filters given.
 * 
 */
public class PublisherQueryResult {

    /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
    private ArrayList<PublisherFilterResult> results;

    /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
    public ArrayList<PublisherFilterResult> getResults() {
        return results;
    }

    /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
    public void setResults(final ArrayList<PublisherFilterResult> results) {
        this.results = results;
    }
}
