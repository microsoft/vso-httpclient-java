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

package com.microsoft.alm.teamfoundation.build.webapi;


/** 
 * Data representation of a build badge
 * 
 */
public class BuildBadge {

    /**
    * Build id, if exists that this badge corresponds to
    */
    private int buildId;
    /**
    * Self Url that generates SVG
    */
    private String imageUrl;

    /**
    * Build id, if exists that this badge corresponds to
    */
    public int getBuildId() {
        return buildId;
    }

    /**
    * Build id, if exists that this badge corresponds to
    */
    public void setBuildId(final int buildId) {
        this.buildId = buildId;
    }

    /**
    * Self Url that generates SVG
    */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
    * Self Url that generates SVG
    */
    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
