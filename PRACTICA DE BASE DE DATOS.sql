CREATE DATABASE Universidad;

USE Universidad;

CREATE TABLE estudiante(
    id_estudiante INT IDENTITY PRIMARY KEY,
	nombres VARCHAR(100) NOT NULL,
	apellidos VARCHAR(100) NOT NULL,
	fecha_nacimiento DATETIME NOT NULL
);

CREATE TABLE carrera(
    id_carrera INT IDENTITY PRIMARY KEY,
	nombre_carrera VARCHAR NOT NULL,
	ciclo INT NOT NULL
);

ALTER TABLE estudiante
ADD id_carrera INT NOT NULL;

ALTER TABLE estudiante
ADD FOREIGN KEY (id_carrera)
REFERENCES carrera(id_carrera);