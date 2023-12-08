CREATE DATABASE registro;

USE registro;

CREATE TABLE persona(
   id_persona INT IDENTITY PRIMARY KEY,
   nombres VARCHAR (100) NOT NULL,
   apellidos VARCHAR (100) NOT NULL,
   fecha_nacimiento DATE NOT NULL,
);

CREATE TABLE tipo_telefono(
    id_tipo_telefono INT IDENTITY PRIMARY KEY,
	tipo_telefono VARCHAR (50) NOT NULL,
	estado VARCHAR (15) NOT NULL
);

CREATE TABLE telefono_persona(
    id_telefono_persona INT IDENTITY PRIMARY KEY,
	numero VARCHAR(10) NOT NULL,
	estado VARCHAR(15) NOT NULL,
	id_tipo_telefono INT NOT NULL,
	CONSTRAINT fk_telefono_persona_tipo_persona
	FOREIGN KEY (id_tipo_telefono) REFERENCES
	tipo_telefono (id_tipo_telefono)
);

ALTER TABLE telefono_persona
ADD id_persona INT NOT NULL;

ALTER TABLE telefono_persona
ADD FOREIGN KEY (id_persona) REFERENCES
persona (id_persona);

CREATE TABLE departamento(
    id_departamento INT IDENTITY PRIMARY KEY,
	departamento VARCHAR(50) NOT NULL,
);

CREATE TABLE municipio(
    id_municipio INT IDENTITY PRIMARY KEY,
	municipio VARCHAR(100) NOT NULL,
	id_departamento INT NOT NULL,
	CONSTRAINT fk_municipio_departamento
	FOREIGN KEY (id_departamento) REFERENCES
	departamento (id_departamento)
);

CREATE TABLE direccion_persona(
    id_direccion_persona INT IDENTITY PRIMARY KEY,
	direccion VARCHAR(500) NOT NULL,
	estado VARCHAR(15) NOT NULL,
	id_municipio INT NOT NULL,
	id_persona INT NOT NULL,
	CONSTRAINT fk_direccion_persona_municipio
	FOREIGN KEY (id_municipio) REFERENCES
	municipio (id_municipio),
	CONSTRAINT fk_direccion_persona_persona
	FOREIGN KEY (id_persona) REFERENCES
	persona (id_persona)
);

/*INSERT A TABLAS*/

INSERT INTO
persona(nombres, apellidos, fecha_nacimiento)
VALUES ('Esdras', 'Palacios', '2004-06-18');

INSERT INTO
persona(nombres, apellidos, fecha_nacimiento)
VALUES ('Jeimy', 'Hernandez', '1994-07-16');

INSERT INTO
persona(nombres, apellidos, fecha_nacimiento)
VALUES ('Cesar', 'Recinos', '2003-06-08'),
('Brandon', 'Lima', '2004-02-21'),
('Salma', 'Orantes', '2002-07-26');

INSERT INTO municipio(municipio, id_departamento)
VALUES('San Salvador', 1);

INSERT INTO municipio(municipio, id_departamento)
VALUES('Apopa', 2);

INSERT INTO municipio(municipio, id_departamento)
VALUES('San Marcos');

INSERT INTO municipio(municipio, id_departamento)
VALUES('San Martin');

INSERT INTO municipio(municipio, id_departamento)
VALUES('Mejicanos');

INSERT INTO municipio(municipio, id_departamento)
VALUES('Soyapango');



INSERT INTO departamento(departamento)
VALUES('San Salvador');

/*Seleccio de datos*/
SELECT *
FROM persona;

SELECT *
FROM departamento;

SELECT id_persona, fecha_nacimiento
FROM persona;

SELECT nombres, apellidos
FROM persona;
INSERT INTO  CHALATE

INSERT INTO  EL PARAISO, 7
