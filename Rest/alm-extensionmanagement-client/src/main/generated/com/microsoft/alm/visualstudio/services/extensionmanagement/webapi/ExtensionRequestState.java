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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;


/** 
 */
public enum ExtensionRequestState {

    /**
    * The request has been opened, but not yet responded to
    */
    OPEN(0),
    /**
    * The request was accepted (extension installed or license assigned)
    */
    ACCEPTED(1),
    /**
    * The request was rejected (extension not installed or license not assigned)
    */
    REJECTED(2),
    ;

    private int value;

    private ExtensionRequestState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("OPEN")) { //$NON-NLS-1$
            return "open"; //$NON-NLS-1$
        }

        if (name.equals("ACCEPTED")) { //$NON-NLS-1$
            return "accepted"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED")) { //$NON-NLS-1$
            return "rejected"; //$NON-NLS-1$
        }

        return null;
    }
}
