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

package com.microsoft.alm.teamfoundation.chat.webapi;


/** 
 */
public enum MessageType {

    /**
    * A normal message that is sent by a user in plain text
    */
    NORMAL(0),
    /**
    * A system message like User Entered and User Left Room
    */
    SYSTEM(1),
    /**
    * A notification from a TFS event
    */
    NOTIFICATION(2),
    /**
    * An error messsage.
    */
    ERROR(3),
    ;

    private int value;

    private MessageType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NORMAL")) { //$NON-NLS-1$
            return "normal"; //$NON-NLS-1$
        }

        if (name.equals("SYSTEM")) { //$NON-NLS-1$
            return "system"; //$NON-NLS-1$
        }

        if (name.equals("NOTIFICATION")) { //$NON-NLS-1$
            return "notification"; //$NON-NLS-1$
        }

        if (name.equals("ERROR")) { //$NON-NLS-1$
            return "error"; //$NON-NLS-1$
        }

        return null;
    }
}
