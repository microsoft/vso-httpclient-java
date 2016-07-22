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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.conditions;


/** 
 */
public enum ConditionType {

    UNDEFINED(0),
    EVENT(1),
    ENVIRONMENT_STATE(2),
    ;

    private int value;

    private ConditionType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNDEFINED")) { //$NON-NLS-1$
            return "undefined"; //$NON-NLS-1$
        }

        if (name.equals("EVENT")) { //$NON-NLS-1$
            return "event"; //$NON-NLS-1$
        }

        if (name.equals("ENVIRONMENT_STATE")) { //$NON-NLS-1$
            return "environmentState"; //$NON-NLS-1$
        }

        return null;
    }
}
