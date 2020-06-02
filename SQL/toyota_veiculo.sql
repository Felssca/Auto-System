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
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veiculo` (
  `id_veiculo` int(11) NOT NULL auto_increment,
  `modelo` varchar(45) character set latin1 default NULL,
  `cor` varchar(45) character set latin1 default NULL,
  `motor` varchar(45) character set latin1 default NULL,
  `usado` tinyint(1) default NULL,
  `dt_fabricacao` date default NULL,
  `descricao` text,
  `combustivel` varchar(45) default NULL,
  `portas` int(11) default NULL,
  `tipo_modelo` varchar(45) default NULL,
  PRIMARY KEY  (`id_veiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

LOCK TABLES `veiculo` WRITE;
/*!40000 ALTER TABLE `veiculo` DISABLE KEYS */;
INSERT INTO `veiculo` VALUES (1,'2000GT','Verde','2.0',0,'2011-04-12','Irado','Gasolina',2,'Sedam'),(2,'4Runner','Vermelho','3.0',0,'2011-04-12','Carro esportivo rápido','Gasolina',2,'SUV'),(3,'Crown','Prata','2.0',1,'2011-04-13','O Crown Ã© um sedan de luxo da Toyota.','Querosene',4,'SUV'),(4,'Cressida','Prata','2.0',1,'1978-04-12','O Cressida Ã© um sedan de porte grande da Toyota.','Gasolina',4,'Sedam'),(5,'Vitz','Branco','2.0',1,'1998-04-14','O Toyota Vitz (ou Yaris) Ã© um carro hatch compacto da Toyota. A primeira geraÃ§Ã£o Ã© de 1999 atÃ© 2004 e a segunda de 2005 atÃ© os dias de hoje. O modelo Ã© chamado de Vitz no JapÃ£o e de Yaris no resto do mundo. Seus principais mÃ©ritos sÃ£o o design moderno e o baixo consumo de combustÃ­vel. Seu concorrente direto Ã© o Honda Fit.','Gasolina',4,'Hatch'),(6,'Yaris','Prata','1.33 Dual VVT-i',1,'2011-02-09','O Toyota Yaris equipado com a tecnologia Toyota Optimal Drive: uma proposta homogénea.  O Toyota Yaris está preparado para a cidade. É compacto e ágil, tem estilo e é super-eficiente, graças a tecnologias avançadas como o sistema Stop & Start.  Mas o Yaris também tem atributos de automóveis de maiores dimensões. A filosofia Toyota Optimal Drive prova que motores económicos também podem ser potentes e proporcionar prazer de condução. A estes atributos junta-se o habitáculo mais espaçoso da classe.  Isto é, de facto, tudo o que esperaria de um Toyota.','Gasolina',3,'HIGH PACK');
/*!40000 ALTER TABLE `veiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-06-01 13:06:28
