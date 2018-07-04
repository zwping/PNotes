> ###目录
> 
> [指令安装插件](#指令安装插件)
>
> [技巧](#技巧)
>
> [安装过程中报错怎么办](#安装过程中报错怎么办)

###  指令安装插件
Sublime可通过指令的形式在线安装卸载插件，首先获取到指令输入框

 1. **Ctrl+Shift+P**
		 - 调出指令输入框
 2. 安装“插件控制器” ，指令`package control:install package`
		 - 输入简短指令`install`，Sublime有输入提示
 3. 安装插件 [MarkdownEditing](https://github.com/SublimeText-Markdown/MarkdownEditing)、[OmniMarkupPreviewer](https://github.com/timonwong/OmniMarkupPreviewer)

-------

### 技巧

 **高亮语法插件 MarkdownEditing**
	 当安装MarkdownEditing后，加载md文件界面背景变为了刺眼的白色，这时候你只需这样配置，就能成恢复成往日的黑色了
```
 {
    "color_scheme": "Packages/MarkdownEditing/MarkdownEditor-Dark.tmTheme",
    "draw_centered": false , //去除Markdown语句居中
    "wrap_width": "auto"
}
```

将以上的代码复制至Preferences --> Package Settings --> MarkdownEditing --> MarkdownEditing GFM Setting - User文件中即可
	 
**实时预览插件 OmniMarkupPreviewer**
快捷键Ctrl+Alt+O在线预览

-------

### 安装过程中报错怎么办
卸载重装

**卸载插件指令**

- Ctrl+Shift+P --> Remove Packer -->选中指定插件卸载


-------

> 发布与 [CSDN](https://blog.csdn.net/z1101558280/article/details/79852741)