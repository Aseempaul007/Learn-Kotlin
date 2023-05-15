package com.example.objectOrientedProg.companionObj

fun main(){
    println(Car.securityInstructions())
}


class Car {

    companion object{
        fun securityInstructions(): String{
            return "Drive safe"
        }
    }
}