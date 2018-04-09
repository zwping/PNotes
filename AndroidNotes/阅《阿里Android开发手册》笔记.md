Tips：

 - [**在线查阅**](https://github.com/zwping-win/RESOURCES/blob/master/android/%E6%96%87%E6%A1%A3/%E9%98%BF%E9%87%8C%E5%AE%89%E5%8D%93%E6%89%8B%E5%86%8C.pdf)
 - [**下载**](https://raw.githubusercontent.com/zwping-win/RESOURCES/master/android/%E6%96%87%E6%A1%A3/%E9%98%BF%E9%87%8C%E5%AE%89%E5%8D%93%E6%89%8B%E5%86%8C.pdf)本地阅读体验更佳
 - [**在线考试获取阿里证书**](https://edu.aliyun.com/certification/cldt02?spm=a2c4e.11153959.blogcont69327.8.3d572b13a4Ay0g)
 - [**ide插件**](https://github.com/alibaba/p3c)在线监测你的代码是否符合规范

## 生搬硬套难有成就，在这依据阿里手册，去掉阿里，迭代一份自我的《Android开发手册》

> 手册从Java开发过程中9个维度铺开，描绘`规范`

- Java语言规范
- 资源文件命名
- 基本组件
- UI与布局
- 进程、线程与消息通讯
- 文件与数据库
- Bitmap、Drawable与动画
- 安全
- 其它



### 一、Java语言规范

- 1.1：遵循[《Java开发手册》](https://github.com/zwping/PNotes/blob/master/JavaNotes/%E9%98%85%E3%80%8A%E9%98%BF%E9%87%8CJava%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C%E3%80%8B%E7%AC%94%E8%AE%B0.md#手册愿景码出高效码出质量身为码农的你怎样保证你的code高效和质量)

### 二、资源文件命名

- 2.1: 遵循《Java开发手册》中[1.1-2](https://github.com/zwping/PNotes/blob/master/JavaNotes/%E9%98%85%E3%80%8A%E9%98%BF%E9%87%8CJava%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C%E3%80%8B%E7%AC%94%E8%AE%B0.md#1编程规范)篇章
- 2.2: 资源文件默认无法使用文件夹归类，在这推荐通过命名的首部根据module来归类；Eg：news_btn_bg / news_list_rv_item / news_logo_icon

### 三、基本组件

- 3.1：Activity间如果是大量数据通信，避免使用Intent + Parcelable方式，可以使用EventBus方案代替
- 3.2：Activity#onSaveInstanceState()不能保证一定会被调用，所以不建议用其保存Activity的临时性数据，建议使用持久化存储
- 3.3: 不要在Activity#onPause()内执行耗时较长的工作，这会影响到页面之间的跳转效率
- 3.4：不要在 Activity#onDestroy()内执行释放资源的工作，因为 onDestroy()执行的时机可能较晚。可根据实际需要，在Activity#onPause()/onStop()中结合 isFinishing()的判断来执行
- 3.5：避免使用嵌套的Fragment
- 3.6: Service 需要以多线程来并发处理多个启动请求，建议使用 `IntentService`，可避免各种复杂的设置

### 四、UI与布局

- 4.1：ScrollView 中嵌套 List 或 RecyclerView 的做法官方明确禁止，推荐使用 NestedScrollView。
- 4.2：布局中不得不使用 ViewGroup 多重嵌套时，不要使用 LinearLayout 嵌套，改用 RelativeLayout，可以有效降低嵌套数
- 4.3: `文本大小使用单位 dp`，sp 是 Android 早期推荐使用的，但其实 sp 不仅和 dp 一样受屏幕密度的影响，还受到系统设置里字体大小的影响，所以使用 dp 对于应用开发会更加保证 UI 的一致性和还原度
- 4.4: 灵活使用布局，推荐 `merge、ViewStub` 来优化布局，尽可能多的减少 UI 布局层级，推荐使用 FrameLayout，RelativeLayout、LinearLayout 次之

### 五、进程、线程与消息通讯

- 5.1：新建线程时，必须通过线程池提供（AsyncTask或者ThreadPoolExecutor或者自定义线程池）
- 5.2：线程池不允许使用 Executors 去创建，而是通过 ThreadPoolExecutor 的方式

### 六、文件与数据库

- 6.1：任何时候不要硬编码文件路径，请使用 Android 文件系统 API 访问
- 6.2：多线程操作写入数据库时，需要使用事务，以免出现同步问题
- 6.2：大数据写入数据库时，请使用事务或其他能够提高 I/O 效率的机制，保证执行速度
- 6.3：执行 SQL 语句时，应使用 SQLiteDatabase#insert()、update()、delete()，不要使用 SQLiteDatabase#execSQL()，以免 SQL 注入风险

### 七、Bitmap、Drawable与动画

- 7.1：png 图片使用 TinyPNG 或者类似工具压缩处理，减少包体积
- 7.2：使用完毕的图片，应该及时回收，释放宝贵的内存
- 7.3：在 Activity#onPause()或 Activity#onStop()回调中，关闭当前 activity 正在执行的的动画
- 7.4：在有强依赖 onAnimationEnd 回调的交互时，onAnimationEnd 可能会因各种异常没被回调[参考](https://stackoverflow.com/questions/5474923/onanimationend-is-not-getting-called-onanimationstart-works-fine)，建议加上超时保护或通过 postDelay 替代onAnimationEnd

### 八、安全

### 九、其它



