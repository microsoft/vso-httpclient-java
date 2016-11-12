// Copyright(C) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.profile.model;

/** 
 */
public class RemoteProfile {

    private String displayName;
    private String emailAddress;
    private byte[] avatar;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(final byte[] avatar) {
        this.avatar = avatar;
    }
}
