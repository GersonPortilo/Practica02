USE procesos;

/*
    TRIGGERS (Disparadores)
	CREATE TRIGGERS <<nombre>>
	ON <<tabla>>
	FOR <<evento>> (INSERT, UPDATE, DELETE)
	AS BEGIN
	<<accion>>
	END;
*/

CREATE TABLE venta(
    id_venta INT IDENTITY(1,1) PRIMARY KEY,
	fecha DATE,
	cantidad INT,
	totalV MONEY,
);

CREATE TABLE inventario(
    id_inventario INT IDENTITY(1,1) PRIMARY KEY,
	id_venta INT,
	total INT
);

CREATE TRIGGER total_inventario
ON venta
FOR INSERT
AS BEGIN
    UPDATE inventario
	SET total=(
	SELECT SUM(totalV)
	FROM venta
    );
END;

INSERT INTO venta(fecha, cantidad, totalV)
VALUES(GETDATE(), 40, 5000);

INSERT INTO inventario(id_venta, total)
VALUES(1, 5000);

SELECT * FROM inventario;

INSERT INTO venta(fecha, cantidad, totalV)
VALUES(GETDATE(), 20, 2000);

SELECT SYSTEM_USER;

CREATE TABLE nombre(
    id_nombre INT IDENTITY PRIMARY KEY,
	nombres VARCHAR(100) NOT NULL,
	apellidos VARCHAR(100) NOT NULL,
	id_persona INT NOT NULL
);

CREATE TABLE historial_nombre(
    id_historial_nombre INT IDENTITY PRIMARY KEY,
	nombre_anterior VARCHAR(100) NOT NULL,
	apellido_anterior VARCHAR(100) NOT NULL,
	nombre_nuevo VARCHAR(100) NOT NULL,
	apellido_nuevo VARCHAR(100) NOT NULL,
	fecha_modificacion DATE NOT NULL,
	id_nombre INT NOT NULL
);

CREATE TRIGGER tg_historial_nombre
ON nombre
AFTER UPDATE
AS BEGIN
    SET NOCOUNT ON;

    INSERT INTO historial_nombre(
	    nombre_anterior,
		apellido_anterior,
		nombre_nuevo,
		apellido_nuevo,
		fecha_modificacion,
		id_nombre
	)
	SELECT d.nombres, d.apellidos,
	i.nombres, i.apellidos, GETDATE(), i.id_nombre
	FROM inserted i
	INNER JOIN deleted
	d ON i.id_nombre=d.id_nombre
END;

INSERT INTO nombre(nombres, apellidos, id_persona)
VALUES('Ricardinho', 'Presentao');

SELECT * FROM nombre;
SELECT * FROM historial_nombre;

UPDATE nombre
SET nombres = 'Ricardo',
apellidos = 'Presentacion'
WHERE id_nombre = 1;


