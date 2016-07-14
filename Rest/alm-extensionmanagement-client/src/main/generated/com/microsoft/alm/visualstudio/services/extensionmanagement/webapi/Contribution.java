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

import java.util.ArrayList;
import com.fasterxml.jackson.databind.node.ObjectNode;

/** 
 * An individual contribution made by an extension
 * 
 */
public class Contribution
    extends ContributionBase {

    /**
    * List of constraints (filters) that should be applied to the availability of this contribution
    */
    private ArrayList<ContributionConstraint> constraints;
    /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
    private ArrayList<String> includes;
    /**
    * Properties/attributes of this contribution
    */
    private ObjectNode properties;
    /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
    private ArrayList<String> targets;
    /**
    * Id of the Contribution Type
    */
    private String type;

    /**
    * List of constraints (filters) that should be applied to the availability of this contribution
    */
    public ArrayList<ContributionConstraint> getConstraints() {
        return constraints;
    }

    /**
    * List of constraints (filters) that should be applied to the availability of this contribution
    */
    public void setConstraints(final ArrayList<ContributionConstraint> constraints) {
        this.constraints = constraints;
    }

    /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
    public ArrayList<String> getIncludes() {
        return includes;
    }

    /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
    public void setIncludes(final ArrayList<String> includes) {
        this.includes = includes;
    }

    /**
    * Properties/attributes of this contribution
    */
    public ObjectNode getProperties() {
        return properties;
    }

    /**
    * Properties/attributes of this contribution
    */
    public void setProperties(final ObjectNode properties) {
        this.properties = properties;
    }

    /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
    public ArrayList<String> getTargets() {
        return targets;
    }

    /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
    public void setTargets(final ArrayList<String> targets) {
        this.targets = targets;
    }

    /**
    * Id of the Contribution Type
    */
    public String getType() {
        return type;
    }

    /**
    * Id of the Contribution Type
    */
    public void setType(final String type) {
        this.type = type;
    }
}
