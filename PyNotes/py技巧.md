### py技巧

```

1.  解决mac下py多版本兼容，安装框架至指定目录: 
pip3 install --target=/Library/Frameworks/Python.framework/Versions/3.7/lib/python3.7/site-packages xxx

2. 使用虚拟环境指定任意框架的任意版本 venv
	- python3 -m venv venv
	- source venv/bin/activate

3. 查询端口占用：
	lsof -i tcp:9000
	kill kid

```



```

flask在虚拟机中启动过程

1. start venv
2. ex

```