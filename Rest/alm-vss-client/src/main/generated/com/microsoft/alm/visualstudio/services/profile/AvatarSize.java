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

package com.microsoft.alm.visualstudio.services.profile;


/** 
 */
public enum AvatarSize {

    SMALL(0),
    MEDIUM(1),
    LARGE(2),
    ;

    private int value;

    private AvatarSize(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SMALL")) { //$NON-NLS-1$
            return "small"; //$NON-NLS-1$
        }

        if (name.equals("MEDIUM")) { //$NON-NLS-1$
            return "medium"; //$NON-NLS-1$
        }

        if (name.equals("LARGE")) { //$NON-NLS-1$
            return "large"; //$NON-NLS-1$
        }

        return null;
    }
}
