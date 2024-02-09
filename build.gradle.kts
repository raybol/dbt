buildscript {
    //ext.objectboxVersion = "3.7.1" // For Groovy build scripts
    val objectboxVersion by extra("3.7.1") // For KTS build scripts
    
    repositories {
        mavenCentral()
        // Note: 2.9.0 and older are available on jcenter()
    }
    
    dependencies {
        classpath("io.objectbox:objectbox-gradle-plugin:$objectboxVersion")
    }
}