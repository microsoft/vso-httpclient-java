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

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class Message {

    /**
    * Message content
    */
    private String content;
    /**
    * Message Id
    */
    private int id;
    /**
    * Message Type, currently only plain text is supported.
    */
    private MessageType messageType;
    /**
    * User who posted the message. May be null if message came from a system account
    */
    private IdentityRef postedBy;
    /**
    * Id of the room in which message is posted
    */
    private int postedRoomId;
    /**
    * Message posted time
    */
    private Date postedTime;

    /**
    * Message content
    */
    public String getContent() {
        return content;
    }

    /**
    * Message content
    */
    public void setContent(final String content) {
        this.content = content;
    }

    /**
    * Message Id
    */
    public int getId() {
        return id;
    }

    /**
    * Message Id
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Message Type, currently only plain text is supported.
    */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
    * Message Type, currently only plain text is supported.
    */
    public void setMessageType(final MessageType messageType) {
        this.messageType = messageType;
    }

    /**
    * User who posted the message. May be null if message came from a system account
    */
    public IdentityRef getPostedBy() {
        return postedBy;
    }

    /**
    * User who posted the message. May be null if message came from a system account
    */
    public void setPostedBy(final IdentityRef postedBy) {
        this.postedBy = postedBy;
    }

    /**
    * Id of the room in which message is posted
    */
    public int getPostedRoomId() {
        return postedRoomId;
    }

    /**
    * Id of the room in which message is posted
    */
    public void setPostedRoomId(final int postedRoomId) {
        this.postedRoomId = postedRoomId;
    }

    /**
    * Message posted time
    */
    public Date getPostedTime() {
        return postedTime;
    }

    /**
    * Message posted time
    */
    public void setPostedTime(final Date postedTime) {
        this.postedTime = postedTime;
    }
}
