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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestSession {

    /**
    * Area path of the test session
    */
    private ShallowReference area;
    /**
    * Comments in the test session
    */
    private String comment;
    /**
    * Duration of the session
    */
    private Date endDate;
    /**
    * Id of the test session
    */
    private int id;
    /**
    * Last Updated By  Reference
    */
    private IdentityRef lastUpdatedBy;
    /**
    * Last updated date
    */
    private Date lastUpdatedDate;
    /**
    * Owner of the test session
    */
    private IdentityRef owner;
    /**
    * Project to which the test session belongs
    */
    private ShallowReference project;
    /**
    * Generic store for test session data
    */
    private PropertyBag propertyBag;
    /**
    * Revision of the test session
    */
    private int revision;
    /**
    * Source of the test session
    */
    private TestSessionSource source;
    /**
    * Start date
    */
    private Date startDate;
    /**
    * State of the test session
    */
    private TestSessionState state;
    /**
    * Title of the test session
    */
    private String title;
    /**
    * Url of Test Session Resource
    */
    private String url;

    /**
    * Area path of the test session
    */
    public ShallowReference getArea() {
        return area;
    }

    /**
    * Area path of the test session
    */
    public void setArea(final ShallowReference area) {
        this.area = area;
    }

    /**
    * Comments in the test session
    */
    public String getComment() {
        return comment;
    }

    /**
    * Comments in the test session
    */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    /**
    * Duration of the session
    */
    public Date getEndDate() {
        return endDate;
    }

    /**
    * Duration of the session
    */
    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    /**
    * Id of the test session
    */
    public int getId() {
        return id;
    }

    /**
    * Id of the test session
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Last Updated By  Reference
    */
    public IdentityRef getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
    * Last Updated By  Reference
    */
    public void setLastUpdatedBy(final IdentityRef lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
    * Last updated date
    */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
    * Last updated date
    */
    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
    * Owner of the test session
    */
    public IdentityRef getOwner() {
        return owner;
    }

    /**
    * Owner of the test session
    */
    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    /**
    * Project to which the test session belongs
    */
    public ShallowReference getProject() {
        return project;
    }

    /**
    * Project to which the test session belongs
    */
    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    /**
    * Generic store for test session data
    */
    public PropertyBag getPropertyBag() {
        return propertyBag;
    }

    /**
    * Generic store for test session data
    */
    public void setPropertyBag(final PropertyBag propertyBag) {
        this.propertyBag = propertyBag;
    }

    /**
    * Revision of the test session
    */
    public int getRevision() {
        return revision;
    }

    /**
    * Revision of the test session
    */
    public void setRevision(final int revision) {
        this.revision = revision;
    }

    /**
    * Source of the test session
    */
    public TestSessionSource getSource() {
        return source;
    }

    /**
    * Source of the test session
    */
    public void setSource(final TestSessionSource source) {
        this.source = source;
    }

    /**
    * Start date
    */
    public Date getStartDate() {
        return startDate;
    }

    /**
    * Start date
    */
    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    /**
    * State of the test session
    */
    public TestSessionState getState() {
        return state;
    }

    /**
    * State of the test session
    */
    public void setState(final TestSessionState state) {
        this.state = state;
    }

    /**
    * Title of the test session
    */
    public String getTitle() {
        return title;
    }

    /**
    * Title of the test session
    */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
    * Url of Test Session Resource
    */
    public String getUrl() {
        return url;
    }

    /**
    * Url of Test Session Resource
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
