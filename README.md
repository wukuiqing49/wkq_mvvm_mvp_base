Mvp 和Mvvm模式的框架搭建

引用方法:
             implementation 'com.github.wukuiqing49:wkq_mvvm_mvp_base:1.0.1'

项目bulid配置

buildscript {

    repositories {
    
        google()
        
        jcenter()
        
        mavenCentral()
        
    }
    
    dependencies {
    
        classpath 'com.android.tools.build:gradle:3.3.2'

        classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5'
    }
    
}

allprojects {

    repositories {
    
        google()
        
        jcenter()
        
        maven { url 'https://jitpack.io' }
        
    }
    
}

task clean(type: Delete) {

    delete rootProject.buildDir
    
}
