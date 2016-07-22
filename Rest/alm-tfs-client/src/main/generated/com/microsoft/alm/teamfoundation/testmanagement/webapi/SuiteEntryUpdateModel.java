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
public class SuiteEntryUpdateModel {

    /**
    * Id of child suite in a suite
    */
    private int childSuiteId;
    /**
    * Updated sequence number for the test case or child suite in the suite
    */
    private int sequenceNumber;
    /**
    * Id of a test case in a suite
    */
    private int testCaseId;

    /**
    * Id of child suite in a suite
    */
    public int getChildSuiteId() {
        return childSuiteId;
    }

    /**
    * Id of child suite in a suite
    */
    public void setChildSuiteId(final int childSuiteId) {
        this.childSuiteId = childSuiteId;
    }

    /**
    * Updated sequence number for the test case or child suite in the suite
    */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
    * Updated sequence number for the test case or child suite in the suite
    */
    public void setSequenceNumber(final int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
    * Id of a test case in a suite
    */
    public int getTestCaseId() {
        return testCaseId;
    }

    /**
    * Id of a test case in a suite
    */
    public void setTestCaseId(final int testCaseId) {
        this.testCaseId = testCaseId;
    }
}
