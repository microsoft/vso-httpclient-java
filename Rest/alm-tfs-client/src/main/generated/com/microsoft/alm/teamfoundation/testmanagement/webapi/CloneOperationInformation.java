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

/** 
 */
public class CloneOperationInformation {

    private CloneStatistics cloneStatistics;
    /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
    private Date completionDate;
    /**
    * DateTime when the operation was started
    */
    private Date creationDate;
    /**
    * Shallow reference of the destination
    */
    private ShallowReference destinationObject;
    /**
    * Shallow reference of the destination
    */
    private ShallowReference destinationPlan;
    /**
    * Shallow reference of the destination
    */
    private ShallowReference destinationProject;
    /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
    private String message;
    /**
    * The ID of the operation
    */
    private int opId;
    /**
    * The type of the object generated as a result of the Clone operation
    */
    private ResultObjectType resultObjectType;
    /**
    * Shallow reference of the source
    */
    private ShallowReference sourceObject;
    /**
    * Shallow reference of the source
    */
    private ShallowReference sourcePlan;
    /**
    * Shallow reference of the source
    */
    private ShallowReference sourceProject;
    /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
    private CloneOperationState state;
    /**
    * Url for geting the clone information
    */
    private String url;

    public CloneStatistics getCloneStatistics() {
        return cloneStatistics;
    }

    public void setCloneStatistics(final CloneStatistics cloneStatistics) {
        this.cloneStatistics = cloneStatistics;
    }

    /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
    public Date getCompletionDate() {
        return completionDate;
    }

    /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
    public void setCompletionDate(final Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
    * DateTime when the operation was started
    */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
    * DateTime when the operation was started
    */
    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
    * Shallow reference of the destination
    */
    public ShallowReference getDestinationObject() {
        return destinationObject;
    }

    /**
    * Shallow reference of the destination
    */
    public void setDestinationObject(final ShallowReference destinationObject) {
        this.destinationObject = destinationObject;
    }

    /**
    * Shallow reference of the destination
    */
    public ShallowReference getDestinationPlan() {
        return destinationPlan;
    }

    /**
    * Shallow reference of the destination
    */
    public void setDestinationPlan(final ShallowReference destinationPlan) {
        this.destinationPlan = destinationPlan;
    }

    /**
    * Shallow reference of the destination
    */
    public ShallowReference getDestinationProject() {
        return destinationProject;
    }

    /**
    * Shallow reference of the destination
    */
    public void setDestinationProject(final ShallowReference destinationProject) {
        this.destinationProject = destinationProject;
    }

    /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
    public String getMessage() {
        return message;
    }

    /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
    * The ID of the operation
    */
    public int getOpId() {
        return opId;
    }

    /**
    * The ID of the operation
    */
    public void setOpId(final int opId) {
        this.opId = opId;
    }

    /**
    * The type of the object generated as a result of the Clone operation
    */
    public ResultObjectType getResultObjectType() {
        return resultObjectType;
    }

    /**
    * The type of the object generated as a result of the Clone operation
    */
    public void setResultObjectType(final ResultObjectType resultObjectType) {
        this.resultObjectType = resultObjectType;
    }

    /**
    * Shallow reference of the source
    */
    public ShallowReference getSourceObject() {
        return sourceObject;
    }

    /**
    * Shallow reference of the source
    */
    public void setSourceObject(final ShallowReference sourceObject) {
        this.sourceObject = sourceObject;
    }

    /**
    * Shallow reference of the source
    */
    public ShallowReference getSourcePlan() {
        return sourcePlan;
    }

    /**
    * Shallow reference of the source
    */
    public void setSourcePlan(final ShallowReference sourcePlan) {
        this.sourcePlan = sourcePlan;
    }

    /**
    * Shallow reference of the source
    */
    public ShallowReference getSourceProject() {
        return sourceProject;
    }

    /**
    * Shallow reference of the source
    */
    public void setSourceProject(final ShallowReference sourceProject) {
        this.sourceProject = sourceProject;
    }

    /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
    public CloneOperationState getState() {
        return state;
    }

    /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
    public void setState(final CloneOperationState state) {
        this.state = state;
    }

    /**
    * Url for geting the clone information
    */
    public String getUrl() {
        return url;
    }

    /**
    * Url for geting the clone information
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
