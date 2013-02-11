-- phpMyAdmin SQL Dump
-- version 3.5.5
-- http://www.phpmyadmin.net
--
-- Host: sql2.freesqldatabase.com
-- Generation Time: Feb 09, 2013 at 10:25 PM
-- Server version: 5.5.29-0ubuntu0.12.04.1
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sql22538`
--

-- --------------------------------------------------------

--
-- Table structure for table `Login_Table`
--

CREATE TABLE IF NOT EXISTS `Login_Table` (
  `ID` int(1) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Login_Table`
--

INSERT INTO `Login_Table` (`ID`, `Username`, `password`) VALUES
(1, 'panagiotis', 'andriotis'),
(1, 'cse38094', 'openlab'),
(1, 'cse36866', 'openlab'),
(1, 'cse30754', 'openlab'),
(2, 'mixalis', 'openlab'),
(2, 'prezerakos', 'openlab'),
(2, 'bagelis', 'openlab'),
(2, 'dimitris', 'openlab');

-- --------------------------------------------------------

--
-- Table structure for table `message`
--

CREATE TABLE IF NOT EXISTS `message` (
  `key` int(10) unsigned NOT NULL,
  `minima` varchar(100) NOT NULL,
  PRIMARY KEY (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `message`
--

INSERT INTO `message` (`key`, `minima`) VALUES
(1, 'kalimeraaaaa !!!!!!!!!!!!!!!!'),
(2, 'doulia . poli doula'),
(3, 'dialima !!!'),
(4, 'test db if work'),
(5, 'hellllooooooooooooooooooooooooo'),
(6, 'ego tha figo . esis douliaaaaaaa '),
(7, 'oreos keros . '),
(8, 'aperfia exi simera !!!'),
(9, 'apo tin alli domada i pliromes dioti to tamio einai mion'),
(10, 'simera tha doulecete mexri tis 10'),
(11, 'kalimera se olo to prosopiko'),
(12, 'apolieste oli strabadia'),
(13, 'to tamio einai klisto logo blabis'),
(14, 'bonous + 10000 euro ta afedika !!!!!!!!!!!!!!!!'),
(15, 'kalo mina'),
(16, 'simera oli tha kanete iperories kai den tha plirothite'),
(17, 'simera tha parete oli bonous 1000 euro'),
(18, 'simera oli exete repo !!!!!! + 1000 euro');

-- --------------------------------------------------------

--
-- Table structure for table `Routes_Table`
--

CREATE TABLE IF NOT EXISTS `Routes_Table` (
  `key_id` int(5) NOT NULL,
  `diadromi` varchar(50) NOT NULL,
  `day` varchar(20) NOT NULL,
  `time` int(5) NOT NULL,
  `thesis` int(5) NOT NULL,
  `cost` int(5) NOT NULL,
  `key_day` int(11) NOT NULL,
  `KENES_THESIS` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Routes_Table`
--

INSERT INTO `Routes_Table` (`key_id`, `diadromi`, `day`, `time`, `thesis`, `cost`, `key_day`, `KENES_THESIS`) VALUES
(40, 'ATHENS_THESALLONIKI', 'Monday', 1000, 100, 20, 1, 98),
(843, 'ATHINA_IOANNINA', 'Tuesda', 2000, 150, 15, 2, 149),
(40, 'ATHENS_THESALLONIKI', 'Friday', 1200, 100, 20, 5, 100),
(40, 'THESALLONIKI_ATHENS', 'Wednes', 1500, 100, 20, 3, 99),
(843, 'IOANNINA_ATHINA', 'Thursd', 8000, 150, 15, 4, 78),
(843, 'IOANNINA_ATHINA', 'Friday', 1300, 150, 15, 5, 150),
(833, 'PATRA_ATHENS', 'Saturd', 8000, 100, 30, 6, 79),
(900, 'NAFPLIO_PATRA', 'Sunday', 6000, 100, 10, 7, 99),
(833, 'ATHENS_PATRA', 'Sunday', 8000, 100, 30, 7, 72),
(500, 'PATRA_ATHENS', 'Saturd', 1300, 100, 20, 6, 100),
(400, 'ATHENS_THESALLONIKI', 'Friday', 1200, 150, 15, 5, 150),
(230, 'ATHENS_PATRA', 'Monday', 1000, 150, 30, 1, 148),
(897, 'IOANNINA_ATHINA', 'Wednes', 1700, 100, 10, 3, 100),
(300, 'IOANNINA_ATHINA', 'Wednes', 1300, 100, 10, 3, 100),
(999, 'ATHENS_PATRA', 'Monday', 1200, 100, 10, 1, 98);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
