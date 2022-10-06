<?php
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, Account $driver){ #definiendo constructor "Account" es para enlazarlo con el otro archivo y traer los atributos 'name' etc
        $this -> license = $license;
        $this -> driver = $driver;
    }

    public function printDataCar(){
        echo "La licencia es:". $this->license. "--El nombre es:". $this->driver->name. "--Su documento:". $this->driver->document;
    }
}