CREATE DATABASE  IF NOT EXISTS `test_base` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `test_base`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: test_base
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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `role` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `check_in` date DEFAULT NULL,
  `check_out` date DEFAULT NULL,
  `total` float DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `hs_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`booking_id`),
  UNIQUE KEY `booking_id_UNIQUE` (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (2,'2017-04-17','2017-04-20',NULL,NULL,8),(3,'2017-04-17','2017-04-20',NULL,NULL,8),(4,'2017-04-17','2017-04-20',NULL,NULL,8),(5,'2017-04-17','2017-04-20',NULL,NULL,8),(6,'2017-04-17','2017-04-20',NULL,NULL,8),(7,'2017-04-17','2017-04-20',NULL,NULL,8),(8,'2017-04-17','2017-04-29',NULL,NULL,8),(9,'2017-04-17','2017-04-29',NULL,NULL,8),(10,'2017-04-17','2017-04-21',NULL,NULL,8),(11,'2017-04-17','2017-04-21',NULL,NULL,8);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `f_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `l_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `birth_date` date NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(10) CHARACTER SET utf8 NOT NULL,
  `customer_type` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_id_UNIQUE` (`customer_id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (6,'iamteerawut','1234','Teerawut','Kitbunjerdjarud','1996-11-08','t.kitbunjerdjarud@gmail.com','0945464678','Host'),(7,'parima','1234','Parima','Pirin','1996-07-18','parima2009@gmail.com','0869014240','Guest'),(8,'admin','admin','Admin','Admin','1996-11-08','admin@gmail.com','0945464678','Admin');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `homestay`
--

DROP TABLE IF EXISTS `homestay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `homestay` (
  `hs_id` int(10) NOT NULL AUTO_INCREMENT,
  `hs_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `hs_desc` varchar(1000) CHARACTER SET utf8 NOT NULL,
  `hs_price` float NOT NULL,
  `hs_guest` int(10) NOT NULL,
  `hs_address` varchar(1000) CHARACTER SET utf8 NOT NULL,
  `hs_province` varchar(45) CHARACTER SET utf8 NOT NULL,
  `hs_lat` varchar(45) CHARACTER SET utf8 NOT NULL DEFAULT '0',
  `hs_long` varchar(45) CHARACTER SET utf8 NOT NULL DEFAULT '0',
  `hs_host` int(11) DEFAULT NULL,
  PRIMARY KEY (`hs_id`),
  UNIQUE KEY `hs_id_UNIQUE` (`hs_id`),
  UNIQUE KEY `hs_address_UNIQUE` (`hs_address`),
  UNIQUE KEY `hs_name_UNIQUE` (`hs_name`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `homestay`
--

LOCK TABLES `homestay` WRITE;
/*!40000 ALTER TABLE `homestay` DISABLE KEYS */;
INSERT INTO `homestay` VALUES (8,'บ้านอาผ่าพัฒนา','ชุมชนผ้าไหมบ้านโนนแดงโฮมสเตย์หมู่บ้านเศรษฐกิจพอเพียงระดับมั่งมี ศรีสุข ระดับจังหวัด มีศูนย์เรียนรู้ชุมชนและศูนย์สาธิตการตลาด เรียนรู้การผลิตผ้าไหม การผลิตข้าวกล้อง(ข้าวซ้อมมือ) ชมวิถีชีวิตชนบท',150,5,'142 ม.11 บ้านอาผ่าพัฒนา ตำบลแม่ยาว อำเภอเมืองเชียงราย จังหวัดเชียงราย','เชียงราย','0','0',6),(9,'กลุ่มเครือข่ายการท่องเที่ยวโดยชุมชนเหล่อชอ','ศูนย์เรียนรู้เศรษฐกิจพอเพียงเฉลิมพระเกียรติ 84 พรรษา หมู่บ้านเศรษฐกิจพอเพียง เรียนรู้กับวิถีชีวิตที่พอเพียงการทำสมุนไพร(วิถีไทย) คัดพันธุ์ข้าวและการทำนาประณีต เตาถ่าน 200 ลิตร บัญชีครัวเรือน',100,3,'171 ม.2 ชุมชนเหล่อชอ ตำบลบ้านจันทร์ อำเภอกัลยานิวัฒนา จังหวัดเชียงใหม่','เชียงใหม่','0','0',6),(10,'แม่โจ้บ้านดินโฮมสเตย์','กลุ่มอนุรักษ์ต้นน้ำมูลโฮมสเตย์บ้านสุขสมบูรณ์ชุมชนต้นน้ำมูล แหล่งท่องเที่ยวเชิงนิเวศและเชิงเกษตร ชมสวนเบญจมาศ การเพาะเห็ดหลากหลายชนิดในฟาร์มเห็ด และแปลงผักปลอดสารพิษ เป็นการท่องเที่ยวเชิงนิเวศ เชิงเกษตรในชุมชน',400,6,'76 หมู่1 บ้านแม่โจ้ ตำบลบ้านเป้า อำเภอแม่แตง จังหวัดเชียงใหม่','เชียงใหม่','0','0',6),(11,'โฮมสเตย์บ้านโปง','มาบกราดโฮมสเตย์การท่องเที่ยวเชิงอนุรักษ์ธรรมชาติ ท่านสามารถนั่งเรือชมทิวทัศน์รอบเขื่อน เดินป่าเพื่อศึกษาสมุนไพร ปีนผาชมวิวของเขื่อนลำแชะ ล่องเรือตกปลา ล่องแพสำราญ ศึกษาธรรมชาติ ป่าดงดิบ อุทยานแห่งชาติทับลาน',500,2,'บ้านโปง หมู่ 6 ชมรมการท่องเที่ยวเชิงนิเวศบ้านโปง ตำบลป่าไผ่ อำเภอสันทราย จังหวัดเชียงใหม่','เชียงใหม่','0','0',NULL),(12,'กลุ่มโฮมสเตย์บ้านดอยยาว','โฮมสเตย์บ้านตาทิตย์ชุมชนมีวิถีชีวิตชนบท มีความผูกพันกับช้าง เปรียบเสมือนช้างเป็นสมาชิกในครอบครัว สามารถนั่งช้างชมวิถีชีวิตของคนกับช้างในชุมชน ชมวิวแม่น้ำมูล แม่น้ำชี พร้อมทั้งกับการอุ้มช้างอาบน้ำ และร่วมพิธีกรรมรำแกลมอและพิธีกรรมประเพณีของชาวส่วย',150,3,'41/1 ม.1 หมู่บ้านดอยยาว ตำบลแช่ช้าง อำเภอสันกำแพง จังหวัดเชียงใหม่ 50130 ตำบลแช่ช้าง อำเภอสันกำแพง จังหวัดเชียงใหม่','เชียงใหม่','0','0',NULL),(13,'โฮมสเตย์บ้านโพน','ซะซอมโฮมสเตย์(กลุ่มกินข้าวเซาเฮือน) หมู่บ้านท่องเที่ยวเชิงวัฒนธรรม เป็นหมู่บ้นรักษ์ป่า หมู่บ้านอนุรักษ์ดีเด่นระดับประเทศ มีการรวมกลุ่มทำกิจกรรมด้านอนุรักษ์ เส้นทางเดินป่า ศึกษาธรรมชาติและสถานปฏิบัติธรรม ท่านจะได้อิ่มเอมกับการเติมความสุขเติมพลังสมอง ณ จุดชมวิวภูปะโหล่ะ ดื่มดำกับบรรยากาศร่มรื่นที่แก่งมโนราห์ ',200,2,'95 ม.3 บ้านโพน ตำบลโพน อำเภอคำม่วง จังหวัดกาฬสินธุ์','กาฬสินธฺุ์','0','0',NULL);
/*!40000 ALTER TABLE `homestay` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-17 13:35:07
