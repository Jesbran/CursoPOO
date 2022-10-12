<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberBlack.php");
require_once("account.php");

$uberX = new UberX("KFP398", new Account("Javier Herrera", "OVP048"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberBlack = new UberBlack("VVK904", new Account("Samuel Sanchez", "FDF396"), "Dodge", "Attitude");
$uberBlack->printDataCar();