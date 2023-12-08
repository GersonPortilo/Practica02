class Persona:

    def __init__(self, nombre, apellido):

        self.nombre = nombre

        self.apellido = apellido


class Cliente(Persona):

    def __init__(self, nombre, apellido, cuenta, balance):

        super().__init__(nombre, apellido)

        self.cuenta = cuenta

        self.balance = balance


    def __str__(self):

        return f"{self.nombre} {self.apellido}, Cuenta: {self.cuenta}, Balance: {self.balance}"


    def depositar(self, monto):

        self.balance += monto

        return self.balance


    def retirar(self, monto):

        if monto > self.balance:

            print("No puede retirar más dinero del que posee.")

        else:

            self.balance -= monto

            return self.balance


cliente = Cliente("Habacuc", "Portillo", "12345678", 1000)

print(cliente)


while True:

    opcion = input("Elija una opción: \n1. Depositar \n2. Retirar \n3. Salir \n")


    if opcion == "1":

        monto = float(input("Ingrese el monto a depositar: "))

        cliente.depositar(monto)

        print(f"Nuevo balance: {cliente.balance}")

    elif opcion == "2":

        monto = float(input("Ingrese el monto a retirar: "))

        cliente.retirar(monto)

        print(f"Nuevo balance: {cliente.balance}")

    elif opcion == "3":

        print("Saliendo del programa...")

        break

    else:

        print("Opción no válida, intente nuevamente.")