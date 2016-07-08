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

import java.util.List;
import com.microsoft.alm.client.json.JObject;

/** 
 * Specifies a constraint that can be used to dynamically include/exclude a given contribution
 * 
 */
public class ContributionConstraint {

    /**
    * An optional property that can be specified to group constraints together. All constraints within a group are AND&#039;d together (all must be evaluate to True in order for the contribution to be included). Different groups of constraints are OR&#039;d (only one group needs to evaluate to True for the contribution to be included).
    */
    private int group;
    /**
    * If true, negate the result of the filter (include the contribution if the applied filter returns false instead of true)
    */
    private boolean inverse;
    /**
    * Name of the IContributionFilter class
    */
    private String name;
    /**
    * Properties that are fed to the contribution filter class
    */
    private JObject properties;
    /**
    * Constraints can be optionally be applied to one or more of the relationships defined in the contribution. If no relationships are defined then all relationships are associated with the constraint. This means the default behaviour will elimiate the contribution from the tree completely if the constraint is applied.
    */
    private List<String> relationships;

    /**
    * An optional property that can be specified to group constraints together. All constraints within a group are AND&amp;#039;d together (all must be evaluate to True in order for the contribution to be included). Different groups of constraints are OR&amp;#039;d (only one group needs to evaluate to True for the contribution to be included).
    */
    public int getGroup() {
        return group;
    }

    /**
    * An optional property that can be specified to group constraints together. All constraints within a group are AND&amp;#039;d together (all must be evaluate to True in order for the contribution to be included). Different groups of constraints are OR&amp;#039;d (only one group needs to evaluate to True for the contribution to be included).
    */
    public void setGroup(final int group) {
        this.group = group;
    }

    /**
    * If true, negate the result of the filter (include the contribution if the applied filter returns false instead of true)
    */
    public boolean getInverse() {
        return inverse;
    }

    /**
    * If true, negate the result of the filter (include the contribution if the applied filter returns false instead of true)
    */
    public void setInverse(final boolean inverse) {
        this.inverse = inverse;
    }

    /**
    * Name of the IContributionFilter class
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the IContributionFilter class
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Properties that are fed to the contribution filter class
    */
    public JObject getProperties() {
        return properties;
    }

    /**
    * Properties that are fed to the contribution filter class
    */
    public void setProperties(final JObject properties) {
        this.properties = properties;
    }

    /**
    * Constraints can be optionally be applied to one or more of the relationships defined in the contribution. If no relationships are defined then all relationships are associated with the constraint. This means the default behaviour will elimiate the contribution from the tree completely if the constraint is applied.
    */
    public List<String> getRelationships() {
        return relationships;
    }

    /**
    * Constraints can be optionally be applied to one or more of the relationships defined in the contribution. If no relationships are defined then all relationships are associated with the constraint. This means the default behaviour will elimiate the contribution from the tree completely if the constraint is applied.
    */
    public void setRelationships(final List<String> relationships) {
        this.relationships = relationships;
    }
}
