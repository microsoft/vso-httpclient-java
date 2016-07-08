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

package com.microsoft.alm.visualstudio.services.security;


/** 
 * Represents a set of evaluated permissions.
 * 
 */
public class PermissionEvaluationBatch {

    private boolean alwaysAllowAdministrators;
    /**
    * Array of permission evaluations to evaluate.
    */
    private PermissionEvaluation[] evaluations;

    public boolean getAlwaysAllowAdministrators() {
        return alwaysAllowAdministrators;
    }

    public void setAlwaysAllowAdministrators(final boolean alwaysAllowAdministrators) {
        this.alwaysAllowAdministrators = alwaysAllowAdministrators;
    }

    /**
    * Array of permission evaluations to evaluate.
    */
    public PermissionEvaluation[] getEvaluations() {
        return evaluations;
    }

    /**
    * Array of permission evaluations to evaluate.
    */
    public void setEvaluations(final PermissionEvaluation[] evaluations) {
        this.evaluations = evaluations;
    }
}
