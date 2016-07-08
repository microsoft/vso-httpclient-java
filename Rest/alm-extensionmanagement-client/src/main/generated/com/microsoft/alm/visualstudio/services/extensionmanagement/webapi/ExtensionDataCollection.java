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
import com.microsoft.alm.client.json.JObject;

/** 
 * Represents a single collection for extension data documents
 * 
 */
public class ExtensionDataCollection {

    /**
    * The name of the collection
    */
    private String collectionName;
    /**
    * A list of documents belonging to the collection
    */
    private List<JObject> documents;
    /**
    * The type of the collection&#039;s scope, such as Default or User
    */
    private String scopeType;
    /**
    * The value of the collection&#039;s scope, such as Current or Me
    */
    private String scopeValue;

    /**
    * The name of the collection
    */
    public String getCollectionName() {
        return collectionName;
    }

    /**
    * The name of the collection
    */
    public void setCollectionName(final String collectionName) {
        this.collectionName = collectionName;
    }

    /**
    * A list of documents belonging to the collection
    */
    public List<JObject> getDocuments() {
        return documents;
    }

    /**
    * A list of documents belonging to the collection
    */
    public void setDocuments(final List<JObject> documents) {
        this.documents = documents;
    }

    /**
    * The type of the collection&amp;#039;s scope, such as Default or User
    */
    public String getScopeType() {
        return scopeType;
    }

    /**
    * The type of the collection&amp;#039;s scope, such as Default or User
    */
    public void setScopeType(final String scopeType) {
        this.scopeType = scopeType;
    }

    /**
    * The value of the collection&amp;#039;s scope, such as Current or Me
    */
    public String getScopeValue() {
        return scopeValue;
    }

    /**
    * The value of the collection&amp;#039;s scope, such as Current or Me
    */
    public void setScopeValue(final String scopeValue) {
        this.scopeValue = scopeValue;
    }
}
