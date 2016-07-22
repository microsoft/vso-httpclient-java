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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class Artifact {

    private String alias;
    private HashMap<String, ArtifactSourceReference> definitionReference;
    private boolean isPrimary;
    private String sourceId;
    private String type;

    public String getAlias() {
        return alias;
    }

    public void setAlias(final String alias) {
        this.alias = alias;
    }

    public HashMap<String, ArtifactSourceReference> getDefinitionReference() {
        return definitionReference;
    }

    public void setDefinitionReference(final HashMap<String, ArtifactSourceReference> definitionReference) {
        this.definitionReference = definitionReference;
    }

    @JsonProperty("isPrimary")
    public boolean isPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setPrimary(final boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(final String sourceId) {
        this.sourceId = sourceId;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
