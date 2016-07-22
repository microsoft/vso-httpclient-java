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
public enum AccountUserStatus {

    NONE(0),
    /**
    * User has signed in at least once to the VSTS account
    */
    ACTIVE(1),
    /**
    * User cannot sign in; primarily used by admin to temporarily remove a user due to absence or license reallocation
    */
    DISABLED(2),
    /**
    * User is removed from the VSTS account by the VSTS account admin
    */
    DELETED(3),
    /**
    * User is invited to join the VSTS account by the VSTS account admin, but has not signed up/signed in yet
    */
    PENDING(4),
    /**
    * User can sign in; primarily used when license is in expired state and we give a grace period
    */
    EXPIRED(5),
    /**
    * User is disabled; if reenabled, they will still be in the Pending state
    */
    PENDING_DISABLED(6),
    ;

    private int value;

    private AccountUserStatus(final int value) {
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

        if (name.equals("ACTIVE")) { //$NON-NLS-1$
            return "active"; //$NON-NLS-1$
        }

        if (name.equals("DISABLED")) { //$NON-NLS-1$
            return "disabled"; //$NON-NLS-1$
        }

        if (name.equals("DELETED")) { //$NON-NLS-1$
            return "deleted"; //$NON-NLS-1$
        }

        if (name.equals("PENDING")) { //$NON-NLS-1$
            return "pending"; //$NON-NLS-1$
        }

        if (name.equals("EXPIRED")) { //$NON-NLS-1$
            return "expired"; //$NON-NLS-1$
        }

        if (name.equals("PENDING_DISABLED")) { //$NON-NLS-1$
            return "pendingDisabled"; //$NON-NLS-1$
        }

        return null;
    }
}
