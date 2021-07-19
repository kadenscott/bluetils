//import net.kyori.indra.IndraPlugin

//import net.kyori.indra.repository.sonatypeSnapshots

plugins {
    java
    `maven-publish`
//    id("net.kyori.indra")
}

group = "dev.kscott"
version = "1.0.0"
description = "Utilities for stff."

subprojects {
//    apply<IndraPlugin>()
    apply<JavaPlugin>()

    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }

    dependencies {
        compileOnly(rootProject.libs.checker.qual)
    }

//    indra {
//        gpl3OnlyLicense()
//
//        javaVersions {
//            target(16)
//        }
//
//        configurePublications {
//            pom {
//                developers {
//                    developer {
//                        id.set("kadenscott")
//                        email.set("kscottdev@gmail.com")
//                    }
//                }
//            }
//        }
//    }
}