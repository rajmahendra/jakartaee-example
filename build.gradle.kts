

allprojects {

    plugins.withId("org.jetbrains.kotlin.jvm") {

    }
    apply(plugin = "java")
    repositories {
        jcenter()
        mavenCentral()
    }

    group = "org.example"
    version ="1.0-SNAPSHOT"


}

subprojects {

}



