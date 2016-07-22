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

package com.microsoft.alm.visualstudio.services.webapi;


/** 
 */
public enum ConnectOptions {

    /**
    * Retrieve no optional data.
    */
    NONE(0),
    /**
    * Includes information about AccessMappings and ServiceDefinitions.
    */
    INCLUDE_SERVICES(1),
    /**
    * Includes the last user access for this host.
    */
    INCLUDE_LAST_USER_ACCESS(2),
    /**
    * This is only valid on the deployment host and when true. Will only return inherited definitions.
    */
    INCLUDE_INHERITED_DEFINITIONS_ONLY(4),
    /**
    * When true will only return non inherited definitions. Only valid at non-deployment host.
    */
    INCLUDE_NON_INHERITED_DEFINITIONS_ONLY(8),
    ;

    private int value;

    private ConnectOptions(final int value) {
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

        if (name.equals("INCLUDE_SERVICES")) { //$NON-NLS-1$
            return "includeServices"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_LAST_USER_ACCESS")) { //$NON-NLS-1$
            return "includeLastUserAccess"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_INHERITED_DEFINITIONS_ONLY")) { //$NON-NLS-1$
            return "includeInheritedDefinitionsOnly"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_NON_INHERITED_DEFINITIONS_ONLY")) { //$NON-NLS-1$
            return "includeNonInheritedDefinitionsOnly"; //$NON-NLS-1$
        }

        return null;
    }
}
