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


/** 
 * Description about a property of a contribution type
 * 
 */
public class ContributionPropertyDescription {

    /**
    * Description of the property
    */
    private String description;
    /**
    * Name of the property
    */
    private String name;
    /**
    * True if this property is required
    */
    private boolean required;
    /**
    * The type of value used for this property
    */
    private ContributionPropertyType type;

    /**
    * Description of the property
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of the property
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Name of the property
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the property
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * True if this property is required
    */
    public boolean getRequired() {
        return required;
    }

    /**
    * True if this property is required
    */
    public void setRequired(final boolean required) {
        this.required = required;
    }

    /**
    * The type of value used for this property
    */
    public ContributionPropertyType getType() {
        return type;
    }

    /**
    * The type of value used for this property
    */
    public void setType(final ContributionPropertyType type) {
        this.type = type;
    }
}
