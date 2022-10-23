class Car{
    private Integer id;
    private String licence;
    private Account driver;
    protected Integer passengers;

    public Car(String licence, Account driver){ //<---------Parametros minimos para que se oueda crear el objeto--------->//
        this.licence = licence; //<---------el atributo licence sera igual a la variable licence para poder trabajar de forma mas comoda con esta--------->//
        this.driver = driver;
        /*passengers = 4;
        System.out.println("num pasajeros: " + passengers);*/
    }

    void printDataCar() {
        if(passengers != null){
            System.out.println("Licence: " + licence + " Driver: " + driver.name + " passengers: " + passengers);
        }
    }

    public Integer getPassenger(){//<-------permite acceder al dato protegido--------->
        return passengers;
    }
    public void setPassenger(Integer passengers){//<-------permite modificar el dato protegido-------->
        if(passengers == 4){
            this.passengers = passengers;
        }else{
            System.out.println("<---------Necesitas agregar mas pasajeros--------->");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
}