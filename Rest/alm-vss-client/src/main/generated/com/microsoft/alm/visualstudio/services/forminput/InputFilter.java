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

package com.microsoft.alm.visualstudio.services.forminput;

import java.util.List;

/** 
 * Defines a filter for subscription inputs. The filter matches a set of inputs if any (one or more) of the groups evaluates to true.
 * 
 */
public class InputFilter {

    /**
    * Groups of input filter expressions. This filter matches a set of inputs if any (one or more) of the groups evaluates to true.
    */
    private List<InputFilterCondition> conditions;

    /**
    * Groups of input filter expressions. This filter matches a set of inputs if any (one or more) of the groups evaluates to true.
    */
    public List<InputFilterCondition> getConditions() {
        return conditions;
    }

    /**
    * Groups of input filter expressions. This filter matches a set of inputs if any (one or more) of the groups evaluates to true.
    */
    public void setConditions(final List<InputFilterCondition> conditions) {
        this.conditions = conditions;
    }
}
