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
 */
public class TaskDefinitionEndpoint {

    /**
    * An ID that identifies a service connection to be used for authenticating endpoint requests.
    */
    private String connectionId;
    /**
    * An Json based keyselector to filter response returned by fetching the endpoint Url.A Json based keyselector must be prefixed with &quot;jsonpath:&quot;. KeySelector can be used to specify the filter to get the keys for the values specified with Selector.  The following keyselector defines an Json for extracting nodes named &#039;ServiceName&#039;.  endpoint.KeySelector = &quot;jsonpath://ServiceName&quot;;
    */
    private String keySelector;
    /**
    * The scope as understood by Connected Services. Essentialy, a project-id for now.
    */
    private String scope;
    /**
    * An XPath/Json based selector to filter response returned by fetching the endpoint Url. An XPath based selector must be prefixed with the string &quot;xpath:&quot;. A Json based selector must be prefixed with &quot;jsonpath:&quot;.  The following selector defines an XPath for extracting nodes named &#039;ServiceName&#039;.  endpoint.Selector = &quot;xpath://ServiceName&quot;;
    */
    private String selector;
    /**
    * TaskId that this endpoint belongs to.
    */
    private String taskId;
    /**
    * URL to GET.
    */
    private String url;

    /**
    * An ID that identifies a service connection to be used for authenticating endpoint requests.
    */
    public String getConnectionId() {
        return connectionId;
    }

    /**
    * An ID that identifies a service connection to be used for authenticating endpoint requests.
    */
    public void setConnectionId(final String connectionId) {
        this.connectionId = connectionId;
    }

    /**
    * An Json based keyselector to filter response returned by fetching the endpoint Url.A Json based keyselector must be prefixed with &amp;quot;jsonpath:&amp;quot;. KeySelector can be used to specify the filter to get the keys for the values specified with Selector.  The following keyselector defines an Json for extracting nodes named &amp;#039;ServiceName&amp;#039;.  endpoint.KeySelector = &amp;quot;jsonpath://ServiceName&amp;quot;;
    */
    public String getKeySelector() {
        return keySelector;
    }

    /**
    * An Json based keyselector to filter response returned by fetching the endpoint Url.A Json based keyselector must be prefixed with &amp;quot;jsonpath:&amp;quot;. KeySelector can be used to specify the filter to get the keys for the values specified with Selector.  The following keyselector defines an Json for extracting nodes named &amp;#039;ServiceName&amp;#039;.  endpoint.KeySelector = &amp;quot;jsonpath://ServiceName&amp;quot;;
    */
    public void setKeySelector(final String keySelector) {
        this.keySelector = keySelector;
    }

    /**
    * The scope as understood by Connected Services. Essentialy, a project-id for now.
    */
    public String getScope() {
        return scope;
    }

    /**
    * The scope as understood by Connected Services. Essentialy, a project-id for now.
    */
    public void setScope(final String scope) {
        this.scope = scope;
    }

    /**
    * An XPath/Json based selector to filter response returned by fetching the endpoint Url. An XPath based selector must be prefixed with the string &amp;quot;xpath:&amp;quot;. A Json based selector must be prefixed with &amp;quot;jsonpath:&amp;quot;.  The following selector defines an XPath for extracting nodes named &amp;#039;ServiceName&amp;#039;.  endpoint.Selector = &amp;quot;xpath://ServiceName&amp;quot;;
    */
    public String getSelector() {
        return selector;
    }

    /**
    * An XPath/Json based selector to filter response returned by fetching the endpoint Url. An XPath based selector must be prefixed with the string &amp;quot;xpath:&amp;quot;. A Json based selector must be prefixed with &amp;quot;jsonpath:&amp;quot;.  The following selector defines an XPath for extracting nodes named &amp;#039;ServiceName&amp;#039;.  endpoint.Selector = &amp;quot;xpath://ServiceName&amp;quot;;
    */
    public void setSelector(final String selector) {
        this.selector = selector;
    }

    /**
    * TaskId that this endpoint belongs to.
    */
    public String getTaskId() {
        return taskId;
    }

    /**
    * TaskId that this endpoint belongs to.
    */
    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    /**
    * URL to GET.
    */
    public String getUrl() {
        return url;
    }

    /**
    * URL to GET.
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
