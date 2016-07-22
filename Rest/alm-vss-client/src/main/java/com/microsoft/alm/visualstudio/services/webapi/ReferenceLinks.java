// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.webapi;

import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(using = ReferenceLinksDeserializer.class)
@JsonSerialize(using = ReferenceLinksSerializer.class)
public class ReferenceLinks {

    private Map<String, Object> links;

    public Map<String, Object> getLinks() {
        return links;
    }

    public void setLinks(final Map<String, Object> links) {
        this.links = links;
    }
}
