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

import java.util.List;

/** 
 */
public class TestRunStatistic {

    private ShallowReference run;
    private List<RunStatistic> runStatistics;

    public ShallowReference getRun() {
        return run;
    }

    public void setRun(final ShallowReference run) {
        this.run = run;
    }

    public List<RunStatistic> getRunStatistics() {
        return runStatistics;
    }

    public void setRunStatistics(final List<RunStatistic> runStatistics) {
        this.runStatistics = runStatistics;
    }
}
