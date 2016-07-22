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
public enum GitPullRequestReviewFileType {

    CHANGE_ENTRY(0),
    ATTACHMENT(1),
    ;

    private int value;

    private GitPullRequestReviewFileType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CHANGE_ENTRY")) { //$NON-NLS-1$
            return "changeEntry"; //$NON-NLS-1$
        }

        if (name.equals("ATTACHMENT")) { //$NON-NLS-1$
            return "attachment"; //$NON-NLS-1$
        }

        return null;
    }
}
