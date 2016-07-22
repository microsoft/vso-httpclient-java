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

package com.microsoft.alm.teamfoundation.chat.webapi;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.HttpMethod;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.client.VssMediaTypes;
import com.microsoft.alm.client.VssRestClientHandler;
import com.microsoft.alm.client.VssRestRequest;
import com.microsoft.alm.teamfoundation.chat.webapi.Message;
import com.microsoft.alm.teamfoundation.chat.webapi.MessageData;
import com.microsoft.alm.teamfoundation.chat.webapi.Room;
import com.microsoft.alm.teamfoundation.chat.webapi.RoomData;
import com.microsoft.alm.teamfoundation.chat.webapi.User;
import com.microsoft.alm.teamfoundation.chat.webapi.UserData;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class ChatHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of ChatHttpClientBase
    *
    * @param jaxrsClient
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected ChatHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1] Delete a given chat message
     * 
     * @param roomId 
     *            Id of the room
     * @param messageId 
     *            Id of the message to delete
     */
    public void deleteMessage(
        final int roomId, 
        final int messageId) { 

        final UUID locationId = UUID.fromString("7d11c820-4bdc-4bca-8957-9d74e32cdd20"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$
        routeValues.put("messageId", messageId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve a listing of all chat messages in a given room
     * 
     * @param roomId 
     *            Id of the room
     * @return ArrayList&lt;Message&gt;
     */
    public ArrayList<Message> getChatRoomMessages(final int roomId) { 

        final UUID locationId = UUID.fromString("7d11c820-4bdc-4bca-8957-9d74e32cdd20"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Message>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve information on a single chat message
     * 
     * @param roomId 
     *            Id of the room
     * @param messageId 
     *            Id of the message to retrieve
     * @return Message
     */
    public Message getChatRoomMessageById(
        final int roomId, 
        final int messageId) { 

        final UUID locationId = UUID.fromString("7d11c820-4bdc-4bca-8957-9d74e32cdd20"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$
        routeValues.put("messageId", messageId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Message.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Post message to a room
     * 
     * @param messageUpdate 
     *            Content of the message to post
     * @param roomId 
     *            Id of the room
     * @return Message
     */
    public Message sendMessageToRoom(
        final MessageData messageUpdate, 
        final int roomId) { 

        final UUID locationId = UUID.fromString("7d11c820-4bdc-4bca-8957-9d74e32cdd20"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               messageUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Message.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update a given chat message
     * 
     * @param messageUpdate 
     *            New message content
     * @param roomId 
     *            Id of the room
     * @param messageId 
     *            Id of the message
     * @return Message
     */
    public Message updateChatMessage(
        final MessageData messageUpdate, 
        final int roomId, 
        final int messageId) { 

        final UUID locationId = UUID.fromString("7d11c820-4bdc-4bca-8957-9d74e32cdd20"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$
        routeValues.put("messageId", messageId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               messageUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Message.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Create a single chat room
     * 
     * @param roomUpdate 
     *            Information to create the room
     * @return Room
     */
    public Room createChatRoom(final RoomData roomUpdate) { 

        final UUID locationId = UUID.fromString("3d0e7ee0-a6c9-497e-9a2c-23b687e860e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               roomUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Room.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Delete a given chat room
     * 
     * @param roomId 
     *            Id of the room
     */
    public void deleteChatRoom(final int roomId) { 

        final UUID locationId = UUID.fromString("3d0e7ee0-a6c9-497e-9a2c-23b687e860e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return ArrayList&lt;Room&gt;
     */
    public ArrayList<Room> getRooms() { 

        final UUID locationId = UUID.fromString("3d0e7ee0-a6c9-497e-9a2c-23b687e860e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Room>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve information on a single chat room
     * 
     * @param roomId 
     *            Id of the room to retrieve
     * @return Room
     */
    public Room getChatRoomById(final int roomId) { 

        final UUID locationId = UUID.fromString("3d0e7ee0-a6c9-497e-9a2c-23b687e860e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Room.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update information on a single chat room
     * 
     * @param roomUpdate 
     *            Room information
     * @param roomId 
     *            Id of the room to update
     * @return Room
     */
    public Room updateChatRoom(
        final RoomData roomUpdate, 
        final int roomId) { 

        final UUID locationId = UUID.fromString("3d0e7ee0-a6c9-497e-9a2c-23b687e860e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               roomUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Room.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve a listing of all chat users
     * 
     * @param roomId 
     *            Id of the room
     * @return ArrayList&lt;User&gt;
     */
    public ArrayList<User> getChatRoomUsers(final int roomId) { 

        final UUID locationId = UUID.fromString("01408881-1a9a-4cc9-981d-9333e354e9d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<User>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve information on a single chat user
     * 
     * @param roomId 
     *            Id of the room
     * @param userId 
     *            TfId of the user
     * @return User
     */
    public User getChatRoomUserById(
        final int roomId, 
        final UUID userId) { 

        final UUID locationId = UUID.fromString("01408881-1a9a-4cc9-981d-9333e354e9d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$
        routeValues.put("userId", userId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, User.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Joins a user to a given room
     * 
     * @param userUpdate 
     *            user model information
     * @param roomId 
     *            Id of the room
     * @param userId 
     *            TfId of the user
     */
    public void joinRoom(
        final UserData userUpdate, 
        final int roomId, 
        final UUID userId) { 

        final UUID locationId = UUID.fromString("01408881-1a9a-4cc9-981d-9333e354e9d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$
        routeValues.put("userId", userId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               userUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Leaves a user from a given room
     * 
     * @param roomId 
     *            Id of the room
     * @param userId 
     *            TfId of the user
     */
    public void leaveRoom(
        final int roomId, 
        final UUID userId) { 

        final UUID locationId = UUID.fromString("01408881-1a9a-4cc9-981d-9333e354e9d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("roomId", roomId); //$NON-NLS-1$
        routeValues.put("userId", userId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }
}
