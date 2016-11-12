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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public enum SourceRepositoryType {

    INVALID(0),
    VSTS_GIT(1),
    GIT_HUB(2),
    ;

    private int value;

    private SourceRepositoryType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("INVALID")) { //$NON-NLS-1$
            return "invalid"; //$NON-NLS-1$
        }

        if (name.equals("VSTS_GIT")) { //$NON-NLS-1$
            return "vstsGit"; //$NON-NLS-1$
        }

        if (name.equals("GIT_HUB")) { //$NON-NLS-1$
            return "gitHub"; //$NON-NLS-1$
        }

        return null;
    }
}
