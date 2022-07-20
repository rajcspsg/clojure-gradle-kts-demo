plugins {
    id("java")
    id("dev.clojurephant.clojure") version "0.7.0-alpha.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    maven(url =  "https://repo.clojars.org/")
}

dependencies {
    implementation ("org.clojure:clojure:1.11.1")
    testRuntimeOnly ("org.ajoberstar:jovial:0.3.0")
    compileOnly ("org.clojure:tools.namespace:1.3.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}