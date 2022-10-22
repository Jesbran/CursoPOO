from car import Car
from account import Account
from uberX import UberX
from driver import Driver

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
    print(vars(car2))
    car = Car('FOP87', Account('Maria Cruz', 'PFV97'))
    print(vars(car))
    print(vars(car.driver))'''
    uberX = UberX('LKJ756', Account('Jose Lopez', 'OIU975', 'Jose@gmail.com'), 'Mercedes', 'A45s')
    uberX.passenger = 4
    print(vars(uberX))
    #print(vars(uberX.driver))

    #driver1 = Driver('Tsukasa', 'UIG785', 'Tsukasa@gmail.com')
    #print(vars(driver1))


if __name__ == '__main__':
    run()