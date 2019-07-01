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
-- Table structure for table `amz_sale_plan_item`
--

DROP TABLE IF EXISTS `amz_sale_plan_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amz_sale_plan_item` (
  `sale_plan_item_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '销售计划子表id',
  `sale_plan_id` int(11) NOT NULL COMMENT '销售计划id',
  `country` int(11) NOT NULL COMMENT '国家id',
  `product_id` int(11) NOT NULL COMMENT '商品 product_id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `est_units_promotion` int(11) DEFAULT '0' COMMENT '运营预估活动量',
  `status` int(11) NOT NULL COMMENT '状态 1正常 -1删除',
  `remark` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  PRIMARY KEY (`sale_plan_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=687 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='销售计划子表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amz_sale_plan_item`
--

LOCK TABLES `amz_sale_plan_item` WRITE;
/*!40000 ALTER TABLE `amz_sale_plan_item` DISABLE KEYS */;
INSERT INTO `amz_sale_plan_item` VALUES (673,779,1,2,1,0,1,'0'),(674,779,1,187,1,0,1,'0'),(675,779,1,188,1,0,1,'0'),(676,779,1,228,1,0,1,'0'),(677,779,2,187,1,0,1,'0'),(678,779,3,187,1,0,1,'0'),(679,779,3,188,1,0,1,'0'),(680,781,1,2,1,0,1,'0'),(681,781,1,187,1,0,1,'0'),(682,781,1,188,1,0,1,'0'),(683,781,1,228,1,0,1,'0'),(684,781,2,187,1,0,1,'0'),(685,781,3,187,1,0,1,'0'),(686,781,3,188,1,0,1,'0');
/*!40000 ALTER TABLE `amz_sale_plan_item` ENABLE KEYS */;
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
