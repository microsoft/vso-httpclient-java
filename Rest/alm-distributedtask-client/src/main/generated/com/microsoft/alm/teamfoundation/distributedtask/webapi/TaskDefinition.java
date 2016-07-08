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

import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.client.json.JObject;

/** 
 */
public class TaskDefinition {

    private TaskExecution agentExecution;
    private String author;
    private String category;
    private boolean contentsUploaded;
    private String contributionIdentifier;
    private String contributionVersion;
    private List<DataSourceBinding> dataSourceBindings;
    private String definitionType;
    private List<Demand> demands;
    private String description;
    private boolean disabled;
    private Map<String, JObject> execution;
    private String friendlyName;
    private List<TaskGroupDefinition> groups;
    private String helpMarkDown;
    private String hostType;
    private String iconUrl;
    private UUID id;
    private List<TaskInputDefinition> inputs;
    private String instanceNameFormat;
    private String minimumAgentVersion;
    private String name;
    private String packageLocation;
    private String packageType;
    private boolean serverOwned;
    private List<TaskSourceDefinition> sourceDefinitions;
    private String sourceLocation;
    private TaskVersion version;
    private List<String> visibility;

    public TaskExecution getAgentExecution() {
        return agentExecution;
    }

    public void setAgentExecution(final TaskExecution agentExecution) {
        this.agentExecution = agentExecution;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public boolean getContentsUploaded() {
        return contentsUploaded;
    }

    public void setContentsUploaded(final boolean contentsUploaded) {
        this.contentsUploaded = contentsUploaded;
    }

    public String getContributionIdentifier() {
        return contributionIdentifier;
    }

    public void setContributionIdentifier(final String contributionIdentifier) {
        this.contributionIdentifier = contributionIdentifier;
    }

    public String getContributionVersion() {
        return contributionVersion;
    }

    public void setContributionVersion(final String contributionVersion) {
        this.contributionVersion = contributionVersion;
    }

    public List<DataSourceBinding> getDataSourceBindings() {
        return dataSourceBindings;
    }

    public void setDataSourceBindings(final List<DataSourceBinding> dataSourceBindings) {
        this.dataSourceBindings = dataSourceBindings;
    }

    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(final String definitionType) {
        this.definitionType = definitionType;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(final boolean disabled) {
        this.disabled = disabled;
    }

    public Map<String, JObject> getExecution() {
        return execution;
    }

    public void setExecution(final Map<String, JObject> execution) {
        this.execution = execution;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public List<TaskGroupDefinition> getGroups() {
        return groups;
    }

    public void setGroups(final List<TaskGroupDefinition> groups) {
        this.groups = groups;
    }

    public String getHelpMarkDown() {
        return helpMarkDown;
    }

    public void setHelpMarkDown(final String helpMarkDown) {
        this.helpMarkDown = helpMarkDown;
    }

    public String getHostType() {
        return hostType;
    }

    public void setHostType(final String hostType) {
        this.hostType = hostType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(final String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public List<TaskInputDefinition> getInputs() {
        return inputs;
    }

    public void setInputs(final List<TaskInputDefinition> inputs) {
        this.inputs = inputs;
    }

    public String getInstanceNameFormat() {
        return instanceNameFormat;
    }

    public void setInstanceNameFormat(final String instanceNameFormat) {
        this.instanceNameFormat = instanceNameFormat;
    }

    public String getMinimumAgentVersion() {
        return minimumAgentVersion;
    }

    public void setMinimumAgentVersion(final String minimumAgentVersion) {
        this.minimumAgentVersion = minimumAgentVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPackageLocation() {
        return packageLocation;
    }

    public void setPackageLocation(final String packageLocation) {
        this.packageLocation = packageLocation;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(final String packageType) {
        this.packageType = packageType;
    }

    public boolean getServerOwned() {
        return serverOwned;
    }

    public void setServerOwned(final boolean serverOwned) {
        this.serverOwned = serverOwned;
    }

    public List<TaskSourceDefinition> getSourceDefinitions() {
        return sourceDefinitions;
    }

    public void setSourceDefinitions(final List<TaskSourceDefinition> sourceDefinitions) {
        this.sourceDefinitions = sourceDefinitions;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(final String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public TaskVersion getVersion() {
        return version;
    }

    public void setVersion(final TaskVersion version) {
        this.version = version;
    }

    @JsonProperty("visibility")
    public List<String> getVisibilities() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibilities(final List<String> visibility) {
        this.visibility = visibility;
    }
}
