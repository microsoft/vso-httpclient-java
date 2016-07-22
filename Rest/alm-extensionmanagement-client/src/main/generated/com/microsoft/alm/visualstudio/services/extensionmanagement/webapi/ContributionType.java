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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.util.HashMap;

/** 
 * A contribution type, given by a json schema
 * 
 */
public class ContributionType
    extends ContributionBase {

    /**
    * Controls whether or not contributions of this type have the type indexed for queries. This allows clients to find all extensions that have a contribution of this type.  NOTE: Only TrustedPartners are allowed to specify indexed contribution types.
    */
    private boolean indexed;
    /**
    * Friendly name of the contribution/type
    */
    private String name;
    /**
    * Describes the allowed properties for this contribution type
    */
    private HashMap<String, ContributionPropertyDescription> properties;

    /**
    * Controls whether or not contributions of this type have the type indexed for queries. This allows clients to find all extensions that have a contribution of this type.  NOTE: Only TrustedPartners are allowed to specify indexed contribution types.
    */
    public boolean getIndexed() {
        return indexed;
    }

    /**
    * Controls whether or not contributions of this type have the type indexed for queries. This allows clients to find all extensions that have a contribution of this type.  NOTE: Only TrustedPartners are allowed to specify indexed contribution types.
    */
    public void setIndexed(final boolean indexed) {
        this.indexed = indexed;
    }

    /**
    * Friendly name of the contribution/type
    */
    public String getName() {
        return name;
    }

    /**
    * Friendly name of the contribution/type
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Describes the allowed properties for this contribution type
    */
    public HashMap<String, ContributionPropertyDescription> getProperties() {
        return properties;
    }

    /**
    * Describes the allowed properties for this contribution type
    */
    public void setProperties(final HashMap<String, ContributionPropertyDescription> properties) {
        this.properties = properties;
    }
}
