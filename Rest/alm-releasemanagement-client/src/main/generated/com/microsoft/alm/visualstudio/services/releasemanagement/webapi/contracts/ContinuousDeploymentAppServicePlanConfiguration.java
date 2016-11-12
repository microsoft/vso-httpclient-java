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
public class ContinuousDeploymentAppServicePlanConfiguration {

    private String appServicePlan;
    private String appServicePlanName;
    private String appServicePricingTier;

    public String getAppServicePlan() {
        return appServicePlan;
    }

    public void setAppServicePlan(final String appServicePlan) {
        this.appServicePlan = appServicePlan;
    }

    public String getAppServicePlanName() {
        return appServicePlanName;
    }

    public void setAppServicePlanName(final String appServicePlanName) {
        this.appServicePlanName = appServicePlanName;
    }

    public String getAppServicePricingTier() {
        return appServicePricingTier;
    }

    public void setAppServicePricingTier(final String appServicePricingTier) {
        this.appServicePricingTier = appServicePricingTier;
    }
}
