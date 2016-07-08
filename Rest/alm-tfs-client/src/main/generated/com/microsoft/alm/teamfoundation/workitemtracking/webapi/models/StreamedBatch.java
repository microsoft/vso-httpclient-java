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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class StreamedBatch<T> {

    private String continuationToken;
    private boolean isLastBatch;
    private String nextLink;
    private List<T> values;

    public String getContinuationToken() {
        return continuationToken;
    }

    public void setContinuationToken(final String continuationToken) {
        this.continuationToken = continuationToken;
    }

    @JsonProperty("isLastBatch")
    public boolean isLastBatch() {
        return isLastBatch;
    }

    @JsonProperty("isLastBatch")
    public void setLastBatch(final boolean isLastBatch) {
        this.isLastBatch = isLastBatch;
    }

    public String getNextLink() {
        return nextLink;
    }

    public void setNextLink(final String nextLink) {
        this.nextLink = nextLink;
    }

    public List<T> getValues() {
        return values;
    }

    public void setValues(final List<T> values) {
        this.values = values;
    }
}
