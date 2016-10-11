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
public class AggregatedResultsDifference {

    private String increaseInDuration;
    private int increaseInFailures;
    private int increaseInOtherTests;
    private int increaseInPassedTests;
    private int increaseInTotalTests;

    public String getIncreaseInDuration() {
        return increaseInDuration;
    }

    public void setIncreaseInDuration(final String increaseInDuration) {
        this.increaseInDuration = increaseInDuration;
    }

    public int getIncreaseInFailures() {
        return increaseInFailures;
    }

    public void setIncreaseInFailures(final int increaseInFailures) {
        this.increaseInFailures = increaseInFailures;
    }

    public int getIncreaseInOtherTests() {
        return increaseInOtherTests;
    }

    public void setIncreaseInOtherTests(final int increaseInOtherTests) {
        this.increaseInOtherTests = increaseInOtherTests;
    }

    public int getIncreaseInPassedTests() {
        return increaseInPassedTests;
    }

    public void setIncreaseInPassedTests(final int increaseInPassedTests) {
        this.increaseInPassedTests = increaseInPassedTests;
    }

    public int getIncreaseInTotalTests() {
        return increaseInTotalTests;
    }

    public void setIncreaseInTotalTests(final int increaseInTotalTests) {
        this.increaseInTotalTests = increaseInTotalTests;
    }
}
