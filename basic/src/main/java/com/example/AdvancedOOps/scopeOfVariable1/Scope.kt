package com.example.AdvancedOOps.scopeOfVariable1

open class Airplane {
    internal var type = "Airbus"

    internal fun fly(){
        println("flying..")
    }
}

class MyAirplane: Airplane() {

    fun takeOff(){
        println(type)
        fly()
    }

}

class MyCar(){

    fun start(){
        var plane = Airplane()
        println(plane.type)
        plane.fly()
    }
}

