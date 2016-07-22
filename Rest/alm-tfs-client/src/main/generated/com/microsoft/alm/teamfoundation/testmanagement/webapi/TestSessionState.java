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
public enum TestSessionState {

    /**
    * Only used during an update to preserve the existing value.
    */
    UNSPECIFIED(0),
    /**
    * The session is still being created.
    */
    NOT_STARTED(1),
    /**
    * The session is running.
    */
    IN_PROGRESS(2),
    /**
    * The session has paused.
    */
    PAUSED(3),
    /**
    * The session has completed.
    */
    COMPLETED(4),
    ;

    private int value;

    private TestSessionState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNSPECIFIED")) { //$NON-NLS-1$
            return "unspecified"; //$NON-NLS-1$
        }

        if (name.equals("NOT_STARTED")) { //$NON-NLS-1$
            return "notStarted"; //$NON-NLS-1$
        }

        if (name.equals("IN_PROGRESS")) { //$NON-NLS-1$
            return "inProgress"; //$NON-NLS-1$
        }

        if (name.equals("PAUSED")) { //$NON-NLS-1$
            return "paused"; //$NON-NLS-1$
        }

        if (name.equals("COMPLETED")) { //$NON-NLS-1$
            return "completed"; //$NON-NLS-1$
        }

        return null;
    }
}
