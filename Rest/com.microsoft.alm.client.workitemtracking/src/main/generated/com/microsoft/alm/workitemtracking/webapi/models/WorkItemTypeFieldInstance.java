/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.workitemtracking.webapi.models;


/** 
 */
public class WorkItemTypeFieldInstance {

    private String helpText;
    private String name;
    private String referenceName;
    private String url;

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(final String helpText) {
        this.helpText = helpText;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getReferenceName() {
      return referenceName;
    }

    public void setReferenceName(String referenceName) {
      this.referenceName = referenceName;
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
}
