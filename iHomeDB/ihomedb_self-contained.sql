-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: ihomedb
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `book_his`
--

DROP TABLE IF EXISTS `book_his`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book_his` (
  `book_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `book_history` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`book_id`,`room_id`),
  KEY `room_id_his_idx` (`room_id`),
  CONSTRAINT `book_id_his` FOREIGN KEY (`book_id`) REFERENCES `booking` (`book_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `room_id_his` FOREIGN KEY (`room_id`) REFERENCES `room` (`room_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_his`
--

LOCK TABLES `book_his` WRITE;
/*!40000 ALTER TABLE `book_his` DISABLE KEYS */;
/*!40000 ALTER TABLE `book_his` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `book_id` int(11) NOT NULL,
  `check_in` datetime NOT NULL,
  `check_out` datetime NOT NULL,
  `touris_amount` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `book_id_UNIQUE` (`book_id`),
  KEY `customer_id_idx` (`customer_id`),
  CONSTRAINT `customer_id_book` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `f_name` varchar(30) NOT NULL,
  `l_name` varchar(20) NOT NULL,
  `id_card` varchar(13) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(11) NOT NULL,
  `customer_type` varchar(5) NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_id_UNIQUE` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facilities`
--

DROP TABLE IF EXISTS `facilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facilities` (
  `fac_id` int(11) NOT NULL,
  `fac_name` varchar(20) NOT NULL,
  `fac_desc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facilities`
--

LOCK TABLES `facilities` WRITE;
/*!40000 ALTER TABLE `facilities` DISABLE KEYS */;
/*!40000 ALTER TABLE `facilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `homestay`
--

DROP TABLE IF EXISTS `homestay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `homestay` (
  `hs_id` int(11) NOT NULL,
  `hs_name` varchar(20) NOT NULL,
  `hs_location` varchar(50) NOT NULL,
  `hs_pics` varchar(50) DEFAULT NULL,
  `hs_promotion` varchar(500) DEFAULT NULL,
  `hs_activity` varchar(500) DEFAULT NULL,
  `hs_traffic` varchar(500) DEFAULT NULL,
  `host_id` int(11) NOT NULL,
  PRIMARY KEY (`hs_id`),
  UNIQUE KEY `hs_id_UNIQUE` (`hs_id`),
  KEY `host_id_idx` (`host_id`),
  CONSTRAINT `host_id` FOREIGN KEY (`host_id`) REFERENCES `host_homestay` (`host_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `homestay`
--

LOCK TABLES `homestay` WRITE;
/*!40000 ALTER TABLE `homestay` DISABLE KEYS */;
/*!40000 ALTER TABLE `homestay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `host_homestay`
--

DROP TABLE IF EXISTS `host_homestay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `host_homestay` (
  `host_id` int(11) NOT NULL,
  `host_web` varchar(20) NOT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`host_id`),
  UNIQUE KEY `host_id_UNIQUE` (`host_id`),
  KEY `customer_id_idx` (`customer_id`),
  CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `host_homestay`
--

LOCK TABLES `host_homestay` WRITE;
/*!40000 ALTER TABLE `host_homestay` DISABLE KEYS */;
/*!40000 ALTER TABLE `host_homestay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `near_homestay`
--

DROP TABLE IF EXISTS `near_homestay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `near_homestay` (
  `hs_id` int(11) NOT NULL,
  `np_id` int(11) NOT NULL,
  PRIMARY KEY (`hs_id`,`np_id`),
  KEY `np_id_near_idx` (`np_id`),
  CONSTRAINT `hs_id_near` FOREIGN KEY (`hs_id`) REFERENCES `homestay` (`hs_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `np_id_near` FOREIGN KEY (`np_id`) REFERENCES `near_place` (`np_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `near_homestay`
--

LOCK TABLES `near_homestay` WRITE;
/*!40000 ALTER TABLE `near_homestay` DISABLE KEYS */;
/*!40000 ALTER TABLE `near_homestay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `near_place`
--

DROP TABLE IF EXISTS `near_place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `near_place` (
  `np_id` int(11) NOT NULL,
  `np_name` varchar(20) NOT NULL,
  `np_desc` varchar(50) DEFAULT NULL,
  `np_pics` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`np_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `near_place`
--

LOCK TABLES `near_place` WRITE;
/*!40000 ALTER TABLE `near_place` DISABLE KEYS */;
/*!40000 ALTER TABLE `near_place` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quantity`
--

DROP TABLE IF EXISTS `quantity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quantity` (
  `rt_id` int(11) NOT NULL,
  `fac_id` int(11) NOT NULL,
  `number_of` int(11) NOT NULL,
  PRIMARY KEY (`rt_id`,`fac_id`),
  UNIQUE KEY `fac_id_UNIQUE` (`fac_id`),
  UNIQUE KEY `rt_id_UNIQUE` (`rt_id`),
  CONSTRAINT `fac_id_quan` FOREIGN KEY (`fac_id`) REFERENCES `facilities` (`fac_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `rt_id_quan` FOREIGN KEY (`rt_id`) REFERENCES `roomtype` (`rt_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quantity`
--

LOCK TABLES `quantity` WRITE;
/*!40000 ALTER TABLE `quantity` DISABLE KEYS */;
/*!40000 ALTER TABLE `quantity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review` (
  `customer_id` int(11) NOT NULL,
  `hs_id` int(11) NOT NULL,
  `review_rate` int(11) NOT NULL,
  PRIMARY KEY (`customer_id`,`hs_id`),
  UNIQUE KEY `customer_id_UNIQUE` (`customer_id`),
  UNIQUE KEY `hs_id_UNIQUE` (`hs_id`),
  CONSTRAINT `cus_id_review` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `hs_id_review` FOREIGN KEY (`hs_id`) REFERENCES `homestay` (`hs_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `room_id` int(11) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `rt_id` int(11) NOT NULL,
  PRIMARY KEY (`room_id`),
  UNIQUE KEY `room_id_UNIQUE` (`room_id`),
  KEY `rt_id_room_idx` (`rt_id`),
  CONSTRAINT `rt_id_room` FOREIGN KEY (`rt_id`) REFERENCES `roomtype` (`rt_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomtype`
--

DROP TABLE IF EXISTS `roomtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roomtype` (
  `rt_id` int(11) NOT NULL,
  `rt_name` varchar(20) NOT NULL,
  `rt_price` float NOT NULL,
  `rt_desc` varchar(500) DEFAULT NULL,
  `rt_unit` int(11) NOT NULL,
  `hs_id` int(11) NOT NULL,
  PRIMARY KEY (`rt_id`),
  UNIQUE KEY `rt_id_UNIQUE` (`rt_id`),
  KEY `hs_id_roomtype_idx` (`hs_id`),
  CONSTRAINT `hs_id_roomtype` FOREIGN KEY (`hs_id`) REFERENCES `homestay` (`hs_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomtype`
--

LOCK TABLES `roomtype` WRITE;
/*!40000 ALTER TABLE `roomtype` DISABLE KEYS */;
/*!40000 ALTER TABLE `roomtype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-12 17:51:34
