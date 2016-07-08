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
public enum CustomTestFieldScope {

    NONE(0),
    TEST_RUN(1),
    TEST_RESULT(2),
    SYSTEM(4),
    ALL(7),
    ;

    private int value;

    private CustomTestFieldScope(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("TEST_RUN")) { //$NON-NLS-1$
            return "testRun"; //$NON-NLS-1$
        }

        if (name.equals("TEST_RESULT")) { //$NON-NLS-1$
            return "testResult"; //$NON-NLS-1$
        }

        if (name.equals("SYSTEM")) { //$NON-NLS-1$
            return "system"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
