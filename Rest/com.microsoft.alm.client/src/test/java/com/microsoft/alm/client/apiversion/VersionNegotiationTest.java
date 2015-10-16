package com.microsoft.alm.client.apiversion;

import com.microsoft.alm.client.AlmHttpClientBase;
import com.microsoft.alm.client.model.ApiResourceLocation;
import com.microsoft.alm.client.moke.MokeClient;
import junit.framework.TestCase;

import com.microsoft.alm.client.model.ApiResourceVersion;

import javax.ws.rs.client.Client;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by arukhlin on 6/19/2015.
 */
public class VersionNegotiationTest
        extends TestCase {

    private final TestClient client = new TestClient();

    public void testSameVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("1.0", "1.0", 1); //not released
        version = new ApiResourceVersion("1.0-preview.1");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals(version.toString(), negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", "1.0", 1); //released
        version = new ApiResourceVersion("1.0");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals(version.toString(), negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", "1.0", 1); //released
        version = new ApiResourceVersion("1.0-preview.1");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals(version.toString(), negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", 1); //not released
        version = new ApiResourceVersion("1.0");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview", negotiatedVersion.toString());
    }

    public void testDeprecatedVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("2.0", "2.0", 3); //not released
        version = new ApiResourceVersion("1.0-preview.3");
        negotiatedVersion = client.negotiate(location, version);

        assertNull(negotiatedVersion);

        location = createLocation("2.0", "2.0", 3); //not released
        version = new ApiResourceVersion("1.0-preview");
        negotiatedVersion = client.negotiate(location, version);

        assertNull(negotiatedVersion);

        location = createLocation("2.0", "2.0", 3); //not released
        version = new ApiResourceVersion("1.0");
        negotiatedVersion = client.negotiate(location, version);

        assertNull(negotiatedVersion);
    }

    public void testNewerVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("1.0", "1.0", 2); //not released
        version = new ApiResourceVersion("2.0-preview.3");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview", negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", "1.0", 2); //not released
        version = new ApiResourceVersion("2.0-preview.3");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0", negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", "1.0", 2); //not released
        version = new ApiResourceVersion("2.0");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0", negotiatedVersion.toString());
    }

    public void testSupportedVersion() {
        ApiResourceLocation location;
        ApiResourceVersion version;
        ApiResourceVersion negotiatedVersion;

        location = createLocation("1.0", "1.0", 2); //not released
        version = new ApiResourceVersion("1.0-preview.1");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview.1", negotiatedVersion.toString());

        location = createLocation("1.0", "1.0", "1.0", 2); //not released
        version = new ApiResourceVersion("1.0-preview.3");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("1.0-preview.2", negotiatedVersion.toString());

        location = createLocation("1.0", "3.0", "2.0", 5); //not released
        version = new ApiResourceVersion("2.0");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("2.0", negotiatedVersion.toString());

        location = createLocation("1.0", "3.0", "2.0", 5); //not released
        version = new ApiResourceVersion("3.0");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("3.0-preview", negotiatedVersion.toString());

        location = createLocation("1.0", "3.0", "2.0", 5); //not released
        version = new ApiResourceVersion("3.0-preview.4");
        negotiatedVersion = client.negotiate(location, version);

        assertNotNull(negotiatedVersion);
        assertEquals("3.0-preview.4", negotiatedVersion.toString());
    }

    private ApiResourceLocation createLocation(final String minVersion,
                                               final String maxVersion,
                                               final int resourceVersion) {
        return createLocation(minVersion, maxVersion, "0.0", resourceVersion);
    }

    private ApiResourceLocation createLocation(final String minVersion,
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

    private static class TestClient
            extends AlmHttpClientBase {

        final static Client client = new MokeClient();
        final static URI testUri = getBaseUri("http://ar01.me.tfsallin.net:81/DefaultCollection"); //$NON-NLS-1$

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
            super(client, testUri);
        }

        public ApiResourceVersion negotiate(ApiResourceLocation location, ApiResourceVersion version) {
            return super.negotiateRequestVersion(location, version);
        }
    }
}
