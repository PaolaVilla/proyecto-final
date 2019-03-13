-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-03-2019 a las 02:35:00
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ordenes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arqueo`
--

CREATE TABLE `arqueo` (
  `arq_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `arq_hora_fecha` datetime NOT NULL,
  `arq_valor_base` decimal(7,2) NOT NULL,
  `arq_valor_fisico` decimal(7,2) NOT NULL,
  `arq_valor_diferencia` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `cat_codigo` int(10) NOT NULL,
  `cat_nombre` varchar(25) NOT NULL,
  `cat_precio` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cli_codigo` int(10) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(25) NOT NULL,
  `cli_apellido` varchar(25) NOT NULL,
  `cli_telefono` varchar(25) NOT NULL,
  `cli_direccion` varchar(100) NOT NULL,
  `cli_correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_producto_menu`
--

CREATE TABLE `detalle_producto_menu` (
  `det_codigo` int(10) NOT NULL,
  `prm_codigo` int(10) NOT NULL,
  `ped_codigo` int(10) NOT NULL,
  `fac_codigo` int(10) NOT NULL,
  `det_especificaciones` varchar(200) NOT NULL,
  `det_cantidad` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `emp_codigo` int(10) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `emp_cargo` varchar(25) NOT NULL,
  `emp_nombre` varchar(25) NOT NULL,
  `emp_apellido` varchar(25) NOT NULL,
  `emp_telefono` varchar(25) NOT NULL,
  `emp_direccion` varchar(100) NOT NULL,
  `emp_correo` varchar(50) NOT NULL,
  `emp_turno` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`emp_codigo`, `emp_id`, `emp_cargo`, `emp_nombre`, `emp_apellido`, `emp_telefono`, `emp_direccion`, `emp_correo`, `emp_turno`) VALUES
(1, '0605694256', 'Mesero', 'Jeison Isidro', 'Caguana Guamán', '0995669394', 'Chunhi - Ecuador', 'jeisoncaguana@gmail.com', 'mañana'),
(2, '17645364565', 'Mesero', 'Daniela Carmen', 'Tene Ruiz', '0995669394', 'Chunhi - Ecuador', 'jeisonhenaselec2@gmail.com', 'tarde');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `fac_codigo` int(10) NOT NULL,
  `cli_codigo` int(10) NOT NULL,
  `fac_fecha` date NOT NULL,
  `fac_hora` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fac_subtotal` decimal(7,2) NOT NULL,
  `fac_iva` decimal(7,2) NOT NULL,
  `fac_total` decimal(7,2) NOT NULL,
  `fac_forma_pago` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `mes_numero` int(10) NOT NULL,
  `mes_estado` enum('LIBRE','OCUPADA') NOT NULL,
  `mes_num_sillas` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `ped_codigo` int(10) NOT NULL,
  `mes_numero` int(10) NOT NULL,
  `ped_estado` enum('RECIBIDO','INGRESADO','EN ESPERA','EN PROCESO','LISTO','DESPACHADO','FINALIZADO','CANCELADO') NOT NULL,
  `ped_especificaciones` varchar(250) DEFAULT NULL,
  `ped_hora_solicitud` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ped_hora_despacho` time DEFAULT NULL,
  `ped_fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_bodega`
--

CREATE TABLE `pedido_bodega` (
  `pdb_codigo` int(10) NOT NULL,
  `prb_codigo` int(10) NOT NULL,
  `prv_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `pdb_fecha` date NOT NULL,
  `pdb_forma_pago` varchar(25) NOT NULL,
  `pdb_descripcion` varchar(100) NOT NULL,
  `pdb_cotizacion` decimal(7,2) NOT NULL,
  `pdb_observacion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto_bodega`
--

CREATE TABLE `producto_bodega` (
  `prb_codigo` int(10) NOT NULL,
  `prb_nombre` varchar(25) NOT NULL,
  `prb_cantidad` int(5) NOT NULL,
  `prb_unidad_peso` varchar(10) NOT NULL,
  `prb_precio` decimal(7,2) NOT NULL,
  `prb_tipo` varchar(25) NOT NULL,
  `prb_lote` varchar(25) NOT NULL,
  `prb_fecha_vencimiento` date NOT NULL,
  `prb_observacion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto_menu`
--

CREATE TABLE `producto_menu` (
  `prm_codigo` int(10) NOT NULL,
  `cat_codigo` int(10) NOT NULL,
  `ree_codigo` int(10) NOT NULL,
  `prm_nombre` varchar(25) NOT NULL,
  `prm_descripción` varchar(200) NOT NULL,
  `prm_disponibilidad` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `prv_codigo` int(10) NOT NULL,
  `prv_nombre` varchar(25) NOT NULL,
  `prv_apellido` varchar(25) NOT NULL,
  `prv_direccion` varchar(100) NOT NULL,
  `prv_telefono` varchar(25) NOT NULL,
  `prv_correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rango`
--

CREATE TABLE `rango` (
  `ran_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `mes_numero` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta_estandar`
--

CREATE TABLE `receta_estandar` (
  `ree_codigo` int(10) NOT NULL,
  `prm_codigo` int(10) NOT NULL,
  `ree_nombre` varchar(50) NOT NULL,
  `ree_tiempo_preparacion` time NOT NULL,
  `ree_fecha_preparacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reexprb`
--

CREATE TABLE `reexprb` (
  `rp_codigo` int(10) NOT NULL,
  `ree_codigo` int(10) NOT NULL,
  `prb_codigo` int(10) NOT NULL,
  `rp_cantidad` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usu_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `usu_cargo` varchar(25) NOT NULL,
  `usu_usuario` varchar(25) NOT NULL,
  `usu_contrasena` varchar(40) NOT NULL DEFAULT 'codigovago'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usu_codigo`, `emp_codigo`, `usu_cargo`, `usu_usuario`, `usu_contrasena`) VALUES
(1, 1, 'Mesero', 'jcaguana1', 'codigovago'),
(2, 2, 'Mesero', 'dtene2', 'codigovago');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arqueo`
--
ALTER TABLE `arqueo`
  ADD PRIMARY KEY (`arq_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`cat_codigo`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cli_codigo`);

--
-- Indices de la tabla `detalle_producto_menu`
--
ALTER TABLE `detalle_producto_menu`
  ADD PRIMARY KEY (`det_codigo`),
  ADD KEY `prm_codigo` (`prm_codigo`,`ped_codigo`),
  ADD KEY `fac_codigo` (`fac_codigo`),
  ADD KEY `ped_codigo` (`ped_codigo`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`emp_codigo`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`fac_codigo`),
  ADD KEY `cli_codigo` (`cli_codigo`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`mes_numero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`ped_codigo`),
  ADD KEY `mes_numero` (`mes_numero`);

--
-- Indices de la tabla `pedido_bodega`
--
ALTER TABLE `pedido_bodega`
  ADD PRIMARY KEY (`pdb_codigo`),
  ADD KEY `prb_codigo` (`prb_codigo`,`prv_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`),
  ADD KEY `prv_codigo` (`prv_codigo`);

--
-- Indices de la tabla `producto_bodega`
--
ALTER TABLE `producto_bodega`
  ADD PRIMARY KEY (`prb_codigo`);

--
-- Indices de la tabla `producto_menu`
--
ALTER TABLE `producto_menu`
  ADD PRIMARY KEY (`prm_codigo`),
  ADD KEY `cat_codigo` (`cat_codigo`),
  ADD KEY `ree_codigo` (`ree_codigo`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`prv_codigo`);

--
-- Indices de la tabla `rango`
--
ALTER TABLE `rango`
  ADD PRIMARY KEY (`ran_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`,`mes_numero`),
  ADD KEY `mes_numero` (`mes_numero`);

--
-- Indices de la tabla `receta_estandar`
--
ALTER TABLE `receta_estandar`
  ADD PRIMARY KEY (`ree_codigo`),
  ADD KEY `prm_codigo` (`prm_codigo`);

--
-- Indices de la tabla `reexprb`
--
ALTER TABLE `reexprb`
  ADD PRIMARY KEY (`rp_codigo`),
  ADD KEY `ree_codigo` (`ree_codigo`,`prb_codigo`),
  ADD KEY `prb_codigo` (`prb_codigo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usu_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arqueo`
--
ALTER TABLE `arqueo`
  MODIFY `arq_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `cat_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cli_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `detalle_producto_menu`
--
ALTER TABLE `detalle_producto_menu`
  MODIFY `det_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `emp_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `fac_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `mes_numero` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `ped_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `pedido_bodega`
--
ALTER TABLE `pedido_bodega`
  MODIFY `pdb_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `producto_bodega`
--
ALTER TABLE `producto_bodega`
  MODIFY `prb_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `producto_menu`
--
ALTER TABLE `producto_menu`
  MODIFY `prm_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `prv_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `rango`
--
ALTER TABLE `rango`
  MODIFY `ran_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `receta_estandar`
--
ALTER TABLE `receta_estandar`
  MODIFY `ree_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `reexprb`
--
ALTER TABLE `reexprb`
  MODIFY `rp_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usu_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arqueo`
--
ALTER TABLE `arqueo`
  ADD CONSTRAINT `arqueo_ibfk_1` FOREIGN KEY (`emp_codigo`) REFERENCES `empleado` (`emp_codigo`);

--
-- Filtros para la tabla `detalle_producto_menu`
--
ALTER TABLE `detalle_producto_menu`
  ADD CONSTRAINT `detalle_producto_menu_ibfk_1` FOREIGN KEY (`ped_codigo`) REFERENCES `pedido` (`ped_codigo`),
  ADD CONSTRAINT `detalle_producto_menu_ibfk_2` FOREIGN KEY (`fac_codigo`) REFERENCES `factura` (`fac_codigo`),
  ADD CONSTRAINT `detalle_producto_menu_ibfk_3` FOREIGN KEY (`prm_codigo`) REFERENCES `producto_menu` (`prm_codigo`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`cli_codigo`) REFERENCES `cliente` (`cli_codigo`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`mes_numero`) REFERENCES `mesa` (`mes_numero`);

--
-- Filtros para la tabla `pedido_bodega`
--
ALTER TABLE `pedido_bodega`
  ADD CONSTRAINT `pedido_bodega_ibfk_1` FOREIGN KEY (`prb_codigo`) REFERENCES `producto_bodega` (`prb_codigo`),
  ADD CONSTRAINT `pedido_bodega_ibfk_2` FOREIGN KEY (`prv_codigo`) REFERENCES `proveedor` (`prv_codigo`),
  ADD CONSTRAINT `pedido_bodega_ibfk_3` FOREIGN KEY (`emp_codigo`) REFERENCES `empleado` (`emp_codigo`);

--
-- Filtros para la tabla `producto_menu`
--
ALTER TABLE `producto_menu`
  ADD CONSTRAINT `producto_menu_ibfk_1` FOREIGN KEY (`cat_codigo`) REFERENCES `categoria` (`cat_codigo`),
  ADD CONSTRAINT `producto_menu_ibfk_2` FOREIGN KEY (`ree_codigo`) REFERENCES `receta_estandar` (`ree_codigo`);

--
-- Filtros para la tabla `rango`
--
ALTER TABLE `rango`
  ADD CONSTRAINT `rango_ibfk_1` FOREIGN KEY (`emp_codigo`) REFERENCES `empleado` (`emp_codigo`),
  ADD CONSTRAINT `rango_ibfk_2` FOREIGN KEY (`mes_numero`) REFERENCES `mesa` (`mes_numero`);

--
-- Filtros para la tabla `receta_estandar`
--
ALTER TABLE `receta_estandar`
  ADD CONSTRAINT `receta_estandar_ibfk_1` FOREIGN KEY (`prm_codigo`) REFERENCES `producto_menu` (`prm_codigo`);

--
-- Filtros para la tabla `reexprb`
--
ALTER TABLE `reexprb`
  ADD CONSTRAINT `reexprb_ibfk_1` FOREIGN KEY (`ree_codigo`) REFERENCES `receta_estandar` (`ree_codigo`),
  ADD CONSTRAINT `reexprb_ibfk_2` FOREIGN KEY (`prb_codigo`) REFERENCES `producto_bodega` (`prb_codigo`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`emp_codigo`) REFERENCES `empleado` (`emp_codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
