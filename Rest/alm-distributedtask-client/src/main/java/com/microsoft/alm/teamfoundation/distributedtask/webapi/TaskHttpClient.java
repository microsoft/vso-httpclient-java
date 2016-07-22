// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.microsoft.alm.client.VssRestClientHandler;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public class TaskHttpClient extends TaskHttpClientBase {

    public TaskHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    /**
     * @param records
     *
     * @param scopeIdentifier
     *        The project GUID to scope the request
     * @param hubName
     *        The name of the server hub: &quot;build&quot; for the Build server
     *        or &quot;rm&quot; for the Release Management server
     * @param planId
     *
     * @param timelineId
     *
     * @return List&lt;TimelineRecord&gt;
     */
    public List<TimelineRecord> updateRecords(
        final List<TimelineRecord> records,
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId) {
        return super.updateRecords(
            VssJsonCollectionWrapper.newInstance(records),
            scopeIdentifier,
            hubName,
            planId,
            timelineId);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @return Response
     */
    public Timeline getTimeline(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId) {
        return super.getTimeline(scopeIdentifier, hubName, planId, timelineId, (Integer) null, (Boolean) null);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @param includeRecords
     * 
     * @return Response
     */
    public Timeline getTimeline(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId,
        final boolean includeRecords) {
        return super.getTimeline(scopeIdentifier, hubName, planId, timelineId, (Integer) null, includeRecords);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @param changeId
     * 
     * @return Response
     */
    public Timeline getTimeline(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId,
        final int changeId) {
        return super.getTimeline(scopeIdentifier, hubName, planId, timelineId, changeId, (Boolean) null);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @return List&lt;TimelineRecord&gt;
     */
    public List<TimelineRecord> getRecords(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId) {
        return super.getRecords(scopeIdentifier, hubName, planId, timelineId, (Integer) null);
    }
}
