// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.webapi;

import java.util.HashMap;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = PropertiesCollectionDeserializer.class)
public class PropertiesCollection extends HashMap<String, String> {
}
