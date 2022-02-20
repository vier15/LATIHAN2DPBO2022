<?php

class Memory extends Hardware {

    /* Private Attribute */
    private $frequency = "Frequency";
    private $memorySize = "Memory Size";
    private $supportsCuda = "Supports Cuda";

    /* Constructor */
    public function __construct($frequency = "Frequency", $memorySize = "Memory Size", $supportsCuda = "Supports Cuda") {
        $this->frequency = $frequency;
        $this->memorySize = $memorySize;
        $this->supportsCuda = $supportsCuda;
    }

    /* Setter dan Getter Frequency */
    public function setFrequency($frequency) {
        $this->frequency = $frequency;
    }

    public function getFrequency() {
        return $this->frequency;
    }

    /* Setter dan Getter Memory Size */
    public function setMemorySize($memorySize) {
        $this->memorySize = $memorySize;
    }

    public function getMemorySize() {
        return $this->memorySize;
    }

    /* Setter dan Getter Supports Cuda */
    public function setSupportsCuda($supportsCuda) {
        $this->supportsCuda = $supportsCuda;
    }

    public function getSupportsCuda() {
        return $this->supportsCuda;
    }

    /* Menampilkan data Memory */
    public function showMemoryData() {
        echo "<br /> __/Product Data___________________";
        echo "<br /> Price : ". $this->getPrice();
        echo "<br /> Id Product : ". $this->getIdProduct();
        echo "<br /> __________________________________";
        echo "<br />";
        echo "<br /> __/Hardware Data___________________";
        echo "<br /> Brand : ". $this->getBrand();
        echo "<br /> Model : ". $this->getModel();
        echo "<br /> __________________________________";
        echo "<br />";
        echo "<br /> __/Memory Data___________________";
        echo "<br /> Frequency : ". $this->getFrequency();
        echo "<br /> Memory Size : ". $this->getMemorySize();
        echo "<br /> Supports Cuda : ". $this->getSupportsCuda();
        echo "<br /> __________________________________";
        echo "<br />";
    }

    /* Destructor */
    public function __destruct() {

	}

}

?>