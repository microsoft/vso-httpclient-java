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

package com.microsoft.alm.visualstudio.services.forminput;


/** 
 */
public enum InputMode {

    /**
    * This input should not be shown in the UI
    */
    NONE(0),
    /**
    * An input text box should be shown
    */
    TEXT_BOX(10),
    /**
    * An password input box should be shown
    */
    PASSWORD_BOX(20),
    /**
    * A select/combo control should be shown
    */
    COMBO(30),
    /**
    * Radio buttons should be shown
    */
    RADIO_BUTTONS(40),
    /**
    * Checkbox should be shown(for true/false values)
    */
    CHECK_BOX(50),
    /**
    * A multi-line text area should be shown
    */
    TEXT_AREA(60),
    ;

    private int value;

    private InputMode(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("TEXT_BOX")) { //$NON-NLS-1$
            return "textBox"; //$NON-NLS-1$
        }

        if (name.equals("PASSWORD_BOX")) { //$NON-NLS-1$
            return "passwordBox"; //$NON-NLS-1$
        }

        if (name.equals("COMBO")) { //$NON-NLS-1$
            return "combo"; //$NON-NLS-1$
        }

        if (name.equals("RADIO_BUTTONS")) { //$NON-NLS-1$
            return "radioButtons"; //$NON-NLS-1$
        }

        if (name.equals("CHECK_BOX")) { //$NON-NLS-1$
            return "checkBox"; //$NON-NLS-1$
        }

        if (name.equals("TEXT_AREA")) { //$NON-NLS-1$
            return "textArea"; //$NON-NLS-1$
        }

        return null;
    }
}
