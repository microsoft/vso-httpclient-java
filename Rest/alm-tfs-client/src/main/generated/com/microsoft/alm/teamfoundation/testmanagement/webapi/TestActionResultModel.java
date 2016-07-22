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


/** 
 */
public class TestActionResultModel
    extends TestResultModelBase {

    private String actionPath;
    private int iterationId;
    private SharedStepModel sharedStepModel;
    private String url;

    public String getActionPath() {
        return actionPath;
    }

    public void setActionPath(final String actionPath) {
        this.actionPath = actionPath;
    }

    public int getIterationId() {
        return iterationId;
    }

    public void setIterationId(final int iterationId) {
        this.iterationId = iterationId;
    }

    public SharedStepModel getSharedStepModel() {
        return sharedStepModel;
    }

    public void setSharedStepModel(final SharedStepModel sharedStepModel) {
        this.sharedStepModel = sharedStepModel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
