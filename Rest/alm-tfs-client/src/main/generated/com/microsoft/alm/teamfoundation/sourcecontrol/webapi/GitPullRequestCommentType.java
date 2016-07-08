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
public enum GitPullRequestCommentType {

    /**
    * The comment type is not known.
    */
    UNKNOWN(0),
    /**
    * This is a regular user comment.
    */
    TEXT(1),
    /**
    * The comment comes as a result of a code change.
    */
    CODE_CHANGE(2),
    /**
    * The comment represents a system message.
    */
    SYSTEM(3),
    ;

    private int value;

    private GitPullRequestCommentType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNKNOWN")) { //$NON-NLS-1$
            return "unknown"; //$NON-NLS-1$
        }

        if (name.equals("TEXT")) { //$NON-NLS-1$
            return "text"; //$NON-NLS-1$
        }

        if (name.equals("CODE_CHANGE")) { //$NON-NLS-1$
            return "codeChange"; //$NON-NLS-1$
        }

        if (name.equals("SYSTEM")) { //$NON-NLS-1$
            return "system"; //$NON-NLS-1$
        }

        return null;
    }
}
