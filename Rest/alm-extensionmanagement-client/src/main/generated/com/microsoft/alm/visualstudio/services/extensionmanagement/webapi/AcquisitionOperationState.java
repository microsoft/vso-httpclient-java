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
public enum AcquisitionOperationState {

    /**
    * Not allowed to use this AcquisitionOperation
    */
    DISALLOW(0),
    /**
    * Allowed to use this AcquisitionOperation
    */
    ALLOW(1),
    /**
    * Operation has already been completed and is no longer available
    */
    COMPLETED(3),
    ;

    private int value;

    private AcquisitionOperationState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("DISALLOW")) { //$NON-NLS-1$
            return "disallow"; //$NON-NLS-1$
        }

        if (name.equals("ALLOW")) { //$NON-NLS-1$
            return "allow"; //$NON-NLS-1$
        }

        if (name.equals("COMPLETED")) { //$NON-NLS-1$
            return "completed"; //$NON-NLS-1$
        }

        return null;
    }
}
