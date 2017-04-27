CREATE DATABASE  IF NOT EXISTS `test_base` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `test_base`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: test_base
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `night` int(11) NOT NULL,
  `booking_date` date NOT NULL,
  `total` float NOT NULL,
  `username` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`booking_id`),
  UNIQUE KEY `booking_id_UNIQUE` (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1031 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1004,'2016-04-22','2016-04-24',2,'2017-04-19',1000,'fluke',6),(1005,'2017-04-28','2017-04-30',2,'2017-04-24',240,'jo',13),(1006,'2017-04-28','2017-04-30',2,'2017-04-24',240,'jo',13),(1007,'2017-05-02','2017-05-06',4,'2017-04-24',600,'jo',10),(1008,'2017-05-02','2017-05-06',4,'2017-04-24',600,'jo',10),(1009,'2017-05-25','2017-05-28',3,'2017-04-24',450,'god',7),(1010,'2017-05-25','2017-05-28',3,'2017-04-24',450,'god',7),(1011,'2017-04-29','2017-05-04',5,'2017-04-24',4500,'god',4),(1012,'2017-04-29','2017-05-02',3,'2017-04-24',450,'xxxx',3),(1013,'2017-04-27','2017-04-30',3,'2017-04-24',450,'xxxx',2),(1018,'2017-04-27','2017-04-30',3,'2017-04-24',450,'xxxx',2),(1019,'2017-05-06','2017-05-09',3,'2017-04-24',360,'ja',13),(1020,'2017-05-06','2017-05-09',3,'2017-04-24',360,'xxxx',13),(1021,'2017-04-27','2017-04-29',2,'2017-04-24',240,'ja',13),(1022,'2017-04-27','2017-04-29',2,'2017-04-24',240,'ja',13),(1023,'2017-04-26','2017-04-29',3,'2017-04-26',750,'xxxx',1),(1024,'2017-04-26','2017-04-29',3,'2017-04-26',750,'ja',1),(1025,'2017-04-26','2017-04-28',2,'2017-04-26',500,'xxxx',1),(1026,'2017-04-26','2017-04-29',3,'2017-04-26',750,'xxxx',1),(1027,'2017-04-26','2017-04-29',3,'2017-04-26',450,'xxxx',7),(1028,'2017-04-26','2017-04-29',3,'2017-04-26',450,'xxxx',7),(1029,'2017-04-26','2017-04-29',3,'2017-04-26',2700,'ja',4),(1030,'2017-04-26','2017-04-29',3,'2017-04-26',1650,'fahjub',5);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `username` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `f_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `l_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `birthdate` date NOT NULL,
  `phone` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(5) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('admin','1234','admin','admin','admin@gmail.com','1997-01-01','0123456789','ADMIN'),('bright','1234','นรภัทร','วิไลพันธุ์','brighteiei@gmail.com','1997-12-01','0805863459','GUEST'),('fahjub','1234','Nateecha','Klinhuan','fahbah@gmail.com','2017-04-14','1234','GUEST'),('fluke','1234','ธีรวุธ','กิจบรรเจิดจรัส','teerawut@gmail.com','1996-11-08','0805863453','GUEST'),('god','1234','อิทธิพัทธ์','ฐานิตย์','xxgod@gmail.com','1995-02-14','0805863462','HOST'),('great','1234','สพล','อัศวมั่นคง','sapol@gmail.com','1994-02-14','0805863452','GUEST'),('in','1234','สาริน','รณเกียรติ','inpitar@gmail.com','1994-02-14','0805863460','GUEST'),('ja','1234','ปาริมา','ไพรินทร์','japp@gmail.com','1996-10-17','0805863455','HOST'),('japp','1710','่สารีนิ','ศรีสมร','ja@hotmail.com','2007-06-12','0985633236','HOST'),('jo','1234','กวินพัฒน์','ธนาหิรัญศิลป์','kvp_jo@gmail.com','1994-02-14','0805863461','HOST'),('muse','1234','ณัฐวิทย์','ผิวงาม','muse_np@gmail.com','1997-05-01','0805863456','GUEST'),('nacha','1234','นัชชา','ดาบุดดี','nacha_nd@gmail.com','1997-05-25','0805863457','GUEST'),('ped','1234','ภัทรวดี','สิงหกุล','fahpat@gmail.com','1995-10-24','0805863458','HOST'),('porch','1234','ศิฑา','กาญจนอลงกรณ์','pporschep@gmail.com','1995-11-30','0805863451','GUEST'),('yong','1234','นทีชา','กลิ่นหวล','fahnatee@gmail.com','1996-07-18','0805863454','GUEST');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facilities`
--

DROP TABLE IF EXISTS `facilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facilities` (
  `fac_id` int(11) NOT NULL AUTO_INCREMENT,
  `fac_name` varchar(50) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`fac_id`),
  UNIQUE KEY `fac_id_UNIQUE` (`fac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facilities`
--

LOCK TABLES `facilities` WRITE;
/*!40000 ALTER TABLE `facilities` DISABLE KEYS */;
INSERT INTO `facilities` VALUES (1,'โทรทัศน์'),(2,'ตู้เย็น'),(3,'ชั้นวางของ'),(4,'ปลั๊กไฟ'),(5,'โต๊ะคอมพิวเตอร์'),(6,'ตู้เสื้อผ้า'),(7,'ไม้แขวนเสื้อ'),(8,'โคมไฟ'),(9,'พัดลมตั้งโต๊ะ'),(10,'พัดลมเพดาน'),(11,'เครื่องปรับอากาศ'),(12,'เก้าอี้'),(13,'กาต้มน้ำร้อน'),(14,'ไดร์เป่าผม'),(15,'สายอินเทอร์เน็ต'),(16,'คอมพิวเตอร์'),(17,'Wi-Fi'),(18,'เครื่องทำน้ำอุ่น'),(19,'ฝักบัว'),(20,'เตารีด'),(21,'ที่จอดรถ'),(22,'เตาอบไมโครเวฟ'),(23,'โทรศัพท์บ้าน'),(24,'จักรยาน'),(25,'ครัว'),(26,'โซฟา'),(27,'โต๊ะเครื่องแป้ง'),(28,'เตียงเดี่ยว'),(29,'เตียงคู่'),(30,'เตียง 2 ชั้น'),(31,'ฟูกนอน'),(32,'เต็นท์');
/*!40000 ALTER TABLE `facilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `homestay`
--

DROP TABLE IF EXISTS `homestay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `homestay` (
  `homestay_id` int(11) NOT NULL AUTO_INCREMENT,
  `homestay_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `homestay_desc` varchar(5000) CHARACTER SET utf8 DEFAULT NULL,
  `homestay_address` varchar(500) CHARACTER SET utf8 NOT NULL,
  `homestay_province` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `homestay_district` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `homestay_region` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `homestay_agree` varchar(3) CHARACTER SET utf8 NOT NULL DEFAULT 'NO',
  `homestay_license` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `homestay_picture` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`homestay_id`),
  UNIQUE KEY `homestay_id_UNIQUE` (`homestay_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `homestay`
--

LOCK TABLES `homestay` WRITE;
/*!40000 ALTER TABLE `homestay` DISABLE KEYS */;
INSERT INTO `homestay` VALUES (1,'กลุ่มโฮมสเตย์บ้านเกาะกลาง','ทดสอบ 2','456','กระบี่','เมือง','S','YES','12345','1.jpg','ja'),(2,'โฮมสเตย์บ้านนาตีน','หมู่บ้านนาตีนเป็นชุมชนชาวมุสลิมที่มีชีวิตเรีบบง่าย ประกอบอาชีพการทำประมงชายฝั่ง ทำสวนยาง สวนมะพร้าวและสวนผลไม้ ซึ่งตั้งอยู่บริเวณแหล่งท่องเที่ยวที่สำคัญคือ อ่าวพระนาง และหาดนพรัตน์ธารา ในแต่ละปีมีนักท่องเที่ยวเข้ามาเป็นจำนวนมาก แต่วิถีชีวิตของชาวบ้านนาตีนก็ยังคงมิได้เปลี่ยนแปลงไปตามกระแสนักท่องเที่ยวชุมชนนาตีน ให้ความสำคัญกับการส่งเสริมภูมิปัญญาท้องถิ่นด้วยการจัดฝึกอบรมให้กับสมาชิกผลิตของที่ระลึกเพื่อจำหน่ายให้นักท่องเที่ยว และได้เริ่มจัดตั้งโฮมสเตย์เมื่อเดือนกรกฎาคม พ.ศ. 2544 กิจกรรม ศึกษาธรรมชาติทางทะเล เล่นน้ำ ดำน้ำดูปะการังที่เกาะไก่ ทะเลแหวก นำเที่ยวในชุมชนและการศึกษาการทำประมงพื้นบ้าน การลอบปลาหมึกแบบดั้งเดิม การทำขนมพื้นบ้านร่วมกับชาวบ้าน การนำชมการประกอบอาชีพหลักของชาวใต้สวนยางพารา นำชมกิจกรรมกลุ่มหัตถกรรม เช่น การทำผ้าบาติก การทำผลิตภัณฑ์กะลามะพร้าว การทำกระดาษใยสับปะรด การทำเรือหัวโทงและการทำข้าวซ้อมมือ   ','4/2 ม.4 หมู่บ้านนาตีน ตำบลอ่าวนาง อำเภอเมือง จังหวัดกระบี่ 81000 ตำบลอ่าวนาง อำเภอเมืองกระบี่ จังหวัดกระบี่','กระบี่','เมืองกระบี่','S','YES','license2.jpg','2.jpg','ja'),(3,'ปากคลองโฮมสเตย์','จากความอุดมสมบูรณ์ทางทรัพยากรธรรมชาติทำให้กลุ่มโฮมสเตย์บ้านปากคลองรวมตัวกันโดยอาศัยแนวคิดการให้ความสำคัญของการนำทรัพยากรธรรมชาติมาใช้อย่างยั่งยืน กิจกรรม เดินป่าสำรวจเกาะเอียง นั่งเรือชมฝูงนกนางนวลและดำน้ำ นั่งเรือชมป่าชายเลน พายเรือดูหิ่งห้อย เที่ยวชมกระชังเลี้ยงปลาของชาวบ้าน นั่งเรือประมงจับปลาหมึก เที่ยวชมเกาะสัมปทานนกนางแอ่น   ','บ้านทุ่งมหา หมู่1 บ้านบนไร่ หมู่6 ตำบลปากคลอง อำเภอปะทิว จังหวัดชุมพร','ชุมพร','ปะทิว','S','YES','license3.jpg','3.jpg','god'),(4,'โฮมสเตย์ท้องตมใหญ่','หมู่บ้านท้องตมใหญ่ อำเภอสวี จังหวัดชุมพรเป็นหมู่บ้านชาวประมงที่มีประวัติยาวนานกว่า 400 ปี มีราษฎรอาศัยอยู่ประมาณ 170 หลังคาเรือน มีประชากรในหมู่บ้านประมาณ 652 คน เป็นหมู่บ้านชายฝั่งทะเลด้านอ่าวไทย ชาวบ้านส่วนใหญ่ปลูกบ้านยื่นลงไปในทะเลตามเชิงเขา ส่วนใหญ่มีที่ดินและกรรมสิทธิ์ในที่อยู่อาศัย ลักษณะทะเลของหมู่บ้าน เป็นอ่าวโค้งรูปเกือกม้า กว้างประมาณ 2 กิโลเมตร ด้านในเป็นป่าชายเลนที่คงความอุดมสมบูรณ์ มีระบบนิเวศป่าชายเลนที่น่าศึกษา มีหาดทรายระยะ 2-3 กิโลเมตร ประมาณ 4-5 หาด ซึ่งล้วนแต่เป็นหาดที่สวยงามสงบ ผู้คนไม่พลุกพล่าน ชุมชนเริ่มมีนักท่องเที่ยวเข้ามาพักอาศัยกับเจ้าบ้าน ตั้งแต่ปี พ.ศ. 2532 เริ่มต้นจากการเป็นสถานที่พักของญาติและเพื่อน ๆ ระยะต่อมาจึงมีนักท่องเที่ยวเข้ามาขอพักอาศัยด้วย เนื่องจากประทับใจในความเงียบสงบ ความมีอัธยาศัยไมตรี ความเป็นมิตร และความร่มรื่นของหมู่บ้าน จนเป็นที่รู้จักและแนะนำต่อๆ กัน กิจกรรม ตกหมึก ตกปลา ลากปลา ดำน้ำดูปะการัง ปลูกป่าชายเลนเป็นหมู่คณะ นั่งเรือชมระบบนิเวศป่าชายเลน เล่นน้ำหาดสวยเป็นส่วนตัว ดูม้าน้ำในทะเล นวดผ่อนคลายด้วยไอน้ำ เรียนรู้วิถีชุมชนชายฝั่งทะเล การประกอบอาชีพประมงชายฝั่ง การออกเรือทดลองเป็นชาวประมง พายเรือคายัคเลียบหาดทราย ผาหิน ป่าชายเลน นั่งเรือชมความงามของอ่าวท้องตมและเกาะต่างๆ สังสรรค์อาหารทะเลริมทะเล เที่ยวชมบ่อน้ำจืดโบราณ บ่อใต้หิน ห้องน้ำ ธรรมชาติโบราณ(สำหรับสุภาพบุรุษเท่านั้น)  ทำบุญ ปล่อยปลา กุ้ง หอย เก็บหอยขาวบริเวณหาดลกกำ เก็บหอยแครงบริเวณอ่าวท้องตม ไหว้พระวัดท้องตมใหญ่ ถวายสังฆทาน รับพรจากพระ เที่ยวชมสถานที่ท่องเที่ยวใกล้เคียง    ','31/2 หมู่ 1 หมู่บ้านตมใหญ่ ตำบลด่านสวี อำเภอสวี จังหวัดชุมพร ตำบลด่านสวี อำเภอสวี จังหวัดชุมพร','ชุมพร','สวี','S','YES','license4.jpg','4.jpg','god'),(5,'โฮมสเตย์บ้านเกาะพิทักษ์','สมัยก่อนมีเรื่องเล่าขานกันว่า ชาวประมงที่วิ่งเรือรอบเกาะพิทักษ์จะได้ยินเสียงคนเรียกให้เข้าไปเที่ยวบนเกาะ แต่พอขึ้นไปบนเกาะกลับไม่พบใครอยุ่เลย ชาวประมงจึงเรียกเกาะแห่งนี้ว่า \"เกาะผีทัก\" ต่อมาในปี พ.ศ.2464 ได้ประกาศเป็นหมู่บ้านและเปลี่ยนชื่อเป็น \"เกาะพิทักษ์\" มาจนทุกวันนี้ คนในชุมชนส่วนใหญ่ประกอบอาชีพด้านการประมงเป็นหลัก กิจกรรม ชมธรรมชาติรอบเกาะ ดูวิถีชีวิตชาวประมง จับปลาหมึก วิ่งแหวกทะเล ปลูกป่า ฐานการเรียนรู้ด้านเศรษฐกิจพอเพียง  ฐานการเรียนรู้ด้านระบบนิเวศ พร้อมการทำจุลินทรีย์ ดำน้ำดูปะการัง ','32 ม.14 บ้านเกาะพิทักษ์ ตำบลบางน้ำจืด อำเภอหลังสวน จังหวัดชุมพร','ชุมพร','หลังสวน','S','NO','license5.jpg','5.jpg','jo'),(6,'กลุ่มโฮมสเตย์บ้านสลวย','กลุ่มโฮมสเตย์บ้านเกาะกลาง เกิดจากชาวบ้านเห็นผู้ประกอบอาชีพเรือรับจ้างท่องเที่ยวพานักท่องเที่ยวโดยเฉพาะชาวต่างชาติมาท่องเที่ยวชมนิเวศวิทยาป่าชายเลน ชมพิพิธภัณฑ์พื้นบ้าน ชมการปลูกข้าว เลี้ยงควาย และยังพบภาพดังกล่าวไปปรากฏตามนิตยสารต่างประเทศ ทำให้คิดกันว่าทำไมชุมชนเราไม่ทำกันเอง ในการรองรีบการท่องเที่ยวในรูปแบบโฮมสเตย์ซึ่งเน้นการท่องเที่ยวเชิงนิเวศ โดยหาแนวทางในการป้องกันการรุกล้ำของวัฒนธรรมการท่องเที่ยวตะวันตก และเป็นอีกทางหนึ่งในการช่วยชาวบ้านมีอาชีพเสริม ที่ยังคงเอกลักษณ์ และวิถีชีวิตชุมชน กิจกรรม ล่องเรือชมทะเล หมู่บ้านเกาะ ชมสระมรกต ศึกษาธรรมชาติป่าชายเลน ชมวิถีชีวิตการทำประมงชายฝั่ง กิจกรรมการเกี่ยวข้าวบนเกาะ  สาธิตการทำผ้าปาเต๊ะ   ','192 ม.1 หมู่บ้านเกาะกลาง ตำบลคลองประสงค์ อำเภอเมือง จังหวัดกระบี่ 81000 ตำบลคลองประสงค์ อำเภอเมืองกระบี่ จังหวัดกระบี่','กระบี่','เมืองกระบี่','S','YES','license6.jpg','6.jpg','jo'),(7,'โฮมสเตย์บ้านนพรัตน์','หมู่บ้านนาตีนเป็นชุมชนชาวมุสลิมที่มีชีวิตเรีบบง่าย ประกอบอาชีพการทำประมงชายฝั่ง ทำสวนยาง สวนมะพร้าวและสวนผลไม้ ซึ่งตั้งอยู่บริเวณแหล่งท่องเที่ยวที่สำคัญคือ อ่าวพระนาง และหาดนพรัตน์ธารา ในแต่ละปีมีนักท่องเที่ยวเข้ามาเป็นจำนวนมาก แต่วิถีชีวิตของชาวบ้านนาตีนก็ยังคงมิได้เปลี่ยนแปลงไปตามกระแสนักท่องเที่ยวชุมชนนาตีน ให้ความสำคัญกับการส่งเสริมภูมิปัญญาท้องถิ่นด้วยการจัดฝึกอบรมให้กับสมาชิกผลิตของที่ระลึกเพื่อจำหน่ายให้นักท่องเที่ยว และได้เริ่มจัดตั้งโฮมสเตย์เมื่อเดือนกรกฎาคม พ.ศ. 2544 กิจกรรม ศึกษาธรรมชาติทางทะเล เล่นน้ำ ดำน้ำดูปะการังที่เกาะไก่ ทะเลแหวก นำเที่ยวในชุมชนและการศึกษาการทำประมงพื้นบ้าน การลอบปลาหมึกแบบดั้งเดิม การทำขนมพื้นบ้านร่วมกับชาวบ้าน การนำชมการประกอบอาชีพหลักของชาวใต้สวนยางพารา นำชมกิจกรรมกลุ่มหัตถกรรม เช่น การทำผ้าบาติก การทำผลิตภัณฑ์กะลามะพร้าว การทำกระดาษใยสับปะรด การทำเรือหัวโทงและการทำข้าวซ้อมมือ   ','4/2 ม.4 หมู่บ้านนาตีน ตำบลอ่าวนาง อำเภอเมือง จังหวัดกระบี่ 81000 ตำบลอ่าวนาง อำเภอเมืองกระบี่ จังหวัดกระบี่','กระบี่','เมืองกระบี่','S','YES','license7.jpg','7.jpg','ped'),(8,'ศรีสมร','จากความอุดมสมบูรณ์ทางทรัพยากรธรรมชาติทำให้กลุ่มโฮมสเตย์บ้านปากคลองรวมตัวกันโดยอาศัยแนวคิดการให้ความสำคัญของการนำทรัพยากรธรรมชาติมาใช้อย่างยั่งยืน กิจกรรม เดินป่าสำรวจเกาะเอียง นั่งเรือชมฝูงนกนางนวลและดำน้ำ นั่งเรือชมป่าชายเลน พายเรือดูหิ่งห้อย เที่ยวชมกระชังเลี้ยงปลาของชาวบ้าน นั่งเรือประมงจับปลาหมึก เที่ยวชมเกาะสัมปทานนกนางแอ่น   ','บ้านทุ่งมหา หมู่1 บ้านบนไร่ หมู่6 ตำบลปากคลอง อำเภอปะทิว จังหวัดชุมพร','ชุมพร','ปะทิว','S','YES','license8.jpg','8.jpg','ped'),(13,'บ้านอุ่นไอดิน','ติดภูเขา ติดธารน้ำ','153/109 ถราชวิถี แขวงวชิร เขตดุสิต','กรุงเทพ','วชิรพยาบาล','C','YES','1123456','9.jpg','ja'),(14,'Test','Test','12545','สมุทรปราการ','เมือง','C','YES','123456','699656054.jpg','ja'),(15,'หาดสีขาว','สวยมาก','125','สมุทรปราการ','เมือง','C','YES','123456789','-1727138115.jpg','ped');
/*!40000 ALTER TABLE `homestay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `near_homestay`
--

DROP TABLE IF EXISTS `near_homestay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `near_homestay` (
  `room_id` int(11) NOT NULL,
  `place_id` int(11) NOT NULL,
  PRIMARY KEY (`room_id`,`place_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `near_homestay`
--

LOCK TABLES `near_homestay` WRITE;
/*!40000 ALTER TABLE `near_homestay` DISABLE KEYS */;
INSERT INTO `near_homestay` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(2,2),(2,3),(2,4),(2,6),(2,7),(2,8),(2,9),(4,10),(4,11),(4,12),(4,13),(4,14),(4,15),(4,16),(6,1),(6,2),(6,3),(6,4),(6,5),(7,2),(7,3),(7,4),(7,6),(7,7),(7,8),(7,9);
/*!40000 ALTER TABLE `near_homestay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `near_place`
--

DROP TABLE IF EXISTS `near_place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `near_place` (
  `place_id` int(11) NOT NULL,
  `place_name` varchar(200) CHARACTER SET utf8 NOT NULL,
  `place_desc` varchar(5000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `place_picture` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`place_id`),
  UNIQUE KEY `place_id_UNIQUE` (`place_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `near_place`
--

LOCK TABLES `near_place` WRITE;
/*!40000 ALTER TABLE `near_place` DISABLE KEYS */;
INSERT INTO `near_place` VALUES (1,'ป่าชายเลน','',NULL),(2,'น้ำตกร้อน',NULL,NULL),(3,'สระมรกต',NULL,NULL),(4,'วัดถ้ำเสือ',NULL,NULL),(5,'เมืองกระบี่',NULL,NULL),(6,'ทะเลแหวก',NULL,NULL),(7,'หาดนพรัตน์ธารา',NULL,NULL),(8,'น้ำตกธารโบกขรณี',NULL,NULL),(9,'อ่าวพระนาง',NULL,NULL),(10,'พระธาตุสวีเก่าแก่กว่า 700 ปี',NULL,NULL),(11,'พระธาตุถ้ำขวัญเมือง (พระบรมสารีริกธาตุ)',NULL,NULL),(12,'เสด็จเตี่ย กรมหลวงชุมพรเขตอุดมศักดิ์',NULL,NULL),(13,'ปากน้ำตะโก',NULL,NULL),(14,'เส้นทางศึกษาธรรมชาติป่าชายเลน สถานีพัฒนาป่าชายเลนที่ 12 อุทยานแห่งชาติหมู่เกาะชุมพร',NULL,NULL);
/*!40000 ALTER TABLE `near_place` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review` (
  `review_date` date NOT NULL,
  `comment` varchar(5000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `username` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `homestay_id` int(11) DEFAULT NULL,
  `review_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`review_id`),
  UNIQUE KEY `review_id_UNIQUE` (`review_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES ('2017-04-24','ไม่โอเคเท่าไหร่ครับ',2,'jo',6,1),('2017-04-24','อากาศดีมากครับ',2,'ja',10,2),('2017-04-24','อากาศร่มรื่นมากมากครับ',4,'god',4,3),('2017-04-24','ชอบที่นี่มากครับ อยากไปอีกมากๆ',3,'jo',7,4),('2017-04-24','ชอบที่นี่มากครับ อยากไปอีกมากๆ',3,'jo',7,5),('2017-04-24','อยากไปอีกมากมากครับ',3,'่jo',5,6),('2017-04-24','ดีมากครับ',5,'ja',14,7),('2017-04-24','อยากไปอีกทีเลยครับ',5,'ja',14,8),('2017-04-26','โอเคมากครับ',4,'fluke',1,9),('2017-04-26','อิอิ',5,'fluke',1,11),('2017-04-26','สุดยอดมากค่า!',5,'fahjub',7,12);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_limit` int(11) NOT NULL,
  `room_price` float NOT NULL,
  `room_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `homestay_id` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `room_picture` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`room_id`),
  UNIQUE KEY `room_id_UNIQUE` (`room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,5,250,'ชบายมาก','1',NULL),(2,2,150,'เคียงเดือน','2',NULL),(3,25,150,'เคียงดาว','3',NULL),(4,2,900,'ริมเท','4',NULL),(5,2,550,'ริมหาด','7',NULL),(6,2,500,'ชมพู่','5',NULL),(7,2,150,'รื่นเริง','4',NULL),(8,25,250,'ร่มรื่น','2',NULL),(9,5,150,'บ้านดิน','3',NULL),(10,3,150,'บ้านไอดิน','5',NULL),(12,5,180,'ฉลาม','8',NULL),(13,5,120,'ลำดวน','6',NULL),(14,8,150,'นารา','6',NULL),(20,5,239,'ชบวย','13','pic.jpg'),(21,1,100,'ชบา','1','pic.jpg'),(27,4,550,'ภัทรา','3','pic.jpg'),(28,5,200,'ชบาแก้ว','1','pic.jpg'),(29,5,200,'ชบาแก้ว','1','pic.jpg'),(30,2,500,'ทดอสบ','1','pic.jpg');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_fac`
--

DROP TABLE IF EXISTS `room_fac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_fac` (
  `room_id` int(11) NOT NULL,
  `fac_id` int(11) NOT NULL,
  `unit` int(11) NOT NULL,
  PRIMARY KEY (`room_id`,`fac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_fac`
--

LOCK TABLES `room_fac` WRITE;
/*!40000 ALTER TABLE `room_fac` DISABLE KEYS */;
INSERT INTO `room_fac` VALUES (1,1,1),(1,2,1),(1,3,1),(1,7,2),(1,9,2),(2,2,1),(2,4,2),(2,11,1),(2,19,1),(2,21,2),(2,24,1),(3,8,2),(3,9,2),(3,12,2),(4,1,1),(4,2,1),(4,4,2),(4,9,1),(4,11,1),(4,19,1),(5,3,1),(5,4,2),(5,9,1),(5,12,2),(5,25,1),(6,1,1),(6,2,1),(6,3,2),(6,4,2),(6,6,1),(6,7,5),(6,8,2),(6,11,1),(7,2,1),(7,4,2),(7,9,2),(7,10,1),(7,17,1),(8,8,1),(8,9,1),(8,12,2),(12,2,0),(12,21,0),(12,24,0),(12,25,0),(13,8,0),(13,15,0),(13,16,0),(13,24,0),(14,9,0),(14,10,0),(14,11,0),(14,13,0),(14,14,0),(16,1,0),(16,6,0),(16,23,0),(16,26,0),(16,27,0),(20,1,0),(20,6,0),(20,23,0),(20,26,0),(20,27,0),(21,1,0),(21,10,0),(21,13,0),(21,14,0),(21,15,0),(21,16,0),(21,19,0),(21,23,0),(25,1,0),(25,2,0),(25,6,0),(25,13,0),(25,14,0),(25,15,0),(25,16,0),(25,18,0),(25,22,0),(25,23,0),(25,26,0),(25,27,0),(27,1,0),(27,2,0),(27,6,0),(27,13,0),(27,14,0),(27,15,0),(27,16,0),(27,18,0),(27,22,0),(27,23,0),(27,26,0),(27,27,0),(28,1,0),(28,6,0),(28,8,0),(28,23,0),(28,26,0),(28,29,0),(30,9,0),(30,10,0),(30,11,0),(30,30,0);
/*!40000 ALTER TABLE `room_fac` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-26 21:55:25
