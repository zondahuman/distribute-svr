
wget http://dl.mycat.io/1.6-RELEASE/Mycat-server-1.6-RELEASE-20161028204710-linux.tar.gz



创建用户
CREATE USER 'user'@'%' IDENTIFIED BY 'user';
用户授权
GRANT ALL ON *.* TO 'user'@'%';


grant all PRIVILEGES on *.* to user@'%'  identified by 'user';

grant all PRIVILEGES on *.* to root@'%'  identified by 'root';



