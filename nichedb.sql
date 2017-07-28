-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema nichedb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema nichedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `nichedb` DEFAULT CHARACTER SET utf8 ;
USE `nichedb` ;

-- -----------------------------------------------------
-- Table `nichedb`.`allowed`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nichedb`.`allowed` (
  `photoid` INT(11) NOT NULL,
  `userid` INT(11) NOT NULL,
  INDEX `photoid_idx` (`photoid` ASC),
  INDEX `userid_idx` (`userid` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `nichedb`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nichedb`.`users` (
  `userid` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `description` VARCHAR(80) NULL DEFAULT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `nichedb`.`photos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nichedb`.`photos` (
  `photoid` INT(11) NOT NULL AUTO_INCREMENT,
  `userid` INT(11) NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  `photoscol` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`photoid`),
  INDEX `userid_idx` (`userid` ASC),
  CONSTRAINT `userid`
    FOREIGN KEY (`userid`)
    REFERENCES `nichedb`.`users` (`userid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `nichedb`.`tags`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nichedb`.`tags` (
  `tag` INT(11) NOT NULL,
  `photoid` INT(11) NOT NULL,
  INDEX `photoid_idx` (`photoid` ASC),
  CONSTRAINT `photoid`
    FOREIGN KEY (`photoid`)
    REFERENCES `nichedb`.`photos` (`photoid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
