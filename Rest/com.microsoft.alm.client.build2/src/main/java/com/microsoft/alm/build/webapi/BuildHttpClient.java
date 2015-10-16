package com.microsoft.alm.build.webapi;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.microsoft.alm.build.webapi.model.Build;
import com.microsoft.alm.build.webapi.model.BuildDefinition;
import com.microsoft.alm.build.webapi.model.DefinitionReference;
import com.microsoft.alm.client.utils.ArgumentUtility;

import javax.ws.rs.client.Client;

public class BuildHttpClient
    extends BuildHttpClientBase
{

    public BuildHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }
    /**
     * Add new build definition
     * 
     * @param definition
     * @return BuildDefinition
     */
    public BuildDefinition addDefinition(final BuildDefinition definition)
    {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.createDefinition(definition, definition.getProject().getId(), null, null);
    }

    /**
     * Add new build definition
     * 
     * @param definition
     * @param definitionToCloneId
     * @return BuildDefinition
     */
    public BuildDefinition addDefinition(final BuildDefinition definition, final int definitionToCloneId)
    {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.createDefinition(definition, definition.getProject().getId(), definitionToCloneId, null);
    }

    /**
     * Add new build definition
     * 
     * @param definition
     * @param definitionToCloneId
     * @param definitionToCloneRevision
     * @return BuildDefinition
     */
    public BuildDefinition addDefinition(
        final BuildDefinition definition,
        final int definitionToCloneId,
        final int definitionToCloneRevision)
    {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.createDefinition(
            definition,
            definition.getProject().getId(),
            definitionToCloneId,
            definitionToCloneRevision);
    }

    /**
     * Get build definitions in team project
     * 
     * @param project
     * @return List&lt;BuildDefinitionReference&gt;
     */
    public List<DefinitionReference> getDefinitions(final UUID project)
    {
        return super.getDefinitions(project, null, null);
    }

    /**
     * Gets a build
     * 
     * @param project
     *        Project ID or project name
     * @param buildId
     *        A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(final String project, final int buildId)
    {
        return super.getBuild(project, buildId, null);
    }

    /**
     * Gets a build
     * 
     * @param project
     *        Project ID or project name
     * @param buildId
     *        A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(final UUID project, final int buildId)
    {
        return super.getBuild(project, buildId, null);
    }

    /**
     * Queue a build
     * 
     * @param build
     * @return Build
     */
    public Build queueBuild(final Build build)
    {
        ArgumentUtility.checkForNull(build, "build"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(build.getProject(), "build.Project"); //$NON-NLS-1$
        return super.queueBuild(build, build.getProject().getId(), null);
    }

    /**
     * Queue a build
     * 
     * @param build
     * @param ignoreWarnings
     * @return Build
     */

    /**
     * Queue a build
     * 
     * @param build
     * @param ignoreWarnings
     * @return Build
     */
    public Build queueBuild(final Build build, final boolean ignoreWarnings)
    {
        ArgumentUtility.checkForNull(build, "build"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(build.getProject(), "build.Project"); //$NON-NLS-1$
        return super.queueBuild(build, build.getProject().getId(), ignoreWarnings);
    }

    /**
     * Update a build
     * 
     * @param build
     * @param buildId
     * @return Build
     */
    @Override
    public Build updateBuild(final Build build, final int buildId)
    {
        ArgumentUtility.checkForNull(build, "build"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(build.getProject(), "build.Project"); //$NON-NLS-1$
        return super.updateBuild(build, build.getProject().getId(), buildId);
    }

    /**
     * Update a build definition
     * 
     * @param definition
     * @return BuildDefinition
     */
    public BuildDefinition updateDefinition(final BuildDefinition definition, final int definitionId)
    {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.updateDefinition(definition, definition.getProject().getId(), definitionId, null, null);
    }
}
