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
public class ExtensionStatisticUpdate {

    private String extensionName;
    private ExtensionStatisticOperation operation;
    private String publisherName;
    private ExtensionStatistic statistic;

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    public ExtensionStatisticOperation getOperation() {
        return operation;
    }

    public void setOperation(final ExtensionStatisticOperation operation) {
        this.operation = operation;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }

    public ExtensionStatistic getStatistic() {
        return statistic;
    }

    public void setStatistic(final ExtensionStatistic statistic) {
        this.statistic = statistic;
    }
}
