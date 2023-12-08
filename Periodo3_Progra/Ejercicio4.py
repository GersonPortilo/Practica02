# En un banco tienen clientes que pueden hacer depositos y extracciones de dinero.
# El banco requiere tambien al final del dia calcular la cantidad de dinero
# que se ha depositado.

# Se deberan crear dos clases, la clase cliente y la clase banco. La clase 
# cliente tendra los atributos nombre y cantidad y los metodos
# __init__, depositar, extraer, mostrar_total.

# La clase banco tendra como atributos 3 objetos de la clase cliente y 
# los metodos __init__, operar y deposito_total.

class Cliente:
    def __init__(self, nombre):
        self.nombre = nombre
        self.saldo = 0

    def hacer_deposito(self, monto):
        self.saldo += monto
        print(f"{self.nombre} ha depositado ${monto}. Saldo actual: ${self.saldo}")

    def hacer_extraccion(self, monto):
        if monto <= self.saldo:
            self.saldo -= monto
            print(f"{self.nombre} ha retirado ${monto}. Saldo actual: ${self.saldo}")
        else:
            print(f"{self.nombre} no tiene fondos suficientes para realizar la extracción.")

class Banco:
    def __init__(self):
        self.clientes = []

    def agregar_cliente(self, cliente):
        self.clientes.append(cliente)

    def calcular_total_depositado(self):
        total_depositado = sum(cliente.saldo for cliente in self.clientes)
        print(f"\nTotal depositado en el banco: ${total_depositado}")


# Ejemplo de uso:
cliente1 = Cliente("Gerson")
cliente2 = Cliente("Habacuc")

banco = Banco()

banco.agregar_cliente(cliente1)
banco.agregar_cliente(cliente2)

cliente1.hacer_deposito(1000)
cliente2.hacer_deposito(500)

cliente1.hacer_extraccion(200)
cliente2.hacer_extraccion(800)

banco.calcular_total_depositado()

