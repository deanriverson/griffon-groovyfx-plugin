//
// This script is executed by Griffon when the plugin is uninstalled from project.
// Use this script if you intend to do any additional clean-up on uninstall, but
// beware of messing up SVN directories!
//

// check to see if we already have a GroovyFXGriffonAddon
boolean builderIsSet
builderConfig.each() { prefix, v ->
    v.each { builder, views ->
        builderIsSet = builderIsSet || 'groovyx.javafx.SceneGraphBuilder' == builder
    }
}

if (builderIsSet) {
    println 'Removing GroovyFX Builder from Builder.groovy'
    builderConfigFile.text = builderConfigFile.text - "root.'groovyx.javafx.SceneGraphBuilder'.view = '*'\n"
}
