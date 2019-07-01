-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: localhost    Database: bison_amz_product_inventory
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `amz_sale_paln_item_val`
--

DROP TABLE IF EXISTS `amz_sale_paln_item_val`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amz_sale_paln_item_val` (
  `item_val_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '销售计划 自定义列名 对应的值id',
  `item_val` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '自定义列名 对应的值',
  `item_key_id` int(11) NOT NULL COMMENT '自定义列名id',
  `sale_plan_item_id` int(11) NOT NULL COMMENT 'sale_plan_item(销售计划子表) : sale_plan_item_id',
  PRIMARY KEY (`item_val_id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='销售计划自定义列对应value表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amz_sale_paln_item_val`
--

LOCK TABLES `amz_sale_paln_item_val` WRITE;
/*!40000 ALTER TABLE `amz_sale_paln_item_val` DISABLE KEYS */;
INSERT INTO `amz_sale_paln_item_val` VALUES (22,'140',89,673),(23,'300',90,673),(24,'450',91,673),(25,NULL,81,673),(26,NULL,82,673),(27,'140',89,674),(28,'300',90,674),(29,'450',91,674),(30,NULL,81,674),(31,NULL,82,674),(32,'140',89,675),(33,'300',90,675),(34,'450',91,675),(35,NULL,81,675),(36,NULL,82,675),(37,'140',89,676),(38,'300',90,676),(39,'450',91,676),(40,NULL,81,676),(41,NULL,82,676),(42,'140',89,677),(43,'300',90,677),(44,'450',91,677),(45,NULL,81,677),(46,NULL,82,677),(47,'140',89,678),(48,'300',90,678),(49,'450',91,678),(50,NULL,81,678),(51,NULL,82,678),(52,'140',89,679),(53,'300',90,679),(54,'450',91,679),(55,NULL,81,679),(56,NULL,82,679),(57,'140',89,680),(58,'300',90,680),(59,'450',91,680),(60,NULL,81,680),(61,NULL,82,680),(62,'140',89,681),(63,'300',90,681),(64,'450',91,681),(65,NULL,81,681),(66,NULL,82,681),(67,'140',89,682),(68,'300',90,682),(69,'450',91,682),(70,NULL,81,682),(71,NULL,82,682),(72,'140',89,683),(73,'300',90,683),(74,'450',91,683),(75,NULL,81,683),(76,NULL,82,683),(77,'140',89,684),(78,'300',90,684),(79,'450',91,684),(80,NULL,81,684),(81,NULL,82,684),(82,'140',89,685),(83,'300',90,685),(84,'450',91,685),(85,NULL,81,685),(86,NULL,82,685),(87,'140',89,686),(88,'300',90,686),(89,'450',91,686),(90,NULL,81,686),(91,NULL,82,686);
/*!40000 ALTER TABLE `amz_sale_paln_item_val` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-18 15:43:31
