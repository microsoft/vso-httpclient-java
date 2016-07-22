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
public class ResultUpdateRequestModel {

    private TestActionResultModel[] actionResultDeletes;
    private TestActionResultModel[] actionResults;
    private TestResultParameterModel[] parameterDeletes;
    private TestResultParameterModel[] parameters;
    private TestCaseResultUpdateModel testCaseResult;

    public TestActionResultModel[] getActionResultDeletes() {
        return actionResultDeletes;
    }

    public void setActionResultDeletes(final TestActionResultModel[] actionResultDeletes) {
        this.actionResultDeletes = actionResultDeletes;
    }

    public TestActionResultModel[] getActionResults() {
        return actionResults;
    }

    public void setActionResults(final TestActionResultModel[] actionResults) {
        this.actionResults = actionResults;
    }

    public TestResultParameterModel[] getParameterDeletes() {
        return parameterDeletes;
    }

    public void setParameterDeletes(final TestResultParameterModel[] parameterDeletes) {
        this.parameterDeletes = parameterDeletes;
    }

    public TestResultParameterModel[] getParameters() {
        return parameters;
    }

    public void setParameters(final TestResultParameterModel[] parameters) {
        this.parameters = parameters;
    }

    public TestCaseResultUpdateModel getTestCaseResult() {
        return testCaseResult;
    }

    public void setTestCaseResult(final TestCaseResultUpdateModel testCaseResult) {
        this.testCaseResult = testCaseResult;
    }
}
