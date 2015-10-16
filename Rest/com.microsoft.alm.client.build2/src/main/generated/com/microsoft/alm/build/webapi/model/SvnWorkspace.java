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

import java.util.List;

/** 
 */
public class SvnWorkspace {

    private List<SvnMappingDetails> mappings;

    public List<SvnMappingDetails> getMappings() {
        return mappings;
    }

    public void setMappings(final List<SvnMappingDetails> mappings) {
        this.mappings = mappings;
    }
}
