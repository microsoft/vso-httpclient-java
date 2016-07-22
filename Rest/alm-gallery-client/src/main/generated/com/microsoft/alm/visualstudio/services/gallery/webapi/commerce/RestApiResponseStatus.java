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

package com.microsoft.alm.visualstudio.services.gallery.webapi.commerce;


/** 
 */
public enum RestApiResponseStatus {

    /**
    * The operation is completed.
    */
    COMPLETED(0),
    /**
    * The operation is failed.
    */
    FAILED(1),
    /**
    * The operation is in progress.
    */
    INPROGRESS(2),
    /**
    * The operation is in skipped.
    */
    SKIPPED(3),
    ;

    private int value;

    private RestApiResponseStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("COMPLETED")) { //$NON-NLS-1$
            return "completed"; //$NON-NLS-1$
        }

        if (name.equals("FAILED")) { //$NON-NLS-1$
            return "failed"; //$NON-NLS-1$
        }

        if (name.equals("INPROGRESS")) { //$NON-NLS-1$
            return "inprogress"; //$NON-NLS-1$
        }

        if (name.equals("SKIPPED")) { //$NON-NLS-1$
            return "skipped"; //$NON-NLS-1$
        }

        return null;
    }
}
