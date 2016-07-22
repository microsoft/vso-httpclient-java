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

package com.microsoft.alm.visualstudio.services.webplatform;

import java.util.HashMap;

/** 
 */
public class CustomerIntelligenceEvent {

    private String area;
    private String feature;
    private HashMap<String, Object> properties;

    public String getArea() {
        return area;
    }

    public void setArea(final String area) {
        this.area = area;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(final String feature) {
        this.feature = feature;
    }

    public HashMap<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(final HashMap<String, Object> properties) {
        this.properties = properties;
    }
}
