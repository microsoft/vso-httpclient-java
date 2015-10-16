package com.microsoft.alm.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public abstract class MessagesTestBase
    extends TestCase {
    private final Hashtable<String, ArrayList<String>> mapClassNames = new Hashtable<String, ArrayList<String>>();
    private final Hashtable<String, Integer> mapParameterCount = new Hashtable<String, Integer>();
    private final Hashtable<String, Integer> mapArgumentsPassed = new Hashtable<String, Integer>();
    private final HashSet<String> hashsetPropertyNames = new HashSet<String>();
    private final List<String> allReferences = new ArrayList<String>();

    protected void validate() {
        try {
            String propertiesPath = getDefaultPropertiesPath();
            assertNotNull("Path must not be null", propertiesPath); //$NON-NLS-1$
            assertTrue("Expected a .properties file", propertiesPath.endsWith(".properties")); //$NON-NLS-1$ //$NON-NLS-2$

            Properties properties = new Properties();
            final InputStream propertiesStream = new FileInputStream(propertiesPath);
            properties.load(propertiesStream);
            propertiesStream.close();

            processProperties(properties);

            System.out.println("Processed properties file " + propertiesPath); //$NON-NLS-1$
            System.out.println("Found " + properties.size() + " properties."); //$NON-NLS-1$ //$NON-NLS-2$

            List<File> javaFiles = new ArrayList<File>();
            getJavaFiles(new File(getSourcesRoot()), javaFiles);
            processJavaFiles(javaFiles);

            System.out.println("Found " + javaFiles.size() + " java files."); //$NON-NLS-1$ //$NON-NLS-2$
            System.out.println("Found " + mapParameterCount.size() + " parameterized messages."); //$NON-NLS-1$ //$NON-NLS-2$
            System.out.println("Found " + allReferences.size() + " message references."); //$NON-NLS-1$ //$NON-NLS-2$

            verifyReferences();
            verifyParameterizedReferences();
        } catch (IOException e) {
            assertTrue("Caught exception: " + e.getMessage(), false); //$NON-NLS-1$
        }
    }

    private void verifyReferences() {
        HashSet<String> undefinedPropertyNames = new HashSet<String>();
        HashSet<String> unReferencedPropertyNames = new HashSet<String>(hashsetPropertyNames);

        /*
         * Remove all the DYNAMIC properties from the unreferenced set, because
         * they shouldn't be tested for references.
         */
        final List<String> dynamicPropertyNames = new ArrayList<String>();
        for (Iterator<String> iterator = unReferencedPropertyNames.iterator(); iterator.hasNext();) {
            final String name = iterator.next();
            if (name.contains("DYNAMIC")) //$NON-NLS-1$
            {
                dynamicPropertyNames.add(name);
            }
        }
        unReferencedPropertyNames.removeAll(dynamicPropertyNames);

        // Test for undefined and unreferenced properties
        for (int i = 0; i < allReferences.size(); i++) {
            String refName = allReferences.get(i);
            if (!hashsetPropertyNames.contains(refName)) {
                undefinedPropertyNames.add(refName);
            }

            if (unReferencedPropertyNames.contains(refName)) {
                unReferencedPropertyNames.remove(refName);
            }
        }

        for (Iterator<String> it = undefinedPropertyNames.iterator(); it.hasNext();)
            System.out.println("Undefined message=" + it.next()); //$NON-NLS-1$

        for (Iterator<String> it = unReferencedPropertyNames.iterator(); it.hasNext();)
            System.out.println("Unreferenced message=" + it.next()); //$NON-NLS-1$

        assertEquals("Undefined messages (see console output)", 0, undefinedPropertyNames.size()); //$NON-NLS-1$
        assertEquals("Unreferenced messages (see console output)", 0, unReferencedPropertyNames.size()); //$NON-NLS-1$
    }

    private void verifyParameterizedReferences() {
        Enumeration<String> keys = mapArgumentsPassed.keys();
        while (keys.hasMoreElements()) {
            String name = keys.nextElement();
            assertTrue("Expected '" + name + "' in parameter map", mapParameterCount.containsKey(name)); //$NON-NLS-1$ //$NON-NLS-2$
            assertTrue("Expected '" + name + "' in argument map", mapArgumentsPassed.containsKey(name)); //$NON-NLS-1$ //$NON-NLS-2$

            int parameterCount = mapParameterCount.get(name).intValue();
            int argumentCount = mapArgumentsPassed.get(name).intValue();
            assertEquals("Argument mismatch for '" + name + "'", parameterCount, argumentCount); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    private void processProperties(Properties properties) {
        final Enumeration<Object> keyEnumerator = properties.keys();
        int unescapedQuoteCount = 0;

        while (keyEnumerator.hasMoreElements()) {
            final String key = (String) keyEnumerator.nextElement();

            PropertyInfo property = new PropertyInfo(key, properties.getProperty(key));
            hashsetPropertyNames.add(property.name);

            // The message resource name should be of the format
            // <classname>.<unique-string>. This is the form generated by the
            // Eclipse wizard.

            int dotIndex = property.name.indexOf('.');
            assertTrue("Expected '.' in '" + property.name + "'", dotIndex > 0); //$NON-NLS-1$ //$NON-NLS-2$

            String className = property.name.substring(0, dotIndex);
            if (!mapClassNames.containsKey(className)) {
                mapClassNames.put(className, new ArrayList<String>());
            }

            ArrayList<String> classStringIds = mapClassNames.get(className);
            classStringIds.add(property.name);

            // Get the parameter counts for each property value. Enforce a
            // 'Format' suffix on parameterized resource identifiers. Record the
            // parameter counts in a hash table to be used later to match up
            // with
            // the actual number of arguments passed.
            if (!property.name.contains("SKIPVALIDATE")) //$NON-NLS-1$
            {
                int parameterCount = getParameterCount(property);
                if (parameterCount > 0) {
                    mapParameterCount.put(property.name, new Integer(parameterCount));

                    boolean isFormat = property.name.endsWith("Format") || property.name.endsWith("FormatNOLOC"); //$NON-NLS-1$ //$NON-NLS-2$
                    assertTrue("Expected name '" + property.name + "' to end in 'Format'", isFormat); //$NON-NLS-1$ //$NON-NLS-2$

                    // Check for properly escaped single quotes in parameterized
                    // strings.
                    String stripped = property.value.replaceAll("\'\'", ""); //$NON-NLS-1$ //$NON-NLS-2$
                    int index = stripped.indexOf('\'');

                    if (index != -1) {
                        unescapedQuoteCount++;
                        System.out.println("Found unescaped single quote in " + property.name); //$NON-NLS-1$
                    }
                }
            }
        }

        if (unescapedQuoteCount > 0) {
            fail("Found " + unescapedQuoteCount + " unescaped single quotes, see console output for details"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    private void processJavaFiles(List<File> javaFiles)
        throws IOException {
        for (int i = 0; i < javaFiles.size(); i++) {
            File javaFile = javaFiles.get(i);
            String javaSourceCode = readFile(javaFile);

            List<String> messageRefs = getMessageReferences(javaSourceCode);
            allReferences.addAll(messageRefs);

            List<ArgumentInfo> argumentInfos = getMessageArguments(javaSourceCode);
            for (int j = 0; j < argumentInfos.size(); j++) {
                ArgumentInfo argumentInfo = argumentInfos.get(j);
                String name = argumentInfo.name;

                if (mapArgumentsPassed.contains(name)) {
                    Integer other = mapArgumentsPassed.get(name);
                    assertEquals("Argument mismatch for id=" + name, argumentInfo.argCount, other.intValue()); //$NON-NLS-1$
                } else {
                    mapArgumentsPassed.put(name, new Integer(argumentInfo.argCount));
                }
            }
        }
    }

    private List<String> getMessageReferences(String javaSourceCode)
        throws IOException {
        String regex = "Messages.getString\\(\"([^\"]*)\"[^\\)]*\\)"; //$NON-NLS-1$
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(javaSourceCode);

        List<String> refs = new ArrayList<String>();
        while (matcher.find()) {
            String sub = matcher.group(1);
            refs.add(sub);
        }

        return refs;
    }

    private List<ArgumentInfo> getMessageArguments(String javaSourceCode)
        throws IOException {
        String regex = "(?m)Messages.getString\\(\"[^\"]*\"\\).*$[^$]MessageFormat.format\\(.*;"; //$NON-NLS-1$
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(javaSourceCode);

        List<ArgumentInfo> infos = new ArrayList<ArgumentInfo>();
        while (matcher.find()) {
            String sub = javaSourceCode.substring(matcher.start(), matcher.end());

            int startIndex = sub.indexOf("MessageFormat.format("); //$NON-NLS-1$
            int endIndex = sub.indexOf(";", startIndex); //$NON-NLS-1$

            int argumentCount = 0;
            int parenNestingLevel = 0;
            for (int i = startIndex + 21; i < endIndex; i++) {
                char ch = sub.charAt(i);
                if (ch == '(')
                    parenNestingLevel++;
                else if (ch == ')')
                    parenNestingLevel--;
                else if (ch == ',' && parenNestingLevel == 0)
                    argumentCount++;
            }

            String id = sub.substring(20, sub.indexOf("\")")); //$NON-NLS-1$
            infos.add(new ArgumentInfo(id, argumentCount));
        }

        return infos;
    }

    private int getParameterCount(PropertyInfo property) {
        Pattern pattern = Pattern.compile("\\{[0-9]\\}"); //$NON-NLS-1$
        Matcher matcher = pattern.matcher(property.value);

        /*
         * Check each parameter value against the expected index. A value must
         * be equal to or less than the previous value, or increase it by 1.
         */
        int parameterIndex = -1;
        while (matcher.find()) {
            String sub = property.value.substring(matcher.start() + 1, matcher.end() - 1);
            int subValue = Integer.valueOf(sub).intValue();

            if (subValue <= parameterIndex) {
                // Repeat of previous parameter; no increment.
            } else if (subValue == parameterIndex + 1) {
                parameterIndex++;
            } else {
                throw new AssertionFailedError("Parameter values must repeat the previous value or increase by 1: " //$NON-NLS-1$
                    + property.name + " [" //$NON-NLS-1$
                    + property.value + "]; '" //$NON-NLS-1$
                    + subValue + "' must be " //$NON-NLS-1$
                    + parameterIndex + " or " //$NON-NLS-1$
                    + (parameterIndex + 1));
            }
        }

        return parameterIndex + 1;
    }

    /**
     * Recursively traverse from the specified directory to locate .java files.
     * File information for java files are accumulated in the input list.
     * 
     * @param directory
     * @param javaFiles
     */
    private void getJavaFiles(File directory, List<File> javaFiles) {
        assertNotNull("Directory must not be null", directory); //$NON-NLS-1$
        assertTrue("Directory does not exist", directory.exists()); //$NON-NLS-1$
        assertTrue("Expected a directory", directory.isDirectory()); //$NON-NLS-1$

        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isDirectory()) {
                getJavaFiles(file, javaFiles);
            } else if (file.isFile() && file.getAbsolutePath().endsWith(".java")) //$NON-NLS-1$
            {
                javaFiles.add(file);
            }
        }
    }

    /**
     * 
     * @param f
     * @return
     * @throws IOException
     */
    private String readFile(File f)
        throws IOException {
        assertTrue("File does not exist=" + f.getAbsolutePath(), f.exists()); //$NON-NLS-1$

        FileInputStream in = new FileInputStream(f);
        byte[] bytes = new byte[(int) f.length()];
        int bytesRead = in.read(bytes);

        assertEquals("Expected to read all bytes", f.length(), bytesRead); //$NON-NLS-1$

        in.close();
        return new String(bytes);
    }

    private String getDefaultPropertiesPath() {
        String className = this.getClass().getName();
        String[] dirs = className.split("\\."); //$NON-NLS-1$
        StringBuffer sb = new StringBuffer(getResourcesRoot());

        for (int i = 0; i < dirs.length - 1; i++) {
            sb.append("/"); //$NON-NLS-1$
            sb.append(dirs[i]);
        }

        sb.append("/messages.properties"); //$NON-NLS-1$
        return sb.toString();
    }

    private String getSourcesRoot() {
        StringBuffer sb = new StringBuffer();

        String sourcesRoot = System.getProperty("com.microsoft.tfs.util.MessagesTestCase.SourcesRoot"); //$NON-NLS-1$
        if (sourcesRoot != null) {
            sb.append(sourcesRoot);
            sb.append(File.separatorChar);
            sb.append("plugins"); //$NON-NLS-1$
            sb.append(File.separatorChar);
            sb.append(this.getClass().getPackage().getName());
            sb.append(File.separatorChar);
        }

        sb.append("src"); //$NON-NLS-1$
        sb.append(File.separatorChar);
        sb.append("main"); //$NON-NLS-1$
        sb.append(File.separatorChar);
        sb.append("java"); //$NON-NLS-1$
        return sb.toString();
    }

    private String getResourcesRoot() {
        StringBuffer sb = new StringBuffer();

        String sourcesRoot = System.getProperty("com.microsoft.tfs.util.MessagesTestCase.SourcesRoot"); //$NON-NLS-1$
        if (sourcesRoot != null) {
            sb.append(sourcesRoot);
            sb.append(File.separatorChar);
            sb.append("plugins"); //$NON-NLS-1$
            sb.append(File.separatorChar);
            sb.append(this.getClass().getPackage().getName());
            sb.append(File.separatorChar);
        }

        sb.append("src"); //$NON-NLS-1$
        sb.append(File.separatorChar);
        sb.append("main"); //$NON-NLS-1$
        sb.append(File.separatorChar);
        sb.append("resources"); //$NON-NLS-1$
        return sb.toString();
    }

    private class PropertyInfo {
        private String name;
        private String value;

        public PropertyInfo(String name, String value) {
            this.name = name;
            this.value = value;
        }
    }

    private class ArgumentInfo {
        private String name;
        private int argCount;

        public ArgumentInfo(String name, int argCount) {
            this.name = name;
            this.argCount = argCount;
        }
    }
}
