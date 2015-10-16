package com.microsoft.visualstudio.services.operations;

import java.util.UUID;

/**
 * 
 * 
 * @author arukhlin
 *
 */
public class OperationReference
{
    private UUID id;
    private OperationStatus status;
    private String url;

    /**
     * The identifier for this operation.
     *
     * @return operation reference ID
     */
    public UUID getId()
    {
        return id;
    }

    /**
     * The identifier for this operation.
     *
     * @param id
     */
    public void setId(final UUID id)
    {
        this.id = id;
    }

    /**
     * The current status of the operation.
     *
     * @return
     */
    public OperationStatus getStatus()
    {
        return status;
    }

    /**
     * The current status of the operation.
     *
     * @param status
     */
    public void setStatus(final OperationStatus status)
    {
        this.status = status;
    }

    /**
     * URL to get the full object.
     *
     * @return
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * URL to get the full object.
     *
     * @param url
     */
    public void setUrl(final String url)
    {
        this.url = url;
    }
}
