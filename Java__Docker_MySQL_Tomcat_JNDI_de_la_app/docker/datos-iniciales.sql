
CREATE DATABASE IF NOT EXISTS `MYSQL_DATABASE`;
USE `MYSQL_DATABASE`;
CREATE TABLE Persona (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255)
);
INSERT INTO Persona (PersonID, LastName,FirstName) VALUES 
(1,'Raul','Carrasco'),
(2,'Michel','Del Alamo'),
(3,'Rosa','Garcia'),
(4,'Vanesa','Torres');