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
public class ContinuousDeploymentSlotConfiguration {

    private String slotName;
    private String webAppLocation;

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(final String slotName) {
        this.slotName = slotName;
    }

    public String getWebAppLocation() {
        return webAppLocation;
    }

    public void setWebAppLocation(final String webAppLocation) {
        this.webAppLocation = webAppLocation;
    }
}
