> ###目录
> 
> [目的](#目的)
> 
> [最佳配置`直接复制使用即可`](#最佳配置直接复制使用即可`)
> 
> [解析.gitignore默认文件学习忽略语法](#解析.gitignore默认文件学习忽略语法)

### 目的

 1. 了解git ignore语法
 2. 减小仓库大小、增加库的兼容性
    - 默认上传Gradle Wrapper会引导使用者安装不同版本的Gradle(Gradle更新被墙)

--------------

### 最佳配置`直接复制使用即可`

```
*.iml
.gradle
/local.properties
.DS_Store
build/
/captures
.externalNativeBuild
.idea
/gradle*
!gradle.properties
```

| ignore语句 | 白话 |
| --- | --- |
|*.iml| 忽略当前目录及子目录中所有后缀为.iml的文件 |
|.gradle| 忽略当前目录的.gradle文件或文件夹 |
|/local.properties| 忽略当前目录下local.properties文件或文件夹 |
|.DS_Store| 忽略当前目录下.DS_Store文件 |
|build/| 忽略当前目录及子目录下的build文件夹 |
|/captures| 忽略当前目录下的captures文件夹 |
|.externalNativeBuild| 忽略当前目录下.externalNativeBuild文件 |
|.idea| 忽略当前目录下.idea文件 |
|/gradle*| 忽略当前目录下的gradle开头的文件或文件夹 |
|!gradle.properties| 保留gradle.properties文件 |

>  效果预览

![修改了Git Ignore后文件列表对比](https://gitee.com/zwping_res/Res/raw/master/android/pnotes/gitignore_diff.png)

-----------

### 解析.gitignore默认文件学习忽略语法

| ignore语句 | 白话 |
| --- | --- |
| *.iml | 忽略当前目录包含子目录所有后缀为.iml的文件 |
|.gradle | 忽略当前目录的.gradle文件或文件夹 |
|/local.properties | 忽略当前目录下local.properties文件或文件夹 |
| /.idea/workspace.xml | 忽略当前目录指定文件夹中的文件 |
| /.idea/libraries | 忽略当前目录下指定文件夹中的文件夹 |
| .DS_Store | 忽略当前目录下.DS_Store文件 |
| /build | 忽略当前目录下的build文件夹 |
| /captures | 忽略当前目录下的captures文件夹 |
| .externalNativeBuild | 忽略当前目录下.externalNativeBuild文件 |

> 从中得到三点：
> 
> - Git Ignore语句只针对当前目录
> - '/' 开头为当前目录命令，则非
> - '*' 为通配符

> 再补充四点：
> 
> - '!' 开头为不忽略文件夹或文件，优先级最高
> - '/' 结尾为忽略当前目录及子目录的所有`文件夹`，eg：build/ 忽略所有build文件夹
> - '*' 为通配多个字符
> - '?' 为通配单个字符

---------
> 发布于[CSDN](https://blog.csdn.net/z1101558280/article/details/78900568)