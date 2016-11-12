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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 */
public enum ExtensionDeploymentTechnology {

    EXE(1),
    MSI(2),
    VSIX(3),
    REFERRAL_LINK(4),
    ;

    private int value;

    private ExtensionDeploymentTechnology(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("EXE")) { //$NON-NLS-1$
            return "exe"; //$NON-NLS-1$
        }

        if (name.equals("MSI")) { //$NON-NLS-1$
            return "msi"; //$NON-NLS-1$
        }

        if (name.equals("VSIX")) { //$NON-NLS-1$
            return "vsix"; //$NON-NLS-1$
        }

        if (name.equals("REFERRAL_LINK")) { //$NON-NLS-1$
            return "referralLink"; //$NON-NLS-1$
        }

        return null;
    }
}
