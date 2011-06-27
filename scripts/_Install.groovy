//
// This script is executed by Griffon after plugin was installed to project.
// This script is a Gant script so you can use all special variables provided
// by Gant (such as 'baseDir' which points on project base dir). You can
// use 'ant' to access a global instance of AntBuilder
//
// For example you can create directory under project tree:
//
//    ant.mkdir(dir:"${basedir}/griffon-app/jobs")
//

// check to see if we already have a GroovyfxGriffonAddon
boolean builderIsSet
builderConfig.each() { prefix, v ->
    v.each { builder, views ->
        builderIsSet = builderIsSet || 'groovyx.javafx.SceneGraphBuilder' == builder
    }
}

if (!builderIsSet) {
    println 'Adding GroovyFX Builder to Builder.groovy'
    builderConfigFile.append('''
root.'groovyx.javafx.SceneGraphBuilder'.view = '*'
''')
}