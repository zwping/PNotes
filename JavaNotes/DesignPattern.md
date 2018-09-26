### 《设计模式》笔记

> 设计模式的理解从架构层或开源层更趋于实践性

[DOC]

----

#### GOF (Gang of Four)

> 1994年，由 Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides 四人合著出版了一本名为 **Design Patterns - Elements of Reusable Object-Oriented Software**（中文译名：设计模式 - 可复用的面向对象软件元素）
> 
> 核心理念(面向对象设计原则)：
> 
> * 对接口编程而不是对实现编程
> * 有限使用对象组合而不是继承

#### 设计模式的六大原则
+ 开闭原则（Open Close Principle）<sup>对扩展开放，对修改关闭；优秀的架构基于良好的使用OCP；可以用“你狂任你狂，清风拂山冈，你横任你横，明月照大江”来描述OCP</sup>
+ 里氏代换原则（Liskov Substitution Principle）<sup>多态的表现；配合OCP诠释架构之美</sup>
+ 依赖倒转原则（Dependence Inversion Principle）<sup>面向接口编程；根据业务写接口，根据接口写代码；OCP的体现</sup>
+ 接口隔离原则（Interface Segregation Principle）<sup>低耦合；JAVA中接口可多继承；</sup>
+ 迪米特法则，又称最少知道原则（Demeter Principle）<sup>高内聚；对象与对象之间减少沟通；相互调用可用“不要问我为什么”网络语解释</sup>
+ 合成复用原则（Composite Reuse Principle）<sup>使用小对象堆积成大对象，勿使用继承大对象实现小功能</sup>

#### 设计模式的类型

+ **创建型模式**<sup>对象的创建</sup>
    + 工厂模式（Factory Pattern）
    + 抽象工厂模式（Abstract Factory Pattern）
    + 单例模式（Singleton Pattern）
    + 建造者模式（Builder Pattern）
    + 原型模式（Prototype Pattern）
+ **结构型模式**<sup>对象和类，扩充对象</sup>
    + 适配器模式（Adapter Pattern）
    + 桥接模式（Bridge Pattern）
    + 过滤器模式（Filter、Criteria Pattern）
    + 组合模式（Composite Pattern）
    + 装饰器模式（Decorator Pattern）
    + 外观模式（Facade Pattern）
    + 享元模式（Flyweight Pattern）
    + 代理模式（Proxy Pattern）
+ **行为型模式**<sup>对象与对象</sup>
    + 责任链模式（Chain of Responsibility Pattern）
    + 命令模式（Command Pattern）
    + 解释器模式（Interpreter Pattern）
    + 迭代器模式（Iterator Pattern）
    + 中介者模式（Mediator Pattern）
    + 备忘录模式（Memento Pattern）
    + 观察者模式（Observer Pattern）
    + 状态模式（State Pattern）
    + 空对象模式（Null Object Pattern）
    + 策略模式（Strategy Pattern）
    + 模板模式（Template Pattern）
    + 访问者模式（Visitor Pattern）
+ **J2EE 模式**<sup>对象的组合使用</sup>
    + MVC 模式（MVC Pattern）
    + 业务代表模式（Business Delegate Pattern）
    + 组合实体模式（Composite Entity Pattern）
    + 数据访问对象模式（Data Access Object Pattern）
    + 前端控制器模式（Front Controller Pattern）
    + 拦截过滤器模式（Intercepting Filter Pattern）
    + 服务定位器模式（Service Locator Pattern）
    + 传输对象模式（Transfer Object Pattern）

------

#### 设计模式的使用

> 两点需求促使设计模式的诞生：
> 
> 1、前人不断实践出的代码设计的最佳解决方案（就是：为什么要用这种设计模式来编写代码？）
> 
> 2、协同开发、代码移交产生的代码规范（就是：用这种设计模式来编写代码就是为了为了***)


| 设计模式 | 什么情况用 | 目的 |
|:------:|:-------|:------|
| <b><sub>创建型模式</sub></b> |
| 工厂模式 | 单一流程不同的实现 | 不同的实现可无限扩充，且调用方法不变 |
| 抽象工厂模式 | 多个流程多个流程的实现(系列) | 系列内的调用方法可无限扩充 |
| 单例模式 | 全局中高频率调用的方法或类 | 节省系统资源 |
| 建造者模式 | 构建时无序列要求 | 生成链式代码，优化代码空间及美化度 |
| 原型模式 | 高频率创建同一个对象 | 性能保障 |
| <b><sub>结构型模式</sub></b> |
| 适配器模式 | 两个不搭架的功能一起用 | 不兼容的功能合并 |
| 桥接模式 | 抽象类的实现部分独立出来 | 增加抽象类的扩展能力 |
| 过滤器模式 | 用不同的标准过滤对象 | 逻辑运算解耦 |
| 组合模式 | 树形结构 | 无限级 |
| 装饰器模式 | 派生的对象进行功能扩充 | 不改变原有结构增加功能 |
| 外观模式 | 约束(规范)调用方法 | 提高灵活度和安全性 |
| 享元模式 | 内存中已有的对象共享 | 避免创建大量对象 |
| 代理模式 | 需要对其控制 | 对方法进行可选的控制 |
| <b><sub>行为型模式</sub></b> |
| 责任链模式 | 有多个对象可以处理一个请求 | 发送者和接收者解耦 |
| 命令模式 |||
| 解释器模式 |||
| 迭代器模式 |||
| 中介者模式 |||
| 备忘录模式 |||
| 观察者模式 |||
| 状态模式 |||
| 空对象模式 |||
| 策略模式 |||
| 访问者模式 |||
| <b><sub>J2EE模式</sub></b> |
| MVC模式 |||
| 业务代表模式 |||
| 组合实体模式 |||
| 数据访问对象模式 |||
| 前端控制器模式 |||
| 拦截过滤器模式 |||
| 服务定位器模式 |||
| 传输对象模式 |||

> 后续的行为型模式和J2EE模式更加抽象，在Android开发者角度无法用短小精悍的语句描述他什么情况用和目的了，后续再看...


--------------
> 发布于[CSDN](https://blog.csdn.net/z1101558280/article/details/82853482)