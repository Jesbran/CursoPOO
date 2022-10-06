<?php

require_once 'account.php';
require_once 'car.php';

echo "<h1>"."POO whit php"."</h1>";

$Car = new car('FKV97', new account('Maria Sanches', 'OJC88'));
$Car -> printDataCar();