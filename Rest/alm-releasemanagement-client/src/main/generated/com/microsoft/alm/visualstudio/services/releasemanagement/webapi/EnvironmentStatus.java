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
public enum EnvironmentStatus {

    UNDEFINED(0),
    NOT_STARTED(1),
    IN_PROGRESS(2),
    SUCCEEDED(4),
    CANCELED(8),
    REJECTED(16),
    QUEUED(32),
    SCHEDULED(64),
    PARTIALLY_SUCCEEDED(128),
    ;

    private int value;

    private EnvironmentStatus(final int value) {
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

        if (name.equals("NOT_STARTED")) { //$NON-NLS-1$
            return "notStarted"; //$NON-NLS-1$
        }

        if (name.equals("IN_PROGRESS")) { //$NON-NLS-1$
            return "inProgress"; //$NON-NLS-1$
        }

        if (name.equals("SUCCEEDED")) { //$NON-NLS-1$
            return "succeeded"; //$NON-NLS-1$
        }

        if (name.equals("CANCELED")) { //$NON-NLS-1$
            return "canceled"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED")) { //$NON-NLS-1$
            return "rejected"; //$NON-NLS-1$
        }

        if (name.equals("QUEUED")) { //$NON-NLS-1$
            return "queued"; //$NON-NLS-1$
        }

        if (name.equals("SCHEDULED")) { //$NON-NLS-1$
            return "scheduled"; //$NON-NLS-1$
        }

        if (name.equals("PARTIALLY_SUCCEEDED")) { //$NON-NLS-1$
            return "partiallySucceeded"; //$NON-NLS-1$
        }

        return null;
    }
}
