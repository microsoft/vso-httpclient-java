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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;


/** 
 */
public enum QueryOption {

    DOING(1),
    DONE(2),
    FOLLOWED(3),
    ;

    private int value;

    private QueryOption(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("DOING")) { //$NON-NLS-1$
            return "doing"; //$NON-NLS-1$
        }

        if (name.equals("DONE")) { //$NON-NLS-1$
            return "done"; //$NON-NLS-1$
        }

        if (name.equals("FOLLOWED")) { //$NON-NLS-1$
            return "followed"; //$NON-NLS-1$
        }

        return null;
    }
}
