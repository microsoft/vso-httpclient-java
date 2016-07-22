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
public enum AgentArtifactType {

    XAML_BUILD(0),
    BUILD(1),
    JENKINS(2),
    FILE_SHARE(3),
    NUGET(4),
    TFS_ON_PREM(5),
    GIT_HUB(6),
    T_F_GIT(7),
    EXTERNAL_TFS_BUILD(8),
    CUSTOM(9),
    TFVC(10),
    ;

    private int value;

    private AgentArtifactType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("XAML_BUILD")) { //$NON-NLS-1$
            return "xamlBuild"; //$NON-NLS-1$
        }

        if (name.equals("BUILD")) { //$NON-NLS-1$
            return "build"; //$NON-NLS-1$
        }

        if (name.equals("JENKINS")) { //$NON-NLS-1$
            return "jenkins"; //$NON-NLS-1$
        }

        if (name.equals("FILE_SHARE")) { //$NON-NLS-1$
            return "fileShare"; //$NON-NLS-1$
        }

        if (name.equals("NUGET")) { //$NON-NLS-1$
            return "nuget"; //$NON-NLS-1$
        }

        if (name.equals("TFS_ON_PREM")) { //$NON-NLS-1$
            return "tfsOnPrem"; //$NON-NLS-1$
        }

        if (name.equals("GIT_HUB")) { //$NON-NLS-1$
            return "gitHub"; //$NON-NLS-1$
        }

        if (name.equals("T_F_GIT")) { //$NON-NLS-1$
            return "tFGit"; //$NON-NLS-1$
        }

        if (name.equals("EXTERNAL_TFS_BUILD")) { //$NON-NLS-1$
            return "externalTfsBuild"; //$NON-NLS-1$
        }

        if (name.equals("CUSTOM")) { //$NON-NLS-1$
            return "custom"; //$NON-NLS-1$
        }

        if (name.equals("TFVC")) { //$NON-NLS-1$
            return "tfvc"; //$NON-NLS-1$
        }

        return null;
    }
}
