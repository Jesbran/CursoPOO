<?php
require_once("car.php");

class UberVan extends Car{
    public $typeCarAccepted;
    public $material;

    public function __construct($license, $driver, $typeCarAccepted, $material){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->material = $material;
    }
    public function setPassengers($passengers) {
    
        if ($passengers == 6) {
            $this->passenger = $passengers;
        }
        else {
            echo "Necesitas asignar 6 pasajeros 
    ";
        }
    
    }
}