// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.microsoft.alm.client.utils.JsonHelper;
import com.microsoft.alm.client.utils.StringUtil;

public class NameValueCollection
    extends HashMap<String, String> {

    public <TValue> void addIfNotEmpty(String parameterName, List<TValue> values) {
        if (values != null && !values.isEmpty()) {
            put(parameterName, StringUtil.join(",", values)); //$NON-NLS-1$
        }
    }

    public void addIfNotEmpty(String parameterName, String value) {
        if (!StringUtil.isNullOrEmpty(value)) {
            put(parameterName, value);
        }
    }

    public <TValue> void addIfNotNull(String parameterName, TValue value) {
        if (value != null) {
            if (value instanceof Date) {
                put(parameterName, JsonHelper.getDateFormat().format((Date) value));
            } else {
                put(parameterName, value.toString());
            }
        }
    }
}
