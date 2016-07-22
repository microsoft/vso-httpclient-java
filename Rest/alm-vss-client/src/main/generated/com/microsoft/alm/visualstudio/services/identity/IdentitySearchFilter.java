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

package com.microsoft.alm.visualstudio.services.identity;


/** 
 */
public enum IdentitySearchFilter {

    /**
    * NT account name (domain\alias)
    */
    ACCOUNT_NAME(0),
    /**
    * Display name
    */
    DISPLAY_NAME(1),
    /**
    * Find project admin group
    */
    ADMINISTRATORS_GROUP(2),
    /**
    * Find the identity using the identifier
    */
    IDENTIFIER(3),
    /**
    * Email address
    */
    MAIL_ADDRESS(4),
    /**
    * A general search for an identity.
    */
    GENERAL(5),
    /**
    * Alternate login username
    */
    ALIAS(6),
    /**
    * Find identity using Domain/TenantId
    */
    DOMAIN(7),
    ;

    private int value;

    private IdentitySearchFilter(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ACCOUNT_NAME")) { //$NON-NLS-1$
            return "accountName"; //$NON-NLS-1$
        }

        if (name.equals("DISPLAY_NAME")) { //$NON-NLS-1$
            return "displayName"; //$NON-NLS-1$
        }

        if (name.equals("ADMINISTRATORS_GROUP")) { //$NON-NLS-1$
            return "administratorsGroup"; //$NON-NLS-1$
        }

        if (name.equals("IDENTIFIER")) { //$NON-NLS-1$
            return "identifier"; //$NON-NLS-1$
        }

        if (name.equals("MAIL_ADDRESS")) { //$NON-NLS-1$
            return "mailAddress"; //$NON-NLS-1$
        }

        if (name.equals("GENERAL")) { //$NON-NLS-1$
            return "general"; //$NON-NLS-1$
        }

        if (name.equals("ALIAS")) { //$NON-NLS-1$
            return "alias"; //$NON-NLS-1$
        }

        if (name.equals("DOMAIN")) { //$NON-NLS-1$
            return "domain"; //$NON-NLS-1$
        }

        return null;
    }
}
