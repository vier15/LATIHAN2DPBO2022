<?php

class Hardware extends Product {

    /* Private Attribute */
    private $brand = "Brand";
    private $model = "Model";

    /* Constructor */
    public function __construct($brand = "Brand", $model = "Model") {
        $this->brand = $brand;
        $this->model = $model;
    }

    /* Setter dan Getter Brand */
    public function setBrand($brand) {
        $this->brand = $brand;
    }

    public function getBrand() {
        return $this->brand;
    }

    /* Setter dan Getter Model */
    public function setModel($model) {
        $this->model = $model;
    }

    public function getModel() {
        return $this->model;
    }

    /* Destructor */
    public function __destruct() {

	}

}

?>