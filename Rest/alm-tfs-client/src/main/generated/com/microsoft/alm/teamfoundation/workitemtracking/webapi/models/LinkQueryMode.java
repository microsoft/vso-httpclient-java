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
public enum LinkQueryMode {

    WORK_ITEMS(0),
    LINKS_ONE_HOP_MUST_CONTAIN(1),
    LINKS_ONE_HOP_MAY_CONTAIN(2),
    LINKS_ONE_HOP_DOES_NOT_CONTAIN(3),
    LINKS_RECURSIVE_MUST_CONTAIN(4),
    LINKS_RECURSIVE_MAY_CONTAIN(5),
    LINKS_RECURSIVE_DOES_NOT_CONTAIN(6),
    ;

    private int value;

    private LinkQueryMode(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("WORK_ITEMS")) { //$NON-NLS-1$
            return "workItems"; //$NON-NLS-1$
        }

        if (name.equals("LINKS_ONE_HOP_MUST_CONTAIN")) { //$NON-NLS-1$
            return "linksOneHopMustContain"; //$NON-NLS-1$
        }

        if (name.equals("LINKS_ONE_HOP_MAY_CONTAIN")) { //$NON-NLS-1$
            return "linksOneHopMayContain"; //$NON-NLS-1$
        }

        if (name.equals("LINKS_ONE_HOP_DOES_NOT_CONTAIN")) { //$NON-NLS-1$
            return "linksOneHopDoesNotContain"; //$NON-NLS-1$
        }

        if (name.equals("LINKS_RECURSIVE_MUST_CONTAIN")) { //$NON-NLS-1$
            return "linksRecursiveMustContain"; //$NON-NLS-1$
        }

        if (name.equals("LINKS_RECURSIVE_MAY_CONTAIN")) { //$NON-NLS-1$
            return "linksRecursiveMayContain"; //$NON-NLS-1$
        }

        if (name.equals("LINKS_RECURSIVE_DOES_NOT_CONTAIN")) { //$NON-NLS-1$
            return "linksRecursiveDoesNotContain"; //$NON-NLS-1$
        }

        return null;
    }
}
