package com.example.basic

fun main(args: Array<String>){

    var inputName = readLine()?:"0"
    when(val letter = inputName.get(0)){
        'a','b','c' -> println("Lucky people")
        'd','e','f' -> println("Unlucky people")
        else-> println("No existence")
    }


    var inputTime = readLine()?:"0"
    var time = inputTime.toInt()

    when(time){
        in 6..11 -> println("morning")
        in 12..14 -> println("noon")
        in 15..17 -> println("afternoon")
        in 18..21 -> println("evening")
        in 22..5 -> println("night")
    }

    var inputMeal = readLine()?:"0"
    var meal = inputMeal.toInt()

    var msg = when(meal){
        0,1,2-> "please increade your meal take"
        3-> "Great keep it up"
        else-> "Please decrease your meal"
    }
    println(msg)

    var name = "Aseem"
    when(val len = name.length){
        in 1..5 -> println("short")
        in 6..10-> println("medium")
        else -> println("long")
    }

    var month = "may"
    var value4=when(month){
        "january","march","may"-> 31
        "february"->28
        else-> 30
    }
    println(value4)

    var numInput = readLine()?:"0"
    var num = numInput.toInt()
    var value:String?= null

    when(num%2){
        0->value = "Even"
        1->value = "odd"
    }

    var value2 = when(num%2){
        0-> "pet it"
        1 -> "fed it"
        else -> "do nothing"
    }
    println(value2)


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