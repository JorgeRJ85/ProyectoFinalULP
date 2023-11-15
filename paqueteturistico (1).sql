-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2023 a las 06:32:34
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `paqueteturistico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamiento`
--

CREATE TABLE `alojamiento` (
  `idAlojamiento` int(11) NOT NULL,
  `FechaIn` date NOT NULL,
  `FechaOn` date NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Servicio` varchar(40) NOT NULL,
  `ImporteDiario` double NOT NULL,
  `idCiudadDestino` int(11) NOT NULL,
  `TipodeAlojamiento` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alojamiento`
--

INSERT INTO `alojamiento` (`idAlojamiento`, `FechaIn`, `FechaOn`, `Estado`, `Servicio`, `ImporteDiario`, `idCiudadDestino`, `TipodeAlojamiento`) VALUES
(1, '2024-01-01', '2024-01-08', 1, 'Desayuno - Almuerzo - Cena', 16000, 2, 'Hotel'),
(2, '2024-01-04', '2024-01-11', 1, 'Desayuno - Almuerzo - Cena', 128000, 12, 'Departamento'),
(3, '2023-01-01', '2023-01-08', 1, 'Desayuno', 150000, 16, 'Hostel'),
(4, '2024-07-01', '2024-07-08', 1, 'Desayuno', 120000, 19, 'Hostel'),
(5, '2024-07-15', '2024-07-22', 1, 'Desayuno - Almuerzo', 150000, 20, 'Departamento'),
(6, '2023-11-01', '2023-11-08', 1, 'Desayuno', 200000, 13, 'Hotel'),
(7, '2023-12-20', '2023-12-27', 1, 'Desayuno - Almuerzo - Cena', 75000, 4, 'Hotel'),
(8, '2023-12-20', '2023-12-27', 1, 'Desayuno', 85000, 4, 'Departamento'),
(9, '2023-12-20', '2023-12-27', 1, 'Desayuno', 75000, 4, 'Departamento'),
(10, '2023-10-25', '2023-10-25', 1, 'Desayuno - Almuerzo', 1, 12, 'Hostel'),
(11, '2024-10-31', '2023-10-31', 0, 'Desayuno', 12, 40, 'Hotel'),
(12, '2023-10-11', '2023-10-29', 1, 'Desayuno - Almuerzo', 25000, 1, 'Hostel'),
(13, '2023-11-01', '2023-11-08', 1, 'Desayuno', 21390, 2, 'Hotel'),
(14, '2024-01-01', '2024-01-08', 1, 'Desayuno - Almuerzo', 24148, 2, 'Hotel'),
(15, '2024-01-01', '2024-01-08', 1, 'Desayuno - Almuerzo', 24148, 2, 'Hotel'),
(16, '2023-12-07', '2023-12-14', 1, 'Desayuno - Almuerzo - Cena', 60000, 40, 'Hotel'),
(17, '2023-12-12', '2023-12-20', 1, 'Desayuno - Almuerzo', 85000, 21, 'Departamento');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `idCiudad` int(11) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `Pais` varchar(20) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Provincia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`idCiudad`, `Nombre`, `Pais`, `Estado`, `Provincia`) VALUES
(1, 'Puerto Madryn', 'Argentina', 1, 'Chubut'),
(2, 'Bariloche', 'Argentina', 1, 'Rio Negro'),
(3, 'Valle Fertil', 'Argentina', 1, 'San Juan'),
(4, 'Mar del Plata', 'Argentina', 1, 'Buenos Aires'),
(6, 'General Pico', 'Argentina', 1, 'La Pampa'),
(7, 'Punta Tombo', 'Argentina', 1, 'Chubut'),
(8, 'Sierra de las Bardas', 'Argentina', 1, 'Rio Negro'),
(9, 'Iglesia', 'Argentina', 1, 'San Juan'),
(10, 'Pinamar', 'Argentina', 1, 'Buenos Aires'),
(12, 'Arequipa', 'Peru', 1, 'Arequipa'),
(13, 'Cusco', 'Peru', 1, 'Cusco'),
(14, 'Cádiz', 'España', 1, 'Cádiz'),
(15, 'Málaga', 'España', 1, 'Málaga'),
(16, 'Cañon del Colca', 'Peru', 1, 'Arequipa'),
(17, 'San Sebastian', 'España', 1, 'Gipuzkoa'),
(18, 'Azul', 'Argentina', 1, 'Buenos Aires'),
(19, 'Las Grutas', 'Argentina', 1, 'Rio Negro'),
(20, 'El Bolson', 'Argentina', 1, 'Rio Negro'),
(21, 'Villa Carlos Paz', 'Argentina', 1, 'Cordoba'),
(32, 'Checoslovaquia', 'Checos', 1, 'Lovaquia'),
(37, 'Barcelona', 'España', 1, 'Barcelona'),
(40, 'Juana Koslay ', 'Argentina', 1, 'San Luis'),
(41, 'Puerto Piramides', 'Argentina', 1, 'Chubut');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

CREATE TABLE `paquete` (
  `idPaquete` int(11) NOT NULL,
  `idCiudadOrigen` int(11) NOT NULL,
  `idCiudadDestino` int(11) NOT NULL,
  `idAlojamiento` int(11) NOT NULL,
  `idPasaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paquete`
--

INSERT INTO `paquete` (`idPaquete`, `idCiudadOrigen`, `idCiudadDestino`, `idAlojamiento`, `idPasaje`) VALUES
(2, 18, 16, 3, 1),
(3, 18, 19, 4, 2),
(4, 18, 20, 5, 2),
(5, 18, 4, 7, 3),
(6, 18, 4, 7, 4),
(7, 18, 4, 9, 5),
(8, 18, 40, 16, 6),
(9, 18, 4, 8, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `idPasaje` int(11) NOT NULL,
  `TipodeTransporte` varchar(20) NOT NULL,
  `Importe` double NOT NULL,
  `idCiudadOrigen` int(11) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pasaje`
--

INSERT INTO `pasaje` (`idPasaje`, `TipodeTransporte`, `Importe`, `idCiudadOrigen`, `Estado`) VALUES
(1, 'Avion', 200000, 18, 1),
(2, 'AutoBus', 60000, 18, 1),
(3, 'Autobus', 100000, 18, 1),
(4, 'Tren', 50000, 18, 1),
(5, 'Avion', 121212, 18, 1),
(6, 'Avion', 30000, 18, 1),
(7, 'Tren', 12000, 18, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD PRIMARY KEY (`idAlojamiento`),
  ADD KEY `idCuidadDestino` (`idCiudadDestino`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`idCiudad`),
  ADD UNIQUE KEY `Nombre` (`Nombre`),
  ADD KEY `Provincia` (`Provincia`),
  ADD KEY `Provincia_2` (`Provincia`),
  ADD KEY `Provincia_3` (`Provincia`);

--
-- Indices de la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD PRIMARY KEY (`idPaquete`),
  ADD KEY `idPasaje` (`idPasaje`),
  ADD KEY `idAlojamiento` (`idAlojamiento`),
  ADD KEY `idCuidadDestino` (`idCiudadDestino`),
  ADD KEY `idCuidadOrigen` (`idCiudadOrigen`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`idPasaje`),
  ADD KEY `idCiudadOrigen` (`idCiudadOrigen`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  MODIFY `idAlojamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `idCiudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `paquete`
--
ALTER TABLE `paquete`
  MODIFY `idPaquete` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `idPasaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD CONSTRAINT `alojamiento_ibfk_1` FOREIGN KEY (`idCiudadDestino`) REFERENCES `ciudad` (`idCiudad`);

--
-- Filtros para la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD CONSTRAINT `paquete_ibfk_1` FOREIGN KEY (`idCiudadOrigen`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `paquete_ibfk_2` FOREIGN KEY (`idCiudadDestino`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `paquete_ibfk_3` FOREIGN KEY (`idAlojamiento`) REFERENCES `alojamiento` (`idAlojamiento`),
  ADD CONSTRAINT `paquete_ibfk_4` FOREIGN KEY (`idPasaje`) REFERENCES `pasaje` (`idPasaje`);

--
-- Filtros para la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `pasaje_ibfk_1` FOREIGN KEY (`idCiudadOrigen`) REFERENCES `ciudad` (`idCiudad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
