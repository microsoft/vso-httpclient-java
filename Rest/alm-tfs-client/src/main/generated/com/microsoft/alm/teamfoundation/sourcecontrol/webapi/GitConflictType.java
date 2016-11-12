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
public enum GitConflictType {

    /**
    * No conflict
    */
    NONE((byte) 0),
    /**
    * Added on source and target; content differs
    */
    ADD_ADD((byte) 1),
    /**
    * Added on source and rename destination on target
    */
    ADD_RENAME((byte) 2),
    /**
    * Deleted on source and edited on target
    */
    DELETE_EDIT((byte) 3),
    /**
    * Deleted on source and renamed on target
    */
    DELETE_RENAME((byte) 4),
    /**
    * Path is a directory on source and a file on target
    */
    DIRECTORY_FILE((byte) 5),
    /**
    * Children of directory which has DirectoryFile or FileDirectory conflict
    */
    DIRECTORY_CHILD((byte) 6),
    /**
    * Edited on source and deleted on target
    */
    EDIT_DELETE((byte) 7),
    /**
    * Edited on source and target; content differs
    */
    EDIT_EDIT((byte) 8),
    /**
    * Path is a file on source and a directory on target
    */
    FILE_DIRECTORY((byte) 9),
    /**
    * Same file renamed on both source and target; destination paths differ
    */
    RENAME1TO2((byte) 10),
    /**
    * Different files renamed to same destination path on both source and target
    */
    RENAME2TO1((byte) 11),
    /**
    * Rename destination on source and new file on target
    */
    RENAME_ADD((byte) 12),
    /**
    * Renamed on source and deleted on target
    */
    RENAME_DELETE((byte) 13),
    /**
    * Rename destination on both source and target; content differs
    */
    RENAME_RENAME((byte) 14),
    ;

    private byte value;

    private GitConflictType(final byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("ADD_ADD")) { //$NON-NLS-1$
            return "addAdd"; //$NON-NLS-1$
        }

        if (name.equals("ADD_RENAME")) { //$NON-NLS-1$
            return "addRename"; //$NON-NLS-1$
        }

        if (name.equals("DELETE_EDIT")) { //$NON-NLS-1$
            return "deleteEdit"; //$NON-NLS-1$
        }

        if (name.equals("DELETE_RENAME")) { //$NON-NLS-1$
            return "deleteRename"; //$NON-NLS-1$
        }

        if (name.equals("DIRECTORY_FILE")) { //$NON-NLS-1$
            return "directoryFile"; //$NON-NLS-1$
        }

        if (name.equals("DIRECTORY_CHILD")) { //$NON-NLS-1$
            return "directoryChild"; //$NON-NLS-1$
        }

        if (name.equals("EDIT_DELETE")) { //$NON-NLS-1$
            return "editDelete"; //$NON-NLS-1$
        }

        if (name.equals("EDIT_EDIT")) { //$NON-NLS-1$
            return "editEdit"; //$NON-NLS-1$
        }

        if (name.equals("FILE_DIRECTORY")) { //$NON-NLS-1$
            return "fileDirectory"; //$NON-NLS-1$
        }

        if (name.equals("RENAME1TO2")) { //$NON-NLS-1$
            return "rename1to2"; //$NON-NLS-1$
        }

        if (name.equals("RENAME2TO1")) { //$NON-NLS-1$
            return "rename2to1"; //$NON-NLS-1$
        }

        if (name.equals("RENAME_ADD")) { //$NON-NLS-1$
            return "renameAdd"; //$NON-NLS-1$
        }

        if (name.equals("RENAME_DELETE")) { //$NON-NLS-1$
            return "renameDelete"; //$NON-NLS-1$
        }

        if (name.equals("RENAME_RENAME")) { //$NON-NLS-1$
            return "renameRename"; //$NON-NLS-1$
        }

        return null;
    }
}
