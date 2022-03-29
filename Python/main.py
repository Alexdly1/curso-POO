#Primero importamos la clase
from car import Car
from account import Account
from uberBlack import UberBlack

""" if __name__ == "__main__":
    print ("Hola mundo")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Matha"
    print(vars(car2)) """

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))


    car1 = UberBlack("AMS234", Account("Andres Herrera", "ANDA876"), "tesla", "cuero")
    print(vars(car1))
    print(vars(car1.driver))