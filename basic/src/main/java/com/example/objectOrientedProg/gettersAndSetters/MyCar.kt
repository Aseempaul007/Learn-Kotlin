package com.example.objectOrientedProg.gettersAndSetters


fun main(){
    var car = MyCar()
    println(car.speed)
    car.speed=100
    println(car.speed)
}



class MyCar {

    var name: String=""
    var speed: Int=0
    get() = field
    set(value) {
        field=value
    }
}