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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;


/** 
 */
public enum TaskAgentQueueActionFilter {

    NONE(0),
    MANAGE(2),
    USE(16),
    ;

    private int value;

    private TaskAgentQueueActionFilter(final int value) {
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

        if (name.equals("MANAGE")) { //$NON-NLS-1$
            return "manage"; //$NON-NLS-1$
        }

        if (name.equals("USE")) { //$NON-NLS-1$
            return "use"; //$NON-NLS-1$
        }

        return null;
    }
}
