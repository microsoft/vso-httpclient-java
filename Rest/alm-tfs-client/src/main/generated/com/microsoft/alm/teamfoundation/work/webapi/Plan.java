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
    * Date when the plan was created
    */
    private Date createdDate;
    /**
    * Id of the plan
    */
    private UUID id;
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
    * Type of the plan
    */
    private PlanType type;
    /**
    * The resource url to locate the plan via rest api
    */
    private String url;

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
