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

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 * An audit log entry for an extension
 * 
 */
public class ExtensionAuditLogEntry {

    /**
    * Change that was made to extension
    */
    private String auditAction;
    /**
    * Date at which the change was made
    */
    private Date auditDate;
    /**
    * Extra information about the change
    */
    private String comment;
    /**
    * Represents the user who made the change
    */
    private IdentityRef updatedBy;

    /**
    * Change that was made to extension
    */
    public String getAuditAction() {
        return auditAction;
    }

    /**
    * Change that was made to extension
    */
    public void setAuditAction(final String auditAction) {
        this.auditAction = auditAction;
    }

    /**
    * Date at which the change was made
    */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
    * Date at which the change was made
    */
    public void setAuditDate(final Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
    * Extra information about the change
    */
    public String getComment() {
        return comment;
    }

    /**
    * Extra information about the change
    */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    /**
    * Represents the user who made the change
    */
    public IdentityRef getUpdatedBy() {
        return updatedBy;
    }

    /**
    * Represents the user who made the change
    */
    public void setUpdatedBy(final IdentityRef updatedBy) {
        this.updatedBy = updatedBy;
    }
}
