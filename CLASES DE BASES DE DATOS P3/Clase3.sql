CREATE DATABASE productos;

USE productos;

CREATE TABLE producto(
    id_producto INT IDENTITY PRIMARY KEY,
	producto VARCHAR(300) NOT NULL,
	precio FLOAT NOT NULL,
	cantidad INT NOT NULL
);

INSERT INTO producto(producto, precio, cantidad)
VALUES('Martillo',2.50,25),
('Clavos',0.10,3000),
('Serrucho',3.00,12),
('Hierro',2.80,50),
('Pegamento',5.25,80),
('Pala',8.00,30),
('Planza',10.,50);

/*
     ACTUALIZACIONES Y ELIMINACIONES
	 UPDATE <<tabla>>
	 SET <<campo>>=<<valor>>,
	 [<<campo2>>=<<valor2>>]
	 <<condicion>>
*/

SELECT * FROM producto;

UPDATE producto
SET precio=0.01;

UPDATE producto
SET precio=2.5
WHERE producto='Martillo';

UPDATE producto
SET cantidad=(cantidad-10)
WHERE cantidad>=50;

/*
     DELETE FROM <<tabla>> [<<condicion>>]
*/

DELETE FROM producto
WHERE id_producto=2;

SELECT * FROM producto;

INSERT INTO producto(producto, precio, cantidad)
VALUES('Tornillos',0.02,4000);

UPDATE producto
SET id_producto=2
WHERE producto='Tornillos';

ALTER TABLE producto
ADD estado VARCHAR(10) NOT NULL DEFAULT 'Activo';

UPDATE producto
SET estado='Eliminado'
WHERE id_producto=5;

SELECT * FROM producto;

/*
    Crear una tabla "ropa"
	(nombre, dirigido_a, color, cantidad)
	- ingresar datos
	1. Actualice las cantidad del primero con la del ultimo
	2. Actualice el color de 2 registros a ropa
	3. El segundo registro actualizar dirigido_a
	    "desconocido"
	4. Eliminar el penultimo registro
*/