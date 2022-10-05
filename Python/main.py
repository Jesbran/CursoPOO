from car import Car
from account import Account

def run():
    '''print("Hola mundo")
    car = Car()
    car.driver = "María Cruz"
    car.licence = "VIS460"
    car.passengers = 4
    print(vars(car))

    car2 = Car()
    car2.driver = "Rocio FLores"
    car2.licence = "BCI498"
    car2.passengers = 4
    print(vars(car2))'''
    car = Car('FOP87', Account('Maria Cruz', 'PFV97'))
    print(vars(car))
    print(vars(car.driver))


if __name__ == '__main__':
    run()