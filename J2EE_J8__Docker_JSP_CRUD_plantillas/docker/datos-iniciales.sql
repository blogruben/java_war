
CREATE DATABASE  IF NOT EXISTS `my_db_name`;

USE `my_db_name`;
CREATE TABLE `Product` (
  `ProductId` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(50) DEFAULT NULL,
  `Price` double NOT NULL,
  PRIMARY KEY (`ProductId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `Product` VALUES (1,'Xbox',100),(2,'PS4',400),(3,'iPhone',699);

--SELECT * FROM my_db_name.Product;