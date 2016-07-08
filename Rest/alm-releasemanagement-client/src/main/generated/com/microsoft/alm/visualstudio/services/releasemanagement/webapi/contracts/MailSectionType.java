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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public enum MailSectionType {

    DETAILS(0),
    ENVIRONMENTS(1),
    ISSUES(2),
    TEST_RESULTS(3),
    WORK_ITEMS(4),
    RELEASE_INFO(5),
    ;

    private int value;

    private MailSectionType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("DETAILS")) { //$NON-NLS-1$
            return "details"; //$NON-NLS-1$
        }

        if (name.equals("ENVIRONMENTS")) { //$NON-NLS-1$
            return "environments"; //$NON-NLS-1$
        }

        if (name.equals("ISSUES")) { //$NON-NLS-1$
            return "issues"; //$NON-NLS-1$
        }

        if (name.equals("TEST_RESULTS")) { //$NON-NLS-1$
            return "testResults"; //$NON-NLS-1$
        }

        if (name.equals("WORK_ITEMS")) { //$NON-NLS-1$
            return "workItems"; //$NON-NLS-1$
        }

        if (name.equals("RELEASE_INFO")) { //$NON-NLS-1$
            return "releaseInfo"; //$NON-NLS-1$
        }

        return null;
    }
}
