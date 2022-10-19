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
    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    printDataCar() {
        console.table(this.driver);
        console.log(this.driver.id);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log(this.driver.email);
    }
}