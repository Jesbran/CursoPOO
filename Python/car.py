from account import Account


class Car:
    id = int
    licence = str
    driver = Account('', '', '')
    __passenger = int
    
    #constructor
    def __init__(self, licence, driver):
        #self.id
        self.licence = licence
        self.driver = driver

    #metodo getter
    @property
    def passenger(self):
        return self.__passenger

    #metodo setter
    @passenger.setter
    def passenger(self, passengers: int):
        if passengers == 4:
            self.__passenger = passengers
        else:
            print("necesitas tener una cantidad mayor de pasajeros")
