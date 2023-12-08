CREATE DATABASE tienda;

USE tienda;

CREATE TABLE ropa(
    id_ropa INT IDENTITY PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	dirigido_a VARCHAR(100) NOT NULL,
	color VARCHAR(100) NOT NULL,
	cantidad INT NOT NULL
);

INSERT INTO ropa(nombre, dirigido_a, color, cantidad)
VALUES('Camisa','Hombre','Roja',30),
('Blusa','Mujer','Morada',40),
('Corbata','Hombre','Azul',50),
('Falda','Mujer','Rosada',20),
('Saco','Hombre','Gris',10);

SELECT * FROM ropa;

UPDATE ropa
SET cantidad=(cantidad-10)
WHERE cantidad>=25;

UPDATE color
SET color='rojo'
WHERE 




