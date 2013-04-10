griffon.project.dependency.resolution = {
    inherits("global")
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
//        mavenRepo "https://oss.sonatype.org/content/groups/public"
        // pluginDirPath is only available when installed
//        String basePath = pluginDirPath? "${pluginDirPath}/" : ''
//        flatDir name: 'groovyfxPluginLib', dirs: ["${basePath}lib"]
    }
    dependencies {
        compile 'org.codehaus.groovyfx:groovyfx:0.3.1'
    }
}

log4j = {
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}