CREATE DATABASE ferreteria3;

USE ferreteria3;


CREATE TABLE producto(
id_producto INT IDENTITY PRIMARY KEY,
marca VARCHAR(30) NOT NULL,
descripcion VARCHAR(100) NOT NULL,
precio_compra  FLOAT NOT NULL,
precio_venta FLOAT NOT NULL
);

INSERT INTO producto(marca, descripcion, precio_compra, precio_venta)
VALUES('Divisa'  , 'Martillo' , 2 , 3.25),
('Constructor' , 'Serrucho' , 3.02 , 4.50),
('Lemus' , 'Clavos' , 0.05 , 0.25),
('Zepeda' , 'Destornilldor' , 0.85 , 1.50),
('Divisa'  , 'Taladro' , 10 , 35),
('Constructor','Tenazas',2.00,3.75),
('Lemus','Limas', 5.00, 13.25);

SELECT * FROM producto;

/*
    OPERADORES LOGICOS 
	AND, OR y NOT
	XOR = AND y OR
*/

SELECT * FROM producto
WHERE NOT NOT id_producto=4;

SELECT * FROM producto
WHERE marca = 'Constructor'
AND precio_compra>2;

SELECT * FROM producto
WHERE marca = 'Divisa'
OR precio_compra>=5;

/*
    BETWEEN (fechas - numericos)
*/

SELECT * FROM producto
WHERE (precio_compra BETWEEN 3 AND 10)
AND (precio_venta BETWEEN 3 AND 10);

SELECT * FROM compras
WHERE fecha_compra BETWEEN '2023-11-01 08:00:00' AND
'2023-11-15 20:00:00';

/*
   LIKE operador de coincidencias
   (campo) LIKE '%info'
                'info%'
				'%info'
*/

SELECT * FROM producto
WHERE descripcion LIKE '%a';

SELECT * FROM producto
WHERE marca LIKE 'L%';

SELECT * FROM producto
WHERE descripcion LIKE '%i%';

CREATE TABLE empleado(
id_empleado INT IDENTITY PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
apellido VARCHAR(30) NOT NULL,
sexo VARCHAR(15) NOT NULL,
salario MONEY NOT NULL,
departamento VARCHAR(50) NOT NULL,
);

INSERT INTO empleado
(nombre, apellido, sexo, salario, departamento)
VALUES
('Anny','Peralta','Femenino',14500, 'Recursos Humanos'),
('Arisbeth','Matias','Femenino',15000, 'Computos'),
('Raymond','Ciriaco','Masculino',13500, 'Finanzas'),
('Luis','Almazar','Masculino',10000, 'Ventas'),
('Diego','Peralta','Masculino',14500, 'Computos'),
('Maria','Binet','Femenino',12000, 'Recepcion'),
('Natividad','Gonzales','Femenino',14500, 'Ventas');

/*
    GROUP BY
	permite juntar filas de una columna con informacion
	igual

*/

SELECT apellido, COUNT(*) total
FROM empleado
GROUP BY apellido;

SELECT departamento, SUM(salario) AS total_empleado
FROM empleado
GROUP BY departamento;

SELECT sexo, COUNT(*)  total_empleados
FROM empleado
GROUP BY sexo;

/*
    HAVING
*/

SELECT nombre FROM empleado
WHERE apellido = 'Peralta'
GROUP BY nombre
HAVING salario > 13000;

SELECT departamento, AVG(salario) prom_salario
FROM empleado
GROUP BY departamento
HAVING AVG(salario)>13000;

SELECT departamento, COUNT(*) total_empleados
FROM empleado
GROUP BY departamento
HAVING COUNT(*)>1;

/*DISTINCT*/

SELECT DISTINCT apellido
FROM empleado;

SELECT DISTINCT departamento
FROM empleado;

SELECT TOP 3 * FROM producto
ORDER BY precio_venta DESC;