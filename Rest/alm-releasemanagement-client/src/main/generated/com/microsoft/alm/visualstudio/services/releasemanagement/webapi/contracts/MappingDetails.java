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

import java.util.Map;
import com.microsoft.alm.visualstudio.services.forminput.InputValue;

/** 
 */
public class MappingDetails {

    private Map<String, InputValue> mappings;

    public Map<String, InputValue> getMappings() {
        return mappings;
    }

    public void setMappings(final Map<String, InputValue> mappings) {
        this.mappings = mappings;
    }
}
