###基本语句

| Description| Code| Remarks |
| :------------- |:-------------|:---------------|
| dos进入数据库 | mysql -uroot -p | 配置本机环境变量 |
| 显示所有数据库 | show databases; |  |
| 创建数据库|create database dbName;||
| 删除数据库 | drop database dbName;||
| 判断数据库是否存在<br/>(获取数据库详情)| select * from information_schema.SCHEMATA where SCHEMA_NAME = "dbName";||
|进入数据库|use dbName;||
|显示所有表|show tables;||
|查看表结构|describe 表名;||
|查看表详细定义|show create tables tableName;||
|创建表|create table 表名 (字段名 类型 约束, 字段名 类型 约束,设置外键 ...)|
|约束|primary key / auto_increment / unique / not null / default '张三' |主键和自动增长一起使用|
|设置外键|foreign key (当前表外键名) references fkTbaleName(primaryKey)||
|设置外键(定外键名) |constraint fkName foreign key (当前表外键名) references fkTbaleName(primaryKey)||
|删除外键约束|alter table tableName drop foreign key fkName||
|删除表| drop table 表名||
|如果表存在则删除|drop table if exists class||
|插入数据| insert into 表名(字段,...) values (数据,...); |
|清空数据|delete from tableName|有日志|
|清空数据|truncate table tableName|无日志|
|修改表名|alter table tableName rename newTbaleName||
|修改字段名|alter table tableName change oldFiledName newFiledName 类型 [约束]||
|修改字段类型/约束|alter table tableName modify filedName 类型 [约束] ||
|增加字段|alter table tableName add filedName type [constraint] [first or after filedName]|first-->首位 after filedName-->某字段后面|
|删除字段|alter table tableName drop filedName||
|修改字段排序位置|alter table tableName modify filedName type [constraint] first [or after filedName]||
|查询数据|select * from tableName||
|todo 复杂查询|||
||||
||||

### 配置

| Description| Code| Remarks |
| :------------- |:-------------|:---------------|

### C

| Description| Code| Remarks |
| :------------- |:-------------|:---------------|
| 当前连接数据库别名 | select database(); | |
| 当前状态 | status; | |

### R

| Description| Code| Remarks |
| :------------- |:-------------|:---------------|

### U

| Description| Code| Remarks |
| :------------- |:-------------|:---------------|

### D

| Description| Code| Remarks |
| :------------- |:-------------|:---------------|

---------------
> 发布于[CSDN](https://blog.csdn.net/z1101558280/article/details/70187495)