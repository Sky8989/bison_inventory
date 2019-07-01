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
-- Table structure for table `amz_sale_paln_item_key`
--

DROP TABLE IF EXISTS `amz_sale_paln_item_key`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amz_sale_paln_item_key` (
  `item_key_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '销售计划 自定义列名id',
  `item_key` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '销售计划 自定义列名',
  `business_unit_id` int(11) NOT NULL COMMENT '部门id',
  `type` int(11) NOT NULL COMMENT '1:历史销量 2:预测销量 3:合理性',
  `status` int(11) DEFAULT '1' COMMENT '1正常状态, -1删除状态',
  `last_day_val` int(11) DEFAULT '0' COMMENT '当前 item_key为历史销量 type=1 存对应的历史天数',
  PRIMARY KEY (`item_key_id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='销售计划自定义列 表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amz_sale_paln_item_key`
--

LOCK TABLES `amz_sale_paln_item_key` WRITE;
/*!40000 ALTER TABLE `amz_sale_paln_item_key` DISABLE KEYS */;
INSERT INTO `amz_sale_paln_item_key` VALUES (81,'7',1,1,1,7),(82,'30',1,1,1,14),(89,'14',1,2,1,7),(90,'30',1,2,1,30),(91,'45',1,2,1,45);
/*!40000 ALTER TABLE `amz_sale_paln_item_key` ENABLE KEYS */;
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
