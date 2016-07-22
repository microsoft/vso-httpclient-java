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

package com.microsoft.alm.teamfoundation.work.webapi;


/** 
 */
public enum TimelineIterationStatusCode {

    /**
    * No error - iteration data is good.
    */
    O_K(0),
    /**
    * This iteration overlaps with another iteration, no data is returned for this iteration.
    */
    IS_OVERLAPPING(1),
    ;

    private int value;

    private TimelineIterationStatusCode(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("O_K")) { //$NON-NLS-1$
            return "oK"; //$NON-NLS-1$
        }

        if (name.equals("IS_OVERLAPPING")) { //$NON-NLS-1$
            return "isOverlapping"; //$NON-NLS-1$
        }

        return null;
    }
}
