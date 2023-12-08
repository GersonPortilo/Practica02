CREATE DATABASE expedien_virtual;

USE expedien_virtual; 

CREATE TABLE expedien_virtual(
id_expedien_virtual INT IDENTITY PRIMARY KEY,
nombre_titular VARCHAR(100) NOT NULL,
apellido_titular VARCHAR(100) NOT NULL,
numero_expedien INT NOT NULL,
hora_asignada DATE NOT NULL,
fecha_inicio DATE NOT NULL,
);


INSERT INTO expedien_virtual(nombre_titular,apellido_titular,numero_expedien,hora_asignada,fecha_inicio)VALUES ('Gerson','Umaña','04379831','06:20:00','2023-07-10');
INSERT INTO expedien_virtual(nombre_titular,apellido_titular,numero_expedien,hora_asignada,fecha_inicio)VALUES ('Habacuc','Portillo','77796230','08:10:00','2023-05-23');
SELECT*FROM expedien_virtual;

SELECT numero_expedien, nombre_titular, apellido_titular FROM expedien_virtual;