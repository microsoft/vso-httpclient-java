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
public enum TaskDefinitionStatus {

    PREINSTALLED(1),
    RECEIVED_INSTALL_OR_UPDATE(2),
    INSTALLED(3),
    RECEIVED_UNINSTALL(4),
    UNINSTALLED(5),
    REQUESTED_UPDATE(6),
    UPDATED(7),
    ALREADY_UP_TO_DATE(8),
    INLINE_UPDATE_RECEIVED(9),
    ;

    private int value;

    private TaskDefinitionStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("PREINSTALLED")) { //$NON-NLS-1$
            return "preinstalled"; //$NON-NLS-1$
        }

        if (name.equals("RECEIVED_INSTALL_OR_UPDATE")) { //$NON-NLS-1$
            return "receivedInstallOrUpdate"; //$NON-NLS-1$
        }

        if (name.equals("INSTALLED")) { //$NON-NLS-1$
            return "installed"; //$NON-NLS-1$
        }

        if (name.equals("RECEIVED_UNINSTALL")) { //$NON-NLS-1$
            return "receivedUninstall"; //$NON-NLS-1$
        }

        if (name.equals("UNINSTALLED")) { //$NON-NLS-1$
            return "uninstalled"; //$NON-NLS-1$
        }

        if (name.equals("REQUESTED_UPDATE")) { //$NON-NLS-1$
            return "requestedUpdate"; //$NON-NLS-1$
        }

        if (name.equals("UPDATED")) { //$NON-NLS-1$
            return "updated"; //$NON-NLS-1$
        }

        if (name.equals("ALREADY_UP_TO_DATE")) { //$NON-NLS-1$
            return "alreadyUpToDate"; //$NON-NLS-1$
        }

        if (name.equals("INLINE_UPDATE_RECEIVED")) { //$NON-NLS-1$
            return "inlineUpdateReceived"; //$NON-NLS-1$
        }

        return null;
    }
}
