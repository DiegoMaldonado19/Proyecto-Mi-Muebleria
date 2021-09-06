CREATE DATABASE mi_muebleria;

USE mi_muebleria;

CREATE TABLE usuario (
    nombre_usuario VARCHAR(20) NOT NULL,
    password  VARCHAR(20) NOT NULL,
    tipo INT NOT NULL,
    CONSTRAINT PK_USUARIO PRIMARY KEY(nombre_usuario)
);

CREATE TABLE cliente (
    nit VARCHAR(15) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(20) NOT NULL,
    municipio VARCHAR(20),
    departamento VARCHAR(25),
    CONSTRAINT PK_CLIENTE PRIMARY KEY(nit)
);

CREATE TABLE pieza (
    id VARCHAR(5) NOT NULL,
    nombre VARCHAR(25) NOT NULL,
    costo DECIMAL(7,2) NOT NULL,
    CONSTRAINT PK_PIEZA PRIMARY KEY(id)
);

CREATE TABLE mueble(
    nombre VARCHAR(25) NOT NULL,
    precio_venta DECIMAL(7,2) NOT NULL,
    CONSTRAINT PK_MUEBLE PRIMARY KEY(nombre)
);

CREATE TABLE ensamble_pieza(
    id VARCHAR(5) NOT NULL,
    nombre_mueble VARCHAR(25) NOT NULL,
    id_pieza VARCHAR(5) NOT NULL,
    cantidad_piezas INT NOT NULL,
    CONSTRAINT PK_ENSAMBLE_PIEZA PRIMARY KEY(id),
    CONSTRAINT FK_TO_MUEBLE FOREIGN KEY(nombre_mueble)
        REFERENCES mueble(nombre),
    CONSTRAINT FK_TO_PIEZA FOREIGN KEY(id_pieza)
        REFERENCES pieza(id)
);

CREATE TABLE ensamble_mueble(
    id VARCHAR(5) NOT NULL,
    id_ensamble_pieza VARCHAR(5) NOT NULL,
    usuario_ensamblador VARCHAR(20) NOT NULL,
    costo DECIMAL(7,2) NOT NULL,
    fecha_ensamble DATE NOT NULL,
    CONSTRAINT PK_ENSAMBLE_MUEBLE PRIMARY KEY(id),
    CONSTRAINT FK_TO_ENSAMBLE_PIEZA FOREIGN KEY(id_ensamble_pieza)
        REFERENCES ensamble_pieza(id),
    CONSTRAINT FK_TO_USUARIO FOREIGN KEY(usuario_ensamblador)
        REFERENCES usuario(nombre_usuario)
);

CREATE TABLE caja(
    id VARCHAR(5) NOT NULL,
    nit_cliente VARCHAR(15) NOT NULL,
    id_mueble_vendido VARCHAR(5) NOT NULL,
    monto_venta DECIMAL(7,2) NOT NULL,
    fecha_compra DATE NOT NULL,
    CONSTRAINT PK_CAJA PRIMARY KEY(id),
    CONSTRAINT FK_TO_CLIENTE FOREIGN KEY(nit_cliente)
        REFERENCES cliente(nit),
    CONSTRAINT FK_TO_ENSAMBLE_MUEBLE FOREIGN KEY(id_mueble_vendido)
        REFERENCES ensamble_mueble(id)
);

CREATE TABLE devolucion(
    id VARCHAR(5) NOT NULL,S
    id_venta VARCHAR(5) NOT NULL,
    perdida DECIMAL(7,2) NOT NULL,
    fecha_devolucion DATE NOT NULL,
    CONSTRAINT PK_DEVOLUCION PRIMARY KEY (id),
    CONSTRAINT FK_TO_CAJA FOREIGN KEY(id_venta)
        REFERENCES caja(id)    
);

INSERT INTO usuario VALUES('Dieguitox', 'maldonado19', 1);

INSERT INTO usuario VALUES('Mander', '1234', 2);

INSERT INTO usuario VALUES('Pepito', 'pepito123', 3);

CREATE USER 'Diego'@'localhost' IDENTIFIED BY 'maldonado19';

GRANT ALL PRIVILEGES ON mi_muebleria.* TO 'Diego'@'localhost';