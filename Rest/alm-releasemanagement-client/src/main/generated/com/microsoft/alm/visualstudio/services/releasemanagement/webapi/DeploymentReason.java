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
public enum DeploymentReason {

    NONE(0),
    MANUAL(1),
    AUTOMATED(2),
    SCHEDULED(4),
    ;

    private int value;

    private DeploymentReason(final int value) {
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

        if (name.equals("MANUAL")) { //$NON-NLS-1$
            return "manual"; //$NON-NLS-1$
        }

        if (name.equals("AUTOMATED")) { //$NON-NLS-1$
            return "automated"; //$NON-NLS-1$
        }

        if (name.equals("SCHEDULED")) { //$NON-NLS-1$
            return "scheduled"; //$NON-NLS-1$
        }

        return null;
    }
}
