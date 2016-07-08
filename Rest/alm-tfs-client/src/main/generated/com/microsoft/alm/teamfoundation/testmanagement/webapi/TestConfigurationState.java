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
public enum TestConfigurationState {

    /**
    * The configuration can be used for new test runs.
    */
    ACTIVE(1),
    /**
    * The configuration has been retired and should not be used for new test runs.
    */
    INACTIVE(2),
    ;

    private int value;

    private TestConfigurationState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ACTIVE")) { //$NON-NLS-1$
            return "active"; //$NON-NLS-1$
        }

        if (name.equals("INACTIVE")) { //$NON-NLS-1$
            return "inactive"; //$NON-NLS-1$
        }

        return null;
    }
}
