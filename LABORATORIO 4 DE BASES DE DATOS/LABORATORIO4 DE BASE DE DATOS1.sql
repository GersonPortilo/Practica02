CREATE DATABASE expediente_virtual;

USE expediente_virtual;

CREATE TABLE expediente_virtual (
    id_expediente_virtual INT PRIMARY KEY,
    numero_expediente VARCHAR(100),
    fecha_inicio DATE,
    nombre_titular VARCHAR(100),
    apellido_titular VARCHAR(100),
    hora_asignacion TIME
);

-- Insertar primer registro
INSERT INTO expediente_virtual (id_expediente_virtual, numero_expediente, fecha_inicio, nombre_titular, apellido_titular, hora_asignacion)
VALUES (1, 'EV2023001', '2023-10-12', 'Juan', 'Perez', '08:30:00');

-- Insertar segundo registro
INSERT INTO expediente_virtual (id_expediente_virtual, numero_expediente, fecha_inicio, nombre_titular, apellido_titular, hora_asignacion)
VALUES (2, 'EV2023002', '2023-10-13', 'Maria', 'Gonzalez', '09:15:00');

-- Insertar tercer registro
INSERT INTO expediente_virtual (id_expediente_virtual, numero_expediente, fecha_inicio, nombre_titular, apellido_titular, hora_asignacion)
VALUES (3, 'EV2023003', '2023-10-14', 'Carlos', 'Lopez', '10:00:00');

SELECT numero_expediente, nombre_titular, apellido_titular
FROM expediente_virtual;
