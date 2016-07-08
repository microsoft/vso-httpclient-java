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

import java.util.Map;

/** 
 */
public class AttributesContainer {

    private Map<String, ProfileAttribute> attributes;
    private String containerName;
    private int revision;

    public Map<String, ProfileAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(final Map<String, ProfileAttribute> attributes) {
        this.attributes = attributes;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(final String containerName) {
        this.containerName = containerName;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }
}
