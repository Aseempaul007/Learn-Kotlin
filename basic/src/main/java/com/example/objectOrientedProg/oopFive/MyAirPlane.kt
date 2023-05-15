package com.example.objectOrientedProg.oopFive

fun main(){
    var yBoeing = Boeing()
    var myAirbus = Airbus()

    yBoeing.ascend()
    yBoeing.ascend()
    yBoeing.ascend()
    yBoeing.descend()

    myAirbus.ascend()
    myAirbus.ascend()
    myAirbus.ascend()
    myAirbus.ascend()
    myAirbus.ascend()
    myAirbus.descend()

}
open class MyAirPlane {

    var speed = 1000
    var altitude =20000

    fun ascend(){
        altitude+=1000
        println("Aeroplane has a speed : $speed and altitude $altitude")
    }

    fun descend(){
        altitude-=1000
        println("Aeroplane has a speed : $speed and altitude $altitude")
    }
}