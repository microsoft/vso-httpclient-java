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

import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.MailSectionType;

/** 
 */
public class SummaryMailSection {

    private String htmlContent;
    private int rank;
    private MailSectionType sectionType;
    private String title;

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(final String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(final int rank) {
        this.rank = rank;
    }

    public MailSectionType getSectionType() {
        return sectionType;
    }

    public void setSectionType(final MailSectionType sectionType) {
        this.sectionType = sectionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
}
