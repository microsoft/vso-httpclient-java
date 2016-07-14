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

import java.util.ArrayList;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionIdentifier;

/** 
 */
public class InstalledExtensionQuery {

    private ArrayList<String> assetTypes;
    private ArrayList<ExtensionIdentifier> monikers;

    public ArrayList<String> getAssetTypes() {
        return assetTypes;
    }

    public void setAssetTypes(final ArrayList<String> assetTypes) {
        this.assetTypes = assetTypes;
    }

    public ArrayList<ExtensionIdentifier> getMonikers() {
        return monikers;
    }

    public void setMonikers(final ArrayList<ExtensionIdentifier> monikers) {
        this.monikers = monikers;
    }
}
