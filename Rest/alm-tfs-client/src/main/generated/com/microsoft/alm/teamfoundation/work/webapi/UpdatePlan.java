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
 */
public class UpdatePlan {

    /**
    * Card settings such as fields and rules
    */
    private CardSettings cardSettings;
    /**
    * Description of the plan
    */
    private String description;
    /**
    * Name of the plan to create.
    */
    private String name;
    /**
    * Plan properties.
    */
    private Object properties;
    /**
    * Revision of the plan that was updated - the value used here should match the one the server gave the client in the Plan.
    */
    private int revision;

    /**
    * Card settings such as fields and rules
    */
    public CardSettings getCardSettings() {
        return cardSettings;
    }

    /**
    * Card settings such as fields and rules
    */
    public void setCardSettings(final CardSettings cardSettings) {
        this.cardSettings = cardSettings;
    }

    /**
    * Description of the plan
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of the plan
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Name of the plan to create.
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the plan to create.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Plan properties.
    */
    public Object getProperties() {
        return properties;
    }

    /**
    * Plan properties.
    */
    public void setProperties(final Object properties) {
        this.properties = properties;
    }

    /**
    * Revision of the plan that was updated - the value used here should match the one the server gave the client in the Plan.
    */
    public int getRevision() {
        return revision;
    }

    /**
    * Revision of the plan that was updated - the value used here should match the one the server gave the client in the Plan.
    */
    public void setRevision(final int revision) {
        this.revision = revision;
    }
}
