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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;


/** 
 */
public enum CoverageQueryFlags {

    /**
    * If set, the Coverage.Modules property will be populated.
    */
    MODULES(1),
    /**
    * If set, the ModuleCoverage.Functions properties will be populated.
    */
    FUNCTIONS(2),
    /**
    * If set, the ModuleCoverage.CoverageData field will be populated.
    */
    BLOCK_DATA(4),
    ;

    private int value;

    private CoverageQueryFlags(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("MODULES")) { //$NON-NLS-1$
            return "modules"; //$NON-NLS-1$
        }

        if (name.equals("FUNCTIONS")) { //$NON-NLS-1$
            return "functions"; //$NON-NLS-1$
        }

        if (name.equals("BLOCK_DATA")) { //$NON-NLS-1$
            return "blockData"; //$NON-NLS-1$
        }

        return null;
    }
}
