# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#-------------------------------------------定制化区域----------------------------------------------
#序列化、反序列化、JNI、反射建议增加keep
#---------------------------------1.实体类---------------------------------
-keep class com.oa.sihongyj.model.** { *; }

#-------------------------------------------------------------------------
#---------------------------------2.第三方包-------------------------------

#-------------------------------------------------------------------------
#---------------------------------3.与js互相调用的类------------------------

#-------------------------------------------------------------------------
#---------------------------------4.反射相关的类和方法-----------------------

#----------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------
#-------------------------------------------基本不用动区域--------------------------------------------
#---------------------------------基本指令区----------------------------------
#-dontshrink  #声明不进行压缩操作，默认情况下，除了-keep配置（下详）的类及其直接或间接引用到的类，都会被移除
-dontoptimize #不对class进行优化，默认开启优化（热修复必须开启该命令）
-optimizationpasses 5 #执行优化的次数，默认1次
-optimizations !code/simplification/cast,!field/*,!class/merging/* #进行除 算法指令精简、字段、类合并外的所有优化
#-optimizations code/removal/variable,code/simplification/arithmetic  #只进行 移除未使用的局部变量、算法指令精简

#-dontobfuscate     #不进行混淆，默认开启混淆。
#-obfuscationdictionary filename        #指定字段、方法名的混淆字典，默认情况下使用abc等字母组合，比如根据自己的喜好指定中文、特殊字符进行混淆命名
#-applymapping filename     #根据指定的mapping映射文件进行混淆。
#-keeppackagenames [package_filter]     #指定不混淆指定的包名，多个包名可以用逗号分隔，可以使用? * **通配符，并且可以使用否定符（!）
-dontusemixedcaseclassnames #包名不混合大小写
-dontskipnonpubliclibraryclasses #不去忽略非公共的库类
-dontskipnonpubliclibraryclassmembers # 指定不去忽略非公共的库的类的成员
-dontpreverify #不对class进行预校验，只对DEX文件预校验，增加编译效率
-verbose #指定在混淆过程中输出更多信息，配置这个选项后，在遇到异常时，将输出完整的堆栈，而不仅仅是异常消息
-printmapping proguardMapping.txt #生成原类名和混淆后的类名的映射文件
#-keepattributes [attribute_filter]     #指定保留属性，多个属性可以用多个-keepattributes配置，也可以用逗号分隔，可以使用? * **通配符，并且可以使用否定符（!）。
-keepattributes Exceptions,InnerClasses,Signature #不混淆泛型
-keepattributes SourceFile,LineNumberTable #抛出异常时保留代码行号
-keepattributes *Annotation* #不混淆Annotation
-keepattributes EnclosingMethod,Deprecated
#-keepparameternames    #指定被保护的方法的参数类型和参数名不被混淆。这项配置在混淆一些类库的时候特别有用，因为根据IDE提示的参数名和参数类型，开发者可以根据他们的语义获得一些信息，这样的类库更友好
-ignorewarnings #忽略所有警告
-keep public class com.google.vending.licensing.ILicensingService  #keep google license服务接口
-keep public class com.android.vending.licensing.ILicensingService  #keep google license服务接口

# keep过于简单粗暴，proguard提供了6种不同的配置：
# 保留 防止被移除或重命名   防止被重命名（未使用的会被移除）
# 类和类成员   -keep   -keepnames
# 仅类成员    -keepclassmembers   -keepclassmembernames
# 如类含有某成员，保留类及其成员 -keepclasseswithmembers -keepclasseswithmembernames

#----------------------------------------------------------------------------
#---------------------------------默认保留区---------------------------------
# 保持哪些类不被混淆
-keep public class * extends android.app.Fragment
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class * extends android.view.View
-keep public class com.android.vending.licensing.ILicensingService
-keep class android.support.** {    # 不输出support包中的警告
    *;
}
#保持 native 方法不被混淆
-keepclasseswithmembernames class * {
    native <methods>;
}
# keep继续自Activity中所有包含public void *(android.view.View)签名的方法，如onClick
-keepclassmembers class * extends android.app.Activity{
    public void *(android.view.View);
}
#保持枚举 enum 类不被混淆 如果混淆报错，建议直接使用上面的 -keepclassmembers class * implements java.io.Serializable即可
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}
-keep public class * extends android.view.View{  # keep自定义view的get/set方法
    *** get*(); void set*(***);
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}
#保持自定义控件类不被混淆
-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}
# keep Parcelable的CREATOR成员
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}
#保持 Serializable 不被混淆
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}
# keep R文件的静态字段
-keep class **.R$* {
    *;
}
-keepclassmembers class * {
    void *(**On*Event);
}

##########JS接口类不混淆，否则执行不了
-dontwarn com.android.JsInterface.**
-keep class com.android.JsInterface.** {*; }

#极光推送和百度lbs android sdk一起使用proguard 混淆的问题#http的类被混淆后，导致apk定位失败，保持apache 的http类不被混淆就好了
-dontwarn org.apache.**
-keep class org.apache.**{ *; }

#----------------------------------------------------------------------------
#---------------------------------webview------------------------------------
-keepclassmembers class fqcn.of.javascript.interface.for.Webview {
    public *;
}
-keepclassmembers class * extends android.webkit.WebViewClient {
    public void *(android.webkit.WebView, java.lang.String, android.graphics.Bitmap);
    public boolean *(android.webkit.WebView, java.lang.String);
}
-keepclassmembers class * extends android.webkit.WebViewClient {
    public void *(android.webkit.WebView, jav.lang.String);
}
#----------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------