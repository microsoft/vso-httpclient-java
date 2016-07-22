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
public enum PublisherFlags {

    /**
    * This should never be returned, it is used to represent a publisher who&amp;#039;s flags havent changed during update calls.
    */
    UN_CHANGED(1073741824),
    /**
    * No flags exist for this publisher.
    */
    NONE(0),
    /**
    * The Disabled flag for a publisher means the publisher can&amp;#039;t be changed and won&amp;#039;t be used by consumers, this extends to extensions owned by the publisher as well. The disabled flag is managed by the service and can&amp;#039;t be supplied by the Extension Developers.
    */
    DISABLED(1),
    /**
    * A verified publisher is one that Microsoft has done some review of and ensured the publisher meets a set of requirements. The requirements to become a verified publisher are not listed here.  They can be found in public documentation (TBD).
    */
    VERIFIED(2),
    /**
    * This is the set of flags that can&amp;#039;t be supplied by the developer and is managed by the service itself.
    */
    SERVICE_FLAGS(3),
    ;

    private int value;

    private PublisherFlags(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UN_CHANGED")) { //$NON-NLS-1$
            return "unChanged"; //$NON-NLS-1$
        }

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("DISABLED")) { //$NON-NLS-1$
            return "disabled"; //$NON-NLS-1$
        }

        if (name.equals("VERIFIED")) { //$NON-NLS-1$
            return "verified"; //$NON-NLS-1$
        }

        if (name.equals("SERVICE_FLAGS")) { //$NON-NLS-1$
            return "serviceFlags"; //$NON-NLS-1$
        }

        return null;
    }
}
