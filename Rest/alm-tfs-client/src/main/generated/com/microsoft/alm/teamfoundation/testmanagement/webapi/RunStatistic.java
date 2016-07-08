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
public class RunStatistic {

    private int count;
    private String outcome;
    private TestResolutionState resolutionState;
    private String state;

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(final String outcome) {
        this.outcome = outcome;
    }

    public TestResolutionState getResolutionState() {
        return resolutionState;
    }

    public void setResolutionState(final TestResolutionState resolutionState) {
        this.resolutionState = resolutionState;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }
}
