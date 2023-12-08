CREATE PROCEDURE CalcularOperacion
    @Operacion VARCHAR(10),
    @Numero1 FLOAT,
    @Numero2 FLOAT
AS
BEGIN
    IF @Operacion = 'Suma'
        SELECT @Numero1 + @Numero2 AS Resultado;
    ELSE IF @Operacion = 'Resta'
        SELECT @Numero1 - @Numero2 AS Resultado;
    ELSE IF @Operacion = 'Multiplicacion'
        SELECT @Numero1 * @Numero2 AS Resultado;
    ELSE IF @Operacion = 'Division'
    BEGIN
        IF @Numero2 <> 0
            SELECT @Numero1 / @Numero2 AS Resultado;
        ELSE
            PRINT 'Error: No es posible dividir por cero.';
    END
    ELSE IF @Operacion = 'Potenciacion'
        SELECT POWER(@Numero1, @Numero2) AS Resultado;
    ELSE IF @Operacion = 'RaizCuadrada'
        SELECT SQRT(@Numero1) AS Resultado;
    ELSE
        PRINT 'Error: Operación no válida.';
END;

EXEC CalcularOperacion @Operacion = 'Suma', @Numero1 = 5, @Numero2 = 3;
EXEC CalcularOperacion @Operacion = 'Resta', @Numero1 = 5, @Numero2 = 3;
EXEC CalcularOperacion @Operacion = 'Multiplicacion', @Numero1 = 5, @Numero2 = 3;
EXEC CalcularOperacion @Operacion = 'Division', @Numero1 = 5, @Numero2 = 3;
EXEC CalcularOperacion @Operacion = 'Potenciacion', @Numero1 = 2, @Numero2 = 3;
EXEC CalcularOperacion @Operacion = 'RaizCuadrada', @Numero1 = 9, @Numero2 = 0;