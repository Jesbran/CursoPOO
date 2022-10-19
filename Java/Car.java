class Car{
    Integer id;
    String licence;
    Account driver;
    Integer passengers;

    public Car(String licence, Account driver){ //<---------Parametros minimos para que se oueda crear el objeto--------->//
        this.licence = licence; //<---------el atributo licence sera igual a la variable licence para poder trabajar de forma mas comoda con esta--------->//
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("Licence: " + licence + " Driver: " + driver.email);
    }
}