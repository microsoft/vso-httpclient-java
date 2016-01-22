/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.workitemtracking.webapi.models;


/** 
 */
public class WorkItemTypeTemplateUpdateModel {

    private ProvisioningActionType actionType;
    private String methodology;
    private String template;
    private TemplateType templateType;

    public ProvisioningActionType getActionType() {
        return actionType;
    }

    public void setActionType(final ProvisioningActionType actionType) {
        this.actionType = actionType;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(final String methodology) {
        this.methodology = methodology;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(final String template) {
        this.template = template;
    }

    public TemplateType getTemplateType() {
        return templateType;
    }

    public void setTemplateType(final TemplateType templateType) {
        this.templateType = templateType;
    }
}
