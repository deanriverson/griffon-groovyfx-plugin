class GroovyfxGriffonPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Griffon the plugin is designed for
    def griffonVersion = '0.9.3-beta-1 > *' 
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are included in plugin packaging
    def pluginIncludes = []
    // the plugin license
    def license = '<UNKNOWN>'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    def toolkits = ['javafx']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    def platforms = []

    // TODO Fill in these fields
    def author = 'Dean Iverson'
    def authorEmail = 'deanriverson@gmail.com'
    def title = 'Griffon GroovyFX Plugin'
    def description = '''
A plugin that provides use of the GroovyFX library from within a Griffon application.
'''

    // URL to the plugin's documentation
    def documentation = 'http://griffon.codehaus.org/Groovyfx+Plugin'
}
