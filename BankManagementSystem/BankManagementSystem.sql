show databases;

use bankmanagementsystem;

show tables;

select * from signup;
select * from signuptwo;

create table signupthree(formno varchar(20), accountType varchar(20), cardnumber varchar(25), pin varchar(10), facility varchar(100));

create table login(formno varchar(20), cardnumber varchar(25), pin varchar(10));
select * from signupthree;

select * from login;

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));

select * from bank;

