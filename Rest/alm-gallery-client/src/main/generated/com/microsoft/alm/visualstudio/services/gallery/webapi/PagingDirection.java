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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 */
public enum PagingDirection {

    /**
    * Backward will return results from earlier in the resultset.
    */
    BACKWARD(1),
    /**
    * Forward will return results from later in the resultset.
    */
    FORWARD(2),
    ;

    private int value;

    private PagingDirection(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BACKWARD")) { //$NON-NLS-1$
            return "backward"; //$NON-NLS-1$
        }

        if (name.equals("FORWARD")) { //$NON-NLS-1$
            return "forward"; //$NON-NLS-1$
        }

        return null;
    }
}
