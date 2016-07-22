package com.microsoft.alm.client;

import com.fasterxml.jackson.core.type.TypeReference;

public interface VssRestResponse {

    boolean isJsonResponse();

    boolean isProxyAuthRequired();

    boolean isSuccessResponse();

    <TEntity> TEntity readEntity(final Class<TEntity> resultClass);

    <TEntity> TEntity readEntity(final TypeReference<TEntity> resultClass);

    String getHeader(final String headerName);

    String getStatusText();

    int getStatusCode();
}
