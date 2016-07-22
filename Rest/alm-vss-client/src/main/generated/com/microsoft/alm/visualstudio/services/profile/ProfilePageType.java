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

package com.microsoft.alm.visualstudio.services.profile;


/** 
 */
public enum ProfilePageType {

    UPDATE(0),
    CREATE(1),
    CREATE_I_D_E(2),
    REVIEW(3),
    AVATAR_IMAGE_FORMAT(4),
    ;

    private int value;

    private ProfilePageType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UPDATE")) { //$NON-NLS-1$
            return "update"; //$NON-NLS-1$
        }

        if (name.equals("CREATE")) { //$NON-NLS-1$
            return "create"; //$NON-NLS-1$
        }

        if (name.equals("CREATE_I_D_E")) { //$NON-NLS-1$
            return "createIDE"; //$NON-NLS-1$
        }

        if (name.equals("REVIEW")) { //$NON-NLS-1$
            return "review"; //$NON-NLS-1$
        }

        if (name.equals("AVATAR_IMAGE_FORMAT")) { //$NON-NLS-1$
            return "avatarImageFormat"; //$NON-NLS-1$
        }

        return null;
    }
}
