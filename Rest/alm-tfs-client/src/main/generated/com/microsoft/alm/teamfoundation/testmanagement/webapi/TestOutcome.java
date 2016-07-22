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
public enum TestOutcome {

    /**
    * Only used during an update to preserve the existing value.
    */
    UNSPECIFIED(0),
    /**
    * Test has not been completed, or the test type does not report pass/failure.
    */
    NONE(1),
    /**
    * Test was executed w/o any issues.
    */
    PASSED(2),
    /**
    * Test was executed, but there were issues. Issues may involve exceptions or failed assertions.
    */
    FAILED(3),
    /**
    * Test has completed, but we can&amp;#039;t say if it passed or failed. May be used for aborted tests...
    */
    INCONCLUSIVE(4),
    /**
    * The test timed out
    */
    TIMEOUT(5),
    /**
    * Test was aborted. This was not caused by a user gesture, but rather by a framework decision.
    */
    ABORTED(6),
    /**
    * Test had it chance for been executed but was not, as ITestElement.IsRunnable == false.
    */
    BLOCKED(7),
    /**
    * Test was not executed. This was caused by a user gesture - e.g. user hit stop button.
    */
    NOT_EXECUTED(8),
    /**
    * To be used by Run level results. This is not a failure.
    */
    WARNING(9),
    /**
    * There was a system error while we were trying to execute a test.
    */
    ERROR(10),
    /**
    * Test is Not Applicable for execution.
    */
    NOT_APPLICABLE(11),
    /**
    * Test is paused.
    */
    PAUSED(12),
    /**
    * Test is currently executing. Added this for TCM charts
    */
    IN_PROGRESS(13),
    MAX_VALUE(13),
    ;

    private int value;

    private TestOutcome(final int value) {
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

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("PASSED")) { //$NON-NLS-1$
            return "passed"; //$NON-NLS-1$
        }

        if (name.equals("FAILED")) { //$NON-NLS-1$
            return "failed"; //$NON-NLS-1$
        }

        if (name.equals("INCONCLUSIVE")) { //$NON-NLS-1$
            return "inconclusive"; //$NON-NLS-1$
        }

        if (name.equals("TIMEOUT")) { //$NON-NLS-1$
            return "timeout"; //$NON-NLS-1$
        }

        if (name.equals("ABORTED")) { //$NON-NLS-1$
            return "aborted"; //$NON-NLS-1$
        }

        if (name.equals("BLOCKED")) { //$NON-NLS-1$
            return "blocked"; //$NON-NLS-1$
        }

        if (name.equals("NOT_EXECUTED")) { //$NON-NLS-1$
            return "notExecuted"; //$NON-NLS-1$
        }

        if (name.equals("WARNING")) { //$NON-NLS-1$
            return "warning"; //$NON-NLS-1$
        }

        if (name.equals("ERROR")) { //$NON-NLS-1$
            return "error"; //$NON-NLS-1$
        }

        if (name.equals("NOT_APPLICABLE")) { //$NON-NLS-1$
            return "notApplicable"; //$NON-NLS-1$
        }

        if (name.equals("PAUSED")) { //$NON-NLS-1$
            return "paused"; //$NON-NLS-1$
        }

        if (name.equals("IN_PROGRESS")) { //$NON-NLS-1$
            return "inProgress"; //$NON-NLS-1$
        }

        if (name.equals("MAX_VALUE")) { //$NON-NLS-1$
            return "maxValue"; //$NON-NLS-1$
        }

        return null;
    }
}
