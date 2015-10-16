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
public class MappingDetails {

    private String localPath;
    private String mappingType;
    private String serverPath;

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(final String localPath) {
        this.localPath = localPath;
    }

    public String getMappingType() {
        return mappingType;
    }

    public void setMappingType(final String mappingType) {
        this.mappingType = mappingType;
    }

    public String getServerPath() {
        return serverPath;
    }

    public void setServerPath(final String serverPath) {
        this.serverPath = serverPath;
    }
}
