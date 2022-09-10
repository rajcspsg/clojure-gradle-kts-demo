plugins {
    id("java")
    id("dev.clojurephant.clojure") version "0.7.0"
    id("application")
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
    testRuntimeOnly ("dev.clojurephant:jovial:0.4.1")
    compileOnly ("org.clojure:tools.namespace:1.3.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
}

clojure {
    builds {
        main {
            aotAll()
        }
    }
}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
            "Implementation-Version" to project.version,
        "Main-Class" to "main.main"))
    }
}

application {
    mainClass.set("main.main")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}