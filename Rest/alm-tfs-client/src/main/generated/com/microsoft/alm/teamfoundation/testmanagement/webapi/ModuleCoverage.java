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

import java.util.ArrayList;
import java.util.UUID;

/** 
 */
public class ModuleCoverage {

    private int blockCount;
    private Byte[] blockData;
    private ArrayList<FunctionCoverage> functions;
    private String name;
    private UUID signature;
    private int signatureAge;
    private CoverageStatistics statistics;

    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(final int blockCount) {
        this.blockCount = blockCount;
    }

    public Byte[] getBlockData() {
        return blockData;
    }

    public void setBlockData(final Byte[] blockData) {
        this.blockData = blockData;
    }

    public ArrayList<FunctionCoverage> getFunctions() {
        return functions;
    }

    public void setFunctions(final ArrayList<FunctionCoverage> functions) {
        this.functions = functions;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public UUID getSignature() {
        return signature;
    }

    public void setSignature(final UUID signature) {
        this.signature = signature;
    }

    public int getSignatureAge() {
        return signatureAge;
    }

    public void setSignatureAge(final int signatureAge) {
        this.signatureAge = signatureAge;
    }

    public CoverageStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(final CoverageStatistics statistics) {
        this.statistics = statistics;
    }
}
