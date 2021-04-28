CREATE DATABASE  IF NOT EXISTS `hb_dog_daycare`;
USE `hb_dog_daycare`;

--
-- Table structure for table `student`
--
DROP TABLE IF EXISTS `visit`;
DROP TABLE IF EXISTS `dog`;
DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `hours_credit` int(11),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `dog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `breed` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `diet_preferences` varchar(45) DEFAULT NULL,
  `img_profile` varchar(45) DEFAULT NULL,
  `owner_id` int(11),
  PRIMARY KEY (`id`),
  foreign key (owner_id)
	references client(id)
    on delete cascade
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `visit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dog_id` int(11) NOT NULL,
  `visit_type` varchar(45) DEFAULT NULL,
  `date_start` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `date_end` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`),
  foreign key (dog_id)
	references dog(id)
    on delete cascade
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;