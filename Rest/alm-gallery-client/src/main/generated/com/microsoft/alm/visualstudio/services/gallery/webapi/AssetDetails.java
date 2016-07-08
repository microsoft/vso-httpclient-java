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
public class AssetDetails {

    /**
    * Gets or sets the Answers, which contains vs marketplace extension name and publisher name
    */
    private Answers answers;
    /**
    * Gets or sets the VS publisher Id
    */
    private String publisherNaturalIdentifier;

    /**
    * Gets or sets the Answers, which contains vs marketplace extension name and publisher name
    */
    public Answers getAnswers() {
        return answers;
    }

    /**
    * Gets or sets the Answers, which contains vs marketplace extension name and publisher name
    */
    public void setAnswers(final Answers answers) {
        this.answers = answers;
    }

    /**
    * Gets or sets the VS publisher Id
    */
    public String getPublisherNaturalIdentifier() {
        return publisherNaturalIdentifier;
    }

    /**
    * Gets or sets the VS publisher Id
    */
    public void setPublisherNaturalIdentifier(final String publisherNaturalIdentifier) {
        this.publisherNaturalIdentifier = publisherNaturalIdentifier;
    }
}
