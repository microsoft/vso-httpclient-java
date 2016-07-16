// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Random;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.alm.client.utils.JsonHelper;
import com.microsoft.alm.client.utils.StringUtil;

public class TestUtil {

    private static final String TEST_CASES_LOCATION = "AlmHttpClientTestCases"; //$NON-NLS-1$
    private static final Random generator = new Random();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                cleanupDirectory(getTempFolder());
            }
        });
    }

    private TestUtil() {
    }

    public static int getRandomInt() {
        return getRandomInt(0, 9);
    }

    public static int getRandomInt(final int a, final int b) {
        return generator.nextInt(b - a + 1) + a;
    }

    public static String getRandomString() {
        final int n = getRandomInt();
        final StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            sb.append((char) ('a' + getRandomInt()));
        }

        return sb.toString();
    }

    public static File getTempFolder() {
        return new File(System.getProperty("java.io.tmpdir"), TEST_CASES_LOCATION); //$NON-NLS-1$
    }

    public static void setUp(final String testCaseName) throws Exception {
        File testCaseTempLocation = getTemporaryTestFilesLocation(testCaseName);

        cleanupDirectory(testCaseTempLocation);

        testCaseTempLocation.mkdir();
    }

    public static File getTemporaryTestFilesLocation(final String testCaseName) {
        return new File(getTempFolder(), testCaseName);
    }

    public static void tearDown(final String testCaseName) throws Exception {
        cleanupDirectory(getTemporaryTestFilesLocation(testCaseName));
    }

    private static boolean cleanupDirectory(final File path) {
        if (path.exists()) {
            for (File file : path.listFiles()) {
                if (file.isDirectory()) {
                    cleanupDirectory(file);
                } else {
                    file.delete();
                }
            }
        }

        return (path.delete());
    }

    public static InputStream toInputStream(final String source) throws IOException {
        final byte[] bytes = source.getBytes(StringUtil.UTF8_CHARSET);

        return new ByteArrayInputStream(bytes);
    }

    public static String toString(final InputStream inputStream) throws IOException {
        final InputStreamReader reader = new InputStreamReader(inputStream, StringUtil.UTF8_CHARSET);
        final StringWriter writer = new StringWriter(4096);

        int c;
        while ((c = reader.read()) != -1) {
            writer.append((char) c);
        }

        return writer.toString();
    }

    public static String toJsonString(final Object object) throws IOException {
        final ObjectMapper objectMapper = JsonHelper.getObjectMapper();

        return objectMapper.writeValueAsString(object);
    }

    public static Object fromJsonString(final String s, Class<?> valueType) throws IOException {
        final ObjectMapper objectMapper = JsonHelper.getObjectMapper();

        return objectMapper.readValue(s, valueType);
    }
}
