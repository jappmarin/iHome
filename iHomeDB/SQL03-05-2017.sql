CREATE DATABASE  IF NOT EXISTS `test_base` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `test_base`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: test_base
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
  `room_id` int(11) DEFAULT NULL,
  `customer_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `customer_phone` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `customer_email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`booking_id`),
  UNIQUE KEY `booking_id_UNIQUE` (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1049 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1042,'2017-05-24','2017-05-29',5,'2017-04-28',600,3,'สารินี ศรีถาวร','0987687564','sari@gmail.com'),(1043,'2017-06-30','2017-07-04',4,'2017-04-23',400,4,'ปาริมา ไพรินทร์','0982707161','jaja@gmail.com'),(1044,'2017-08-01','2017-08-03',2,'2017-04-27',800,3,'ฐานัช ธีรพงศ์พัฒนา','0674561123','tanat@hotmail.com'),(1045,'2017-05-02','2017-05-05',3,'2017-05-02',6000,29,'khim khim','0945464678','khim@gmail.com'),(1046,'2017-05-24','2017-05-27',3,'2017-05-02',450,2,'hee hyorin','0658956741','hoo@hotmail.com'),(1047,'2017-05-23','2017-05-26',3,'2017-05-02',450,2,'สพล อัศวมั่นคง','0805863452','sapol@gmail.com'),(1048,'2017-05-29','2017-05-31',2,'2017-05-02',500,8,'สพล อัศวมั่นคง','0805863452','sapol@gmail.com');
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
INSERT INTO `customer` VALUES ('admin','1234','admin','admin','admin@gmail.com','1997-01-01','0123456789','ADMIN'),('bright','1234','นรภัทร','วิไลพันธุ์','brighteiei@gmail.com','1997-12-01','0805863459','GUEST'),('choimin','1234','minho','choi','choimin@hotmail.com','1991-12-08','0982707161','HOST'),('fluke','1234','ธีรวุธ','กิจบรรเจิดจรัส','teerawut@gmail.com','1996-11-08','0805863453','GUEST'),('god','1234','อิทธิพัทธ์','ฐานิตย์','xxgod@gmail.com','1995-02-14','0805863462','HOST'),('great','1234','สพล','อัศวมั่นคง','sapol@gmail.com','1994-02-14','0805863452','GUEST'),('in','1234','สาริน','รณเกียรติ','inpitar@gmail.com','1994-02-14','0805863460','GUEST'),('ja','1234','ปาริมา','ไพรินทร์','japp@gmail.com','1996-10-17','0982707161','HOST'),('jo','1234','กวินพัฒน์','ธนาหิรัญศิลป์','kvp_jo@gmail.com','1994-02-14','0805863461','HOST'),('khimkhim','12341234','khim','khim','khim@gmail.com','2017-05-02','0945464678','GUEST'),('leejong','1234','jonghyun','lee','leejong@hotmail.com','1990-04-08','0982707161','HOST'),('leetae','1234','taemin','lee','leetae@hotmail.com','1994-07-18','0982707161','HOST'),('muse','1234','ณัฐวิทย์','ผิวงาม','muse_np@gmail.com','1997-05-01','0805863456','GUEST'),('nacha','1234','นัชชา','ดาบุดดี','nacha_nd@gmail.com','1997-05-25','0805863457','GUEST'),('ped','1234','ภัทรวดี','สิงหกุล','fahpat@gmail.com','1995-10-24','0805863458','HOST'),('porch','1234','ศิฑา','กาญจนอลงกรณ์','pporschep@gmail.com','1995-11-30','0805863451','GUEST'),('yong','1234','นทีชา','กลิ่นหวล','fahnatee@gmail.com','1996-07-18','0805863454','HOST');
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
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `homestay`
--

LOCK TABLES `homestay` WRITE;
/*!40000 ALTER TABLE `homestay` DISABLE KEYS */;
INSERT INTO `homestay` VALUES (1,'กลุ่มโฮมสเตย์บ้านเกาะกลาง','กลุ่มโฮมสเตย์บ้านเกาะกลาง เกิดจากชาวบ้านเห็นผู้ประกอบอาชีพเรือรับจ้างท่องเที่ยวพานักท่องเที่ยวโดยเฉพาะชาวต่างชาติมาท่องเที่ยวชมนิเวศวิทยาป่าชายเลน ชมพิพิธภัณฑ์พื้นบ้าน ชมการปลูกข้าว เลี้ยงควาย และยังพบภาพดังกล่าวไปปรากฏตามนิตยสารต่างประเทศ ทำให้คิดกันว่าทำไมชุมชนเราไม่ทำกันเอง ในการรองรีบการท่องเที่ยวในรูปแบบโฮมสเตย์ซึ่งเน้นการท่องเที่ยวเชิงนิเวศ โดยหาแนวทางในการป้องกันการรุกล้ำของวัฒนธรรมการท่องเที่ยวตะวันตก และเป็นอีกทางหนึ่งในการช่วยชาวบ้านมีอาชีพเสริม ที่ยังคงเอกลักษณ์ และวิถีชีวิตชุมชน กิจกรรม ล่องเรือชมทะเล หมู่บ้านเกาะ ชมสระมรกต ศึกษาธรรมชาติป่าชายเลน ชมวิถีชีวิตการทำประมงชายฝั่ง กิจกรรมการเกี่ยวข้าวบนเกาะ  สาธิตการทำผ้าปาเต๊ะ   ','192 ม.1 หมู่บ้านเกาะกลาง ตำบลคลองประสงค์ อำเภอเมือง จังหวัดกระบี่ 81000 ตำบลคลองประสงค์ อำเภอเมืองกระบี่ จังหวัดกระบี่','กระบี่','เมืองกระบี่','S','YES','example','1.jpg','ja'),(2,'โฮมสเตย์บ้านนาตีน','หมู่บ้านนาตีนเป็นชุมชนชาวมุสลิมที่มีชีวิตเรีบบง่าย ประกอบอาชีพการทำประมงชายฝั่ง ทำสวนยาง สวนมะพร้าวและสวนผลไม้ ซึ่งตั้งอยู่บริเวณแหล่งท่องเที่ยวที่สำคัญคือ อ่าวพระนาง และหาดนพรัตน์ธารา ในแต่ละปีมีนักท่องเที่ยวเข้ามาเป็นจำนวนมาก แต่วิถีชีวิตของชาวบ้านนาตีนก็ยังคงมิได้เปลี่ยนแปลงไปตามกระแสนักท่องเที่ยวชุมชนนาตีน ให้ความสำคัญกับการส่งเสริมภูมิปัญญาท้องถิ่นด้วยการจัดฝึกอบรมให้กับสมาชิกผลิตของที่ระลึกเพื่อจำหน่ายให้นักท่องเที่ยว และได้เริ่มจัดตั้งโฮมสเตย์เมื่อเดือนกรกฎาคม พ.ศ. 2544 กิจกรรม ศึกษาธรรมชาติทางทะเล เล่นน้ำ ดำน้ำดูปะการังที่เกาะไก่ ทะเลแหวก นำเที่ยวในชุมชนและการศึกษาการทำประมงพื้นบ้าน การลอบปลาหมึกแบบดั้งเดิม การทำขนมพื้นบ้านร่วมกับชาวบ้าน การนำชมการประกอบอาชีพหลักของชาวใต้สวนยางพารา นำชมกิจกรรมกลุ่มหัตถกรรม เช่น การทำผ้าบาติก การทำผลิตภัณฑ์กะลามะพร้าว การทำกระดาษใยสับปะรด การทำเรือหัวโทงและการทำข้าวซ้อมมือ   ','4/2 ม.4 หมู่บ้านนาตีน ตำบลอ่าวนาง อำเภอเมือง จังหวัดกระบี่ 81000 ตำบลอ่าวนาง อำเภอเมืองกระบี่ จังหวัดกระบี่','กระบี่','เมืองกระบี่','S','YES','example','2.jpg','ja'),(3,'ปากคลองโฮมสเตย์','จากความอุดมสมบูรณ์ทางทรัพยากรธรรมชาติทำให้กลุ่มโฮมสเตย์บ้านปากคลองรวมตัวกันโดยอาศัยแนวคิดการให้ความสำคัญของการนำทรัพยากรธรรมชาติมาใช้อย่างยั่งยืน กิจกรรม เดินป่าสำรวจเกาะเอียง นั่งเรือชมฝูงนกนางนวลและดำน้ำ นั่งเรือชมป่าชายเลน พายเรือดูหิ่งห้อย เที่ยวชมกระชังเลี้ยงปลาของชาวบ้าน นั่งเรือประมงจับปลาหมึก เที่ยวชมเกาะสัมปทานนกนางแอ่น   ','บ้านทุ่งมหา หมู่1 บ้านบนไร่ หมู่6 ตำบลปากคลอง อำเภอปะทิว จังหวัดชุมพร','ชุมพร','ปะทิว','S','YES','example','3.jpg','god'),(4,'โฮมสเตย์ท้องตมใหญ่','หมู่บ้านท้องตมใหญ่ อำเภอสวี จังหวัดชุมพรเป็นหมู่บ้านชาวประมงที่มีประวัติยาวนานกว่า 400 ปี มีราษฎรอาศัยอยู่ประมาณ 170 หลังคาเรือน มีประชากรในหมู่บ้านประมาณ 652 คน เป็นหมู่บ้านชายฝั่งทะเลด้านอ่าวไทย ชาวบ้านส่วนใหญ่ปลูกบ้านยื่นลงไปในทะเลตามเชิงเขา ส่วนใหญ่มีที่ดินและกรรมสิทธิ์ในที่อยู่อาศัย ลักษณะทะเลของหมู่บ้าน เป็นอ่าวโค้งรูปเกือกม้า กว้างประมาณ 2 กิโลเมตร ด้านในเป็นป่าชายเลนที่คงความอุดมสมบูรณ์ มีระบบนิเวศป่าชายเลนที่น่าศึกษา มีหาดทรายระยะ 2-3 กิโลเมตร ประมาณ 4-5 หาด ซึ่งล้วนแต่เป็นหาดที่สวยงามสงบ ผู้คนไม่พลุกพล่าน ชุมชนเริ่มมีนักท่องเที่ยวเข้ามาพักอาศัยกับเจ้าบ้าน ตั้งแต่ปี พ.ศ. 2532 เริ่มต้นจากการเป็นสถานที่พักของญาติและเพื่อน ๆ ระยะต่อมาจึงมีนักท่องเที่ยวเข้ามาขอพักอาศัยด้วย เนื่องจากประทับใจในความเงียบสงบ ความมีอัธยาศัยไมตรี ความเป็นมิตร และความร่มรื่นของหมู่บ้าน จนเป็นที่รู้จักและแนะนำต่อๆ กัน กิจกรรม ตกหมึก ตกปลา ลากปลา ดำน้ำดูปะการัง ปลูกป่าชายเลนเป็นหมู่คณะ นั่งเรือชมระบบนิเวศป่าชายเลน เล่นน้ำหาดสวยเป็นส่วนตัว ดูม้าน้ำในทะเล นวดผ่อนคลายด้วยไอน้ำ เรียนรู้วิถีชุมชนชายฝั่งทะเล การประกอบอาชีพประมงชายฝั่ง การออกเรือทดลองเป็นชาวประมง พายเรือคายัคเลียบหาดทราย ผาหิน ป่าชายเลน นั่งเรือชมความงามของอ่าวท้องตมและเกาะต่างๆ สังสรรค์อาหารทะเลริมทะเล เที่ยวชมบ่อน้ำจืดโบราณ บ่อใต้หิน ห้องน้ำ ธรรมชาติโบราณ(สำหรับสุภาพบุรุษเท่านั้น)  ทำบุญ ปล่อยปลา กุ้ง หอย เก็บหอยขาวบริเวณหาดลกกำ เก็บหอยแครงบริเวณอ่าวท้องตม ไหว้พระวัดท้องตมใหญ่ ถวายสังฆทาน รับพรจากพระ เที่ยวชมสถานที่ท่องเที่ยวใกล้เคียง    ','31/2 หมู่ 1 หมู่บ้านตมใหญ่ ตำบลด่านสวี อำเภอสวี จังหวัดชุมพร ตำบลด่านสวี อำเภอสวี จังหวัดชุมพร','ชุมพร','สวี','S','YES','example','4.jpg','god'),(5,'โฮมสเตย์บ้านเกาะพิทักษ์','สมัยก่อนมีเรื่องเล่าขานกันว่า ชาวประมงที่วิ่งเรือรอบเกาะพิทักษ์จะได้ยินเสียงคนเรียกให้เข้าไปเที่ยวบนเกาะ แต่พอขึ้นไปบนเกาะกลับไม่พบใครอยุ่เลย ชาวประมงจึงเรียกเกาะแห่งนี้ว่า \"เกาะผีทัก\" ต่อมาในปี พ.ศ.2464 ได้ประกาศเป็นหมู่บ้านและเปลี่ยนชื่อเป็น \"เกาะพิทักษ์\" มาจนทุกวันนี้ คนในชุมชนส่วนใหญ่ประกอบอาชีพด้านการประมงเป็นหลัก กิจกรรม ชมธรรมชาติรอบเกาะ ดูวิถีชีวิตชาวประมง จับปลาหมึก วิ่งแหวกทะเล ปลูกป่า ฐานการเรียนรู้ด้านเศรษฐกิจพอเพียง  ฐานการเรียนรู้ด้านระบบนิเวศ พร้อมการทำจุลินทรีย์ ดำน้ำดูปะการัง ','32 ม.14 บ้านเกาะพิทักษ์ ตำบลบางน้ำจืด อำเภอหลังสวน จังหวัดชุมพร','ชุมพร','หลังสวน','S','YES','example','5.jpg','jo'),(6,'กลุ่มโฮมสเตย์บ้านสลวย','กลุ่มโฮมสเตย์บ้านเกาะกลาง เกิดจากชาวบ้านเห็นผู้ประกอบอาชีพเรือรับจ้างท่องเที่ยวพานักท่องเที่ยวโดยเฉพาะชาวต่างชาติมาท่องเที่ยวชมนิเวศวิทยาป่าชายเลน ชมพิพิธภัณฑ์พื้นบ้าน ชมการปลูกข้าว เลี้ยงควาย และยังพบภาพดังกล่าวไปปรากฏตามนิตยสารต่างประเทศ ทำให้คิดกันว่าทำไมชุมชนเราไม่ทำกันเอง ในการรองรีบการท่องเที่ยวในรูปแบบโฮมสเตย์ซึ่งเน้นการท่องเที่ยวเชิงนิเวศ โดยหาแนวทางในการป้องกันการรุกล้ำของวัฒนธรรมการท่องเที่ยวตะวันตก และเป็นอีกทางหนึ่งในการช่วยชาวบ้านมีอาชีพเสริม ที่ยังคงเอกลักษณ์ และวิถีชีวิตชุมชน กิจกรรม ล่องเรือชมทะเล หมู่บ้านเกาะ ชมสระมรกต ศึกษาธรรมชาติป่าชายเลน ชมวิถีชีวิตการทำประมงชายฝั่ง กิจกรรมการเกี่ยวข้าวบนเกาะ  สาธิตการทำผ้าปาเต๊ะ   ','192 ม.1 หมู่บ้านเกาะกลาง ตำบลคลองประสงค์ อำเภอเมือง จังหวัดกระบี่ 81000 ตำบลคลองประสงค์ อำเภอเมืองกระบี่ จังหวัดกระบี่','กระบี่','เมืองกระบี่','S','YES','example','6.jpg','jo'),(7,'โฮมสเตย์บ้านนพรัตน์','หมู่บ้านนาตีนเป็นชุมชนชาวมุสลิมที่มีชีวิตเรีบบง่าย ประกอบอาชีพการทำประมงชายฝั่ง ทำสวนยาง สวนมะพร้าวและสวนผลไม้ ซึ่งตั้งอยู่บริเวณแหล่งท่องเที่ยวที่สำคัญคือ อ่าวพระนาง และหาดนพรัตน์ธารา ในแต่ละปีมีนักท่องเที่ยวเข้ามาเป็นจำนวนมาก แต่วิถีชีวิตของชาวบ้านนาตีนก็ยังคงมิได้เปลี่ยนแปลงไปตามกระแสนักท่องเที่ยวชุมชนนาตีน ให้ความสำคัญกับการส่งเสริมภูมิปัญญาท้องถิ่นด้วยการจัดฝึกอบรมให้กับสมาชิกผลิตของที่ระลึกเพื่อจำหน่ายให้นักท่องเที่ยว และได้เริ่มจัดตั้งโฮมสเตย์เมื่อเดือนกรกฎาคม พ.ศ. 2544 กิจกรรม ศึกษาธรรมชาติทางทะเล เล่นน้ำ ดำน้ำดูปะการังที่เกาะไก่ ทะเลแหวก นำเที่ยวในชุมชนและการศึกษาการทำประมงพื้นบ้าน การลอบปลาหมึกแบบดั้งเดิม การทำขนมพื้นบ้านร่วมกับชาวบ้าน การนำชมการประกอบอาชีพหลักของชาวใต้สวนยางพารา นำชมกิจกรรมกลุ่มหัตถกรรม เช่น การทำผ้าบาติก การทำผลิตภัณฑ์กะลามะพร้าว การทำกระดาษใยสับปะรด การทำเรือหัวโทงและการทำข้าวซ้อมมือ   ','4/2 ม.4 หมู่บ้านนาตีน ตำบลอ่าวนาง อำเภอเมือง จังหวัดกระบี่ 81000 ตำบลอ่าวนาง อำเภอเมืองกระบี่ จังหวัดกระบี่','กระบี่','เมืองกระบี่','S','YES','example','7.jpg','ped'),(8,'ศรีสมร','จากความอุดมสมบูรณ์ทางทรัพยากรธรรมชาติทำให้กลุ่มโฮมสเตย์บ้านปากคลองรวมตัวกันโดยอาศัยแนวคิดการให้ความสำคัญของการนำทรัพยากรธรรมชาติมาใช้อย่างยั่งยืน กิจกรรม เดินป่าสำรวจเกาะเอียง นั่งเรือชมฝูงนกนางนวลและดำน้ำ นั่งเรือชมป่าชายเลน พายเรือดูหิ่งห้อย เที่ยวชมกระชังเลี้ยงปลาของชาวบ้าน นั่งเรือประมงจับปลาหมึก เที่ยวชมเกาะสัมปทานนกนางแอ่น   ','บ้านทุ่งมหา หมู่1 บ้านบนไร่ หมู่6 ตำบลปากคลอง อำเภอปะทิว จังหวัดชุมพร','ชุมพร','ปะทิว','S','YES','example','8.jpg','ped'),(13,'บ้านอุ่นไอดิน','ติดภูเขา ติดธารน้ำ','153/109 ถราชวิถี แขวงวชิร เขตดุสิต','กรุงเทพ','วชิรพยาบาล','C','YES','example','9.jpg','ja'),(25,'บ้านอรุณแสง','อบอุ่นสบาย','122/123','บางพลี','บางรัก','N','NO','example','371800068.jpg','ja'),(27,'บ้านกกกอด','สำหรับคนรักบรรยากาศธรรมชาติ ชอบความสงบ ไม่ติดความหรูหรา ถ้าคุณชอบอยู่กับสายลม แสงแดด  สายน้ำ ภูเขา พระจันทร์ แสงดาว มากกว่าแสงสีอันศิวิไลซ์','บ้านกกกอด ต.ช่องสะเดา อ.เมือง จ.กาญจนบุรี','กาญจนบุรี','เมือง','W','YES','example','10.jpg','yong'),(28,'บ้านริมแคว','บรรยากาศสบายๆ สไตล์แพริมน้ำ ตั้งอยู่ห่างจากใจกลางเมืองเพียง 60 กิโลเมตร ภายในห้องพักเน้นโทนสีขาว ประดับด้วยไฟสีเหลืองนวล อบอุ่นดูแล้วสบายตา ด้านนอกระเบียงยื่นออกมาตลอดริมแม่น้ำแคว มีเก้าอี้ไม้ไว้สำหรับพักผ่อนยามค่ำคืน ','55 หมู่5  อาคาร ตรงข้ามกับเรือนแพริเวอร์แควจังเกิลราฟท์   ตำบลวังกระแจะ อำเภอไทรโยค กาญจนบุรี','กาญจนบุรี','ไทรโยค','W','YES','example','11.jpg','yong'),(29,'หินตกริเวอร์แคมป์','ที่ถูกโอบล้อมด้วยขุนเขา ณ ริมสายน้ำแควน้อยที่อบอวลไปด้วยเรื่องราวทางประวัติศาสตร์หน้าหนึ่งของโลก ซึ่งเป็นที่ตั้งแคมป์ของกองทัพทหารญี่ปุ่นในสมัยสงครามโลกครั้งที่ 2','109 หมู่9  ตำบลท่าเสา อำเภอไทรโยค กาญจนบุรี','กาญจนบุรี','ไทรโยค','W','YES','example','12.jpg','choimin'),(30,'บ้านบึงฉวาก (บ้านต้นไม้)',' รื่นรมณ์กับบรรยากาศร่มรื่น สูดกลืนกลิ่นลมหายใจธรรมชาติ ชื่นชมความงามริมบึงน้ำกว้างใหญ่ ประทับใจกับการพักผ่อนอันแสนสุข เพลินทุกแหล่งท่องเที่ยวในบึงฉวาก ','บึงฉวากเฉลิมพระเกียรติ อ.เดิมบางนางบวช จ.สุพรรณบุรี','สุพรรณบุรี','เดิมบางนางบวช','C','YES','example','13.jpg','leetae'),(31,'ลุงนะโฮมสเตย์','\"หมอกสามฤดู กองมูเสียดฟ้า ป่าเขียวขจี  ผู้คนดี ประเพณีงาม ลือนามถิ่นบัวตอง\" โฮมสเตย์ไม้ไผ่หลังคาใบตองตึง จัดสวนไว้อย่างสวยงามร่มรื่น','หมอกจำแป่ อ.เมืองแม่ฮ่องสอน จ.แม่ฮ่องสอน','แม่ฮ่องสอน','ปางอุ๋ง','N','YES','example','14.jpg','leejong');
/*!40000 ALTER TABLE `homestay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `near_homestay`
--

DROP TABLE IF EXISTS `near_homestay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `near_homestay` (
  `homestay_id` int(11) NOT NULL,
  `place_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `near_homestay`
--

LOCK TABLES `near_homestay` WRITE;
/*!40000 ALTER TABLE `near_homestay` DISABLE KEYS */;
INSERT INTO `near_homestay` VALUES (1,2),(2,3),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(1,9),(2,10),(26,11),(4,12),(5,13),(13,14),(14,30),(15,34),(21,4),(25,38),(27,39),(28,40),(28,41),(29,42),(30,43),(31,44);
/*!40000 ALTER TABLE `near_homestay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `near_place`
--

DROP TABLE IF EXISTS `near_place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `near_place` (
  `place_id` int(11) NOT NULL AUTO_INCREMENT,
  `place_name` varchar(200) CHARACTER SET utf8 NOT NULL,
  `place_desc` varchar(5000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `place_picture` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`place_id`),
  UNIQUE KEY `place_id_UNIQUE` (`place_id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `near_place`
--

LOCK TABLES `near_place` WRITE;
/*!40000 ALTER TABLE `near_place` DISABLE KEYS */;
INSERT INTO `near_place` VALUES (1,'ป่าชายเลน','',NULL),(2,'น้ำตกร้อน',NULL,NULL),(3,'สระมรกต',NULL,NULL),(4,'วัดถ้ำเสือ',NULL,NULL),(5,'เมืองกระบี่',NULL,NULL),(6,'ทะเลแหวก',NULL,NULL),(7,'หาดนพรัตน์ธารา',NULL,NULL),(8,'น้ำตกธารโบกขรณี',NULL,NULL),(9,'อ่าวพระนาง',NULL,NULL),(10,'พระธาตุสวีเก่าแก่กว่า 700 ปี',NULL,NULL),(11,'พระธาตุถ้ำขวัญเมือง (พระบรมสารีริกธาตุ)',NULL,NULL),(12,'เสด็จเตี่ย กรมหลวงชุมพรเขตอุดมศักดิ์',NULL,NULL),(13,'ปากน้ำตะโก',NULL,NULL),(14,'เส้นทางศึกษาธรรมชาติป่าชายเลน สถานีพัฒนาป่าชายเลนที่ 12 อุทยานแห่งชาติหมู่เกาะชุมพร',NULL,NULL),(30,'น้ำตกอาเรวัน',NULL,NULL),(34,'น้ำตกวังตะไคร้',NULL,NULL),(36,'สนามกีฬา',NULL,NULL),(37,'สวนสนุก',NULL,NULL),(38,'สวนน้ำ',NULL,NULL),(39,'น้ำตกเอราวัณ',NULL,NULL),(40,'แม่น้ำแคว',NULL,NULL),(41,'รถไฟสายมรณะ',NULL,NULL),(42,'น้ำตกไทรโยค',NULL,NULL),(43,'บึงฉวาก',NULL,NULL),(44,'หมู่บ้านรวมไทย',NULL,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES ('2017-05-03','เจ้าของใจดีมากครับ',4,'jo',1,1),('2017-05-03','wifi ช้าไปหน่อยครับ แต่รวมๆแล้วทุกอย่างดีครับ',3,'jo',3,2),('2017-05-03','ชอบบรรยากาศมากครับ เจ้าของบ้านเป็นกันเองมากๆ ถ้ามีโอกาสจะไปอีกครับ',5,'jo',2,3),('2017-05-03','บ้านพักสะอาดมากเลยครับ บรรยากาศตอนกลางคืนดี แต่ถ้าไปช่วงเมษาร้อนมากครับ',4,'muse',28,4),('2017-05-03','บรรยากาศภายนอกดีมากครับ แต่เครื่องใช้ในบ้านดูเก่าไปหน่อย ',3,'muse',13,5),('2017-05-03','ชอบคุณเจ้าของเหมือนกันครับ เป็นกันเองมากๆเลย ดูแลตลอด',5,'muse',1,6);
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
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,5,250,'ชบายมาก','1',NULL),(2,2,150,'เคียงเดือน','2',NULL),(3,25,150,'เคียงดาว','3',NULL),(4,2,900,'ริมเท','4',NULL),(5,2,550,'ริมหาด','7',NULL),(6,2,500,'ชมพู่','5',NULL),(7,2,150,'รื่นเริง','4',NULL),(8,25,250,'ร่มรื่น','2',NULL),(9,5,150,'บ้านดิน','3',NULL),(10,3,150,'บ้านไอดิน','5',NULL),(12,5,180,'ฉลาม','8',NULL),(13,5,120,'ลำดวน','6',NULL),(14,8,150,'นารา','6',NULL),(20,5,239,'ชบวย','13','pic.jpg'),(21,1,100,'ชบา','1','pic.jpg'),(27,4,550,'ภัทรา','3','pic.jpg'),(28,5,120,'สวย','1','pic.jpg'),(29,4,2000,'สุขสบาย','1','pic.jpg'),(30,2,800,'กระโจมเต๊นท์','27','pic.jpg'),(31,4,950,'ห้องวิวเขื่อน','27','pic.jpg'),(32,2,1150,'ริมแคว1','28','pic.jpg'),(33,2,700,'ริมแคว2','28','pic.jpg'),(34,4,850,'แคมป์ใหญ่','29','pic.jpg'),(35,2,500,'แคมป์เล็กริมเขา','29','pic.jpg'),(36,2,500,'แคมป์เล็กริมน้ำ','29','pic.jpg'),(37,4,2600,'ต้นไม้','30','pic.jpg'),(38,2,400,'บ้านเล็ก','31','pic.jpg'),(39,8,1000,'ใหญ่','31','pic.jpg');
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
INSERT INTO `room_fac` VALUES (1,1,1),(1,2,1),(1,3,1),(1,7,2),(1,9,2),(2,2,1),(2,4,2),(2,11,1),(2,19,1),(2,21,2),(2,24,1),(3,8,2),(3,9,2),(3,12,2),(4,1,1),(4,2,1),(4,4,2),(4,9,1),(4,11,1),(4,19,1),(5,3,1),(5,4,2),(5,9,1),(5,12,2),(5,25,1),(6,1,1),(6,2,1),(6,3,2),(6,4,2),(6,6,1),(6,7,5),(6,8,2),(6,11,1),(7,2,1),(7,4,2),(7,9,2),(7,10,1),(7,17,1),(8,8,1),(8,9,1),(8,12,2),(12,2,0),(12,21,0),(12,24,0),(12,25,0),(13,8,0),(13,15,0),(13,16,0),(13,24,0),(14,9,0),(14,10,0),(14,11,0),(14,13,0),(14,14,0),(16,1,0),(16,6,0),(16,23,0),(16,26,0),(16,27,0),(20,1,0),(20,6,0),(20,23,0),(20,26,0),(20,27,0),(21,1,0),(21,10,0),(21,13,0),(21,14,0),(21,15,0),(21,16,0),(21,19,0),(21,23,0),(25,1,0),(25,2,0),(25,6,0),(25,13,0),(25,14,0),(25,15,0),(25,16,0),(25,18,0),(25,22,0),(25,23,0),(25,26,0),(25,27,0),(27,1,0),(27,2,0),(27,6,0),(27,13,0),(27,14,0),(27,15,0),(27,16,0),(27,18,0),(27,22,0),(27,23,0),(27,26,0),(27,27,0),(28,1,0),(28,6,0),(28,20,0),(28,23,0),(28,26,0),(28,27,0),(29,1,0),(29,2,0),(29,6,0),(29,13,0),(29,18,0),(29,20,0),(29,21,0),(29,22,0),(29,23,0),(29,26,0),(29,27,0),(29,29,0),(30,8,0),(30,9,0),(30,32,0),(31,1,0),(31,10,0),(31,27,0),(31,29,0),(32,1,0),(32,11,0),(32,14,0),(32,15,0),(32,18,0),(32,27,0),(32,29,0),(33,1,0),(33,10,0),(33,14,0),(33,15,0),(33,19,0),(33,29,0),(34,8,0),(34,11,0),(34,15,0),(34,21,0),(34,27,0),(34,32,0),(35,15,0),(35,21,0),(35,32,0),(36,9,0),(36,15,0),(36,21,0),(36,32,0),(37,1,0),(37,6,0),(37,11,0),(37,14,0),(37,15,0),(37,18,0),(37,21,0),(37,23,0),(37,27,0),(37,29,0),(38,11,0),(38,19,0),(38,21,0),(38,27,0),(38,31,0),(39,1,0),(39,11,0),(39,18,0),(39,27,0),(39,29,0);
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

-- Dump completed on 2017-05-03  7:22:54
