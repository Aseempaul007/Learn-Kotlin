package com.example.basic

fun main(args:Array<String>){

    var inputAge = readLine()?:"0"
    var age = inputAge.toInt()
    if(age in 1..13){
        println("child")
    }else if(age in 14..18){
        println("teen")
    }else if(age==0){
        println("Not valid")
    }else{
        println("adult")
    }

    var noOfCatsInput = readLine()?:"0"
    var noOfCats = noOfCatsInput.toInt()
    if(noOfCats in 1..3){
        println("Few cats")
    }else if(noOfCats in 4..6){
        println("Several cats")
    }else{
        println("Many cats")
    }

    var guestList = listOf("john","alice","bob","carol")
    var guest = readLine()?:""
    if(guest in guestList){
        println("You are welcome $guest")
    }

    var sen = readLine()
    if(sen=="") println("pakad lia")

    var inputNum = readLine()?:"0"
    println(inputNum)
    var num = inputNum.toInt()
    if(num !in 0..9) println("Two digit number")

    var coffeeList = listOf<String>("capuccino","mocha","latte")
    var myCoffee = "latte"

    var msg2=if(myCoffee !in coffeeList){
        "Your fav coffee not available"
    }else{
        "Coffee Available"
    }
    println(msg2)

    var favPet = "cow"
    var pets = listOf("dog","cat","cow")

    var msg=if(favPet in pets){
        "Favourite pet is there"
    }else{
        "Favourite pet is not there"
    }
    println(msg)

    println(5 in 1..10)
    println(15 in 1..10)

    var cats = listOf<String>("Pussy","Heera","Moti")
    println("Pussy" in cats)
}