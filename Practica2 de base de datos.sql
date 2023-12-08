CREATE DATABASE usuario;

USE usuario;

CREATE TABLE usuario1(
    id_usuario1 INT IDENTITY PRIMARY KEY,
	nombres VARCHAR(100) NOT NULL,
	apellidos VARCHAR(100) NOT NULL,
	estado VARCHAR(20) NOT NULL
);

CREATE TABLE clave(
    id_clave INT IDENTITY PRIMARY KEY,
	clave VARCHAR(300) NOT NULL,
	estado VARCHAR(20) NOT NULL,
	fecha_creacion DATETIME NOT NULL,
	id_usuario1 INT NOT NULL,
	CONSTRAINT fk_clave_usuario FOREIGN KEY
	(id_usuario1) REFERENCES usuario1(id_usuario1)
);

ALTER TABLE clave
ADD fecha_vencimiento DATETIME NOT NULL;

ALTER TABLE clave
ADD fecha_deceso DATETIME NOT NULL;

ALTER TABLE clave
DROP COLUMN fecha_deceso;

CREATE TABLE sexo(
    id_sexo INT IDENTITY PRIMARY KEY,
	sexo VARCHAR(15) NOT NULL,

);

ALTER TABLE usuario1
ADD id_sexo INT NOT NULL,

ALTER TABLE usuario1
ADD FOREIGN KEY (id_sexo)
REFERENCES sexo(id_sexo);

DROP TABLE producto;
