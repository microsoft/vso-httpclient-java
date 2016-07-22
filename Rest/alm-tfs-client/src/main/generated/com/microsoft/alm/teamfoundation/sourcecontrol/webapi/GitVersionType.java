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
public enum GitVersionType {

    /**
    * Interpret the version as a branch name
    */
    BRANCH(0),
    /**
    * Interpret the version as a tag name
    */
    TAG(1),
    /**
    * Interpret the version as a commit ID (SHA1)
    */
    COMMIT(2),
    /**
    * Interpret the version as an index name
    */
    INDEX(3),
    ;

    private int value;

    private GitVersionType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BRANCH")) { //$NON-NLS-1$
            return "branch"; //$NON-NLS-1$
        }

        if (name.equals("TAG")) { //$NON-NLS-1$
            return "tag"; //$NON-NLS-1$
        }

        if (name.equals("COMMIT")) { //$NON-NLS-1$
            return "commit"; //$NON-NLS-1$
        }

        if (name.equals("INDEX")) { //$NON-NLS-1$
            return "index"; //$NON-NLS-1$
        }

        return null;
    }
}
