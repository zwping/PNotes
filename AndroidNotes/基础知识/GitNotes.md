> ### 目录
> 
> [必备技巧](#必备技巧)
> 
> [常见操作](#常见操作)`术语、基本命令、配置、c、r、u、d`
 
### 必备巧技

```
设置查看详细log的别名（提供版本号(哈希值)的前七位）
git config --global alias.lg "log --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit --date=relative" 
设置精简查看log的提交日志的别名
git config --global alias.logi "log --pretty=oneline"
通过连接符拼接命令
git add . && git commit -m "Up" && git push
```

### 基本的操作

- 术语
```
缓存区 创建或修改文件，属于缓存区
暂存区 add过后，文件进入暂存区（staged）
本地库 commit过后，文件进入本地库
远程库 push之后地址
```
- 基本命令
```
pwd 显示当前目录的绝对路径
ls 显示所有文件
ls -a 显示含隐藏的所有文件
cd test 进入文件夹
cd .. 退回上级目录
cd / 退回根目录
f 下一页
b 上一页
q 退出当前查阅状态
git init 初始化git仓库
git init --bare  初始化服务器
git status 显示当前文件状态
git status -s 精简形式显示当前文件状态
git log 显示日志
git log -1 显示最近一次提交的日志
git lg 显示精简日志（详见必备巧计）
git reflog 查看所有的分支详细操作日志
git checkout branch1 切换至分支1中
git checkout tag1 切换至tag1标签中
git checkout log名 切换至指定log名版本中
git checkout head^^ 往上切换至倒数第二个版本
git reset --hard log名 代码回退至指定版本
git reset --hard head^ 回退一个版本
git checkout 123.txt 撤销未加入暂存区123.txt文件修改的内容
git checkout branch1 origin/branch1 将远程仓库分支1迁移至本地仓库，并命名为branch1
git checkout -b branch1 origin/branch1 将远程仓库分支1迁移至本地仓库，并命名为branch1和切换至branch1分支
git stash apply 恢复最近一条隐藏标记中的内容
git stash pop 恢复最近一条隐藏标记中的内容，并将这条隐藏标记删除
git stash apply stash@{1} 恢复至指定的隐藏标记内容
```
- 配置 (可查阅.git文件夹中config文件)
```
git config --global user.name zwping 设置全局的用户名
git config user.email 1101558280@qq.com 设置某个项目中的邮箱
git config --global alias.cm commit 将commit设置别名为cm
git config --global alias.psm 'push origin master' 将push origin master命令行设置别名为psm
git config --global core.editor "sublime" 设置git编辑器为sublime
```
- c (Create 创建增加)
```
mkdir test 创建文件夹
touch 123.txt 创建文件
git add test 增加文件夹至本地仓库暂存区
git add 123.txt 增加文件至本地仓库暂存区
git add . 增加所有文件至本地仓库暂存区
git add -all 增加所有文件至本地仓库暂存区
git commit -m "first commit" 将暂存区保存至本地仓库
git branch branch1 创建分支1
git checkout -b branch1 创建并切换至分支1
git tag "tag1" 创建tag1标签
git clone https://github.com/zwping/PSeries.git 将pSeries项目克隆至本地
git remote add origin https://github.com/zwping/PSeries.git 添加pseries远程仓库至本地，并将其命名为remote-pseries
git branch --set-upstream branch1 origin/branch1 将本地分支1和远程分支1建立链接关系
git stash 将当前修改内容隐藏起来并stash标记
git tag v1.0 在当前版本上创建标签
git tag v1.1 ca06bd7 对某一次提交创建标签
git tag -a v1.2 -m "release v1.2" 在当前版本上创建带有说明的标签
ssh-keygen -t rsa 根据rsa算法生成ssh公私钥
```
- r (Retrieve 读取查询)
```
ssh 查询是否安装ssh证书
git config user.name 查询当前项目的用户名
git config --global --list 查询全局配置列表
git tag 获取所有标签
git remote -v 查询远程仓库地址
git diff 查询缓存区有哪些改动
git diff --staged 123.txt 查看缓存区123.txt文件有哪些改动
git diff --staged 查看暂存区有哪些改动
git diff --staged 123.txt 查看暂存区123.txt文件有哪些改动
git diff head 查看当前文件与本地库的差异
git diff head -- 123.txt 查看123.txt文件和本地库中123.txt的差异
git diff 版本号1 版本号2 查询两次提交有哪些改动
git diff 分支名1 分支名2 查询两个分支有哪些改动
git stash list 查询当前隐藏标记集合
git branch 查看本地分支
git branch -r 查看远程分支
git branch -a 查看本地和远程分支
git branch -av 查看本地和远程分支，及分支最后提交的Log
git tag 查看标签列表
git show v1.0 查看标签详情
```
- u (Update 更新)

```
git merge branch1 将分支1中的代码合并至master中
git merge --no-ff -m "fix" 将branch1 将分支1中的代码合并至master中，禁用Fast forward模式（可以看出是从哪个分支合并过来的，及合并缘由）
git rebase branch1 将分支1中的代码合并至master中
git push -u origin master 将master主分支推送至origin远程仓库上，并关联远程主分支
git push origin branch1 将分支1推送至origin远程仓库上
git push origin v1.0 将标签1推送至远程仓库上
git push origin --tags 将所有标签推送至远程仓库
git pull 更新本地仓库
git pull origin master 将远程仓库master主分支上的代码更新至本地仓库
```
- d (delete 删除)

```
git rm --cache 123.txt 删除123.txt的缓存
git rm --cache -r app 删除app文件夹的缓存
git rm -f 123.txt 删除123.txt的缓存及文件
rm -r test 删除test文件件
rm -f test 强制删除test文件夹
rm -rf test 强制删除test文件夹
rm 123.txt 删除123.txt
git branch -d branch1 删除分支1
git branch -D branch1 强制删除分支1
git push origin :branch1 删除远程仓库分支1
git branch -r -d origin/branch1 删除远程仓库分支1
git stash drop 删除最近一条隐藏标记
git stash drop 删除所有的隐藏标记并恢复最近一条隐藏标记的内容
git stash clear 清空所有隐藏标记
git tag -d v1.0 删除标签
git push origin :refs/tags/v1.0 删除远程仓库标签
```

-----
撸git的过程（黑马[git教学视频](https://chuanke.baidu.com/v1867921-208020-1272123.html) --> 廖雪峰老师[git教程](https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000) --> [git官网](https://git-scm.com/book/zh/v2) --> 个人习惯撰写Blog --> 百度）

> 发布于[CSDN](https://blog.csdn.net/z1101558280/article/details/66972349)