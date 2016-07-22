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

package com.microsoft.alm.teamfoundation.work.webapi;


/** 
 * An abstracted reference to a field
 * 
 */
public class FieldReference {

    /**
    * fieldRefName for the field
    */
    private String referenceName;
    /**
    * Full http link to more information about the field
    */
    private String url;

    /**
    * fieldRefName for the field
    */
    public String getReferenceName() {
        return referenceName;
    }

    /**
    * fieldRefName for the field
    */
    public void setReferenceName(final String referenceName) {
        this.referenceName = referenceName;
    }

    /**
    * Full http link to more information about the field
    */
    public String getUrl() {
        return url;
    }

    /**
    * Full http link to more information about the field
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
