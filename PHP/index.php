<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberBlack.php");
require_once("account.php");

$uberX = new UberX("KFP398", new Account("Javier Herrera", "OVP048", "Javier@gmail.com"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberBlack = new UberBlack("VVK904", new Account("Samuel Sanchez", "FDF396", "Samuel34@gmail.com"), "Dodge", "Attitude");
$uberBlack->printDataCar();