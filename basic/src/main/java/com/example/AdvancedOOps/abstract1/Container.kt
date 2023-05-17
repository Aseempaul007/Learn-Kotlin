package com.example.AdvancedOOps.abstract1

abstract class Container {
    abstract fun pour()
}

class Jug: Container(){
    override fun pour() {
        println("pouring water from jug")
    }

}

class Bottle: Container(){

    override fun pour() {
        println("pouring water form bottle")
    }

}

fun main(){
    var myJug:Container = Jug()
    myJug.pour()
}