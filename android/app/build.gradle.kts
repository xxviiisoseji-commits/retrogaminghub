plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.retrogaminghub.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.retrogaminghub.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "2.1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
}
