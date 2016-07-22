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

package com.microsoft.alm.visualstudio.services.gallery.webapi.acquisitionrequest;


/** 
 */
public enum AcquisitionOperationType {

    /**
    * Not yet used
    */
    GET(0),
    /**
    * Install this extension into the host provided
    */
    INSTALL(1),
    /**
    * Buy licenses for this extension and install into the host provided
    */
    BUY(2),
    /**
    * Not yet used
    */
    TRY(3),
    /**
    * Not yet used
    */
    REQUEST(4),
    /**
    * No action found
    */
    NONE(5),
    ;

    private int value;

    private AcquisitionOperationType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("GET")) { //$NON-NLS-1$
            return "get"; //$NON-NLS-1$
        }

        if (name.equals("INSTALL")) { //$NON-NLS-1$
            return "install"; //$NON-NLS-1$
        }

        if (name.equals("BUY")) { //$NON-NLS-1$
            return "buy"; //$NON-NLS-1$
        }

        if (name.equals("TRY")) { //$NON-NLS-1$
            return "try"; //$NON-NLS-1$
        }

        if (name.equals("REQUEST")) { //$NON-NLS-1$
            return "request"; //$NON-NLS-1$
        }

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        return null;
    }
}
