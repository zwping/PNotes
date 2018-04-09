##### 手册愿景“码出高效，码出质量”，身为码农的你怎样保证你的Code高效和质量？
生搬硬套难有成就，在这依据阿里手册，去掉阿里，迭代一份自我的《Java开发手册》


Tips：

 - [**在线查阅**](https://github.com/zwping-win/RESOURCES/blob/master/java/%E6%96%87%E6%A1%A3/%E9%98%BF%E9%87%8CJava%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C.pdf)
 - [**下载**](https://raw.githubusercontent.com/zwping-win/RESOURCES/master/java/%E6%96%87%E6%A1%A3/%E9%98%BF%E9%87%8CJava%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C.pdf)本地阅读体验更佳
 - [**在线考试获取阿里证书**](https://edu.aliyun.com/certification/cldt02?spm=a2c4e.11153959.blogcont69327.8.3d572b13a4Ay0g)
 - [**ide插件**](https://github.com/alibaba/p3c)在线监测你的代码是否符合规范  ***必装***


> 手册从Java开发过程中6个维度铺开，描绘`规范`

 - 编程规约
 - 异常日志
 - 单元测试
 - 安全规约
 - MySQL数据库规约
 - 工程结构规约

实体书中多第7维度“设计规约”，笔者暂未购买实体书，在这暂不讨论

> **在ide中安装了阿里Coding Guidelines插件背景下，在这整理一下插件提醒不到的**

### 1、编程规范

- 1.1：命名规范
    - 1、**常规的就不提了**，类似`驼峰命名`、命名的`缩写不可模棱两可`、所有的命名前后`不可有数字及特殊字符`、`不可使用拼音`这种不确定含义的字符、Boolean类型的变量`不可用is开头`
    - 2、**提下一些经常忽略的**
        - 2.1、命名可以直译出`它是什么及做什么` ，eg:httpGetNewsList() / OnNewsListChangeInterface() / NewsListBean / NewsTypeEnum
- 1.2：常量定义
    - 1、Long初始赋值时，要`使用大写的L`，eg: Long val = 2L
    - 2、如果变量值仅有一个固定范围内变化用enum类型或注解来定义 [附录1](#附录1)
- 1.3: 代码格式
    - 1、总结阿里手册中11点为：代码格式需要`层次和段落感`
- 1.4: OOP规约
    - 1、重点：所有的相同类型的包装类对象之间值的比较，`全部使用 equals 方法比较`
- 1.5: 集合处理
    - 1、如果在循环中处理集合对象，请使用Iterator方法，如果并发操作，需要对Iterator对象加锁
- 1.6: 并发处理
    - 1、所有的线程必须通过ThreadPoolExecutor方式创建的线程池来提供
    - 2、创建线程池时请指定有意义的线程名，方便出错时回溯
    - 3、高并发加锁对象的代码块工作量尽量可能的小，避免在锁代码块中调用RPC(过程调用)方法
    - 4、使用ScheduledExecutorService代替Timer
- 1.7：控制语句
    - 1、判断语句中，尽量使用简单语句，解耦逻辑，使阅读简单 [附录2](#附录2)
- 1.8：注释规约
    - 1、注释应简单明了，坚持1.1-2，使用好的命名替代注释
    - 2、注意`TODO`和`FIXME`的使用


### 2、异常日志

- 2.1：异常处理
- 2.2：日志规约
- 2.3：其它

### 3、单元测试

- 3.1：遵守AIR原则
    - A： Automatic （自动化）
    - I： Independent （独立性）
    - R： Repeatable （可重复）
- 3.2：编写单元测试代码遵守BCDE原则
    - B： Border ，边界值测试，包括循环边界、特殊取值、特殊时间点、数据顺序等。
    - C： Correct ，正确的输入，并得到预期的结果。
    - D： Design ，与设计文档相结合，来编写单元测试。
    - E： Error ，强制错误信息输入（如：非法数据、异常流程、非业务允许输入等），并得
到预期的结果

### 4、安全规约

### 5、MySQL数据库

- 5.1：建表规约
- 5.2：索引规约
- 5.3：SQL语句
- 5.4：ORM映射

### 6、工程结构

- 6.1：应用分层
- 6.2：二方库依赖
- 6.3：服务器

##### 附录1
``` java
//定义enum
public enum SeasonEnum {
    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);
    int seq;
    SeasonEnum(int seq){
        this.seq = seq;
    }
}
//使用enum
setSeason(SeasonEnum.SPRING);
//定义annotation
public final class MemoryConstants {
    public static final int BYTE = 1;
    public static final int KB   = 1024;
    public static final int MB   = 1048576;
    public static final int GB   = 1073741824;

    @IntDef({BYTE, KB, MB, GB})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {}
}
//使用annotation
byte2MemorySize(final long byteSize,@MemoryConstants.Unit final int unit)
```

##### 附录2
``` java
//案例
final boolean existed = (file.open(fileName, "w") != null) && (...) || (...);
if (existed) {
...
}
```