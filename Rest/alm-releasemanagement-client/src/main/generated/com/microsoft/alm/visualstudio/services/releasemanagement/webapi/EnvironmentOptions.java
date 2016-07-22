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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;


/** 
 */
public class EnvironmentOptions {

    private String emailNotificationType;
    private String emailRecipients;
    private boolean enableAccessToken;
    private boolean skipArtifactsDownload;
    private int timeoutInMinutes;

    public String getEmailNotificationType() {
        return emailNotificationType;
    }

    public void setEmailNotificationType(final String emailNotificationType) {
        this.emailNotificationType = emailNotificationType;
    }

    public String getEmailRecipients() {
        return emailRecipients;
    }

    public void setEmailRecipients(final String emailRecipients) {
        this.emailRecipients = emailRecipients;
    }

    public boolean getEnableAccessToken() {
        return enableAccessToken;
    }

    public void setEnableAccessToken(final boolean enableAccessToken) {
        this.enableAccessToken = enableAccessToken;
    }

    public boolean getSkipArtifactsDownload() {
        return skipArtifactsDownload;
    }

    public void setSkipArtifactsDownload(final boolean skipArtifactsDownload) {
        this.skipArtifactsDownload = skipArtifactsDownload;
    }

    public int getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    public void setTimeoutInMinutes(final int timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }
}
