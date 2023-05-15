package com.example.objectOrientedProg.oopFour

fun main(){
    var myLap2 = Laptop()
    myLap2.screenSize=12
    myLap2.speed=3
    myLap2.run()

    var myLap = Apple()
    myLap.screenSize=14
    myLap.run()
}

class Apple : Laptop() {


}