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
 * The FilterResult is the set of extensions that matched a particular query filter.
 * 
 */
public class ExtensionFilterResult {

    /**
    * This is the set of appplications that matched the query filter supplied.
    */
    private List<PublishedExtension> extensions;
    /**
    * The PagingToken is returned from a request when more records exist that match the result than were requested or could be returned. A follow-up query with this paging token can be used to retrieve more results.
    */
    private String pagingToken;
    /**
    * This is the additional optional metadata for the given result. E.g. Total count of results which is useful in case of paged results
    */
    private List<ExtensionFilterResultMetadata> resultMetadata;

    /**
    * This is the set of appplications that matched the query filter supplied.
    */
    public List<PublishedExtension> getExtensions() {
        return extensions;
    }

    /**
    * This is the set of appplications that matched the query filter supplied.
    */
    public void setExtensions(final List<PublishedExtension> extensions) {
        this.extensions = extensions;
    }

    /**
    * The PagingToken is returned from a request when more records exist that match the result than were requested or could be returned. A follow-up query with this paging token can be used to retrieve more results.
    */
    public String getPagingToken() {
        return pagingToken;
    }

    /**
    * The PagingToken is returned from a request when more records exist that match the result than were requested or could be returned. A follow-up query with this paging token can be used to retrieve more results.
    */
    public void setPagingToken(final String pagingToken) {
        this.pagingToken = pagingToken;
    }

    /**
    * This is the additional optional metadata for the given result. E.g. Total count of results which is useful in case of paged results
    */
    public List<ExtensionFilterResultMetadata> getResultMetadata() {
        return resultMetadata;
    }

    /**
    * This is the additional optional metadata for the given result. E.g. Total count of results which is useful in case of paged results
    */
    public void setResultMetadata(final List<ExtensionFilterResultMetadata> resultMetadata) {
        this.resultMetadata = resultMetadata;
    }
}
