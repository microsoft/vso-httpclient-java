package com.microsoft.alm.client.entitytypes;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLink;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;

public class EntityWithReferenceLinks {
    private int fieldA;
    private ReferenceLinks links;

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(final int fieldA) {
        this.fieldA = fieldA;
    }

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof EntityWithReferenceLinks)) {
            return false;
        }

        final EntityWithReferenceLinks o = (EntityWithReferenceLinks) obj;

        if (fieldA != o.getFieldA()) {
            return false;
        }

        return equals(links, o.getLinks());
    }

    private boolean equals(final ReferenceLinks r1, final ReferenceLinks r2) {
        final Map<String, Object> l1 = r1.getLinks();
        final Map<String, Object> l2 = r2.getLinks();

        if (l1 == null || l2 == null || l1.size() != l2.size()) {
            return false;
        }

        for (final Entry<String, Object> e : l1.entrySet()) {
            if (!l2.containsKey(e.getKey())) {
                return false;
            }

            final Object v1 = e.getValue();
            final Object v2 = l1.get(e.getKey());

            if (v1.getClass() != v2.getClass()) {
                return false;
            }

            if (v1 instanceof ReferenceLink) {
                return ((ReferenceLink) v1).getHref().equals(((ReferenceLink) v1).getHref());
            }

            if (!(v1 instanceof List<?>)) {
                return false;
            }

            if (!equals((List<?>) v1, (List<?>) v2)) {
                return false;
            }
        }

        return true;
    }

    private boolean equals(final List<?> list1, final List<?> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (final Object o : list1) {
            if (!(o instanceof ReferenceLink)) {
                return false;
            }

            if (!list2.contains(o)) {
                return false;
            }
        }

        return true;
    }
}
