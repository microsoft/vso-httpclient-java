/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.build.webapi.model;


/** 
 */
public class BuildResourceUsage {

    private int distributedTaskAgents;
    private int totalUsage;
    private int xamlControllers;

    public int getDistributedTaskAgents() {
        return distributedTaskAgents;
    }

    public void setDistributedTaskAgents(final int distributedTaskAgents) {
        this.distributedTaskAgents = distributedTaskAgents;
    }

    public int getTotalUsage() {
        return totalUsage;
    }

    public void setTotalUsage(final int totalUsage) {
        this.totalUsage = totalUsage;
    }

    public int getXamlControllers() {
        return xamlControllers;
    }

    public void setXamlControllers(final int xamlControllers) {
        this.xamlControllers = xamlControllers;
    }
}
