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

package com.microsoft.alm.visualstudio.services.webapi;

import java.util.Map;

/** 
 */
public class ServiceEvent {

    /**
    * This is the id of the type. Constants that will be used by subscribers to identify/filter events being published on a topic.
    */
    private String eventType;
    /**
    * This is the service that published this event.
    */
    private Publisher publisher;
    /**
    * The resource object that carries specific information about the event. The object must have the ServiceEventObject applied for serialization/deserialization to work.
    */
    private Object resource;
    /**
    * This dictionary carries the context descriptors along with their ids.
    */
    private Map<String, Object> resourceContainers;
    /**
    * This is the version of the resource.
    */
    private String resourceVersion;

    /**
    * This is the id of the type. Constants that will be used by subscribers to identify/filter events being published on a topic.
    */
    public String getEventType() {
        return eventType;
    }

    /**
    * This is the id of the type. Constants that will be used by subscribers to identify/filter events being published on a topic.
    */
    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    /**
    * This is the service that published this event.
    */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
    * This is the service that published this event.
    */
    public void setPublisher(final Publisher publisher) {
        this.publisher = publisher;
    }

    /**
    * The resource object that carries specific information about the event. The object must have the ServiceEventObject applied for serialization/deserialization to work.
    */
    public Object getResource() {
        return resource;
    }

    /**
    * The resource object that carries specific information about the event. The object must have the ServiceEventObject applied for serialization/deserialization to work.
    */
    public void setResource(final Object resource) {
        this.resource = resource;
    }

    /**
    * This dictionary carries the context descriptors along with their ids.
    */
    public Map<String, Object> getResourceContainers() {
        return resourceContainers;
    }

    /**
    * This dictionary carries the context descriptors along with their ids.
    */
    public void setResourceContainers(final Map<String, Object> resourceContainers) {
        this.resourceContainers = resourceContainers;
    }

    /**
    * This is the version of the resource.
    */
    public String getResourceVersion() {
        return resourceVersion;
    }

    /**
    * This is the version of the resource.
    */
    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }
}
