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

import java.util.Map;

/** 
 * Contextual information that data providers can examine when populating their data
 * 
 */
public class DataProviderContext {

    /**
    * Generic property bag that contains context-specific properties that data providers can use when populating their data dictionary
    */
    private Map<String, Object> properties;

    /**
    * Generic property bag that contains context-specific properties that data providers can use when populating their data dictionary
    */
    public Map<String, Object> getProperties() {
        return properties;
    }

    /**
    * Generic property bag that contains context-specific properties that data providers can use when populating their data dictionary
    */
    public void setProperties(final Map<String, Object> properties) {
        this.properties = properties;
    }
}
