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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;


/** 
 */
public enum DeploymentOperationStatus {

    UNDEFINED(0),
    QUEUED(1),
    SCHEDULED(2),
    PENDING(4),
    APPROVED(8),
    REJECTED(16),
    DEFERRED(32),
    QUEUED_FOR_AGENT(64),
    PHASE_IN_PROGRESS(128),
    PHASE_SUCCEEDED(256),
    PHASE_PARTIALLY_SUCCEEDED(512),
    PHASE_FAILED(1024),
    CANCELED(2048),
    PHASE_CANCELED(4096),
    MANUAL_INTERVENTION_PENDING(8192),
    ;

    private int value;

    private DeploymentOperationStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNDEFINED")) { //$NON-NLS-1$
            return "undefined"; //$NON-NLS-1$
        }

        if (name.equals("QUEUED")) { //$NON-NLS-1$
            return "queued"; //$NON-NLS-1$
        }

        if (name.equals("SCHEDULED")) { //$NON-NLS-1$
            return "scheduled"; //$NON-NLS-1$
        }

        if (name.equals("PENDING")) { //$NON-NLS-1$
            return "pending"; //$NON-NLS-1$
        }

        if (name.equals("APPROVED")) { //$NON-NLS-1$
            return "approved"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED")) { //$NON-NLS-1$
            return "rejected"; //$NON-NLS-1$
        }

        if (name.equals("DEFERRED")) { //$NON-NLS-1$
            return "deferred"; //$NON-NLS-1$
        }

        if (name.equals("QUEUED_FOR_AGENT")) { //$NON-NLS-1$
            return "queuedForAgent"; //$NON-NLS-1$
        }

        if (name.equals("PHASE_IN_PROGRESS")) { //$NON-NLS-1$
            return "phaseInProgress"; //$NON-NLS-1$
        }

        if (name.equals("PHASE_SUCCEEDED")) { //$NON-NLS-1$
            return "phaseSucceeded"; //$NON-NLS-1$
        }

        if (name.equals("PHASE_PARTIALLY_SUCCEEDED")) { //$NON-NLS-1$
            return "phasePartiallySucceeded"; //$NON-NLS-1$
        }

        if (name.equals("PHASE_FAILED")) { //$NON-NLS-1$
            return "phaseFailed"; //$NON-NLS-1$
        }

        if (name.equals("CANCELED")) { //$NON-NLS-1$
            return "canceled"; //$NON-NLS-1$
        }

        if (name.equals("PHASE_CANCELED")) { //$NON-NLS-1$
            return "phaseCanceled"; //$NON-NLS-1$
        }

        if (name.equals("MANUAL_INTERVENTION_PENDING")) { //$NON-NLS-1$
            return "manualInterventionPending"; //$NON-NLS-1$
        }

        return null;
    }
}
