package com.example.objectOrientedProg.constructors


fun main(){
    var c = Car()
    var c2 = Car("Bmw")
    var c3 = Car(10)
}

class Car {

    var model =""
    var topSpeed = 0

    constructor(){
        model ="No Model"
        topSpeed=10
    }

    constructor(model: String,topSpeed:Int){
        this.model=model
        this.topSpeed=topSpeed
    }

    constructor(model: String){
        this.model=model
    }

    constructor(topSpeed: Int){
        this.topSpeed=topSpeed
    }


}