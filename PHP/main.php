<?php

include "Product.php";
include "Hardware.php";
include "Memory.php";

/* Pembuatan class Player baru bernama memory1 beserta inisialisasinya */
$memory1 = new Memory();
$memory1->setFrequency("10GHz");
$memory1->setMemorySize("10TB");
$memory1->setSupportsCuda("Yes");
$memory1->setPrice("10000IDR");
$memory1->setIdProduct("lk2ik34");
$memory1->setBrand("Nonoc");
$memory1->setModel("REM10");

/* Tampilkan data player1 */
$memory1->showMemoryData();

?>