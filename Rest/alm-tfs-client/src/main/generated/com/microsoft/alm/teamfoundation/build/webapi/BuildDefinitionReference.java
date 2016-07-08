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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class BuildDefinitionReference
    extends DefinitionReference {

    private ReferenceLinks _links;
    /**
    * The author of the definition.
    */
    private IdentityRef authoredBy;
    /**
    * The default branch of this definition
    */
    private String defaultBranch;
    /**
    * If this is a draft definition, it might have a parent
    */
    private DefinitionReference draftOf;
    private List<BuildMetric> metrics;
    /**
    * The quality of the definition document (draft, etc.)
    */
    private DefinitionQuality quality;
    /**
    * The default queue which should be used for requests.
    */
    private AgentPoolQueue queue;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * The author of the definition.
    */
    public IdentityRef getAuthoredBy() {
        return authoredBy;
    }

    /**
    * The author of the definition.
    */
    public void setAuthoredBy(final IdentityRef authoredBy) {
        this.authoredBy = authoredBy;
    }

    /**
    * The default branch of this definition
    */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
    * The default branch of this definition
    */
    public void setDefaultBranch(final String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
    * If this is a draft definition, it might have a parent
    */
    @JsonProperty("draftOf")
    public DefinitionReference getParentDefinition() {
        return draftOf;
    }

    /**
    * If this is a draft definition, it might have a parent
    */
    @JsonProperty("draftOf")
    public void setParentDefinition(final DefinitionReference draftOf) {
        this.draftOf = draftOf;
    }

    public List<BuildMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(final List<BuildMetric> metrics) {
        this.metrics = metrics;
    }

    /**
    * The quality of the definition document (draft, etc.)
    */
    @JsonProperty("quality")
    public DefinitionQuality getDefinitionQuality() {
        return quality;
    }

    /**
    * The quality of the definition document (draft, etc.)
    */
    @JsonProperty("quality")
    public void setDefinitionQuality(final DefinitionQuality quality) {
        this.quality = quality;
    }

    /**
    * The default queue which should be used for requests.
    */
    public AgentPoolQueue getQueue() {
        return queue;
    }

    /**
    * The default queue which should be used for requests.
    */
    public void setQueue(final AgentPoolQueue queue) {
        this.queue = queue;
    }
}
