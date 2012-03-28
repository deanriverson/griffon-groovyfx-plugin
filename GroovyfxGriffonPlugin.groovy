/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Dean Iverson
 */
class GroovyfxGriffonPlugin {
    String version = '0.3'
    String griffonVersion = '0.9.5 > *'
    def dependsOn = [:]
    List pluginIncludes = []
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing', 'javafx']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL to the plugin's documentation
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/deanriverson/griffon-groovyfx-plugin'

    List authors = [
        [
            name: 'Dean Iverson',
            email: 'deanriverson@gmail.com'
        ],
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Griffon GroovyFX Plugin'
    String description = '''
Provides integration with [GroovyFX][1].  GroovyFX allows you to use the [JavaFX][2] API to write your Griffon
views.

Usage
-----

This version of the plugin uses GroovyFX 0.2, which provides compatibility with JavaFX 2.1 (Developer's Preview).
JavaFX 2.1 can be downloaded from [javafx.com][3].

Once installed, you can use any of the nodes provided by GroovyFX in your views.  GroovyFX documentation can be
found [here][4].

### Example

A simple GroovyFX/JavaFX view might look like this.
    hbox(padding: 80) {
        text(text: "Java", font: "80pt sanserif") {
            fill linearGradient(endX: 0, stops: [[0, orange], [1, chocolate]])
        }
        text(text: "FX", font: "80pt sanserif") {
            fill linearGradient(endX: 0, stops: [[0, cyan], [1, dodgerblue]])
            effect dropShadow(color: dodgerblue, radius: 25, spread: 0.25)
        }
    }

[1]: http://www.groovyfx.org
[2]: http://docs.oracle.com/javafx/2.0/api/index.html
[3]: http://www.oracle.com/technetwork/java/javafx/downloads/index.html
[4]: http://groovy.codehaus.org/GroovyFX
'''
}
