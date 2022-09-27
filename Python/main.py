from car import Car

def run():
    print("Hola mundo")
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

if __name__ == '__main__':
    run()