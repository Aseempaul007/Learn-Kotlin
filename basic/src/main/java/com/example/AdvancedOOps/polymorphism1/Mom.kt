package com.example.AdvancedOOps.polymorphism1

open class Mom {

    open fun say(msg: String){
        println("Mom says $msg")
    }

}

class Daughter(): Mom(){

    override fun say(msg: String){
        println("Daughter says $msg")
    }
}

fun main(){
    var myMom:Mom = Mom()
    var myDaughter: Mom = Daughter()

    myMom.say("Eat")
    myDaughter.say("Eat")
}