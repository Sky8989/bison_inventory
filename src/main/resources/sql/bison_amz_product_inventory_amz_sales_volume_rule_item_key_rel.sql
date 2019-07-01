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
-- Table structure for table `amz_sales_volume_rule_item_key_rel`
--

DROP TABLE IF EXISTS `amz_sales_volume_rule_item_key_rel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amz_sales_volume_rule_item_key_rel` (
  `sales_volume_rule_id` int(11) NOT NULL COMMENT '销量规则id  每个销量规则id关联一组 itme_key_id',
  `item_key_id` int(11) NOT NULL COMMENT '历史日均 或 预测日均 itme_key_id  \nitme_key表type=1历史日均  \nitme_key表type=2预测日均',
  `item_key_ratio` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT ' 比率',
  PRIMARY KEY (`sales_volume_rule_id`,`item_key_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='销售规则 与 销售规则自定义列 比率关系表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amz_sales_volume_rule_item_key_rel`
--

LOCK TABLES `amz_sales_volume_rule_item_key_rel` WRITE;
/*!40000 ALTER TABLE `amz_sales_volume_rule_item_key_rel` DISABLE KEYS */;
INSERT INTO `amz_sales_volume_rule_item_key_rel` VALUES (119,81,1.00),(119,82,0.00),(119,89,0.10),(119,90,0.10),(119,91,0.80),(120,81,1.00),(120,82,0.00),(120,89,0.15),(120,90,0.15),(120,91,0.70),(121,81,0.80),(121,82,0.20),(121,89,0.15),(121,90,0.40),(121,91,0.45),(122,81,0.60),(122,82,0.40),(122,89,0.40),(122,90,0.30),(122,91,0.30),(123,81,0.60),(123,82,0.40),(123,89,0.40),(123,90,0.30),(123,91,0.30),(124,81,0.50),(124,82,0.50),(124,89,0.30),(124,90,0.30),(124,91,0.40),(125,81,0.50),(125,82,0.50),(125,89,0.30),(125,90,0.30),(125,91,0.40);
/*!40000 ALTER TABLE `amz_sales_volume_rule_item_key_rel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-18 15:43:30
