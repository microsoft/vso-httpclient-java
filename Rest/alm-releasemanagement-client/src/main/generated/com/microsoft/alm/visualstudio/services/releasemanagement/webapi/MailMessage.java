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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.Date;
import java.util.List;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.MailSectionType;

/** 
 */
public class MailMessage {

    private String body;
    private EmailRecipients cC;
    private String inReplyTo;
    private String messageId;
    private Date replyBy;
    private EmailRecipients replyTo;
    private List<MailSectionType> sections;
    private SenderType senderType;
    private String subject;
    private EmailRecipients to;

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    public EmailRecipients getCC() {
        return cC;
    }

    public void setCC(final EmailRecipients cC) {
        this.cC = cC;
    }

    public String getInReplyTo() {
        return inReplyTo;
    }

    public void setInReplyTo(final String inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(final String messageId) {
        this.messageId = messageId;
    }

    public Date getReplyBy() {
        return replyBy;
    }

    public void setReplyBy(final Date replyBy) {
        this.replyBy = replyBy;
    }

    public EmailRecipients getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(final EmailRecipients replyTo) {
        this.replyTo = replyTo;
    }

    public List<MailSectionType> getSections() {
        return sections;
    }

    public void setSections(final List<MailSectionType> sections) {
        this.sections = sections;
    }

    public SenderType getSenderType() {
        return senderType;
    }

    public void setSenderType(final SenderType senderType) {
        this.senderType = senderType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public EmailRecipients getTo() {
        return to;
    }

    public void setTo(final EmailRecipients to) {
        this.to = to;
    }
}
