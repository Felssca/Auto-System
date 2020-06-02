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
-- Table structure for table `historico_veiculo_revisoes`
--

DROP TABLE IF EXISTS `historico_veiculo_revisoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico_veiculo_revisoes` (
  `id_historico_veiculo_revisoes` int(11) NOT NULL,
  `id_historico_veiculo` int(11) default NULL,
  `detalhes` varchar(255) default NULL,
  `km` int(11) default NULL,
  PRIMARY KEY  (`id_historico_veiculo_revisoes`),
  KEY `id_historico_veiculo` (`id_historico_veiculo`),
  CONSTRAINT `id_historico_veiculo` FOREIGN KEY (`id_historico_veiculo`) REFERENCES `historico_veiculo` (`id_historico_veiculo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico_veiculo_revisoes`
--

LOCK TABLES `historico_veiculo_revisoes` WRITE;
/*!40000 ALTER TABLE `historico_veiculo_revisoes` DISABLE KEYS */;
INSERT INTO `historico_veiculo_revisoes` VALUES (1,1,'Combustível e lubrificantes \nFiltros \nVelas e Cabos \nFaróis e lâmpadas  \nLimpador de pára-brisas \nFreios \nSuspensão \nCorreia dentada \nSistema Elétrico \nRadiador \nPneus',15000),(2,1,'Combustível e lubrificantes \nFiltros \nVelas e Cabos \nFaróis e lâmpadas  \nLimpador de pára-brisas \nFreios \nSuspensão \nCorreia dentada \nSistema Elétrico \nRadiador \nPneus',30000);
/*!40000 ALTER TABLE `historico_veiculo_revisoes` ENABLE KEYS */;
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
