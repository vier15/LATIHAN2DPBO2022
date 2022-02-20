<?php

class Product {

    /* Private Attribute */
    private $price = "Price";
    private $idProduct = "Id Product";

    /* Constructor */
    public function __construct($price = "Price", $idProduct = "Id Product") {
        $this->price = $price;
        $this->idProduct = $idProduct;
    }

    /* Setter dan Getter Price */
    public function setPrice($price) {
        $this->price = $price;
    }

    public function getPrice() {
        return $this->price;
    }

    /* Setter dan Getter Id Product */
    public function setIdProduct($idProduct) {
        $this->idProduct = $idProduct;
    }

    public function getIdProduct() {
        return $this->idProduct;
    }

    /* Destructor */
    public function __destruct() {

	}

}

?>