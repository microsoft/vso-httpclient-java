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
 * Holds the inherited and effective permission information for a given AccessControlEntry.
 * 
 */
public class AceExtendedInformation {

    /**
    * This is the combination of all of the explicit and inherited permissions for this identity on this token.  These are the permissions used when determining if a given user has permission to perform an action.
    */
    private int effectiveAllow;
    /**
    * This is the combination of all of the explicit and inherited permissions for this identity on this token.  These are the permissions used when determining if a given user has permission to perform an action.
    */
    private int effectiveDeny;
    /**
    * These are the permissions that are inherited for this identity on this token.  If the token does not inherit permissions this will be 0.  Note that any permissions that have been explicitly set on this token for this identity, or any groups that this identity is a part of, are not included here.
    */
    private int inheritedAllow;
    /**
    * These are the permissions that are inherited for this identity on this token.  If the token does not inherit permissions this will be 0.  Note that any permissions that have been explicitly set on this token for this identity, or any groups that this identity is a part of, are not included here.
    */
    private int inheritedDeny;

    /**
    * This is the combination of all of the explicit and inherited permissions for this identity on this token.  These are the permissions used when determining if a given user has permission to perform an action.
    */
    public int getEffectiveAllow() {
        return effectiveAllow;
    }

    /**
    * This is the combination of all of the explicit and inherited permissions for this identity on this token.  These are the permissions used when determining if a given user has permission to perform an action.
    */
    public void setEffectiveAllow(final int effectiveAllow) {
        this.effectiveAllow = effectiveAllow;
    }

    /**
    * This is the combination of all of the explicit and inherited permissions for this identity on this token.  These are the permissions used when determining if a given user has permission to perform an action.
    */
    public int getEffectiveDeny() {
        return effectiveDeny;
    }

    /**
    * This is the combination of all of the explicit and inherited permissions for this identity on this token.  These are the permissions used when determining if a given user has permission to perform an action.
    */
    public void setEffectiveDeny(final int effectiveDeny) {
        this.effectiveDeny = effectiveDeny;
    }

    /**
    * These are the permissions that are inherited for this identity on this token.  If the token does not inherit permissions this will be 0.  Note that any permissions that have been explicitly set on this token for this identity, or any groups that this identity is a part of, are not included here.
    */
    public int getInheritedAllow() {
        return inheritedAllow;
    }

    /**
    * These are the permissions that are inherited for this identity on this token.  If the token does not inherit permissions this will be 0.  Note that any permissions that have been explicitly set on this token for this identity, or any groups that this identity is a part of, are not included here.
    */
    public void setInheritedAllow(final int inheritedAllow) {
        this.inheritedAllow = inheritedAllow;
    }

    /**
    * These are the permissions that are inherited for this identity on this token.  If the token does not inherit permissions this will be 0.  Note that any permissions that have been explicitly set on this token for this identity, or any groups that this identity is a part of, are not included here.
    */
    public int getInheritedDeny() {
        return inheritedDeny;
    }

    /**
    * These are the permissions that are inherited for this identity on this token.  If the token does not inherit permissions this will be 0.  Note that any permissions that have been explicitly set on this token for this identity, or any groups that this identity is a part of, are not included here.
    */
    public void setInheritedDeny(final int inheritedDeny) {
        this.inheritedDeny = inheritedDeny;
    }
}
