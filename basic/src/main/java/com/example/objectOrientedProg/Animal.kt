package com.example.objectOrientedProg

class Animal {

    var topSpeed: Int? = null

    fun run(){
        println("Animal's top speed is $topSpeed")
    }
}

fun main(args: Array<String>){

    var animal = Animal()
    animal.run()
    animal.topSpeed=30
    animal.run()

}