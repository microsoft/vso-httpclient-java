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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.ArrayList;

/** 
 */
public class GitImportStatusDetail {

    private ArrayList<String> allSteps;
    private int currentStep;
    private String errorMessage;

    public ArrayList<String> getAllSteps() {
        return allSteps;
    }

    public void setAllSteps(final ArrayList<String> allSteps) {
        this.allSteps = allSteps;
    }

    public int getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(final int currentStep) {
        this.currentStep = currentStep;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
