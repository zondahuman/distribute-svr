
wget http://dl.mycat.io/1.6-RELEASE/Mycat-server-1.6-RELEASE-20161028204710-linux.tar.gz



创建用户
CREATE USER 'user'@'%' IDENTIFIED BY 'user';
用户授权
GRANT ALL ON *.* TO 'user'@'%';


grant all PRIVILEGES on *.* to user@'%'  identified by 'user';

grant all PRIVILEGES on *.* to root@'%'  identified by 'root';



Mycat 多租户方案
http://blog.csdn.net/prestigeding/article/details/52662426?locationNum=11&fps=1
https://github.com/dingwpmz/Mycat-Demo




MyCat部署运行（Windows环境）与使用步骤详解
http://blog.csdn.net/Stubborn_Cow/article/details/46967407
MyCAT全局序列号
http://www.linuxidc.com/Linux/2016-03/129179.htm





本地时间戳方式获取

1.修改server配置文件

<system><property name="sequnceHandlerType">2</property></system>
注：sequnceHandlerType 配置为2表示时间戳方式。


2.测试插入数据，也是在mycat逻辑库上执行，注意时间戳的长度有18位，保证表的字段长度足够

insert into user(id,name) values(next value for MYCATSEQ_GLOBAL,'中文');


优点：不存在上面两种方案因为mycat的重启导致id重复的现象

缺点：数据类型太长








