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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 */
public enum ExtensionQueryFlags {

    /**
    * None is used to retrieve only the basic extension details.
    */
    NONE(0),
    /**
    * IncludeVersions will return version information for extensions returned
    */
    INCLUDE_VERSIONS(1),
    /**
    * IncludeFiles will return information about which files were found within the extension that were stored independant of the manifest. When asking for files, versions will be included as well since files are returned as a property of the versions.  These files can be retrieved using the path to the file without requiring the entire manifest be downloaded.
    */
    INCLUDE_FILES(2),
    /**
    * Include the Categories and Tags that were added to the extension definition.
    */
    INCLUDE_CATEGORY_AND_TAGS(4),
    /**
    * Include the details about which accounts the extension has been shared with if the extesion is a private extension.
    */
    INCLUDE_SHARED_ACCOUNTS(8),
    /**
    * Include properties associated with versions of the extension
    */
    INCLUDE_VERSION_PROPERTIES(16),
    /**
    * Excluding non-validated extensions will remove any extension versions that either are in the process of being validated or have failed validation.
    */
    EXCLUDE_NON_VALIDATED(32),
    /**
    * Include the set of installation targets the extension has requested.
    */
    INCLUDE_INSTALLATION_TARGETS(64),
    /**
    * Include the base uri for assets of this extension
    */
    INCLUDE_ASSET_URI(128),
    /**
    * Include the statistics associated with this extension
    */
    INCLUDE_STATISTICS(256),
    /**
    * When retrieving versions from a query, only include the latest version of the extensions that matched. This is useful when the caller doesn&amp;#039;t need all the published versions. It will save a significant size in the returned payload.
    */
    INCLUDE_LATEST_VERSION_ONLY(512),
    /**
    * This flag switches the asset uri to use GetAssetByName instead of CDN When this is used, values of base asset uri and base asset uri fallback are switched When this is used, source of asset files are pointed to Gallery service always even if CDN is available
    */
    USE_FALLBACK_ASSET_URI(1024),
    /**
    * AllAttributes is designed to be a mask that defines all sub-elements of the extension should be returned.  NOTE: This is not actually All flags. This is now locked to the set defined since changing this enum would be a breaking change and would change the behavior of anyone using it. Try not to use this value when making calls to the service, instead be explicit about the options required.
    */
    ALL_ATTRIBUTES(479),
    ;

    private int value;

    private ExtensionQueryFlags(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_VERSIONS")) { //$NON-NLS-1$
            return "includeVersions"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_FILES")) { //$NON-NLS-1$
            return "includeFiles"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_CATEGORY_AND_TAGS")) { //$NON-NLS-1$
            return "includeCategoryAndTags"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_SHARED_ACCOUNTS")) { //$NON-NLS-1$
            return "includeSharedAccounts"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_VERSION_PROPERTIES")) { //$NON-NLS-1$
            return "includeVersionProperties"; //$NON-NLS-1$
        }

        if (name.equals("EXCLUDE_NON_VALIDATED")) { //$NON-NLS-1$
            return "excludeNonValidated"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_INSTALLATION_TARGETS")) { //$NON-NLS-1$
            return "includeInstallationTargets"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_ASSET_URI")) { //$NON-NLS-1$
            return "includeAssetUri"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_STATISTICS")) { //$NON-NLS-1$
            return "includeStatistics"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_LATEST_VERSION_ONLY")) { //$NON-NLS-1$
            return "includeLatestVersionOnly"; //$NON-NLS-1$
        }

        if (name.equals("USE_FALLBACK_ASSET_URI")) { //$NON-NLS-1$
            return "useFallbackAssetUri"; //$NON-NLS-1$
        }

        if (name.equals("ALL_ATTRIBUTES")) { //$NON-NLS-1$
            return "allAttributes"; //$NON-NLS-1$
        }

        return null;
    }
}
