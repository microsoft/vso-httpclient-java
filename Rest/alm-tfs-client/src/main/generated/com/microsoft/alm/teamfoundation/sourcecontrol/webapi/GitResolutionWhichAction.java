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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 */
public enum GitResolutionWhichAction {

    UNDECIDED((byte) 0),
    PICK_SOURCE_ACTION((byte) 1),
    PICK_TARGET_ACTION((byte) 2),
    ;

    private byte value;

    private GitResolutionWhichAction(final byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNDECIDED")) { //$NON-NLS-1$
            return "undecided"; //$NON-NLS-1$
        }

        if (name.equals("PICK_SOURCE_ACTION")) { //$NON-NLS-1$
            return "pickSourceAction"; //$NON-NLS-1$
        }

        if (name.equals("PICK_TARGET_ACTION")) { //$NON-NLS-1$
            return "pickTargetAction"; //$NON-NLS-1$
        }

        return null;
    }
}
