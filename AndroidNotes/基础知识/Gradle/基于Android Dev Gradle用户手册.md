#### 基于Android Dev Gradle用户手册

##### 技巧

 - 引用阿里云镜像加速下载第三方库


``` groovy

buildscript {

    repositories {
        maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
        //...other code...
    }
    //...other code...
}

allprojects {
    repositories {
        maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
        //...other code...
    }
}

```

##### 文档

[Gradle For Android](https://storage.pardot.com/68052/108724/Gradle_Recipes_for_Android.pdf) ---  (官方PDF英文版)