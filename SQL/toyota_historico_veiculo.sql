CREATE DATABASE  IF NOT EXISTS `toyota` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `toyota`;
-- MySQL dump 10.13  Distrib 5.1.40, for Win32 (ia32)
--
-- Host: localhost    Database: toyota
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt

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
-- Not dumping tablespaces as no INFORMATION_SCHEMA.FILES table on this server
--

--
-- Table structure for table `historico_veiculo`
--

DROP TABLE IF EXISTS `historico_veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico_veiculo` (
  `id_historico_veiculo` int(11) NOT NULL,
  `id_veiculo` int(11) default NULL,
  `dt_entrada` datetime default NULL,
  `dt_saida` datetime default NULL,
  `proprietario` varchar(45) default NULL,
  `sinistro` varchar(45) default NULL,
  `estado` varchar(45) default NULL,
  `local_venda` varchar(45) default NULL,
  `multas` varchar(45) default NULL,
  `ipva` varchar(45) default NULL,
  `km` int(11) default NULL,
  PRIMARY KEY  (`id_historico_veiculo`),
  KEY `id_veiculo` (`id_veiculo`),
  CONSTRAINT `historico_veiculo_ibfk_1` FOREIGN KEY (`id_veiculo`) REFERENCES `veiculo` (`id_veiculo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico_veiculo`
--

LOCK TABLES `historico_veiculo` WRITE;
/*!40000 ALTER TABLE `historico_veiculo` DISABLE KEYS */;
INSERT INTO `historico_veiculo` VALUES (1,6,'2009-11-04 19:00:40','2009-10-02 19:00:42','Ronildo Ferraz','Sim, pequena batida na porta do motorista','Goias','Toyota Goias','Nenhuma','Pago',30000),(2,6,'2011-05-31 23:35:25','2011-05-03 23:35:46','Joaquim Magal','Não','Brasilia','Toyota Brasilia','Nenhuma','Pago',60000);
/*!40000 ALTER TABLE `historico_veiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-06-01 13:06:25
