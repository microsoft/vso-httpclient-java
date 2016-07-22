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

import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class PointAssignment {

    private ShallowReference configuration;
    private IdentityRef tester;

    public ShallowReference getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final ShallowReference configuration) {
        this.configuration = configuration;
    }

    public IdentityRef getTester() {
        return tester;
    }

    public void setTester(final IdentityRef tester) {
        this.tester = tester;
    }
}
