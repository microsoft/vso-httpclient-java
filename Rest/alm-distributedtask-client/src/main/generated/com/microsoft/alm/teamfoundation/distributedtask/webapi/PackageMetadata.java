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
 * Represents a downloadable package.
 * 
 */
public class PackageMetadata {

    /**
    * The date the package was created
    */
    private Date createdOn;
    /**
    * A direct link to download the package.
    */
    private String downloadUrl;
    /**
    * The UI uses this to display instructions, i.e. &quot;unzip MyAgent.zip&quot;
    */
    private String filename;
    /**
    * MD5 hash as a base64 string
    */
    private String hashValue;
    /**
    * A link to documentation
    */
    private String infoUrl;
    /**
    * The platform (win7, linux, etc.)
    */
    private String platform;
    /**
    * The type of package (e.g. &quot;agent&quot;)
    */
    private String type;
    /**
    * The package version.
    */
    private PackageVersion version;

    /**
    * The date the package was created
    */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
    * The date the package was created
    */
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

    /**
    * The UI uses this to display instructions, i.e. &amp;quot;unzip MyAgent.zip&amp;quot;
    */
    public String getFilename() {
        return filename;
    }

    /**
    * The UI uses this to display instructions, i.e. &amp;quot;unzip MyAgent.zip&amp;quot;
    */
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

    /**
    * The platform (win7, linux, etc.)
    */
    public String getPlatform() {
        return platform;
    }

    /**
    * The platform (win7, linux, etc.)
    */
    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    /**
    * The type of package (e.g. &amp;quot;agent&amp;quot;)
    */
    public String getType() {
        return type;
    }

    /**
    * The type of package (e.g. &amp;quot;agent&amp;quot;)
    */
    public void setType(final String type) {
        this.type = type;
    }

    /**
    * The package version.
    */
    public PackageVersion getVersion() {
        return version;
    }

    /**
    * The package version.
    */
    public void setVersion(final PackageVersion version) {
        this.version = version;
    }
}
