> 十八般武艺，样样都要精通，在这了解一下Git忽略规则，以至上传至服务端的开发文件最少（还可增加第三方函数库的兼容性）

> 先直接看下我在Android开发中Git的忽略规则怎么配置达到最佳

```
*.iml
.gradle
/local.properties
/.idea/workspace.xml
/.idea/libraries
.DS_Store
build/
/captures
.externalNativeBuild
.idea
/gradle
/gradle*
```
- Ps：
- 增加了.idea、/gradle、/gradle*
- 将/build更改为build/
 - `其中`
 - `.idea文件夹属于studio的配置信息`
 - `gradle版本众多，每次更新不同版本的gradle都需要翻墙，开源后免去同行加载你的项目过慢(兼容性增加)`
 - `So，去除.idea和gradle相关文件是必要的`
 
>  效果预览

![修改了Git Ignore后文件列表对比](https://raw.githubusercontent.com/zwping-win/RESOURCES/master/android/%E4%BF%AE%E6%94%B9%E4%BA%86GitIgnore%E5%90%8E%E6%96%87%E4%BB%B6%E5%88%97%E8%A1%A8%E5%AF%B9%E6%AF%94%E5%9B%BE%E7%89%87.png)


Next，下面了解一下Git Ignore的语法

> 先解析一下AndroidStudio默认生成的`.gitignore`文件

| ignore语句 | 白话 |
| --- | --- |
| *.iml | 忽略当前目录包含子目录所有后缀为.iml的文件 |
| .gradle | 忽略当前目录的.gradle文件 |
| /local.properties| 忽略当前目录下local.properties文件夹 |
| /.idea/workspace.xml| 忽略当前目录指定文件夹中的文件 |
| /.idea/libraries| 忽略当前目录下指定文件夹中的文件夹 |
| .DS_Store| 忽略当前目录下.DS_Store文件 |
| /build| 忽略当前目录下的build文件夹 |
| /captures| 忽略当前目录下的captures文件夹 |
| .externalNativeBuild| 忽略当前目录下.externalNativeBuild文件 |

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


>熟生巧，活学用