plugins {
    id("com.android.application")
}

android {
    namespace = "com.masarif.boudnib"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.masarif.boudnib"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
