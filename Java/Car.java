class Car{
    Integer id;
    String licence;
    Account driver;
    private Integer passengers;

    public Car(String licence, Account driver){ //<---------Parametros minimos para que se oueda crear el objeto--------->//
        this.licence = licence; //<---------el atributo licence sera igual a la variable licence para poder trabajar de forma mas comoda con esta--------->//
        this.driver = driver;
        /*passengers = 4;
        System.out.println("num pasajeros: " + passengers);*/
    }

    void printDataCar() {
        if(passengers != null){
            System.out.println("Licence: " + licence + " Driver: " + driver.email + " passengers: " + passengers);
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
}