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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/** 
 */
@JsonDeserialize(using = ReleaseTriggerBaseDeserializer.class)
@JsonSerialize(using = ReleaseTriggerBaseSerializer.class)
public class ReleaseTriggerBase {

    private ReleaseTriggerType triggerType;

    public ReleaseTriggerType getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(final ReleaseTriggerType triggerType) {
        this.triggerType = triggerType;
    }
}
