<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberVan.php");
require_once("account.php");

$uberX = new UberX("KFP398", new Account("Javier Herrera", "OVP048", "Javier@gmail.com"), "Chevrolet", "Spark");
$uberX->setPassengers(4);
$uberX->printDataCar();

$uberVan = new UberVan("VVK904", new Account("Samuel Sanchez", "FDF396", "Samuel34@gmail.com"), "Dodge", "Attitude");
$uberVan->setPassengers(6);
$uberVan->printDataCar();