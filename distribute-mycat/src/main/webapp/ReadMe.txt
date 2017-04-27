
create table order_info(
id int auto_increment not null,
name varchar(100) ,
age int ,
create_time datetime ,
update_time datetime ,
version int,
constraint pk_order_info primary key(id)
)



mysql -uroot -proot -h172.16.2.145 -P9066
mysql -uroot -proot -h172.16.2.145 -P8066



