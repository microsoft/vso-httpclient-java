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

import java.net.URI;
import java.util.Date;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectReference;

/** 
 * A reference to a definition.
 * 
 */
@JsonDeserialize(using = DefinitionReferenceDeserializer.class)
@JsonSerialize(using = DefinitionReferenceSerializer.class)
public class DefinitionReference
    extends ShallowReference {

    /**
    * The date the definition was created
    */
    private Date createdDate;
    /**
    * The path this definitions belongs to
    */
    private String path;
    /**
    * The project.
    */
    private TeamProjectReference project;
    /**
    * If builds can be queued from this definition
    */
    private DefinitionQueueStatus queueStatus;
    /**
    * The definition revision number.
    */
    private int revision;
    /**
    * The type of the definition.
    */
    private DefinitionType type;
    /**
    * The Uri of the definition
    */
    private URI uri;

    /**
    * The date the definition was created
    */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
    * The date the definition was created
    */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
    * The path this definitions belongs to
    */
    public String getPath() {
        return path;
    }

    /**
    * The path this definitions belongs to
    */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
    * The project.
    */
    public TeamProjectReference getProject() {
        return project;
    }

    /**
    * The project.
    */
    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    /**
    * If builds can be queued from this definition
    */
    public DefinitionQueueStatus getQueueStatus() {
        return queueStatus;
    }

    /**
    * If builds can be queued from this definition
    */
    public void setQueueStatus(final DefinitionQueueStatus queueStatus) {
        this.queueStatus = queueStatus;
    }

    /**
    * The definition revision number.
    */
    public int getRevision() {
        return revision;
    }

    /**
    * The definition revision number.
    */
    public void setRevision(final int revision) {
        this.revision = revision;
    }

    /**
    * The type of the definition.
    */
    public DefinitionType getType() {
        return type;
    }

    /**
    * The type of the definition.
    */
    public void setType(final DefinitionType type) {
        this.type = type;
    }

    /**
    * The Uri of the definition
    */
    public URI getUri() {
        return uri;
    }

    /**
    * The Uri of the definition
    */
    public void setUri(final URI uri) {
        this.uri = uri;
    }
}
