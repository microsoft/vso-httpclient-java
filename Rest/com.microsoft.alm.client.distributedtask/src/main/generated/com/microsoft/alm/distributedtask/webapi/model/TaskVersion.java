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

package com.microsoft.alm.distributedtask.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class TaskVersion {

    private boolean isTest;
    private int major;
    private int minor;
    private int patch;

    @JsonProperty("isTest")
    public boolean isTest() {
        return isTest;
    }

    @JsonProperty("isTest")
    public void setTest(final boolean isTest) {
        this.isTest = isTest;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(final int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(final int minor) {
        this.minor = minor;
    }

    public int getPatch() {
        return patch;
    }

    public void setPatch(final int patch) {
        this.patch = patch;
    }
}
