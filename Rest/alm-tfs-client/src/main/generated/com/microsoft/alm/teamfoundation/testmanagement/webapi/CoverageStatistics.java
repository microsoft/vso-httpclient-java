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


/** 
 */
public class CoverageStatistics {

    private int blocksCovered;
    private int blocksNotCovered;
    private int linesCovered;
    private int linesNotCovered;
    private int linesPartiallyCovered;

    public int getBlocksCovered() {
        return blocksCovered;
    }

    public void setBlocksCovered(final int blocksCovered) {
        this.blocksCovered = blocksCovered;
    }

    public int getBlocksNotCovered() {
        return blocksNotCovered;
    }

    public void setBlocksNotCovered(final int blocksNotCovered) {
        this.blocksNotCovered = blocksNotCovered;
    }

    public int getLinesCovered() {
        return linesCovered;
    }

    public void setLinesCovered(final int linesCovered) {
        this.linesCovered = linesCovered;
    }

    public int getLinesNotCovered() {
        return linesNotCovered;
    }

    public void setLinesNotCovered(final int linesNotCovered) {
        this.linesNotCovered = linesNotCovered;
    }

    public int getLinesPartiallyCovered() {
        return linesPartiallyCovered;
    }

    public void setLinesPartiallyCovered(final int linesPartiallyCovered) {
        this.linesPartiallyCovered = linesPartiallyCovered;
    }
}
