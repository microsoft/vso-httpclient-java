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
public enum GitResolutionRename1to2Action {

    UNDECIDED((byte) 0),
    KEEP_SOURCE_PATH((byte) 1),
    KEEP_TARGET_PATH((byte) 2),
    KEEP_BOTH_FILES((byte) 3),
    ;

    private byte value;

    private GitResolutionRename1to2Action(final byte value) {
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

        if (name.equals("KEEP_SOURCE_PATH")) { //$NON-NLS-1$
            return "keepSourcePath"; //$NON-NLS-1$
        }

        if (name.equals("KEEP_TARGET_PATH")) { //$NON-NLS-1$
            return "keepTargetPath"; //$NON-NLS-1$
        }

        if (name.equals("KEEP_BOTH_FILES")) { //$NON-NLS-1$
            return "keepBothFiles"; //$NON-NLS-1$
        }

        return null;
    }
}
