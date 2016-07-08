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
 * This is a temporary class to provide the details for the test run environment.
 * 
 */
public class DtlEnvironmentDetails {

    private String csmContent;
    private String csmParameters;
    private String subscriptionName;

    public String getCsmContent() {
        return csmContent;
    }

    public void setCsmContent(final String csmContent) {
        this.csmContent = csmContent;
    }

    public String getCsmParameters() {
        return csmParameters;
    }

    public void setCsmParameters(final String csmParameters) {
        this.csmParameters = csmParameters;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(final String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
}
