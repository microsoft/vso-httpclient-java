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

import java.util.Date;
import java.util.UUID;

/** 
 * Data contract for the plan definition
 * 
 */
public class Plan {

    /**
    * Card settings such as fields and rules
    */
    private CardSettings cardSettings;
    /**
    * Identity when the plan was created. Default to Empty Guid for the existing records before upgrading to ScaledAgileViewComponent4, which means we do not know the identity that created this resource.
    */
    private UUID createdBy;
    /**
    * Date when the plan was created
    */
    private Date createdDate;
    /**
    * Description of the plan
    */
    private String description;
    /**
    * Id of the plan
    */
    private UUID id;
    /**
    * Identity when the plan was last modified.  Default to Empty Guid for the existing records before upgrading to ScaledAgileViewComponent4, which means we do not know the identity that last modified this resource.
    */
    private UUID modifiedBy;
    /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
    private Date modifiedDate;
    /**
    * Name of the plan
    */
    private String name;
    /**
    * OwnerId of the plan, typically same as the TFID of the team under which this plan has been created
    */
    private UUID ownerId;
    /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewProperyCollection.
    */
    private Object properties;
    /**
    * Revision of the plan. Used to safeguard users from overwriting each other&#039;s changes.
    */
    private int revision;
    /**
    * Type of the plan
    */
    private PlanType type;
    /**
    * The resource url to locate the plan via rest api
    */
    private String url;

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
    * Identity when the plan was created. Default to Empty Guid for the existing records before upgrading to ScaledAgileViewComponent4, which means we do not know the identity that created this resource.
    */
    public UUID getCreatedBy() {
        return createdBy;
    }

    /**
    * Identity when the plan was created. Default to Empty Guid for the existing records before upgrading to ScaledAgileViewComponent4, which means we do not know the identity that created this resource.
    */
    public void setCreatedBy(final UUID createdBy) {
        this.createdBy = createdBy;
    }

    /**
    * Date when the plan was created
    */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
    * Date when the plan was created
    */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
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
    * Id of the plan
    */
    public UUID getId() {
        return id;
    }

    /**
    * Id of the plan
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Identity when the plan was last modified.  Default to Empty Guid for the existing records before upgrading to ScaledAgileViewComponent4, which means we do not know the identity that last modified this resource.
    */
    public UUID getModifiedBy() {
        return modifiedBy;
    }

    /**
    * Identity when the plan was last modified.  Default to Empty Guid for the existing records before upgrading to ScaledAgileViewComponent4, which means we do not know the identity that last modified this resource.
    */
    public void setModifiedBy(final UUID modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
    public void setModifiedDate(final Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
    * Name of the plan
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the plan
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * OwnerId of the plan, typically same as the TFID of the team under which this plan has been created
    */
    public UUID getOwnerId() {
        return ownerId;
    }

    /**
    * OwnerId of the plan, typically same as the TFID of the team under which this plan has been created
    */
    public void setOwnerId(final UUID ownerId) {
        this.ownerId = ownerId;
    }

    /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewProperyCollection.
    */
    public Object getProperties() {
        return properties;
    }

    /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewProperyCollection.
    */
    public void setProperties(final Object properties) {
        this.properties = properties;
    }

    /**
    * Revision of the plan. Used to safeguard users from overwriting each other&amp;#039;s changes.
    */
    public int getRevision() {
        return revision;
    }

    /**
    * Revision of the plan. Used to safeguard users from overwriting each other&amp;#039;s changes.
    */
    public void setRevision(final int revision) {
        this.revision = revision;
    }

    /**
    * Type of the plan
    */
    public PlanType getType() {
        return type;
    }

    /**
    * Type of the plan
    */
    public void setType(final PlanType type) {
        this.type = type;
    }

    /**
    * The resource url to locate the plan via rest api
    */
    public String getUrl() {
        return url;
    }

    /**
    * The resource url to locate the plan via rest api
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
