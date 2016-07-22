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

import java.util.ArrayList;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Class for describing the details of a TeamFoundationSecurityNamespace.
 * 
 */
public class SecurityNamespaceDescription {

    /**
    * The list of actions that this Security Namespace is responsible for securing.
    */
    private ArrayList<ActionDefinition> actions;
    /**
    * This is the dataspace category that describes where the security information for this SecurityNamespace should be stored.
    */
    private String dataspaceCategory;
    /**
    * This localized name for this namespace.
    */
    private String displayName;
    /**
    * If the security tokens this namespace will be operating on need to be split on certain character lengths to determine its elements, that length should be specified here. If not, this value will be -1.
    */
    private int elementLength;
    /**
    * This is the type of the extension that should be loaded from the plugins directory for extending this security namespace.
    */
    private String extensionType;
    /**
    * If true, the security namespace is remotable, allowing another service to proxy the namespace.
    */
    private boolean isRemotable;
    /**
    * This non-localized for this namespace.
    */
    private String name;
    /**
    * The unique identifier for this namespace.
    */
    private UUID namespaceId;
    /**
    * The permission bits needed by a user in order to read security data on the Security Namespace.
    */
    private int readPermission;
    /**
    * If the security tokens this namespace will be operating on need to be split on certain characters to determine its elements that character should be specified here. If not, this value will be the null character.
    */
    private char separatorValue;
    /**
    * Used to send information about the structure of the security namespace over the web service.
    */
    private int structureValue;
    /**
    * If true, the security service will expect an ISecurityDataspaceTokenTranslator plugin to exist for this namespace
    */
    private boolean useTokenTranslator;
    /**
    * The permission bits needed by a user in order to modify security data on the Security Namespace.
    */
    private int writePermission;

    /**
    * The list of actions that this Security Namespace is responsible for securing.
    */
    public ArrayList<ActionDefinition> getActions() {
        return actions;
    }

    /**
    * The list of actions that this Security Namespace is responsible for securing.
    */
    public void setActions(final ArrayList<ActionDefinition> actions) {
        this.actions = actions;
    }

    /**
    * This is the dataspace category that describes where the security information for this SecurityNamespace should be stored.
    */
    public String getDataspaceCategory() {
        return dataspaceCategory;
    }

    /**
    * This is the dataspace category that describes where the security information for this SecurityNamespace should be stored.
    */
    public void setDataspaceCategory(final String dataspaceCategory) {
        this.dataspaceCategory = dataspaceCategory;
    }

    /**
    * This localized name for this namespace.
    */
    public String getDisplayName() {
        return displayName;
    }

    /**
    * This localized name for this namespace.
    */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
    * If the security tokens this namespace will be operating on need to be split on certain character lengths to determine its elements, that length should be specified here. If not, this value will be -1.
    */
    public int getElementLength() {
        return elementLength;
    }

    /**
    * If the security tokens this namespace will be operating on need to be split on certain character lengths to determine its elements, that length should be specified here. If not, this value will be -1.
    */
    public void setElementLength(final int elementLength) {
        this.elementLength = elementLength;
    }

    /**
    * This is the type of the extension that should be loaded from the plugins directory for extending this security namespace.
    */
    public String getExtensionType() {
        return extensionType;
    }

    /**
    * This is the type of the extension that should be loaded from the plugins directory for extending this security namespace.
    */
    public void setExtensionType(final String extensionType) {
        this.extensionType = extensionType;
    }

    /**
    * If true, the security namespace is remotable, allowing another service to proxy the namespace.
    */
    @JsonProperty("isRemotable")
    public boolean isRemotable() {
        return isRemotable;
    }

    /**
    * If true, the security namespace is remotable, allowing another service to proxy the namespace.
    */
    @JsonProperty("isRemotable")
    public void setRemotable(final boolean isRemotable) {
        this.isRemotable = isRemotable;
    }

    /**
    * This non-localized for this namespace.
    */
    public String getName() {
        return name;
    }

    /**
    * This non-localized for this namespace.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * The unique identifier for this namespace.
    */
    public UUID getNamespaceId() {
        return namespaceId;
    }

    /**
    * The unique identifier for this namespace.
    */
    public void setNamespaceId(final UUID namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
    * The permission bits needed by a user in order to read security data on the Security Namespace.
    */
    public int getReadPermission() {
        return readPermission;
    }

    /**
    * The permission bits needed by a user in order to read security data on the Security Namespace.
    */
    public void setReadPermission(final int readPermission) {
        this.readPermission = readPermission;
    }

    /**
    * If the security tokens this namespace will be operating on need to be split on certain characters to determine its elements that character should be specified here. If not, this value will be the null character.
    */
    public char getSeparatorValue() {
        return separatorValue;
    }

    /**
    * If the security tokens this namespace will be operating on need to be split on certain characters to determine its elements that character should be specified here. If not, this value will be the null character.
    */
    public void setSeparatorValue(final char separatorValue) {
        this.separatorValue = separatorValue;
    }

    /**
    * Used to send information about the structure of the security namespace over the web service.
    */
    public int getStructureValue() {
        return structureValue;
    }

    /**
    * Used to send information about the structure of the security namespace over the web service.
    */
    public void setStructureValue(final int structureValue) {
        this.structureValue = structureValue;
    }

    /**
    * If true, the security service will expect an ISecurityDataspaceTokenTranslator plugin to exist for this namespace
    */
    public boolean getUseTokenTranslator() {
        return useTokenTranslator;
    }

    /**
    * If true, the security service will expect an ISecurityDataspaceTokenTranslator plugin to exist for this namespace
    */
    public void setUseTokenTranslator(final boolean useTokenTranslator) {
        this.useTokenTranslator = useTokenTranslator;
    }

    /**
    * The permission bits needed by a user in order to modify security data on the Security Namespace.
    */
    public int getWritePermission() {
        return writePermission;
    }

    /**
    * The permission bits needed by a user in order to modify security data on the Security Namespace.
    */
    public void setWritePermission(final int writePermission) {
        this.writePermission = writePermission;
    }
}
