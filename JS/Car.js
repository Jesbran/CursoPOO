/*function Car(licence, driver) {
    this.id;
    this.license = licence;
    this.driver = driver;
    this.passenger;

    Car.prototype.printDataCar = function () {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}*/
//------------new method------------
class Car{
    #passenger
    constructor(license, driver, passenger){
        this.id;
        this.license = license;
        this.driver = driver;
        this.#passenger = passenger;
    }
    
    get passenger(){
        return this.#passenger
    }
    set passenger(pasajeros){
        if(pasajeros < 4){
            console.error('se requiere una cantidad mayor de pasajeros');
        }else{
            
            this.#passenger = pasajeros;
        }

    }

    printDataCar() {
        console.table(this.driver);
        /*console.log(this.driver.id);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log(this.driver.email);*/
        console.log(this.passenger);
    }
}