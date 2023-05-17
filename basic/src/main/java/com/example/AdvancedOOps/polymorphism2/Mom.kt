package com.example.AdvancedOOps.polymorphism2

class Mom {

    fun say(){
        println("Mom")
    }

    fun say(msg: String){
        println("Mom $msg")
    }

    fun say(slaps: Int){
        println("Hi Mom gives me $slaps")
    }
}

fun main(){
    var m = Mom()
    m.say()
    m.say(5)
    m.say("aa gyi")
}