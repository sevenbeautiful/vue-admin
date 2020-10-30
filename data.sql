create database if not exists st2015;
 use st2015
 drop table if exists student;
 create table student(
     no varchar(11) primary key,
     name varchar(20),
     age int,
     birthday date)default charset=utf8;

 insert into student values("20154091001","li",20,"1997-09-01");
 insert into student values("20154091002","zhang",20,"1997-09-01");
 insert into student values("20154091003","li",20,"1997-09-01");
 insert into student values("20154091004","zhang",20,"1997-09-01");
 
  select * from student;
 drop table if exists user;
  create table user(
     userId varchar(20) primary key,
	 username varchar(20),
     password varchar(20),
	 email varchar(20)
	 )default charset=utf8;
	 insert into user values("admin","wang","1","tai@163.com");
	