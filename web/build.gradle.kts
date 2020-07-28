plugins {
    war
}

dependencies {
    implementation(project(":common"))
    implementation(project(":rest"))
    testImplementation("junit:junit:4.13")
    compileOnly ("jakarta.platform:jakarta.jakartaee-api:8.0.0")
    runtimeOnly ("org.eclipse.krazo:krazo-jersey:1.0.0-RC1")
    compileOnly ("jakarta.mvc:jakarta.mvc-api:1.1-RC1")
}
