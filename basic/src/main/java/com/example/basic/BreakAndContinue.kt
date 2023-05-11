package com.example.basic

fun main(args:Array<String>){

    var inputAge = readLine()?:""
    if(inputAge.equals("stop")){
    }
    var age = inputAge.toInt()
    while(true){
        if(inputAge=="stop") {
            break
        }
        if(age<18) continue
    }

    val clients = arrayListOf<String>("anna","bob","carol","david")
    for(client in clients){
        if(client.startsWith('c')) continue
        println("Hello $client")
    }

    var animals = arrayListOf<String>()
    for(i in 1..5){
        var animal = readLine()?:""
        if(animal=="snake") break
        animals.add(animal)
    }
    println(animals)

    for(i in 1..10){
        loop@ for(j in 1..10){
            if(j>5) break@loop
            print("$i$j ")
        }
        println()
    }

    var onlyEven = arrayListOf<Int>(2,4,5,6,7,8,9,10)

    for (even in onlyEven){
        if (even%2!=0){
            println("$even is not even")
            continue
        }
    }
    println(onlyEven)
}