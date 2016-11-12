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
public enum ContinuousDeploymentWebAppProjectType {

    ASP_NET_WAP(0),
    ASP_NET_CORE(1),
    NODE_J_S(2),
    ;

    private int value;

    private ContinuousDeploymentWebAppProjectType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ASP_NET_WAP")) { //$NON-NLS-1$
            return "aspNetWap"; //$NON-NLS-1$
        }

        if (name.equals("ASP_NET_CORE")) { //$NON-NLS-1$
            return "aspNetCore"; //$NON-NLS-1$
        }

        if (name.equals("NODE_J_S")) { //$NON-NLS-1$
            return "nodeJS"; //$NON-NLS-1$
        }

        return null;
    }
}
