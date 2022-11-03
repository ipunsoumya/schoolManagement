create database school;
use school;
create table school(schoolId int not null, 
schoolName varchar(255) not null, location varchar(100),
primary key (schoolId));
insert into school values (1, 'Saraswati Shishu Vidya Mandir', 'Rourkela'); 
insert into school values (2, 'Xavier Public School', 'Jharsuguda'); 
insert into school values (3, 'DAV Public School', 'Cuutack'); 
insert into school values (4, 'Sai International School', 'Bhubaneshwar'); 