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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;


/** 
 */
public enum TestSessionSource {

    /**
    * Source of test session uncertain as it is stale
    */
    UNKONOWN(0),
    /**
    * The session was created from Microsoft Test Manager exploratory desktop tool.
    */
    X_T_DESKTOP(1),
    /**
    * The session was created from feedback client.
    */
    FEEDBACK_DESKTOP(2),
    /**
    * The session was created from browser extension.
    */
    X_T_WEB(3),
    /**
    * The session was created from browser extension.
    */
    FEEDBACK_WEB(4),
    ;

    private int value;

    private TestSessionSource(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNKONOWN")) { //$NON-NLS-1$
            return "unkonown"; //$NON-NLS-1$
        }

        if (name.equals("X_T_DESKTOP")) { //$NON-NLS-1$
            return "xTDesktop"; //$NON-NLS-1$
        }

        if (name.equals("FEEDBACK_DESKTOP")) { //$NON-NLS-1$
            return "feedbackDesktop"; //$NON-NLS-1$
        }

        if (name.equals("X_T_WEB")) { //$NON-NLS-1$
            return "xTWeb"; //$NON-NLS-1$
        }

        if (name.equals("FEEDBACK_WEB")) { //$NON-NLS-1$
            return "feedbackWeb"; //$NON-NLS-1$
        }

        return null;
    }
}
