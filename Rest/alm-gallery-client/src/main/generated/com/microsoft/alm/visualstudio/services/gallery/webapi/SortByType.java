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
public enum SortByType {

    /**
    * The results will be sorted by relevance in case search query is given, if no search query resutls will be provided as is
    */
    RELEVANCE(0),
    /**
    * The results will be sorted as per Last Updated date of the extensions with recently updated at the top
    */
    LAST_UPDATED_DATE(1),
    /**
    * Results will be sorted Alphabetically as per the title of the extension
    */
    TITLE(2),
    /**
    * Results will be sorted Alphabetically as per Publisher title
    */
    PUBLISHER(3),
    /**
    * Results will be sorted by Install Count
    */
    INSTALL_COUNT(4),
    /**
    * The results will be sorted as per Published date of the extensions
    */
    PUBLISHED_DATE(5),
    /**
    * The results will be sorted as per Average ratings of the extensions
    */
    AVERAGE_RATING(6),
    /**
    * The results will be sorted as per Trending Daily Score of the extensions
    */
    TRENDING_DAILY(7),
    /**
    * The results will be sorted as per Trending weekly Score of the extensions
    */
    TRENDING_WEEKLY(8),
    /**
    * The results will be sorted as per Trending monthly Score of the extensions
    */
    TRENDING_MONTHLY(9),
    /**
    * The results will be sorted as per ReleaseDate of the extensions (date on which the extension first went public)
    */
    RELEASE_DATE(10),
    ;

    private int value;

    private SortByType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("RELEVANCE")) { //$NON-NLS-1$
            return "relevance"; //$NON-NLS-1$
        }

        if (name.equals("LAST_UPDATED_DATE")) { //$NON-NLS-1$
            return "lastUpdatedDate"; //$NON-NLS-1$
        }

        if (name.equals("TITLE")) { //$NON-NLS-1$
            return "title"; //$NON-NLS-1$
        }

        if (name.equals("PUBLISHER")) { //$NON-NLS-1$
            return "publisher"; //$NON-NLS-1$
        }

        if (name.equals("INSTALL_COUNT")) { //$NON-NLS-1$
            return "installCount"; //$NON-NLS-1$
        }

        if (name.equals("PUBLISHED_DATE")) { //$NON-NLS-1$
            return "publishedDate"; //$NON-NLS-1$
        }

        if (name.equals("AVERAGE_RATING")) { //$NON-NLS-1$
            return "averageRating"; //$NON-NLS-1$
        }

        if (name.equals("TRENDING_DAILY")) { //$NON-NLS-1$
            return "trendingDaily"; //$NON-NLS-1$
        }

        if (name.equals("TRENDING_WEEKLY")) { //$NON-NLS-1$
            return "trendingWeekly"; //$NON-NLS-1$
        }

        if (name.equals("TRENDING_MONTHLY")) { //$NON-NLS-1$
            return "trendingMonthly"; //$NON-NLS-1$
        }

        if (name.equals("RELEASE_DATE")) { //$NON-NLS-1$
            return "releaseDate"; //$NON-NLS-1$
        }

        return null;
    }
}
