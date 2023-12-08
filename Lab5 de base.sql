CREATE DATABASE Lab5;

USE Lab5;

CREATE TABLE Estudiante(
    id_estudiante INT IDENTITY PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT
);

CREATE TABLE Ordenes (
    id_orden INT IDENTITY PRIMARY KEY,
    producto NVARCHAR(100) NOT NULL,
    cantidad FLOAT NOT NULL,
    precio FLOAT NOT NULL
);

CREATE TABLE Empleados (
    id_empleado INT IDENTITY PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    salario FLOAT NOT NULL
);

CREATE TABLE ventas (
    id_venta INT IDENTITY PRIMARY KEY,
    producto VARCHAR(100) NOT NULL,
    cantidad FLOAT NOT NULL,
    fecha VARCHAR(100) NOT NULL
);

INSERT INTO Estudiante(nombre, edad)
VALUES (1, 'Juan', 22),
(2, 'Marta', 21),
(3, 'Josue', 24),
(4, 'Carlos', 19),
(5, 'Josue', 20);

SELECT * FROM Estudiante
WHERE edad > 20;

SELECT id_orden, producto, cantidad, precio, cantidad * precio AS total_venta
FROM Ordenes;

UPDATE Empleados
SET salario = nuevo_salario
WHERE id_empleado = id_empleado_a_actualizar;

UPDATE Empleados
SET salario = 2000
WHERE id_empleado = 1;

SELECT fecha, AVG(cantidad) AS promedio_ventas_por_dia
FROM ventas
GROUP BY fecha;

SELECT fecha, MIN(cantidad) AS venta_minima_por_dia
FROM ventas
GROUP BY fecha;

SELECT fecha, MAX(cantidad) AS venta_maxima_por_dia
FROM ventas
GROUP BY fecha;

