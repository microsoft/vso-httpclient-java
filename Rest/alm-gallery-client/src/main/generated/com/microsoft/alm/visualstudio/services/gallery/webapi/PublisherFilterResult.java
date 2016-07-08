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

import java.util.List;

/** 
 * The FilterResult is the set of publishers that matched a particular query filter.
 * 
 */
public class PublisherFilterResult {

    /**
    * This is the set of appplications that matched the query filter supplied.
    */
    private List<Publisher> publishers;

    /**
    * This is the set of appplications that matched the query filter supplied.
    */
    public List<Publisher> getPublishers() {
        return publishers;
    }

    /**
    * This is the set of appplications that matched the query filter supplied.
    */
    public void setPublishers(final List<Publisher> publishers) {
        this.publishers = publishers;
    }
}
