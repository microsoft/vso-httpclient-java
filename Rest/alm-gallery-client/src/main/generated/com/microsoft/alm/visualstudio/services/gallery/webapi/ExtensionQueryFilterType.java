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
public enum ExtensionQueryFilterType {

    /**
    * The values are used as tags. All tags are treated as &amp;quot;OR&amp;quot; conditions with each other. There may be some value put on the number of matched tags from the query.
    */
    TAG(1),
    /**
    * The Values are an ExtensionName or fragment that is used to match other extension names.
    */
    DISPLAY_NAME(2),
    /**
    * The Filter is one or more tokens that define what scope to return private extensions for.
    */
    PRIVATE(3),
    /**
    * Retrieve a set of extensions based on their id&amp;#039;s. The values should be the extension id&amp;#039;s encoded as strings.
    */
    ID(4),
    /**
    * The catgeory is unlike other filters. It is AND&amp;#039;d with the other filters instead of being a seperate query.
    */
    CATEGORY(5),
    /**
    * Certain contribution types may be indexed to allow for query by type. User defined types can&amp;#039;t be indexed at the moment.
    */
    CONTRIBUTION_TYPE(6),
    /**
    * Retrieve an set extension based on the name based identifier. This differs from the internal id (which is being deprecated).
    */
    NAME(7),
    /**
    * The InstallationTarget for an extension defines the target consumer for the extension. This may be something like VS, VSOnline, or VSCode
    */
    INSTALLATION_TARGET(8),
    /**
    * Query for featured extensions, no value is allowed when using the query type.
    */
    FEATURED(9),
    /**
    * The SearchText provided by the user to search for extensions
    */
    SEARCH_TEXT(10),
    /**
    * Query for extensions that are featured in their own category, The filterValue for this is name of category of extensions.
    */
    FEATURED_IN_CATEGORY(11),
    /**
    * When retrieving extensions from a query, exclude the extensions which are having the given flags. The value specified for this filter should be a string representing the integer values of the flags to be excluded. In case of mulitple flags to be specified, a logical OR of the interger values should be given as value for this filter This should be at most one filter of this type. This filter is only supported when search text is specified
    */
    EXCLUDE_WITH_FLAGS(12),
    ;

    private int value;

    private ExtensionQueryFilterType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("TAG")) { //$NON-NLS-1$
            return "tag"; //$NON-NLS-1$
        }

        if (name.equals("DISPLAY_NAME")) { //$NON-NLS-1$
            return "displayName"; //$NON-NLS-1$
        }

        if (name.equals("PRIVATE")) { //$NON-NLS-1$
            return "private"; //$NON-NLS-1$
        }

        if (name.equals("ID")) { //$NON-NLS-1$
            return "id"; //$NON-NLS-1$
        }

        if (name.equals("CATEGORY")) { //$NON-NLS-1$
            return "category"; //$NON-NLS-1$
        }

        if (name.equals("CONTRIBUTION_TYPE")) { //$NON-NLS-1$
            return "contributionType"; //$NON-NLS-1$
        }

        if (name.equals("NAME")) { //$NON-NLS-1$
            return "name"; //$NON-NLS-1$
        }

        if (name.equals("INSTALLATION_TARGET")) { //$NON-NLS-1$
            return "installationTarget"; //$NON-NLS-1$
        }

        if (name.equals("FEATURED")) { //$NON-NLS-1$
            return "featured"; //$NON-NLS-1$
        }

        if (name.equals("SEARCH_TEXT")) { //$NON-NLS-1$
            return "searchText"; //$NON-NLS-1$
        }

        if (name.equals("FEATURED_IN_CATEGORY")) { //$NON-NLS-1$
            return "featuredInCategory"; //$NON-NLS-1$
        }

        if (name.equals("EXCLUDE_WITH_FLAGS")) { //$NON-NLS-1$
            return "excludeWithFlags"; //$NON-NLS-1$
        }

        return null;
    }
}
