--
-- Table structure for table `fwk_code_group`
--
DROP TABLE IF EXISTS `fwk_code_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = euckr */;
CREATE TABLE `fwk_code_group` (
          `CODE_GROUP_ID` varchar(8) DEFAULT NULL,
          `CODE_GROUP_NAME` varchar(100) DEFAULT NULL,
          `CODE_GROUP_DESC` varchar(200) DEFAULT NULL,
          `LAST_UPDATE_DTIME` varchar(40) DEFAULT NULL,
          `LAST_UPDATE_USER_ID` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=euckr;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fwk_code`
--
DROP TABLE IF EXISTS `fwk_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = euckr */;
CREATE TABLE `fwk_code` (
        `CODE_GROUP_ID` varchar(8) DEFAULT NULL,
        `CODE` varchar(50) DEFAULT NULL,
        `CODE_NAME` varchar(100) DEFAULT NULL,
        `CODE_DESC` varchar(200) DEFAULT NULL,
        `SORT_ORDER` smallint(6) DEFAULT NULL,
        `USE_YN` varchar(1) DEFAULT NULL,
        `CODE_ENGNAME` varchar(300) DEFAULT NULL,
        `LAST_UPDATE_DTIME` varchar(40) DEFAULT NULL,
        `LAST_UPDATE_USER_ID` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=euckr;
/*!40101 SET character_set_client = @saved_cs_client */;