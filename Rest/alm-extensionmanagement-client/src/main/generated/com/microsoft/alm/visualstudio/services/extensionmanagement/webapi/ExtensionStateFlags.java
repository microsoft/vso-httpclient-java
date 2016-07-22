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
public enum ExtensionStateFlags {

    /**
    * No flags set
    */
    NONE(0),
    /**
    * Extension is disabled
    */
    DISABLED(1),
    /**
    * Extension is a built in
    */
    BUILT_IN(2),
    /**
    * Extension has multiple versions
    */
    MULTI_VERSION(4),
    /**
    * Extension is not installed.  This is for builtin extensions only and can not otherwise be set.
    */
    UN_INSTALLED(8),
    /**
    * Error performing version check
    */
    VERSION_CHECK_ERROR(16),
    /**
    * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can&amp;#039;t be published by the general public.  Note: BuiltIn extensions are always trusted.
    */
    TRUSTED(32),
    /**
    * Extension is currently in an error state
    */
    ERROR(64),
    /**
    * Extension scopes have changed and the extension requires re-authorization
    */
    NEEDS_REAUTHORIZATION(128),
    /**
    * Error performing auto-upgrade. For example, if the new version has demands not supported the extension cannot be auto-upgraded.
    */
    AUTO_UPGRADE_ERROR(256),
    /**
    * Extension is currently in a warning state, that can cause a degraded experience. The degraded experience can be caused for example by some installation issues detected such as implicit demands not supported.
    */
    WARNING(512),
    ;

    private int value;

    private ExtensionStateFlags(final int value) {
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

        if (name.equals("DISABLED")) { //$NON-NLS-1$
            return "disabled"; //$NON-NLS-1$
        }

        if (name.equals("BUILT_IN")) { //$NON-NLS-1$
            return "builtIn"; //$NON-NLS-1$
        }

        if (name.equals("MULTI_VERSION")) { //$NON-NLS-1$
            return "multiVersion"; //$NON-NLS-1$
        }

        if (name.equals("UN_INSTALLED")) { //$NON-NLS-1$
            return "unInstalled"; //$NON-NLS-1$
        }

        if (name.equals("VERSION_CHECK_ERROR")) { //$NON-NLS-1$
            return "versionCheckError"; //$NON-NLS-1$
        }

        if (name.equals("TRUSTED")) { //$NON-NLS-1$
            return "trusted"; //$NON-NLS-1$
        }

        if (name.equals("ERROR")) { //$NON-NLS-1$
            return "error"; //$NON-NLS-1$
        }

        if (name.equals("NEEDS_REAUTHORIZATION")) { //$NON-NLS-1$
            return "needsReauthorization"; //$NON-NLS-1$
        }

        if (name.equals("AUTO_UPGRADE_ERROR")) { //$NON-NLS-1$
            return "autoUpgradeError"; //$NON-NLS-1$
        }

        if (name.equals("WARNING")) { //$NON-NLS-1$
            return "warning"; //$NON-NLS-1$
        }

        return null;
    }
}
