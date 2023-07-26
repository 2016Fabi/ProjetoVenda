-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: vendas
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_itens`
--

DROP TABLE IF EXISTS `tb_itens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_itens` (
  `ite_codigo` bigint NOT NULL AUTO_INCREMENT,
  `ite_quantidade` int NOT NULL,
  `ite_valor_parcial` decimal(7,2) NOT NULL,
  `tb_produtos_pro_codigo` bigint NOT NULL,
  `tb_vendas_ven_codigo` bigint NOT NULL,
  PRIMARY KEY (`ite_codigo`),
  KEY `FK_tk942rfche8jcppquu2mv3ui1` (`tb_produtos_pro_codigo`),
  KEY `FK_4hr3nbkayb3vrl5hfwy6ug7mu` (`tb_vendas_ven_codigo`),
  CONSTRAINT `FK_4hr3nbkayb3vrl5hfwy6ug7mu` FOREIGN KEY (`tb_vendas_ven_codigo`) REFERENCES `tb_vendas` (`ven_codigo`),
  CONSTRAINT `FK_tk942rfche8jcppquu2mv3ui1` FOREIGN KEY (`tb_produtos_pro_codigo`) REFERENCES `tb_produtos` (`pro_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_itens`
--

LOCK TABLES `tb_itens` WRITE;
/*!40000 ALTER TABLE `tb_itens` DISABLE KEYS */;
INSERT INTO `tb_itens` VALUES (1,2,109.99,2,1),(2,8,120.99,1,1),(4,1,17.99,2,4),(5,1,13.99,5,4),(6,1,20.99,4,4),(7,1,10.99,1,4);
/*!40000 ALTER TABLE `tb_itens` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-25 21:05:02
