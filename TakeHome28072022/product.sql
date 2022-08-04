create database ecommerce;
use ecommerce;
create table productcategory(
categoryid bigint primary key auto_increment,
categoryname varchar(255));

select * from productcategory;

create table product(
id bigint primary key auto_increment,
sku varchar(255),
name varchar(255),
description varchar(255),
unitprice decimal(13,2),
imageurl varchar(255), 
active bit(1),
unitinstock int,
datecreated datetime(6),
lastupdated datetime(6),
categoryid bigint ,
foreign key (categoryid) references productcategory(categoryid));

alter table product modify imageurl varchar(10512);
insert into productcategory values(1, "Mobile"),(2,"Clothing"),(3,"Electronics");
select * from product;
insert into product values(1001,"MDN-5001","Iphone 12","This is apple product",56900,"www.apple.co.in",0,5,20200912,20220727,1);
insert into product values(1002,"MDN-5002","Jeans","This is a jeans",3500,"www.levis.com",1,100,20210730,20220725,2);
insert into product values(1003,"MDN-5003","AC","This is a air conditioner",35000,"www.lg.com",0,15,20191225,20220611,3);
update product set imageurl = "https://os-wordpress-media.s3.ap-south-1.amazonaws.com/blog/wp-content/uploads/2020/11/24212247/Air-Conditioner-Buying-Guide.jpg" where id = 1003;
alter table product modify datecreated date;
alter table product modify lastupdated date;
delete from product;
delete from productcategory;
drop table productcategory;
select * from productcategory;
alter table product modify id int auto_increment;
alter table productcategory modify categoryid int auto_increment;

create table cart(
cartid int primary key,
productname varchar(255),
imageurl varchar(10512),
unitprice decimal(13,2),
productid int,
foreign key (productid) references product(id));