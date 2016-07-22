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
 * Defines policy on environment queuing at Release Management side queue. We will send to Environment Runner [creating pre-deploy and other steps] only when the policies mentioned are satisfied.
 * 
 */
public class EnvironmentExecutionPolicy {

    /**
    * This policy decides, how many environments would be with Environment Runner.
    */
    private int concurrencyCount;
    /**
    * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it&#039;s policy] to take another environment for running.
    */
    private int queueDepthCount;

    /**
    * This policy decides, how many environments would be with Environment Runner.
    */
    public int getConcurrencyCount() {
        return concurrencyCount;
    }

    /**
    * This policy decides, how many environments would be with Environment Runner.
    */
    public void setConcurrencyCount(final int concurrencyCount) {
        this.concurrencyCount = concurrencyCount;
    }

    /**
    * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it&amp;#039;s policy] to take another environment for running.
    */
    public int getQueueDepthCount() {
        return queueDepthCount;
    }

    /**
    * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it&amp;#039;s policy] to take another environment for running.
    */
    public void setQueueDepthCount(final int queueDepthCount) {
        this.queueDepthCount = queueDepthCount;
    }
}
