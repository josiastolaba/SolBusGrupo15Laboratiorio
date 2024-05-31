-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2024 a las 21:48:54
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `solbus`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colectivo`
--

CREATE TABLE `colectivo` (
  `idColectivo` int(11) NOT NULL,
  `matricula` varchar(10) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(15) NOT NULL,
  `capacidad` int(100) NOT NULL,
  `estado` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `idHorario` int(11) NOT NULL,
  `idRuta` int(11) NOT NULL,
  `horaSalida` time NOT NULL,
  `horaLlegada` time NOT NULL,
  `estado` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `idPasaje` int(11) NOT NULL,
  `idPasajero` int(11) NOT NULL,
  `idColectivo` int(11) NOT NULL,
  `idRuta` int(11) NOT NULL,
  `fechaviaje` date NOT NULL,
  `horaViaje` time NOT NULL,
  `asiento` int(11) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajero`
--

CREATE TABLE `pasajero` (
  `idPasajero` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido` varchar(15) NOT NULL,
  `dni` varchar(10) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `telefono` int(15) NOT NULL,
  `estado` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `idRuta` int(11) NOT NULL,
  `origen` varchar(40) NOT NULL,
  `destino` varchar(40) NOT NULL,
  `duracionEstimada` time NOT NULL,
  `estado` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `colectivo`
--
ALTER TABLE `colectivo`
  ADD PRIMARY KEY (`idColectivo`),
  ADD KEY `idColectivo` (`idColectivo`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`idHorario`),
  ADD KEY `idHorario` (`idHorario`),
  ADD KEY `idRuta` (`idRuta`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`idPasaje`),
  ADD KEY `idPasajero` (`idPasajero`),
  ADD KEY `idColectivo` (`idColectivo`),
  ADD KEY `idRuta` (`idRuta`),
  ADD KEY `idPasaje` (`idPasaje`);

--
-- Indices de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  ADD PRIMARY KEY (`idPasajero`),
  ADD KEY `idPasajero` (`idPasajero`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`idRuta`),
  ADD KEY `idRuta` (`idRuta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `colectivo`
--
ALTER TABLE `colectivo`
  MODIFY `idColectivo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `idHorario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `idPasaje` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  MODIFY `idPasajero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `idRuta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `horario`
--
ALTER TABLE `horario`
  ADD CONSTRAINT `horario_ibfk_1` FOREIGN KEY (`idRuta`) REFERENCES `ruta` (`idRuta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `pasaje_ibfk_1` FOREIGN KEY (`idColectivo`) REFERENCES `colectivo` (`idColectivo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pasaje_ibfk_2` FOREIGN KEY (`idPasajero`) REFERENCES `pasajero` (`idPasajero`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pasaje_ibfk_3` FOREIGN KEY (`idRuta`) REFERENCES `ruta` (`idRuta`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
