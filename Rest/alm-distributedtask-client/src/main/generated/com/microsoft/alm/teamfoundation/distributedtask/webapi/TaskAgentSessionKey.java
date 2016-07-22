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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;


/** 
 * Represents a symmetric key used for message-level encryption for communication sent to an agent.
 * 
 */
public class TaskAgentSessionKey {

    /**
    * Gets or sets a value indicating whether or not the key value is encrypted. If this value is true, the property should be decrypted using the RSA key exchanged with the server during registration.
    */
    private boolean encrypted;
    /**
    * Gets or sets the symmetric key value.
    */
    private Byte[] value;

    /**
    * Gets or sets a value indicating whether or not the key value is encrypted. If this value is true, the property should be decrypted using the RSA key exchanged with the server during registration.
    */
    public boolean getEncrypted() {
        return encrypted;
    }

    /**
    * Gets or sets a value indicating whether or not the key value is encrypted. If this value is true, the property should be decrypted using the RSA key exchanged with the server during registration.
    */
    public void setEncrypted(final boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
    * Gets or sets the symmetric key value.
    */
    public Byte[] getValue() {
        return value;
    }

    /**
    * Gets or sets the symmetric key value.
    */
    public void setValue(final Byte[] value) {
        this.value = value;
    }
}
