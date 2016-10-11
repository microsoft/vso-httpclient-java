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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.Date;

/** 
 */
public class PackageMetadata {

    private Date createdOn;
    /**
    * A direct link to download the package.
    */
    private String downloadUrl;
    private String filename;
    /**
    * MD5 hash as a base64 string
    */
    private String hashValue;
    /**
    * A link to documentation
    */
    private String infoUrl;
    private String platform;
    private String type;
    private PackageVersion version;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
    * A direct link to download the package.
    */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
    * A direct link to download the package.
    */
    public void setDownloadUrl(final String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(final String filename) {
        this.filename = filename;
    }

    /**
    * MD5 hash as a base64 string
    */
    public String getHashValue() {
        return hashValue;
    }

    /**
    * MD5 hash as a base64 string
    */
    public void setHashValue(final String hashValue) {
        this.hashValue = hashValue;
    }

    /**
    * A link to documentation
    */
    public String getInfoUrl() {
        return infoUrl;
    }

    /**
    * A link to documentation
    */
    public void setInfoUrl(final String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public PackageVersion getVersion() {
        return version;
    }

    public void setVersion(final PackageVersion version) {
        this.version = version;
    }
}
