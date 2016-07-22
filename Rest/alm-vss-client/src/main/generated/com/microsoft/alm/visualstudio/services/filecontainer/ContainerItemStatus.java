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

package com.microsoft.alm.visualstudio.services.filecontainer;


/** 
 */
public enum ContainerItemStatus {

    /**
    * Item is created.
    */
    CREATED(1),
    /**
    * Item is a file pending for upload.
    */
    PENDING_UPLOAD(2),
    ;

    private int value;

    private ContainerItemStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CREATED")) { //$NON-NLS-1$
            return "created"; //$NON-NLS-1$
        }

        if (name.equals("PENDING_UPLOAD")) { //$NON-NLS-1$
            return "pendingUpload"; //$NON-NLS-1$
        }

        return null;
    }
}
