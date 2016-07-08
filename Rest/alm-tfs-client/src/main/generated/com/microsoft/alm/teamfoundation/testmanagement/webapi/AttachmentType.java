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
public enum AttachmentType {

    GENERAL_ATTACHMENT(0),
    AFN_STRIP(1),
    BUG_FILING_DATA(2),
    CODE_COVERAGE(3),
    INTERMEDIATE_COLLECTOR_DATA(4),
    RUN_CONFIG(5),
    TEST_IMPACT_DETAILS(6),
    TMI_TEST_RUN_DEPLOYMENT_FILES(7),
    TMI_TEST_RUN_REVERSE_DEPLOYMENT_FILES(8),
    TMI_TEST_RESULT_DETAIL(9),
    TMI_TEST_RUN_SUMMARY(10),
    CONSOLE_LOG(11),
    ;

    private int value;

    private AttachmentType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("GENERAL_ATTACHMENT")) { //$NON-NLS-1$
            return "generalAttachment"; //$NON-NLS-1$
        }

        if (name.equals("AFN_STRIP")) { //$NON-NLS-1$
            return "afnStrip"; //$NON-NLS-1$
        }

        if (name.equals("BUG_FILING_DATA")) { //$NON-NLS-1$
            return "bugFilingData"; //$NON-NLS-1$
        }

        if (name.equals("CODE_COVERAGE")) { //$NON-NLS-1$
            return "codeCoverage"; //$NON-NLS-1$
        }

        if (name.equals("INTERMEDIATE_COLLECTOR_DATA")) { //$NON-NLS-1$
            return "intermediateCollectorData"; //$NON-NLS-1$
        }

        if (name.equals("RUN_CONFIG")) { //$NON-NLS-1$
            return "runConfig"; //$NON-NLS-1$
        }

        if (name.equals("TEST_IMPACT_DETAILS")) { //$NON-NLS-1$
            return "testImpactDetails"; //$NON-NLS-1$
        }

        if (name.equals("TMI_TEST_RUN_DEPLOYMENT_FILES")) { //$NON-NLS-1$
            return "tmiTestRunDeploymentFiles"; //$NON-NLS-1$
        }

        if (name.equals("TMI_TEST_RUN_REVERSE_DEPLOYMENT_FILES")) { //$NON-NLS-1$
            return "tmiTestRunReverseDeploymentFiles"; //$NON-NLS-1$
        }

        if (name.equals("TMI_TEST_RESULT_DETAIL")) { //$NON-NLS-1$
            return "tmiTestResultDetail"; //$NON-NLS-1$
        }

        if (name.equals("TMI_TEST_RUN_SUMMARY")) { //$NON-NLS-1$
            return "tmiTestRunSummary"; //$NON-NLS-1$
        }

        if (name.equals("CONSOLE_LOG")) { //$NON-NLS-1$
            return "consoleLog"; //$NON-NLS-1$
        }

        return null;
    }
}
