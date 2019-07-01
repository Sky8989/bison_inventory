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
-- Table structure for table `amz_sales_volume_rule`
--

DROP TABLE IF EXISTS `amz_sales_volume_rule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amz_sales_volume_rule` (
  `sales_volume_rule_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '销量计划 规则id',
  `item_key_id` int(11) NOT NULL COMMENT '销售计划 自定义列id type=1',
  `min_sales_volume` int(11) NOT NULL COMMENT '销售规则范围 最小销量',
  `max_sales_volume` int(11) NOT NULL COMMENT '销售规则范围  最大销量',
  `rationality` int(11) NOT NULL DEFAULT '0' COMMENT '判断合理性的百分比，存储去掉百分号的数据',
  PRIMARY KEY (`sales_volume_rule_id`)
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='销售规则表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amz_sales_volume_rule`
--

LOCK TABLES `amz_sales_volume_rule` WRITE;
/*!40000 ALTER TABLE `amz_sales_volume_rule` DISABLE KEYS */;
INSERT INTO `amz_sales_volume_rule` VALUES (119,81,0,10,100),(120,81,10,20,100),(121,81,20,100,70),(122,81,100,200,20),(123,81,200,300,15),(124,81,300,500,10),(125,81,500,30000,10);
/*!40000 ALTER TABLE `amz_sales_volume_rule` ENABLE KEYS */;
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
