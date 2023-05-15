package com.example.objectOrientedProg.initBlockInKotlin


fun main(){
    var c1 = Car()
}


class Car {

    var model: String=""
    var topSpeed =0

    init {
        println("Car has $model with topSpeed : $topSpeed")
    }
}