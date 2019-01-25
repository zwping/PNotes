#### Python笔记

> py ---> 神经病语言
>
> 习惯了Java的指示性编程，外加上py的基础语法与原有知识初入太大，So，动手写点

| 语句 | 详解 |
| :-----: | :----: |
| #!/usr/bin/env python3 | 声明py环境 |
| # -*- coding: utf-8 -*- | 声明编码 |
| print(v) | 控制台常规输出 |
| print(v,v) | 逗号转空格输出 |
| print(v, end=' ') | 控制台输出不换行 |
| input() | 控制台输入 |
| None | 特殊的空值 |
| pass | 占位语句 |
| Number / String / Tuple(元组) | 不可变数据类型 |
| List / Set / Dictionary(字典/map) | 可变数据类型 |
| data = [] | 创建List |
| data = () | 创建Tuple |
| data = {} / {k:v,k:v} | 创建dict |
| data = set() / {v,v} | 创建Set |
| for x in data | for循环 |
| String[0::2] | 每个两位取一个值 |
| data[-1] | 集合取值 |
| range(10) | 0~10的整数系列 |
| help(max) | 查看max函数的文档 |
| 2**3 | 8 幂算术运算符 |
| 11//3 | 3 取整算术运算符 |
| not x | 取反逻辑运算符 |
| x and y | True==>y,False==>第一个False |
| x or y | if x : return x; else return y; |
| 1 in / not in [1,2] | 成员运算符 |
| x is/ not is y | 身份运算符 |
| id(x) == / != id(y) | 同上 |
| id() | 获取对象内存地址 |
| bin() oct() hex() | 二进制 八进制 十六进制 |
| "I\'m %s,age %d.2f" % ('z',18) | 字符串格式化 |
| "I\'m {0},age {1:.2f}".format("z",18) | 字符串格式化 |
| ljust(width[, fillchar]) | 字符串固定宽度，后面空值替换为指定值 |
| zfill (width) | 返回固定长度，前面填充0 |
| istitle() | 字符串是否是标题化(首字母大写) |
| maketrans() | 字符表映射转换表(批量替换) |
| translate(table, deletechars="") | 根据翻译表来替换 |
| replace(old, new [, max]) | 有上限的批量替换 |
| splitlines([keepends]) | 是否保留换行符 |
| yield | generator函数(生成器) |
| iter(list) | 迭代器 |
| isinstance([], Iterable) | 是否可迭代 |
| isinstance(iter('abc'), Iterator) | 是否是迭代器类型 |
| function(*s) | 不定长度的参数方法(*==>tuple) |
| function(**s) | 不定长度的参数方法(**==>dict)  |
| f(a,*,b,c) | 关键词参数 (f(1,b=2,c=3)) |
| f = lambda a, b : a + b | lambda |
| global | 声明使用全局变量 |
| nonlocal | 声明使用嵌套作用域的变量(外层方法中) |
| Iterator = map(f,[x1,x2]]) def f(x1): retrun x1*2 | 著名的map()函数 |
| reduce(add,[x1,x2,x3]]) == f(f(x1,x2),x3) | 著名的reduce()函数 |
| Iterator = filter(f,[x1,x2]) | 过滤序列函数(f成立则保留) |
| sorted(['a','c','b'], key=str.lower, reverse=True) | 排序函数 |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |