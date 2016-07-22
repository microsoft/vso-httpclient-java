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
public enum TestRunSubstate {

    NONE(0),
    CREATING_ENVIRONMENT(1),
    RUNNING_TESTS(2),
    CANCELED_BY_USER(3),
    ABORTED_BY_SYSTEM(4),
    TIMED_OUT(5),
    PENDING_ANALYSIS(6),
    ANALYZED(7),
    CANCELLATION_IN_PROGRESS(8),
    ;

    private int value;

    private TestRunSubstate(final int value) {
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

        if (name.equals("CREATING_ENVIRONMENT")) { //$NON-NLS-1$
            return "creatingEnvironment"; //$NON-NLS-1$
        }

        if (name.equals("RUNNING_TESTS")) { //$NON-NLS-1$
            return "runningTests"; //$NON-NLS-1$
        }

        if (name.equals("CANCELED_BY_USER")) { //$NON-NLS-1$
            return "canceledByUser"; //$NON-NLS-1$
        }

        if (name.equals("ABORTED_BY_SYSTEM")) { //$NON-NLS-1$
            return "abortedBySystem"; //$NON-NLS-1$
        }

        if (name.equals("TIMED_OUT")) { //$NON-NLS-1$
            return "timedOut"; //$NON-NLS-1$
        }

        if (name.equals("PENDING_ANALYSIS")) { //$NON-NLS-1$
            return "pendingAnalysis"; //$NON-NLS-1$
        }

        if (name.equals("ANALYZED")) { //$NON-NLS-1$
            return "analyzed"; //$NON-NLS-1$
        }

        if (name.equals("CANCELLATION_IN_PROGRESS")) { //$NON-NLS-1$
            return "cancellationInProgress"; //$NON-NLS-1$
        }

        return null;
    }
}
