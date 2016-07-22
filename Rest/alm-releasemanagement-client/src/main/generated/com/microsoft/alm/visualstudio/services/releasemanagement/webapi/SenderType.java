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
public enum SenderType {

    SERVICE_ACCOUNT(1),
    REQUESTING_USER(2),
    ;

    private int value;

    private SenderType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SERVICE_ACCOUNT")) { //$NON-NLS-1$
            return "serviceAccount"; //$NON-NLS-1$
        }

        if (name.equals("REQUESTING_USER")) { //$NON-NLS-1$
            return "requestingUser"; //$NON-NLS-1$
        }

        return null;
    }
}
