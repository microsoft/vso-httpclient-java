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
 */
public class FunctionCoverage {

    private String _clazz;
    private String name;
    private String namespace;
    private String sourceFile;
    private CoverageStatistics statistics;

    @JsonProperty("class")
    public String getClazz() {
        return _clazz;
    }

    @JsonProperty("class")
    public void setClazz(final String _clazz) {
        this._clazz = _clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(final String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public CoverageStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(final CoverageStatistics statistics) {
        this.statistics = statistics;
    }
}
