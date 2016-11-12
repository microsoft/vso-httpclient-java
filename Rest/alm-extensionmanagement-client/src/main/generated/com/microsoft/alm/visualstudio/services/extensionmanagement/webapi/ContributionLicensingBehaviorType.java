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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;


/** 
 */
public enum ContributionLicensingBehaviorType {

    /**
    * Default value - only include the contribution if the user is licensed for the extension
    */
    ONLY_IF_LICENSED(0),
    /**
    * Only include the contribution if the user is NOT licensed for the extension
    */
    ONLY_IF_UNLICENSED(1),
    /**
    * Always include the contribution regardless of whether or not the user is licensed for the extension
    */
    ALWAYS_INCLUDE(2),
    ;

    private int value;

    private ContributionLicensingBehaviorType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ONLY_IF_LICENSED")) { //$NON-NLS-1$
            return "onlyIfLicensed"; //$NON-NLS-1$
        }

        if (name.equals("ONLY_IF_UNLICENSED")) { //$NON-NLS-1$
            return "onlyIfUnlicensed"; //$NON-NLS-1$
        }

        if (name.equals("ALWAYS_INCLUDE")) { //$NON-NLS-1$
            return "alwaysInclude"; //$NON-NLS-1$
        }

        return null;
    }
}
