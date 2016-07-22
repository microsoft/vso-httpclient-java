// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client.apiversion;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.client.Client;

import com.microsoft.alm.client.DefaultRestClientHandler;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.client.moke.MokeClient;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocation;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

import junit.framework.TestCase;

/**
 * Created by arukhlin on 6/19/2015.
 */
public class VersionNegotiationTest extends TestCase {

    private final TestClient client = new TestClient();

    public void testSameVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("1.0", "1.0", 1); // not //$NON-NLS-1$ //$NON-NLS-2$
                                                    // released
        version = new ApiResourceVersion("1.0-preview.1"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals(version.toString(), negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", "1.0", 1); // released //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        version = new ApiResourceVersion("1.0"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals(version.toString(), negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", "1.0", 1); // released //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        version = new ApiResourceVersion("1.0-preview.1"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals(version.toString(), negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", 1); // not //$NON-NLS-1$ //$NON-NLS-2$
                                                    // released
        version = new ApiResourceVersion("1.0"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview", negotiatedVersion.toString()); //$NON-NLS-1$
    }

    public void testDeprecatedVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("2.0", "2.0", 3); // not //$NON-NLS-1$ //$NON-NLS-2$
                                                    // released
        version = new ApiResourceVersion("1.0-preview.3"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNull(negotiatedVersion);

        location = createLocation("2.0", "2.0", 3); // not //$NON-NLS-1$ //$NON-NLS-2$
                                                    // released
        version = new ApiResourceVersion("1.0-preview"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNull(negotiatedVersion);

        location = createLocation("2.0", "2.0", 3); // not //$NON-NLS-1$ //$NON-NLS-2$
                                                    // released
        version = new ApiResourceVersion("1.0"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNull(negotiatedVersion);
    }

    public void testNewerVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("1.0", "1.0", 2); // not //$NON-NLS-1$ //$NON-NLS-2$
                                                    // released
        version = new ApiResourceVersion("2.0-preview.3"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview", negotiatedVersion.toString()); //$NON-NLS-1$

        location = createLocation("1.0", "1.0", "1.0", 2); // not //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                           // released
        version = new ApiResourceVersion("2.0-preview.3"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0", negotiatedVersion.toString()); //$NON-NLS-1$

        location = createLocation("1.0", "1.0", "1.0", 2); // not //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                           // released
        version = new ApiResourceVersion("2.0"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0", negotiatedVersion.toString()); //$NON-NLS-1$
    }

    public void testSupportedVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("1.0", "1.0", 2); // not //$NON-NLS-1$ //$NON-NLS-2$
                                                    // released
        version = new ApiResourceVersion("1.0-preview.1"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview.1", negotiatedVersion.toString()); //$NON-NLS-1$

        location = createLocation("1.0", "1.0", "1.0", 2); // not //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                           // released
        version = new ApiResourceVersion("1.0-preview.3"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview.2", negotiatedVersion.toString()); //$NON-NLS-1$

        location = createLocation("1.0", "3.0", "2.0", 5); // not //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                           // released
        version = new ApiResourceVersion("2.0"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("2.0", negotiatedVersion.toString()); //$NON-NLS-1$

        location = createLocation("1.0", "3.0", "2.0", 5); // not //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                           // released
        version = new ApiResourceVersion("3.0"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("3.0-preview", negotiatedVersion.toString()); //$NON-NLS-1$

        location = createLocation("1.0", "3.0", "2.0", 5); // not //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                           // released
        version = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("3.0-preview.4", negotiatedVersion.toString()); //$NON-NLS-1$
    }

    private ApiResourceLocation createLocation(
        final String minVersion,
        final String maxVersion,
        final int resourceVersion) {
        return createLocation(minVersion, maxVersion, "0.0", resourceVersion); //$NON-NLS-1$
    }

    private ApiResourceLocation createLocation(
        final String minVersion,
        final String maxVersion,
        final String releasedVersion,
        final int resourceVersion) {
        final ApiResourceLocation location = new ApiResourceLocation();

        location.setMinVersionString(minVersion);
        location.setMaxVersionString(maxVersion);
        location.setReleasedVersionString(releasedVersion);
        location.setResourceVersion(resourceVersion);

        return location;
    }

    private static class TestClient extends VssHttpClientBase {

        final static Client client = new MokeClient();
        final static URI testUri = getBaseUri("http://ar01.me.tfsallin.net:81/DefaultCollection"); //$NON-NLS-1$
        final static DefaultRestClientHandler clientHandler = new DefaultRestClientHandler(client);

        private static URI getBaseUri(final String uri) {
            try {
                return new URI(uri);
            } catch (URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return null;
        }

        public TestClient() {
            super(clientHandler, testUri);
        }

        public ApiResourceVersion negotiate(ApiResourceLocation location, ApiResourceVersion version) {
            return clientHandler.negotiateRequestVersion(location, version);
        }
    }
}
