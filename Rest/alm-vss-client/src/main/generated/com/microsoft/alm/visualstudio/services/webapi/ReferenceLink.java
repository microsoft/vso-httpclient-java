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

package com.microsoft.alm.visualstudio.services.webapi;


/** 
 * The class to represent a REST reference link.  Example: { self: { href: &quot;http://localhost:8080/tfs/DefaultCollection/_apis/wit/workItems/1&quot; } }  RFC: http://tools.ietf.org/html/draft-kelly-json-hal-06  The RFC is not fully implemented, additional properties are allowed on the reference link but as of yet we don&#039;t have a need for them.
 * 
 */
public class ReferenceLink {

    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(final String href) {
        this.href = href;
    }
}
