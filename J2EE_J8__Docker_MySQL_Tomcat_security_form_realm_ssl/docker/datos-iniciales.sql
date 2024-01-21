
CREATE DATABASE IF NOT EXISTS `MYSQL_DATABASE`;

use `MYSQL_DATABASE`;

create table Fruta (
    FrutaID int,
    Nombre varchar(255),
    Precio DECIMAL(6,2)
);

insert into Fruta (FrutaID, Nombre,Precio) values 
(1,'Pera',0.83),
(2,'Platano',1.24),
(3,'Manzana',1.17),
(4,'Uvas',2.67);




create table users (
  user_name         varchar(15) not null primary key,
  user_pass         varchar(15) not null
);

create table user_roles (
  user_name         varchar(15) not null,
  role_name         varchar(15) not null,
  primary key (user_name, role_name)
);

insert into users (user_name,user_pass) values ( 'Roberto','Roberto1' );
insert into users (user_name,user_pass) values ( 'Rocio','Rocio1' );
insert into users (user_name,user_pass) values ( 'Rafael','Rafael1' );
insert into user_roles (user_name,role_name) values ( 'Roberto','empleado' );
insert into user_roles (user_name,role_name) values ( 'Rocio','empleado' );
insert into user_roles (user_name,role_name) values ( 'Rafael','gerente' );


