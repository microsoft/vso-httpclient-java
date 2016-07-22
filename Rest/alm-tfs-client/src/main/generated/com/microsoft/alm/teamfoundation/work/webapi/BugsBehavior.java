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

package com.microsoft.alm.teamfoundation.work.webapi;


/** 
 */
public enum BugsBehavior {

    OFF(0),
    AS_REQUIREMENTS(1),
    AS_TASKS(2),
    ;

    private int value;

    private BugsBehavior(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("OFF")) { //$NON-NLS-1$
            return "off"; //$NON-NLS-1$
        }

        if (name.equals("AS_REQUIREMENTS")) { //$NON-NLS-1$
            return "asRequirements"; //$NON-NLS-1$
        }

        if (name.equals("AS_TASKS")) { //$NON-NLS-1$
            return "asTasks"; //$NON-NLS-1$
        }

        return null;
    }
}
