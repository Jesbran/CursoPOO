<?php
require_once("account.php")
class Driver extends Account{
    public function __construct($name, $document, $email){
        parent::__construct($name, $document, $email);
    }
}