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
public enum PublisherPermissions {

    /**
    * This gives the bearer the rights to read Publishers and Extensions.
    */
    READ(1),
    /**
    * This gives the bearer the rights to update, delete, and share Extensions (but not the ability to create them).
    */
    UPDATE_EXTENSION(2),
    /**
    * This gives the bearer the rights to create new Publishers at the root of the namespace.
    */
    CREATE_PUBLISHER(4),
    /**
    * This gives the bearer the rights to create new Extensions within a publisher.
    */
    PUBLISH_EXTENSION(8),
    /**
    * Admin gives the bearer the rights to manage restricted attributes of Publishers and Extensions.
    */
    ADMIN(16),
    /**
    * TrustedPartner gives the bearer the rights to publish a extensions with restricted capabilities.
    */
    TRUSTED_PARTNER(32),
    /**
    * PrivateRead is another form of read designed to allow higher privilege accessors the ability to read private extensions.
    */
    PRIVATE_READ(64),
    /**
    * This gives the bearer the rights to delete any extension.
    */
    DELETE_EXTENSION(128),
    /**
    * This gives the bearer the rights edit the publisher settings.
    */
    EDIT_SETTINGS(256),
    /**
    * This gives the bearer the rights to see all permissions on the publisher.
    */
    VIEW_PERMISSIONS(512),
    /**
    * This gives the bearer the rights to assign permissions on the publisher.
    */
    MANAGE_PERMISSIONS(1024),
    /**
    * This gives the bearer the rights to delete the publisher.
    */
    DELETE_PUBLISHER(2048),
    ;

    private int value;

    private PublisherPermissions(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("READ")) { //$NON-NLS-1$
            return "read"; //$NON-NLS-1$
        }

        if (name.equals("UPDATE_EXTENSION")) { //$NON-NLS-1$
            return "updateExtension"; //$NON-NLS-1$
        }

        if (name.equals("CREATE_PUBLISHER")) { //$NON-NLS-1$
            return "createPublisher"; //$NON-NLS-1$
        }

        if (name.equals("PUBLISH_EXTENSION")) { //$NON-NLS-1$
            return "publishExtension"; //$NON-NLS-1$
        }

        if (name.equals("ADMIN")) { //$NON-NLS-1$
            return "admin"; //$NON-NLS-1$
        }

        if (name.equals("TRUSTED_PARTNER")) { //$NON-NLS-1$
            return "trustedPartner"; //$NON-NLS-1$
        }

        if (name.equals("PRIVATE_READ")) { //$NON-NLS-1$
            return "privateRead"; //$NON-NLS-1$
        }

        if (name.equals("DELETE_EXTENSION")) { //$NON-NLS-1$
            return "deleteExtension"; //$NON-NLS-1$
        }

        if (name.equals("EDIT_SETTINGS")) { //$NON-NLS-1$
            return "editSettings"; //$NON-NLS-1$
        }

        if (name.equals("VIEW_PERMISSIONS")) { //$NON-NLS-1$
            return "viewPermissions"; //$NON-NLS-1$
        }

        if (name.equals("MANAGE_PERMISSIONS")) { //$NON-NLS-1$
            return "managePermissions"; //$NON-NLS-1$
        }

        if (name.equals("DELETE_PUBLISHER")) { //$NON-NLS-1$
            return "deletePublisher"; //$NON-NLS-1$
        }

        return null;
    }
}
