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

import java.util.List;

/** 
 * A query that can be issued for data provider data
 * 
 */
public class DataProviderQuery {

    /**
    * Contextual information to pass to the data providers
    */
    private DataProviderContext context;
    /**
    * The contribution ids of the data providers to resolve
    */
    private List<String> contributionIds;

    /**
    * Contextual information to pass to the data providers
    */
    public DataProviderContext getContext() {
        return context;
    }

    /**
    * Contextual information to pass to the data providers
    */
    public void setContext(final DataProviderContext context) {
        this.context = context;
    }

    /**
    * The contribution ids of the data providers to resolve
    */
    public List<String> getContributionIds() {
        return contributionIds;
    }

    /**
    * The contribution ids of the data providers to resolve
    */
    public void setContributionIds(final List<String> contributionIds) {
        this.contributionIds = contributionIds;
    }
}
