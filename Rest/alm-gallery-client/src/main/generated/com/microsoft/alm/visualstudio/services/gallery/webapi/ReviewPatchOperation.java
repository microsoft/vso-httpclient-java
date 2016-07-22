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
public enum ReviewPatchOperation {

    /**
    * Flag a review
    */
    FLAG_REVIEW(1),
    /**
    * Update an existing review
    */
    UPDATE_REVIEW(2),
    /**
    * Submit a reply for a review
    */
    REPLY_TO_REVIEW(3),
    ;

    private int value;

    private ReviewPatchOperation(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("FLAG_REVIEW")) { //$NON-NLS-1$
            return "flagReview"; //$NON-NLS-1$
        }

        if (name.equals("UPDATE_REVIEW")) { //$NON-NLS-1$
            return "updateReview"; //$NON-NLS-1$
        }

        if (name.equals("REPLY_TO_REVIEW")) { //$NON-NLS-1$
            return "replyToReview"; //$NON-NLS-1$
        }

        return null;
    }
}
