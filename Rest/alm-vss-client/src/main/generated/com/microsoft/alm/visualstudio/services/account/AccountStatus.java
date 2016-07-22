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

package com.microsoft.alm.visualstudio.services.account;


/** 
 */
public enum AccountStatus {

    NONE(0),
    /**
    * This hosting account is active and assigned to a customer.
    */
    ENABLED(1),
    /**
    * This hosting account is disabled.
    */
    DISABLED(2),
    /**
    * This account is part of deletion batch and scheduled for deletion.
    */
    DELETED(3),
    /**
    * This account is not mastered locally and has physically moved.
    */
    MOVED(4),
    ;

    private int value;

    private AccountStatus(final int value) {
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

        if (name.equals("ENABLED")) { //$NON-NLS-1$
            return "enabled"; //$NON-NLS-1$
        }

        if (name.equals("DISABLED")) { //$NON-NLS-1$
            return "disabled"; //$NON-NLS-1$
        }

        if (name.equals("DELETED")) { //$NON-NLS-1$
            return "deleted"; //$NON-NLS-1$
        }

        if (name.equals("MOVED")) { //$NON-NLS-1$
            return "moved"; //$NON-NLS-1$
        }

        return null;
    }
}
