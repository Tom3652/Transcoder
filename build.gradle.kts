buildscript {

    extra["minSdkVersion"] = 18
    extra["compileSdkVersion"] = 31
    extra["targetSdkVersion"] = 31
    
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
        classpath("com.android.tools.build:gradle:7.1.1")
        classpath("io.deepmedia.tools:publisher:0.6.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

/*
tasks.register("clean", Delete::class) {
    delete(buildDir)
}

 */