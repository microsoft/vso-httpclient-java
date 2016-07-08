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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.List;
import com.microsoft.alm.visualstudio.services.forminput.InputDescriptor;

/** 
 */
public class ArtifactTypeDefinition {

    private String displayName;
    private List<InputDescriptor> inputDescriptors;
    private String name;
    private String uniqueSourceIdentifier;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public List<InputDescriptor> getInputDescriptors() {
        return inputDescriptors;
    }

    public void setInputDescriptors(final List<InputDescriptor> inputDescriptors) {
        this.inputDescriptors = inputDescriptors;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUniqueSourceIdentifier() {
        return uniqueSourceIdentifier;
    }

    public void setUniqueSourceIdentifier(final String uniqueSourceIdentifier) {
        this.uniqueSourceIdentifier = uniqueSourceIdentifier;
    }
}
