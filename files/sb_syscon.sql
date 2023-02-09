/*Base de datos para el sistema de contabilidad*/
DROP DATABASE IF EXISTS `db_sistema_contable`;

CREATE DATABASE `db_sistema_contable`;

USE `db_sistema_contable`;

/*Tabla de usuarios del sistema*/
DROP TABLE IF EXISTS `db_sistema_contable`.`t_usuario`;
CREATE TABLE `db_sistema_contable`.`t_usuario` (
    `id_usuario` INT(10) NOT NULL AUTO_INCREMENT,
    `cui_usuario` VARCHAR(20) NOT NULL,
    `nombre_usuario` VARCHAR(200) DEFAULT '',
    `apellido_usuario` VARCHAR(200) DEFAULT '',
    PRIMARY KEY(`id_usuario`, `cui_usuario`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;