2017年10月，Google发布了Android Studio 3.0，更新内容除了常见的一些问题修复/性能更优

还带来了对Android开发更便捷稳定的功能：

 - 支持Android O (Oreo / SDK 26)
 - 支持Java 8
    - `Lambda语法，趋于你了解新型编程语法`
    - 不包含[Jack](https://blog.csdn.net/pcsxk/article/details/52213784)
 - 默认支持Kotlin
    - `新型编程语法`
 - 增加预览版的[D8 Dx编译器](https://blog.dreamtobe.cn/android_d8_r8/)
    - `Dx编译器的迭代版，并且给它命名为D8`
    - `Android Studio 3.1默认开启D8编译器`
 - [Android Profiler](https://developer.android.google.cn/studio/profile/android-profiler)窗口取代[Android Monitor](https://blog.csdn.net/testcs_dn/article/details/53687771)工具
    - DDMS工具入口被隐藏，功能被拆分，[博客](https://developer.android.google.cn/studio/profile/monitor)
 - 支持基于语言类型打包
 - [自动打包工具](https://blog.csdn.net/xiangzhihong8/article/details/53607539)AAPT2默认开启
 - 支持测试支持库[AndroidJUnitRunner](https://developer.android.google.cn/training/testing/junit-runner#using-android-test-orchestrator)
 - 支持[分析调试APK](https://developer.android.google.cn/studio/debug/apk-debugger)工具

 > Android Studio 3.0 采用全新的 **Android Profiler ** 窗口取代 Android Monitor 工具。 这些全新的分析工具能够提供关于应用 CPU、内存和网络 Activity 的实时数据。 您可以执行基于样本的函数跟踪来记录代码执行时间、采集堆转储数据、查看内存分配，以及查看网络传输文件的详情

 自2017年10月AS发布3.0后，常用的DDMS工具入口被隐藏，取而代之的是更加先进的Android Profiler，


-----

###### 参考资料

 - [Android Profiler官方文档](https://developer.android.google.cn/studio/profile/android-profiler)
 - [Android Monitor官方文档](https://developer.android.google.cn/studio/profile/monitor)
 - [白话解释DDMS](https://blog.csdn.net/testcs_dn/article/details/53687771)