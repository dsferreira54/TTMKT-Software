-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: ttmktdatabase
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contrato` (
  `CODIGO_CONTRATO` varchar(10) NOT NULL,
  `DATA_INICIO` date DEFAULT NULL,
  `DATA_TERMINO` date DEFAULT NULL,
  PRIMARY KEY (`CODIGO_CONTRATO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `CPF_FUNCIONARIO` varchar(14) NOT NULL,
  `TELEFONE` varchar(16) NOT NULL,
  `E-MAIL` varchar(60) NOT NULL,
  `RG` varchar(15) NOT NULL,
  `CARGO` varchar(30) NOT NULL,
  `DATA_ADMISSAO` date NOT NULL,
  `DATA_NASCIMENO` varchar(45) NOT NULL,
  `CNH` int DEFAULT NULL,
  `SEXO` enum('M,S') NOT NULL,
  `NUMERO_CASA` varchar(5) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `ULTIMO_NOME` varchar(30) NOT NULL,
  `PRIMEIRO_NOME` varchar(30) NOT NULL,
  PRIMARY KEY (`CPF_FUNCIONARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario_contrato`
--

DROP TABLE IF EXISTS `funcionario_contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario_contrato` (
  `CODIGO_CONTRATO` varchar(10) NOT NULL,
  `CPF_FUNCIONARIO` varchar(45) NOT NULL,
  KEY `CODIGO_CONTRATO_idx` (`CODIGO_CONTRATO`),
  KEY `CPF_FUNCIONARIO_idx` (`CPF_FUNCIONARIO`),
  CONSTRAINT `CODIGO_CONTRATO` FOREIGN KEY (`CODIGO_CONTRATO`) REFERENCES `contrato` (`CODIGO_CONTRATO`),
  CONSTRAINT `CPF_FUNCIONARIO` FOREIGN KEY (`CPF_FUNCIONARIO`) REFERENCES `funcionario` (`CPF_FUNCIONARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario_contrato`
--

LOCK TABLES `funcionario_contrato` WRITE;
/*!40000 ALTER TABLE `funcionario_contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario_contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `CNPJ_MARCA` varchar(20) NOT NULL,
  `TELEFONE` varchar(16) NOT NULL,
  `E-MAIL` varchar(60) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  PRIMARY KEY (`CNPJ_MARCA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `CODIGO_PRODUTO` varchar(10) NOT NULL,
  `NOME` varchar(60) NOT NULL,
  PRIMARY KEY (`CODIGO_PRODUTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto_marca`
--

DROP TABLE IF EXISTS `produto_marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto_marca` (
  `CODIGO_PRODUTO_MARCA` varchar(10) NOT NULL,
  `CODIGO_PRODUTO` varchar(10) NOT NULL,
  `CNPJ_MARCA` varchar(20) NOT NULL,
  `MEDIDA` varchar(20) NOT NULL,
  PRIMARY KEY (`CODIGO_PRODUTO_MARCA`),
  KEY `COD_PRODUTO_MARCA_idx` (`CODIGO_PRODUTO`),
  KEY `CNPJ_MARCA_idx` (`CNPJ_MARCA`),
  CONSTRAINT `CNPJ_MARCA` FOREIGN KEY (`CNPJ_MARCA`) REFERENCES `marca` (`CNPJ_MARCA`),
  CONSTRAINT `COD_PRODUTO_MARCA` FOREIGN KEY (`CODIGO_PRODUTO`) REFERENCES `produto` (`CODIGO_PRODUTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto_marca`
--

LOCK TABLES `produto_marca` WRITE;
/*!40000 ALTER TABLE `produto_marca` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto_marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto_marca_contrato`
--

DROP TABLE IF EXISTS `produto_marca_contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto_marca_contrato` (
  `CODIGO_PRODUTO_MARCA` varchar(10) NOT NULL,
  `CODIGO_CONTRATO` varchar(10) NOT NULL,
  KEY `CODIGO_PRODUTO_MARCA_idx` (`CODIGO_PRODUTO_MARCA`),
  KEY `CODIGO_CONTRATO_idx` (`CODIGO_CONTRATO`),
  CONSTRAINT `CODIGO_CONTRATO_PMC` FOREIGN KEY (`CODIGO_CONTRATO`) REFERENCES `contrato` (`CODIGO_CONTRATO`),
  CONSTRAINT `CODIGO_PRODUTO_MARCA` FOREIGN KEY (`CODIGO_PRODUTO_MARCA`) REFERENCES `produto_marca` (`CODIGO_PRODUTO_MARCA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto_marca_contrato`
--

LOCK TABLES `produto_marca_contrato` WRITE;
/*!40000 ALTER TABLE `produto_marca_contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto_marca_contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supermercado`
--

DROP TABLE IF EXISTS `supermercado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supermercado` (
  `CNPJ_SUPERMERCADO` varchar(20) NOT NULL,
  `NOME` varchar(50) DEFAULT NULL,
  `E-MAIL` varchar(60) DEFAULT NULL,
  `NUM_ESTABELECIMENTO` varchar(5) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`CNPJ_SUPERMERCADO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supermercado`
--

LOCK TABLES `supermercado` WRITE;
/*!40000 ALTER TABLE `supermercado` DISABLE KEYS */;
/*!40000 ALTER TABLE `supermercado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supermercado_contrato`
--

DROP TABLE IF EXISTS `supermercado_contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supermercado_contrato` (
  `CNPJ_SUPERMERCADO` varchar(20) NOT NULL,
  `CODIGO_CONTRATO` varchar(10) NOT NULL,
  KEY `CNPJ_SUPERMERCADO_idx` (`CNPJ_SUPERMERCADO`),
  KEY `CODIGO_CONTRATO_idx` (`CODIGO_CONTRATO`),
  CONSTRAINT `CNPJ_SUPERMERCADO` FOREIGN KEY (`CNPJ_SUPERMERCADO`) REFERENCES `supermercado` (`CNPJ_SUPERMERCADO`),
  CONSTRAINT `CODIGO_CONTRATO_SUPERMERCADO` FOREIGN KEY (`CODIGO_CONTRATO`) REFERENCES `contrato` (`CODIGO_CONTRATO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supermercado_contrato`
--

LOCK TABLES `supermercado_contrato` WRITE;
/*!40000 ALTER TABLE `supermercado_contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `supermercado_contrato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-14 21:40:45
