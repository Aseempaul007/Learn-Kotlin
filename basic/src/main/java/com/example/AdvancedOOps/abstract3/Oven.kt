package com.example.AdvancedOOps.abstract3

abstract class Oven {

    abstract fun cookingSpeed()
    abstract fun temperature()
    abstract fun canCook()
    abstract fun canRoast()

}

class Bosch(): Oven(){
    override fun cookingSpeed() {

    }

    override fun temperature() {
        println("Bosch has high cooking temp")
    }

    override fun canCook() {
        println("")
    }

    override fun canRoast() {
        TODO("Not yet implemented")
    }

}

class Roaster(): Oven(){
    override fun cookingSpeed() {
        TODO("Not yet implemented")
    }

    override fun temperature() {
        TODO("Not yet implemented")
    }

    override fun canCook() {
        println("Can't cook")
    }

    override fun canRoast() {
        println("Roaster can cook")
    }

}

fun main(){

    var myBosch = Bosch()
    myBosch.temperature()

    var myRoaster = Roaster()
    myRoaster.canRoast()

}