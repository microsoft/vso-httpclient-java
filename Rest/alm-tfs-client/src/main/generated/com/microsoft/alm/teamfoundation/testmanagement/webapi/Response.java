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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.UUID;
import com.system.net.HttpStatusCode;

/** 
 */
public class Response {

    private String error;
    private UUID id;
    private HttpStatusCode status;
    private String url;

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public HttpStatusCode getStatus() {
        return status;
    }

    public void setStatus(final HttpStatusCode status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
