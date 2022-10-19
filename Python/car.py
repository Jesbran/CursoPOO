from account import Account


class Car:
    id = int
    licence = str
    driver = Account('', '', '')
    passengers = int
    
    def __init__(self, licence, driver):
        #self.id
        self.licence = licence
        self.driver = driver
        #self.passengers