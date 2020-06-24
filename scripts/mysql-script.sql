CREATE DATABASE  IF NOT EXISTS `test`;
USE `test`;


DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `price` decimal(5,2) NOT NULL,
  `publication_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


LOCK TABLES `books` WRITE;
INSERT INTO `books` VALUES (1,'The Big 4','William Welch Deloitte',12.00,'2020-01-01'),(2,'My Journey','Bill Gates',245.50,'2019-12-31');
UNLOCK TABLES;
