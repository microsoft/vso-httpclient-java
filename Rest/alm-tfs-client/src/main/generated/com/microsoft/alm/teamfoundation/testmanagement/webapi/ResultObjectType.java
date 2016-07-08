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
public enum ResultObjectType {

    TEST_SUITE((byte) 0),
    TEST_PLAN((byte) 1),
    ;

    private byte value;

    private ResultObjectType(final byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("TEST_SUITE")) { //$NON-NLS-1$
            return "testSuite"; //$NON-NLS-1$
        }

        if (name.equals("TEST_PLAN")) { //$NON-NLS-1$
            return "testPlan"; //$NON-NLS-1$
        }

        return null;
    }
}
