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
public enum FrameworkIdentityType {

    NONE(0),
    SERVICE_IDENTITY(1),
    AGGREGATE_IDENTITY(2),
    IMPORTED_IDENTITY(3),
    ;

    private int value;

    private FrameworkIdentityType(final int value) {
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

        if (name.equals("SERVICE_IDENTITY")) { //$NON-NLS-1$
            return "serviceIdentity"; //$NON-NLS-1$
        }

        if (name.equals("AGGREGATE_IDENTITY")) { //$NON-NLS-1$
            return "aggregateIdentity"; //$NON-NLS-1$
        }

        if (name.equals("IMPORTED_IDENTITY")) { //$NON-NLS-1$
            return "importedIdentity"; //$NON-NLS-1$
        }

        return null;
    }
}
