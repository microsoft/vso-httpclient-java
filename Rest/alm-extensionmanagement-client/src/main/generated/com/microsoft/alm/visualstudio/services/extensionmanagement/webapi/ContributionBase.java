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

/** 
 * Base class shared by contributions and contribution types
 * 
 */
public class ContributionBase {

    /**
    * Description of the contribution/type
    */
    private String description;
    /**
    * Fully qualified identifier of the contribution/type
    */
    private String id;
    /**
    * VisibleTo can be used to restrict whom can reference a given contribution/type. This value should be a list of publishers or extensions access is restricted too.  Examples: &quot;ms&quot; - Means only the &quot;ms&quot; publisher can reference this. &quot;ms.vss-web&quot; - Means only the &quot;vss-web&quot; extension from the &quot;ms&quot; publisher can reference this.
    */
    private ArrayList<String> visibleTo;

    /**
    * Description of the contribution/type
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of the contribution/type
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Fully qualified identifier of the contribution/type
    */
    public String getId() {
        return id;
    }

    /**
    * Fully qualified identifier of the contribution/type
    */
    public void setId(final String id) {
        this.id = id;
    }

    /**
    * VisibleTo can be used to restrict whom can reference a given contribution/type. This value should be a list of publishers or extensions access is restricted too.  Examples: &amp;quot;ms&amp;quot; - Means only the &amp;quot;ms&amp;quot; publisher can reference this. &amp;quot;ms.vss-web&amp;quot; - Means only the &amp;quot;vss-web&amp;quot; extension from the &amp;quot;ms&amp;quot; publisher can reference this.
    */
    public ArrayList<String> getVisibleTo() {
        return visibleTo;
    }

    /**
    * VisibleTo can be used to restrict whom can reference a given contribution/type. This value should be a list of publishers or extensions access is restricted too.  Examples: &amp;quot;ms&amp;quot; - Means only the &amp;quot;ms&amp;quot; publisher can reference this. &amp;quot;ms.vss-web&amp;quot; - Means only the &amp;quot;vss-web&amp;quot; extension from the &amp;quot;ms&amp;quot; publisher can reference this.
    */
    public void setVisibleTo(final ArrayList<String> visibleTo) {
        this.visibleTo = visibleTo;
    }
}
