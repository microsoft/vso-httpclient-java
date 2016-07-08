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

package com.microsoft.alm.visualstudio.services.account;


/** 
 */
public enum AccountLicenseSource {

    /**
    * The following correspond to various license sources
    */
    NONE(2),
    VS_EXPRESS(10),
    VS_PRO(12),
    VS_TEST_PRO(14),
    VS_PREMIUM(16),
    VS_ULTIMATE(18),
    M_S_D_N(38),
    MSDN_PRO(40),
    MSDN_TEST_PRO(42),
    MSDN_PREMIUM(44),
    MSDN_ULTIMATE(46),
    MSDN_PLATFORMS(48),
    V_S_O_STANDARD(50),
    V_S_O_ADVANCED(52),
    V_S_O_PRO_STANDARD(54),
    WIN8(56),
    DESKTOP(58),
    PHONE(60),
    /**
    * Early adopters may get a special license
    */
    VS_EARLY_ADOPTER(70),
    ;

    private int value;

    private AccountLicenseSource(final int value) {
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

        if (name.equals("VS_EXPRESS")) { //$NON-NLS-1$
            return "vsExpress"; //$NON-NLS-1$
        }

        if (name.equals("VS_PRO")) { //$NON-NLS-1$
            return "vsPro"; //$NON-NLS-1$
        }

        if (name.equals("VS_TEST_PRO")) { //$NON-NLS-1$
            return "vsTestPro"; //$NON-NLS-1$
        }

        if (name.equals("VS_PREMIUM")) { //$NON-NLS-1$
            return "vsPremium"; //$NON-NLS-1$
        }

        if (name.equals("VS_ULTIMATE")) { //$NON-NLS-1$
            return "vsUltimate"; //$NON-NLS-1$
        }

        if (name.equals("M_S_D_N")) { //$NON-NLS-1$
            return "mSDN"; //$NON-NLS-1$
        }

        if (name.equals("MSDN_PRO")) { //$NON-NLS-1$
            return "msdnPro"; //$NON-NLS-1$
        }

        if (name.equals("MSDN_TEST_PRO")) { //$NON-NLS-1$
            return "msdnTestPro"; //$NON-NLS-1$
        }

        if (name.equals("MSDN_PREMIUM")) { //$NON-NLS-1$
            return "msdnPremium"; //$NON-NLS-1$
        }

        if (name.equals("MSDN_ULTIMATE")) { //$NON-NLS-1$
            return "msdnUltimate"; //$NON-NLS-1$
        }

        if (name.equals("MSDN_PLATFORMS")) { //$NON-NLS-1$
            return "msdnPlatforms"; //$NON-NLS-1$
        }

        if (name.equals("V_S_O_STANDARD")) { //$NON-NLS-1$
            return "vSOStandard"; //$NON-NLS-1$
        }

        if (name.equals("V_S_O_ADVANCED")) { //$NON-NLS-1$
            return "vSOAdvanced"; //$NON-NLS-1$
        }

        if (name.equals("V_S_O_PRO_STANDARD")) { //$NON-NLS-1$
            return "vSOProStandard"; //$NON-NLS-1$
        }

        if (name.equals("WIN8")) { //$NON-NLS-1$
            return "win8"; //$NON-NLS-1$
        }

        if (name.equals("DESKTOP")) { //$NON-NLS-1$
            return "desktop"; //$NON-NLS-1$
        }

        if (name.equals("PHONE")) { //$NON-NLS-1$
            return "phone"; //$NON-NLS-1$
        }

        if (name.equals("VS_EARLY_ADOPTER")) { //$NON-NLS-1$
            return "vsEarlyAdopter"; //$NON-NLS-1$
        }

        return null;
    }
}
