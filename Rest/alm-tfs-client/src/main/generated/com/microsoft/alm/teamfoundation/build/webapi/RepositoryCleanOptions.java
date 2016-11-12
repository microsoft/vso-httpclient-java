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

package com.microsoft.alm.teamfoundation.build.webapi;


/** 
 */
public enum RepositoryCleanOptions {

    SOURCE(0),
    SOURCE_AND_OUTPUT_DIR(1),
    /**
    * Re-create $(build.sourcesDirectory)
    */
    SOURCE_DIR(2),
    /**
    * Re-create $(agnet.buildDirectory) which contains $(build.sourcesDirectory), $(build.binariesDirectory) and any folders that left from previous build.
    */
    ALL_BUILD_DIR(3),
    ;

    private int value;

    private RepositoryCleanOptions(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SOURCE")) { //$NON-NLS-1$
            return "source"; //$NON-NLS-1$
        }

        if (name.equals("SOURCE_AND_OUTPUT_DIR")) { //$NON-NLS-1$
            return "sourceAndOutputDir"; //$NON-NLS-1$
        }

        if (name.equals("SOURCE_DIR")) { //$NON-NLS-1$
            return "sourceDir"; //$NON-NLS-1$
        }

        if (name.equals("ALL_BUILD_DIR")) { //$NON-NLS-1$
            return "allBuildDir"; //$NON-NLS-1$
        }

        return null;
    }
}
