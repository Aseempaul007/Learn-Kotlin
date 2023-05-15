package com.example.objectOrientedProg.oopOne

class Car {

    var model: String? = null
    var topSpeed =100

    fun start(){
        println("Staring the $model")
    }

    fun drive(speed: Int){
        println("Driving at $speed")
    }

}