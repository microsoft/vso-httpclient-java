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

package com.microsoft.alm.teamfoundation.policy.webapi;


/** 
 */
public enum PolicyEvaluationStatus {

    QUEUED(0),
    RUNNING(1),
    APPROVED(2),
    REJECTED(3),
    NOT_APPLICABLE(4),
    BROKEN(5),
    ;

    private int value;

    private PolicyEvaluationStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("QUEUED")) { //$NON-NLS-1$
            return "queued"; //$NON-NLS-1$
        }

        if (name.equals("RUNNING")) { //$NON-NLS-1$
            return "running"; //$NON-NLS-1$
        }

        if (name.equals("APPROVED")) { //$NON-NLS-1$
            return "approved"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED")) { //$NON-NLS-1$
            return "rejected"; //$NON-NLS-1$
        }

        if (name.equals("NOT_APPLICABLE")) { //$NON-NLS-1$
            return "notApplicable"; //$NON-NLS-1$
        }

        if (name.equals("BROKEN")) { //$NON-NLS-1$
            return "broken"; //$NON-NLS-1$
        }

        return null;
    }
}
