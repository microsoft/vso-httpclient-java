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

import java.util.ArrayList;

/** 
 * This is the type used for firing notifications intended for the subsystem in the Notifications SDK. For components that can&#039;t take a dependency on the Notifications SDK directly, they can use ITeamFoundationEventService.PublishNotification and the Notifications SDK ISubscriber implementation will get it.
 * 
 */
public class VssNotificationEvent {

    /**
    * Optional: A list of actors which are additional identities with corresponding roles that are relevant to the event.
    */
    private ArrayList<EventActor> actors;
    /**
    * Optional: A list of artifacts referenced or impacted by this event.
    */
    private ArrayList<String> artifactUris;
    /**
    * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise it must have a serialization format attribute.
    */
    private Object data;
    /**
    * Required: The name of the event.  This event must be registered in the context it is being fired.
    */
    private String eventType;

    /**
    * Optional: A list of actors which are additional identities with corresponding roles that are relevant to the event.
    */
    public ArrayList<EventActor> getActors() {
        return actors;
    }

    /**
    * Optional: A list of actors which are additional identities with corresponding roles that are relevant to the event.
    */
    public void setActors(final ArrayList<EventActor> actors) {
        this.actors = actors;
    }

    /**
    * Optional: A list of artifacts referenced or impacted by this event.
    */
    public ArrayList<String> getArtifactUris() {
        return artifactUris;
    }

    /**
    * Optional: A list of artifacts referenced or impacted by this event.
    */
    public void setArtifactUris(final ArrayList<String> artifactUris) {
        this.artifactUris = artifactUris;
    }

    /**
    * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise it must have a serialization format attribute.
    */
    public Object getData() {
        return data;
    }

    /**
    * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise it must have a serialization format attribute.
    */
    public void setData(final Object data) {
        this.data = data;
    }

    /**
    * Required: The name of the event.  This event must be registered in the context it is being fired.
    */
    public String getEventType() {
        return eventType;
    }

    /**
    * Required: The name of the event.  This event must be registered in the context it is being fired.
    */
    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }
}
