package com.example.basic

fun main(args: Array<String>){
    var animals = "cat"

    when(animals){
        "cat" -> {
            println("pet it")
        }
        "dog" -> {
            println("feed it")
        }
        "action" -> {
            println("google it")
        }
    }
}