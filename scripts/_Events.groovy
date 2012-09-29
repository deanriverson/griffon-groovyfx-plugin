/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Dean Iverson
 * @author Andres Almiray
 */

File jfxrtFile = null

//eventClasspathEnd = {
eventCompileSourcesStart = {
    // Check for a JavaFX SDK via a JAVAFX_HOME environment variable
    String javafxHome = ant.project.properties['environment.JAVAFX_HOME'] ?: ''
    jfxrtFile = new File(javafxHome, 'rt/lib/jfxrt.jar')

    if(!jfxrtFile.exists()) {
        // Maybe JAVAFX_HOME is pointing us directly at the .jar?
        jfxrtFile = new File(javafxHome, 'jfxrt.jar')

        if(jfxrtFile.exists()) {
            debug "JavaFX runtime found using JAVAFX_HOME at ${jfxrtFile.absolutePath}"
        } else {
            // Next check if JavaFX is present with the JDK pointed at by JAVA_HOME
            String javaHome = ant.project.properties['environment.JAVA_HOME']
            jfxrtFile = new File(javaHome, 'jre/lib/jfxrt.jar')

            if (!jfxrtFile.exists()) {
                event 'StatusError', ['The file jfxrt.jar could not be found. Is JAVAFX_HOME set in the environment variables?']
                exit 1
            }

            debug "JavaFX runtime found using JAVA_HOME at ${jfxrtFile.absolutePath}"
        }
    } else {
        debug "JavaFX runtime found using JAVAFX_HOME at ${jfxrtFile.absolutePath}"
    }

    final jfxrtJarPath = ant.path {
        pathElement(location: jfxrtFile.absolutePath)
    }

    ant.project.references['griffon.compile.classpath'].append(jfxrtJarPath)
    ant.project.references['griffon.test.classpath'].append(jfxrtJarPath)

    griffonSettings.updateDependenciesFor 'compile', [jfxrtFile]
    griffonSettings.updateDependenciesFor 'test', [jfxrtFile]
}

/**
* Add the actual JavaFX runtime jar from its real location so that it can find
* it's hard-coded native library dependencies.
*/
eventRunAppTweak = { message ->
    def originalSetupRuntimeJars = setupRuntimeJars
    setupRuntimeJars = {
        def runtimeJars = []

        if (originalSetupRuntimeJars)
            runtimeJars = originalSetupRuntimeJars()

        if (jfxrtFile)
            runtimeJars << jfxrtFile

        return runtimeJars
    }
}
