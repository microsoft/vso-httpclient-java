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

package com.microsoft.alm.visualstudio.services.profile;


/** 
 * Country/region information
 * 
 */
public class ProfileRegion {

    /**
    * The two-letter code defined in ISO 3166 for the country/region.
    */
    private String code;
    /**
    * Localized country/region name
    */
    private String name;

    /**
    * The two-letter code defined in ISO 3166 for the country/region.
    */
    public String getCode() {
        return code;
    }

    /**
    * The two-letter code defined in ISO 3166 for the country/region.
    */
    public void setCode(final String code) {
        this.code = code;
    }

    /**
    * Localized country/region name
    */
    public String getName() {
        return name;
    }

    /**
    * Localized country/region name
    */
    public void setName(final String name) {
        this.name = name;
    }
}
