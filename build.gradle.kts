plugins {
    kotlin("jvm") version "1.9.21"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.9.21")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }

    sourceSets {
        main {
            kotlin.srcDir("src/main")
        }
        test {
            java.srcDirs("src/test")
        }
    }

    wrapper {
        gradleVersion = "8.5"
    }
}
