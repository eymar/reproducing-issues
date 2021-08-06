plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.5.21"
}


repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
            }
        }
    }
}
