
dependencies {
    testImplementation("junit:junit:4.13")
  //  compileOnly ("jakarta.platform:jakarta.jakartaee-api:8.0.0")
    implementation(kotlin("stdlib-jdk8"))
    compileOnly (project(":common"))
}
