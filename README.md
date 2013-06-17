
Griffon GroovyFX Plugin
-----------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/groovyfx](http://artifacts.griffon-framework.org/plugin/groovyfx)


Provides integration with [GroovyFX][1]. GroovyFX allows you to use the [JavaFX][2]
API to write your Griffon views.

*Note:* If you want to create a Griffon JavaFX application, install the JavaFX plugin
instead.  The JavaFX plugin will automatically pull this plugin in as a dependency.
This plugin should only be installed independently if you want to add JavaFX views
to your existing Swing application.

Usage
-----

This version of the plugin uses GroovyFX 0.3.1, which works with JavaFX 2.2. The
JavaFX 2.2 SDK can be downloaded from [javafx.com][3].  Once the SDK is installed,
the JAVAFX_HOME environment variable should be set to point to the root directory
of the JavaFX SDK installation

The JavaFX 2.2 SDK is also bundled with the Java 7u13 (or later) JDK. In this
case, you can just set your JAVA_HOME environment variable to point to the JDK
installation and the plugin will use the bundled JavaFX SDK.

Once installed, you can use any of the nodes provided by GroovyFX in your views.
GroovyFX documentation can be found [here][4].

### Example

A simple GroovyFX/JavaFX view might look like this:

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

Griffon GroovyFX Plugin
=====================

This plugin allows you to use ithe GroovyFX library with the Griffon
framework.

*This plugin is highly experimental*
