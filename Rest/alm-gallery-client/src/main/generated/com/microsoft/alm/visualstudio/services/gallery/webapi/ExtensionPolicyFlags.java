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
public enum ExtensionPolicyFlags {

    /**
    * No permission
    */
    NONE(0),
    /**
    * Permission on private extensions
    */
    PRIVATE(1),
    /**
    * Permission on public extensions
    */
    PUBLIC(2),
    /**
    * Premission in extensions that are in preview
    */
    PREVIEW(4),
    /**
    * Premission in relased extensions
    */
    RELEASED(8),
    /**
    * Permission in 1st party extensions
    */
    FIRST_PARTY(16),
    /**
    * Mask that defines all permissions
    */
    ALL(31),
    ;

    private int value;

    private ExtensionPolicyFlags(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("PRIVATE")) { //$NON-NLS-1$
            return "private"; //$NON-NLS-1$
        }

        if (name.equals("PUBLIC")) { //$NON-NLS-1$
            return "public"; //$NON-NLS-1$
        }

        if (name.equals("PREVIEW")) { //$NON-NLS-1$
            return "preview"; //$NON-NLS-1$
        }

        if (name.equals("RELEASED")) { //$NON-NLS-1$
            return "released"; //$NON-NLS-1$
        }

        if (name.equals("FIRST_PARTY")) { //$NON-NLS-1$
            return "firstParty"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
