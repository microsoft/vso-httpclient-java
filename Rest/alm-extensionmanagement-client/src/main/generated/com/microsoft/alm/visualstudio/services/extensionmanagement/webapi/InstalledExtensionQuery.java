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

import java.util.List;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionIdentifier;

/** 
 */
public class InstalledExtensionQuery {

    private List<String> assetTypes;
    private List<ExtensionIdentifier> monikers;

    public List<String> getAssetTypes() {
        return assetTypes;
    }

    public void setAssetTypes(final List<String> assetTypes) {
        this.assetTypes = assetTypes;
    }

    public List<ExtensionIdentifier> getMonikers() {
        return monikers;
    }

    public void setMonikers(final List<ExtensionIdentifier> monikers) {
        this.monikers = monikers;
    }
}
