package com.microsoft.alm.core.webapi;

import java.net.URI;
import java.util.List;

import com.microsoft.alm.common.ProjectState;
import com.microsoft.alm.core.webapi.model.TeamProject;
import com.microsoft.alm.core.webapi.model.TeamProjectReference;
import com.microsoft.alm.client.utils.ArgumentUtility;

import javax.ws.rs.client.Client;

public class CoreHttpClient
    extends com.microsoft.alm.core.webapi.CoreHttpClientBase
{

    public CoreHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }
    /**
     * Get TeamProject
     * 
     * @param projectId
     * @return TeamProject
     */
    public TeamProject getProject(final String projectId)
    {
        ArgumentUtility.checkStringForNullOrEmpty(projectId, "projectId", true); //$NON-NLS-1$
        return super.getProject(projectId, null, null);
    }

    /**
     * Get TeamProject
     * 
     * @param projectId
     * @param includeCapabilities
     * @return TeamProject
     */
    public TeamProject getProject(final String projectId, final boolean includeCapabilities)
    {
        ArgumentUtility.checkStringForNullOrEmpty(projectId, "projectId", true); //$NON-NLS-1$
        return super.getProject(projectId, includeCapabilities, null);
    }

    /**
     * Get TeamProject
     * 
     * @param projectId
     * @param includeCapabilities
     * @param includeHistory
     * @return TeamProject
     */
    public TeamProject getProject(
        final String projectId,
        final boolean includeCapabilities,
        final boolean includeHistory)
    {
        ArgumentUtility.checkStringForNullOrEmpty(projectId, "projectId", true); //$NON-NLS-1$
        return super.getProject(projectId, includeCapabilities, includeHistory);
    }

    /**
     * Get TeamProjects
     * 
     * @return List&lt;TeamProjectReference&gt;
     */
    public List<TeamProjectReference> getProjects()
    {
        return super.getProjects(null, null, null);
    }

    /**
     * Get TeamProjects
     * 
     * @param stateFilter
     * @return List&lt;TeamProjectReference&gt;
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter)
    {
        ArgumentUtility.checkForNull(stateFilter, "stateFilter"); //$NON-NLS-1$
        return super.getProjects(stateFilter, null, null);
    }

    /**
     * Get TeamProjects
     * 
     * @param stateFilter
     * @param top
     * @return List&lt;TeamProjectReference&gt;
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter, final int top)
    {
        ArgumentUtility.checkForNull(stateFilter, "stateFilter"); //$NON-NLS-1$
        return super.getProjects(stateFilter, top, null);
    }

    /**
     * Get TeamProjects
     * 
     * @param stateFilter
     * @param top
     * @param skip
     * @return List&lt;TeamProjectReference&gt;
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter, final int top, final int skip)
    {
        ArgumentUtility.checkForNull(stateFilter, "stateFilter"); //$NON-NLS-1$
        return super.getProjects(stateFilter, top, skip);
    }
}
