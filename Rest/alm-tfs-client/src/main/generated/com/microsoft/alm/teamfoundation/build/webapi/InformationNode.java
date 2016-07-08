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

import java.util.Date;
import java.util.Map;

/** 
 * Data representation of an information node associated with a build
 * 
 */
public class InformationNode {

    /**
    * Fields of the information node
    */
    private Map<String, String> fields;
    /**
    * Process or person that last modified this node
    */
    private String lastModifiedBy;
    /**
    * Date this node was last modified
    */
    private Date lastModifiedDate;
    /**
    * Node Id of this information node
    */
    private int nodeId;
    /**
    * Id of parent node (xml tree)
    */
    private int parentId;
    /**
    * The type of the information node
    */
    private String type;

    /**
    * Fields of the information node
    */
    public Map<String, String> getFields() {
        return fields;
    }

    /**
    * Fields of the information node
    */
    public void setFields(final Map<String, String> fields) {
        this.fields = fields;
    }

    /**
    * Process or person that last modified this node
    */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
    * Process or person that last modified this node
    */
    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
    * Date this node was last modified
    */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
    * Date this node was last modified
    */
    public void setLastModifiedDate(final Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
    * Node Id of this information node
    */
    public int getNodeId() {
        return nodeId;
    }

    /**
    * Node Id of this information node
    */
    public void setNodeId(final int nodeId) {
        this.nodeId = nodeId;
    }

    /**
    * Id of parent node (xml tree)
    */
    public int getParentId() {
        return parentId;
    }

    /**
    * Id of parent node (xml tree)
    */
    public void setParentId(final int parentId) {
        this.parentId = parentId;
    }

    /**
    * The type of the information node
    */
    public String getType() {
        return type;
    }

    /**
    * The type of the information node
    */
    public void setType(final String type) {
        this.type = type;
    }
}
