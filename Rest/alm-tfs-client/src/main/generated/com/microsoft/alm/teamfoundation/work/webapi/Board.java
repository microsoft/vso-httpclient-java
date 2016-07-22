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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class Board
    extends ShallowReference {

    private ReferenceLinks _links;
    private HashMap<String, HashMap<String, String[]>> allowedMappings;
    private boolean canEdit;
    private ArrayList<BoardColumn> columns;
    private BoardFields fields;
    private boolean isValid;
    private int revision;
    private ArrayList<BoardRow> rows;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public HashMap<String, HashMap<String, String[]>> getAllowedMappings() {
        return allowedMappings;
    }

    public void setAllowedMappings(final HashMap<String, HashMap<String, String[]>> allowedMappings) {
        this.allowedMappings = allowedMappings;
    }

    public boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(final boolean canEdit) {
        this.canEdit = canEdit;
    }

    public ArrayList<BoardColumn> getColumns() {
        return columns;
    }

    public void setColumns(final ArrayList<BoardColumn> columns) {
        this.columns = columns;
    }

    public BoardFields getFields() {
        return fields;
    }

    public void setFields(final BoardFields fields) {
        this.fields = fields;
    }

    @JsonProperty("isValid")
    public boolean isValid() {
        return isValid;
    }

    @JsonProperty("isValid")
    public void setValid(final boolean isValid) {
        this.isValid = isValid;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public ArrayList<BoardRow> getRows() {
        return rows;
    }

    public void setRows(final ArrayList<BoardRow> rows) {
        this.rows = rows;
    }
}
