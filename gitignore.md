# GitIgnore语法

> 首先解析一下AndroidStudio默认生成的`.gitignore`文件，初步了解gitignore语法

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
> - GitIgnore语句只针对当前目录
> - '/' 开头为目录命令，则非
> - '*' 为通配符

> 补充：
> 
> - '!' 开头为不忽略文件夹或文件，优先级最高
> - '/' 结尾为忽略当前目录及子目录的所有`文件夹`，eg：build/ 忽略所有build文件夹
> - '*' 为通配多个字符
> - '?' 为通配单个字符

> 初步了解了之后算是精通gitignore语法，就达到大师级别了? 有高级的写法嘛? (´⊙ω⊙`)一脸懵逼状

#### 实践
> 平时习惯性的将AndroidStudio项目根目录下的.gitignore轻微更改一下，以达到线上文件最小化

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
```

`ps: 增加了.idea、/gradle、将/build更改为build/`

###### 待完善...
