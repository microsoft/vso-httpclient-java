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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 * Represents a Supported IDE entity.
 * 
 */
public class SupportedIde {

    /**
    * The download URL for the IDE.
    */
    private String downloadUrl;
    /**
    * The type of the IDE.
    */
    private SupportedIdeType ideType;
    /**
    * The name of the IDE.
    */
    private String name;
    /**
    * The URL to open the protocol handler for the IDE.
    */
    private String protocolHandlerUrl;
    /**
    * A list of SupportedPlatforms.
    */
    private String[] supportedPlatforms;

    /**
    * The download URL for the IDE.
    */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
    * The download URL for the IDE.
    */
    public void setDownloadUrl(final String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
    * The type of the IDE.
    */
    public SupportedIdeType getIdeType() {
        return ideType;
    }

    /**
    * The type of the IDE.
    */
    public void setIdeType(final SupportedIdeType ideType) {
        this.ideType = ideType;
    }

    /**
    * The name of the IDE.
    */
    public String getName() {
        return name;
    }

    /**
    * The name of the IDE.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * The URL to open the protocol handler for the IDE.
    */
    public String getProtocolHandlerUrl() {
        return protocolHandlerUrl;
    }

    /**
    * The URL to open the protocol handler for the IDE.
    */
    public void setProtocolHandlerUrl(final String protocolHandlerUrl) {
        this.protocolHandlerUrl = protocolHandlerUrl;
    }

    /**
    * A list of SupportedPlatforms.
    */
    public String[] getSupportedPlatforms() {
        return supportedPlatforms;
    }

    /**
    * A list of SupportedPlatforms.
    */
    public void setSupportedPlatforms(final String[] supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }
}
