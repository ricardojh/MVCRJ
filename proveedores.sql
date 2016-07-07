-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-07-2016 a las 02:26:53
-- Versión del servidor: 5.7.9
-- Versión de PHP: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proveedores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE IF NOT EXISTS `proveedores` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `empresa` text NOT NULL,
  `ruc` text NOT NULL,
  `pais` text NOT NULL,
  `ciudad` text NOT NULL,
  `direccion` text NOT NULL,
  `telefono` text NOT NULL,
  `celular` text NOT NULL,
  `representante` text NOT NULL,
  `fecha` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `id_2` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`id`, `empresa`, `ruc`, `pais`, `ciudad`, `direccion`, `telefono`, `celular`, `representante`, `fecha`) VALUES
(1, 'Calva & Calva', '1094857346001', 'Ecuador', 'Loja', 'Argelia', '2560474', '0987654321', 'Luis Chamba', '12/06/1999'),
(2, 'Toyota', '11984756372001', 'Ecuador', 'Loja', 'Miguel Riofrio y Av. Universitaria', '2464758', '0932467648', 'Loreto Bravo', '11/10/2000'),
(3, 'Netplus', '11984756389001', 'Ecuador', 'Loja', 'Sucre y Azuay', '354672', '097465926', 'Pedro Alfonso', '20/04/1980'),
(5, 'Puma', '1104637478001', 'Ecuador', 'Quito', 'Calderon', '029857461', '09746289128', 'Pablo Armijos', '2/7/2001'),
(6, 'Kradac', '11058694857001', 'Ecuador', 'Loja', 'Los Geraneos', '465738', '09765836421', 'Bruno ', '01/05/2000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
