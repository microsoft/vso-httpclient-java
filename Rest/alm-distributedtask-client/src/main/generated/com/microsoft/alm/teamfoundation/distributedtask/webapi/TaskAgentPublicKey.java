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
 * Represents the public key portion of an RSA asymmetric key.
 * 
 */
public class TaskAgentPublicKey {

    /**
    * Gets or sets the exponent for the public key.
    */
    private Byte[] exponent;
    /**
    * Gets or sets the modulus for the public key.
    */
    private Byte[] modulus;

    /**
    * Gets or sets the exponent for the public key.
    */
    public Byte[] getExponent() {
        return exponent;
    }

    /**
    * Gets or sets the exponent for the public key.
    */
    public void setExponent(final Byte[] exponent) {
        this.exponent = exponent;
    }

    /**
    * Gets or sets the modulus for the public key.
    */
    public Byte[] getModulus() {
        return modulus;
    }

    /**
    * Gets or sets the modulus for the public key.
    */
    public void setModulus(final Byte[] modulus) {
        this.modulus = modulus;
    }
}
