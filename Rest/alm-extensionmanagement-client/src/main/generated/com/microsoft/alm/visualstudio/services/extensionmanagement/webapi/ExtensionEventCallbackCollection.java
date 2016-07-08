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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;


/** 
 * Collection of event callbacks - endpoints called when particular extension events occur.
 * 
 */
public class ExtensionEventCallbackCollection {

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension disable has occurred.
    */
    private ExtensionEventCallback postDisable;
    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension enable has occurred.
    */
    private ExtensionEventCallback postEnable;
    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install has completed.
    */
    private ExtensionEventCallback postInstall;
    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension uninstall has occurred.
    */
    private ExtensionEventCallback postUninstall;
    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension update has occurred.
    */
    private ExtensionEventCallback postUpdate;
    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install is about to occur.  Response indicates whether to proceed or abort.
    */
    private ExtensionEventCallback preInstall;
    /**
    * For multi-version extensions, defines an endpoint that gets called via an OPTIONS request to determine the particular version of the extension to be used
    */
    private ExtensionEventCallback versionCheck;

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension disable has occurred.
    */
    public ExtensionEventCallback getPostDisable() {
        return postDisable;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension disable has occurred.
    */
    public void setPostDisable(final ExtensionEventCallback postDisable) {
        this.postDisable = postDisable;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension enable has occurred.
    */
    public ExtensionEventCallback getPostEnable() {
        return postEnable;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension enable has occurred.
    */
    public void setPostEnable(final ExtensionEventCallback postEnable) {
        this.postEnable = postEnable;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install has completed.
    */
    public ExtensionEventCallback getPostInstall() {
        return postInstall;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install has completed.
    */
    public void setPostInstall(final ExtensionEventCallback postInstall) {
        this.postInstall = postInstall;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension uninstall has occurred.
    */
    public ExtensionEventCallback getPostUninstall() {
        return postUninstall;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension uninstall has occurred.
    */
    public void setPostUninstall(final ExtensionEventCallback postUninstall) {
        this.postUninstall = postUninstall;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension update has occurred.
    */
    public ExtensionEventCallback getPostUpdate() {
        return postUpdate;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension update has occurred.
    */
    public void setPostUpdate(final ExtensionEventCallback postUpdate) {
        this.postUpdate = postUpdate;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install is about to occur.  Response indicates whether to proceed or abort.
    */
    public ExtensionEventCallback getPreInstall() {
        return preInstall;
    }

    /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install is about to occur.  Response indicates whether to proceed or abort.
    */
    public void setPreInstall(final ExtensionEventCallback preInstall) {
        this.preInstall = preInstall;
    }

    /**
    * For multi-version extensions, defines an endpoint that gets called via an OPTIONS request to determine the particular version of the extension to be used
    */
    public ExtensionEventCallback getVersionCheck() {
        return versionCheck;
    }

    /**
    * For multi-version extensions, defines an endpoint that gets called via an OPTIONS request to determine the particular version of the extension to be used
    */
    public void setVersionCheck(final ExtensionEventCallback versionCheck) {
        this.versionCheck = versionCheck;
    }
}
