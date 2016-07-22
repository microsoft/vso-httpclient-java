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

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Represents the code coverage statistics for a particular coverage label (modules, statements, blocks, etc.)
 * 
 */
public class CodeCoverageStatistics {

    /**
    * Covered units
    */
    private int covered;
    /**
    * Delta of coverage
    */
    private double delta;
    /**
    * Is delta valid
    */
    private boolean isDeltaAvailable;
    /**
    * Label of coverage data (&quot;Blocks&quot;, &quot;Statements&quot;, &quot;Modules&quot;, etc.)
    */
    private String label;
    /**
    * Position of label
    */
    private int position;
    /**
    * Total units
    */
    private int total;

    /**
    * Covered units
    */
    public int getCovered() {
        return covered;
    }

    /**
    * Covered units
    */
    public void setCovered(final int covered) {
        this.covered = covered;
    }

    /**
    * Delta of coverage
    */
    public double getDelta() {
        return delta;
    }

    /**
    * Delta of coverage
    */
    public void setDelta(final double delta) {
        this.delta = delta;
    }

    /**
    * Is delta valid
    */
    @JsonProperty("isDeltaAvailable")
    public boolean isDeltaAvailable() {
        return isDeltaAvailable;
    }

    /**
    * Is delta valid
    */
    @JsonProperty("isDeltaAvailable")
    public void setDeltaAvailable(final boolean isDeltaAvailable) {
        this.isDeltaAvailable = isDeltaAvailable;
    }

    /**
    * Label of coverage data (&amp;quot;Blocks&amp;quot;, &amp;quot;Statements&amp;quot;, &amp;quot;Modules&amp;quot;, etc.)
    */
    public String getLabel() {
        return label;
    }

    /**
    * Label of coverage data (&amp;quot;Blocks&amp;quot;, &amp;quot;Statements&amp;quot;, &amp;quot;Modules&amp;quot;, etc.)
    */
    public void setLabel(final String label) {
        this.label = label;
    }

    /**
    * Position of label
    */
    public int getPosition() {
        return position;
    }

    /**
    * Position of label
    */
    public void setPosition(final int position) {
        this.position = position;
    }

    /**
    * Total units
    */
    public int getTotal() {
        return total;
    }

    /**
    * Total units
    */
    public void setTotal(final int total) {
        this.total = total;
    }
}
