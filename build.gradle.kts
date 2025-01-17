buildscript {

    extra["minSdkVersion"] = 18
    extra["compileSdkVersion"] = 33
    extra["targetSdkVersion"] = 33
    
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("io.deepmedia.tools:publisher:0.6.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}


tasks.register("clean", Delete::class) {
    delete(buildDir)
}