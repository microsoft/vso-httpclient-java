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
public enum GitResolutionError {

    /**
    * No error
    */
    NONE((byte) 0),
    /**
    * User set a blob id for resolving a content merge, but blob was not found in repo during application
    */
    MERGE_CONTENT_NOT_FOUND((byte) 1),
    /**
    * Attempted to resolve a conflict by moving a file to another path, but path was already in use
    */
    PATH_IN_USE((byte) 2),
    /**
    * No error
    */
    INVALID_PATH((byte) 3),
    /**
    * GitResolutionAction was set to an unrecognized value
    */
    UNKNOWN_ACTION((byte) 4),
    /**
    * GitResolutionMergeType was set to an unrecognized value
    */
    UNKNOWN_MERGE_TYPE((byte) 5),
    /**
    * Any error for which a more specific code doesn&amp;#039;t apply
    */
    OTHER_ERROR((byte) 255),
    ;

    private byte value;

    private GitResolutionError(final byte value) {
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

        if (name.equals("MERGE_CONTENT_NOT_FOUND")) { //$NON-NLS-1$
            return "mergeContentNotFound"; //$NON-NLS-1$
        }

        if (name.equals("PATH_IN_USE")) { //$NON-NLS-1$
            return "pathInUse"; //$NON-NLS-1$
        }

        if (name.equals("INVALID_PATH")) { //$NON-NLS-1$
            return "invalidPath"; //$NON-NLS-1$
        }

        if (name.equals("UNKNOWN_ACTION")) { //$NON-NLS-1$
            return "unknownAction"; //$NON-NLS-1$
        }

        if (name.equals("UNKNOWN_MERGE_TYPE")) { //$NON-NLS-1$
            return "unknownMergeType"; //$NON-NLS-1$
        }

        if (name.equals("OTHER_ERROR")) { //$NON-NLS-1$
            return "otherError"; //$NON-NLS-1$
        }

        return null;
    }
}
