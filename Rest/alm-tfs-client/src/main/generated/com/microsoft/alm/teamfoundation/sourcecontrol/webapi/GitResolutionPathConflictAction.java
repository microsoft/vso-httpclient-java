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
public enum GitResolutionPathConflictAction {

    UNDECIDED((byte) 0),
    KEEP_SOURCE_RENAME_TARGET((byte) 1),
    KEEP_SOURCE_DELETE_TARGET((byte) 2),
    KEEP_TARGET_RENAME_SOURCE((byte) 3),
    KEEP_TARGET_DELETE_SOURCE((byte) 4),
    ;

    private byte value;

    private GitResolutionPathConflictAction(final byte value) {
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

        if (name.equals("KEEP_SOURCE_RENAME_TARGET")) { //$NON-NLS-1$
            return "keepSourceRenameTarget"; //$NON-NLS-1$
        }

        if (name.equals("KEEP_SOURCE_DELETE_TARGET")) { //$NON-NLS-1$
            return "keepSourceDeleteTarget"; //$NON-NLS-1$
        }

        if (name.equals("KEEP_TARGET_RENAME_SOURCE")) { //$NON-NLS-1$
            return "keepTargetRenameSource"; //$NON-NLS-1$
        }

        if (name.equals("KEEP_TARGET_DELETE_SOURCE")) { //$NON-NLS-1$
            return "keepTargetDeleteSource"; //$NON-NLS-1$
        }

        return null;
    }
}
