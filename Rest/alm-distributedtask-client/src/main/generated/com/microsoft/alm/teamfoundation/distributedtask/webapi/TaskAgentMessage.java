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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;


/** 
 * Provides a contract for receiving messages from the task orchestrator.
 * 
 */
public class TaskAgentMessage {

    /**
    * Gets or sets the body of the message. If the IV property is provided the body will need to be decrypted using the TaskAgentSession.EncryptionKey value in addition to the IV.
    */
    private String body;
    /**
    * Gets or sets the intialization vector used to encrypt this message.
    */
    private Byte[] iV;
    /**
    * Gets or sets the message identifier.
    */
    private long messageId;
    /**
    * Gets or sets the message type, describing the data contract found in TaskAgentMessage.Body.
    */
    private String messageType;

    /**
    * Gets or sets the body of the message. If the IV property is provided the body will need to be decrypted using the TaskAgentSession.EncryptionKey value in addition to the IV.
    */
    public String getBody() {
        return body;
    }

    /**
    * Gets or sets the body of the message. If the IV property is provided the body will need to be decrypted using the TaskAgentSession.EncryptionKey value in addition to the IV.
    */
    public void setBody(final String body) {
        this.body = body;
    }

    /**
    * Gets or sets the intialization vector used to encrypt this message.
    */
    public Byte[] getIV() {
        return iV;
    }

    /**
    * Gets or sets the intialization vector used to encrypt this message.
    */
    public void setIV(final Byte[] iV) {
        this.iV = iV;
    }

    /**
    * Gets or sets the message identifier.
    */
    public long getMessageId() {
        return messageId;
    }

    /**
    * Gets or sets the message identifier.
    */
    public void setMessageId(final long messageId) {
        this.messageId = messageId;
    }

    /**
    * Gets or sets the message type, describing the data contract found in TaskAgentMessage.Body.
    */
    public String getMessageType() {
        return messageType;
    }

    /**
    * Gets or sets the message type, describing the data contract found in TaskAgentMessage.Body.
    */
    public void setMessageType(final String messageType) {
        this.messageType = messageType;
    }
}
