plugins {
    java
    kotlin("jvm") version "1.3.72"
    war
}

group = "org.example"
version ="1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    compileOnly("jakarta.platform:jakarta.jakartaee-api:9.0.0-RC1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")

    runtimeOnly ("org.eclipse.krazo:krazo-jersey:1.0.0-RC1")
    compileOnly ("jakarta.mvc:jakarta.mvc-api:1.1-RC1")
}






