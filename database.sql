-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema chat-application
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema chat-application
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `chat-application` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `chat-application` ;

-- -----------------------------------------------------
-- Table `chat-application`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chat-application`.`user` (
  `UserID` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `UserName` VARCHAR(255) NULL DEFAULT NULL,
  `Password` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`UserID`))
ENGINE = InnoDB
AUTO_INCREMENT = 39
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `chat-application`.`user_account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chat-application`.`user_account` (
  `UserID` INT UNSIGNED NOT NULL,
  `UserName` VARCHAR(255) NULL DEFAULT NULL,
  `Gender` CHAR(1) NOT NULL DEFAULT '',
  `Image` LONGBLOB NULL DEFAULT NULL,
  `ImageString` VARCHAR(255) NULL DEFAULT '',
  `Status` CHAR(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`UserID`),
  CONSTRAINT `user_account_ibfk_1`
    FOREIGN KEY (`UserID`)
    REFERENCES `chat-application`.`user` (`UserID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
