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
public enum GitResolutionMergeType {

    UNDECIDED((byte) 0),
    TAKE_SOURCE_CONTENT((byte) 1),
    TAKE_TARGET_CONTENT((byte) 2),
    AUTO_MERGED((byte) 3),
    USER_MERGED((byte) 4),
    ;

    private byte value;

    private GitResolutionMergeType(final byte value) {
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

        if (name.equals("TAKE_SOURCE_CONTENT")) { //$NON-NLS-1$
            return "takeSourceContent"; //$NON-NLS-1$
        }

        if (name.equals("TAKE_TARGET_CONTENT")) { //$NON-NLS-1$
            return "takeTargetContent"; //$NON-NLS-1$
        }

        if (name.equals("AUTO_MERGED")) { //$NON-NLS-1$
            return "autoMerged"; //$NON-NLS-1$
        }

        if (name.equals("USER_MERGED")) { //$NON-NLS-1$
            return "userMerged"; //$NON-NLS-1$
        }

        return null;
    }
}
