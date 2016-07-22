// Copyright(C) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.model;

/** 
 */
public enum DayOfWeek {

    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6),;

    private int value;

    private DayOfWeek(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SUNDAY")) { //$NON-NLS-1$
            return "sunday"; //$NON-NLS-1$
        }

        if (name.equals("MONDAY")) { //$NON-NLS-1$
            return "monday"; //$NON-NLS-1$
        }

        if (name.equals("TUESDAY")) { //$NON-NLS-1$
            return "tuesday"; //$NON-NLS-1$
        }

        if (name.equals("WEDNESDAY")) { //$NON-NLS-1$
            return "wednesday"; //$NON-NLS-1$
        }

        if (name.equals("THURSDAY")) { //$NON-NLS-1$
            return "thursday"; //$NON-NLS-1$
        }

        if (name.equals("FRIDAY")) { //$NON-NLS-1$
            return "friday"; //$NON-NLS-1$
        }

        if (name.equals("SATURDAY")) { //$NON-NLS-1$
            return "saturday"; //$NON-NLS-1$
        }

        return null;
    }
}
