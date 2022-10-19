<?php
require_once("payment.php");
class Card extends Payment{
    public $number;
    public $cvv;
    public $date;
    public function __construct($id, $number, $cvv, $date){
        parent::__construct($id);
        $this->email = $number;
        $this->cvv = $cvv;
        $this->date = $date;
    }
}