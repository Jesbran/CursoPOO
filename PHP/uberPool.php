<?php
class uberPool extends Car{
    public $brand;
    public $model;

    public function __construct($licence, $driver, $brand, $model){
        parent::__construct($licence, $driver);
        $this->brand = brand;
        $this->model = model; 
    }
}