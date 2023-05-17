package com.example.AdvancedOOps.polymorphism3

class Translator {

    fun sayHello(){
        println("Hello english")
    }

    fun sayHello(lan: String){

        when(lan){
            "fr" -> println("Hello French")
            "rs" -> println("Russian")
            else -> println("Nothing")
        }

    }
}

fun main(){
    Translator().sayHello()
    Translator().sayHello("tm")
}