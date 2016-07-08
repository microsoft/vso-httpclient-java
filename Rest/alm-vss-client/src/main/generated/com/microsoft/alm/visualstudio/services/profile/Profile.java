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

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/** 
 */
public class Profile {

    private AttributesContainer applicationContainer;
    private Map<String, CoreProfileAttribute> coreAttributes;
    private int coreRevision;
    private UUID id;
    private int revision;
    private Date timeStamp;

    public AttributesContainer getApplicationContainer() {
        return applicationContainer;
    }

    public void setApplicationContainer(final AttributesContainer applicationContainer) {
        this.applicationContainer = applicationContainer;
    }

    public Map<String, CoreProfileAttribute> getCoreAttributes() {
        return coreAttributes;
    }

    public void setCoreAttributes(final Map<String, CoreProfileAttribute> coreAttributes) {
        this.coreAttributes = coreAttributes;
    }

    public int getCoreRevision() {
        return coreRevision;
    }

    public void setCoreRevision(final int coreRevision) {
        this.coreRevision = coreRevision;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(final Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
