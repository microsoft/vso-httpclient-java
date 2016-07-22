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
 * Policy with a set of permissions on extension operations
 * 
 */
public class ExtensionPolicy {

    /**
    * Permissions on &#039;Install&#039; operation
    */
    private ExtensionPolicyFlags install;
    /**
    * Permission on &#039;Request&#039; operation
    */
    private ExtensionPolicyFlags request;

    /**
    * Permissions on &amp;#039;Install&amp;#039; operation
    */
    public ExtensionPolicyFlags getInstall() {
        return install;
    }

    /**
    * Permissions on &amp;#039;Install&amp;#039; operation
    */
    public void setInstall(final ExtensionPolicyFlags install) {
        this.install = install;
    }

    /**
    * Permission on &amp;#039;Request&amp;#039; operation
    */
    public ExtensionPolicyFlags getRequest() {
        return request;
    }

    /**
    * Permission on &amp;#039;Request&amp;#039; operation
    */
    public void setRequest(final ExtensionPolicyFlags request) {
        this.request = request;
    }
}
