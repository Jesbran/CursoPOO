<?php
class Car{
    public $id;
    public $license;
    public $driver;
    private $passenger;

    public function __construct($license, Account $driver){ #definiendo constructor "Account" es para enlazarlo con el otro archivo y traer los atributos 'name' etc
        $this -> license = $license;
        $this -> driver = $driver;
    }

    public function getPassengers(){
        return $this->passenger;
    }

    public function setPassengers($passengers){
        if($passengers == 4){
            $this->passenger = $passengers;
        } else {
            $this->passenger = "undefined";
            throw new Error('El número de pasajeros debe ser de 4');
        }
    }

    public function printDataCar(){
        echo "La licencia es:". $this->license. "--El nombre es:". $this->driver->name. "--Su email:". $this->driver->email. "--pasajeros:". $this->passenger. "</br><br/>";
    }
}