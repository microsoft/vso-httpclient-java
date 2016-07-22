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
public enum SpecialGroupType {

    GENERIC(0),
    ADMINISTRATIVE_APPLICATION_GROUP(1),
    SERVICE_APPLICATION_GROUP(2),
    EVERYONE_APPLICATION_GROUP(3),
    LICENSEES_APPLICATION_GROUP(4),
    AZURE_ACTIVE_DIRECTORY_APPLICATION_GROUP(5),
    ;

    private int value;

    private SpecialGroupType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("GENERIC")) { //$NON-NLS-1$
            return "generic"; //$NON-NLS-1$
        }

        if (name.equals("ADMINISTRATIVE_APPLICATION_GROUP")) { //$NON-NLS-1$
            return "administrativeApplicationGroup"; //$NON-NLS-1$
        }

        if (name.equals("SERVICE_APPLICATION_GROUP")) { //$NON-NLS-1$
            return "serviceApplicationGroup"; //$NON-NLS-1$
        }

        if (name.equals("EVERYONE_APPLICATION_GROUP")) { //$NON-NLS-1$
            return "everyoneApplicationGroup"; //$NON-NLS-1$
        }

        if (name.equals("LICENSEES_APPLICATION_GROUP")) { //$NON-NLS-1$
            return "licenseesApplicationGroup"; //$NON-NLS-1$
        }

        if (name.equals("AZURE_ACTIVE_DIRECTORY_APPLICATION_GROUP")) { //$NON-NLS-1$
            return "azureActiveDirectoryApplicationGroup"; //$NON-NLS-1$
        }

        return null;
    }
}
