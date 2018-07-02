### 简述Android Studio 3.0的一些新增功能

2017年10月26日，Google发布了Android Studio 3.0和Oreo预览版，更新内容除了常见的一些问题修复/性能更优

还带来了更便捷稳定的功能辅佐Android开发：

 1. 支持Android 8.0 (Oreo / SDK 26)
 2. 支持Java 8
    - `Lambda语法，趋于你了解新型编程语法`
    - 不包含[Jack](https://blog.csdn.net/pcsxk/article/details/52213784?_bank)
 3. 默认支持Kotlin
    - `新型编程语法`
 4. 支持基于语言类型打包
 5. 支持测试支持库[AndroidJUnitRunner](https://developer.android.google.cn/training/testing/junit-runner#using-android-test-orchestrator)
 7. 支持[自适应图标](https://blog.csdn.net/creeper_san/article/details/77916089)
 8. 官方支持共享字体资源包
    - `基于Google Play的功能，被墙，GG`
 8. 新增Things模块
 7. 支持[Instant Apps](https://segmentfault.com/a/1190000010906162)
    - `基于Google Service的既时应用（类似小程序）`
    - `Google Service被墙，Instant Apps鸡肋了`
 7. [自动打包工具](https://blog.csdn.net/xiangzhihong8/article/details/53607539)AAPT2默认开启
 6. [分析调试APK](https://developer.android.google.cn/studio/debug/apk-debugger)工具更强大
 8. [Android Profiler](https://developer.android.google.cn/studio/profile/android-profiler)窗口取代[Android Monitor](https://blog.csdn.net/testcs_dn/article/details/53687771)工具
    - DDMS工具入口被隐藏，功能被拆分，[博客](https://developer.android.google.cn/studio/profile/monitor)
 - [Firebase](https://blog.csdn.net/wangshubo1989/article/details/52558629)支持升级
    - `被墙，GG`
    - 感觉[蒲公英](http://pgyer.com)更实用
 9. 基本放弃了 ndkCompile工具
 10. 增加预览版的[D8 Dx编译器](https://blog.dreamtobe.cn/android_d8_r8/)
    - `Dx编译器的迭代版，并且给它命名为D8`
    - `Android Studio 3.1默认开启D8编译器`