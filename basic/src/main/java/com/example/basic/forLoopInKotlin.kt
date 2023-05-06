package com.example.basic

fun main(args: Array<String>){

    var num = 10

    for(i in 1..num){
        for(j in 1..num){
            if((i*j)%3==0) print("\uD83D\uDE00 ")
            if((i*j)%3==1) print("\uD83E\uDD28 ")
            if((i*j)%3==2) print("\uD83D\uDE31 ")
        }
        println()
    }

    var InputMaxValue = readLine()?:"0"
    var maxValue = InputMaxValue.toInt()

    for(i in maxValue downTo 0){
        if(i%7==0) print("$i ")
    }

    for(i in 1..5){
        for(j in 1..5){
            if(i==j) print("diagonal\t") else print("$i$j\t\t")
        }
        println()
        println()
    }

    for(i in 1..5){
        for(j in 1..5){
            print("*  ")
        }
        println()
    }

    for(i in 10 downTo 1 step 2){
        println("Strike ${i}")
    }

    for(i in 10 downTo 1){
        println("Strike ${i}")
    }


    println("Enter year")
    var inputYear = readLine()?:"0"
    var year = inputYear.toInt()

    for(i in 1..12){
        var msg = when(i){
            1 -> "\"january\",31"
            2 -> if(year%4==0) "february 29" else "february 28"
            3 -> "\"march\",31"
            4 -> "\"april\",31"
            5 -> "\"may\",31"
            6 -> "\"june\",31"
            7 -> "\"july\",31"
            8 -> "\"august\",31"
            9 -> "\"september\",31"
            10 -> "\"october\",31"
            11-> "\"november\",31"
            else-> "\"december\",31"
        }
        println(msg)
    }







    var customers = hashMapOf<String,Int>(Pair("Alice",4),Pair("Judy",8),Pair("Anna",6))
    for(customer in customers){
        println("${customer.key} bought ${customer.value}")
    }

    for(customer in customers){
        println(customer)
    }


    var sum=0
    for(i in 1..100){
        sum +=i
    }
    println(sum)

    for(i in 1..10){
        println("Welcome $i")
    }

    var animals = listOf<String>("cow","dog","cat","lion")
    for(animal in animals){
        println("I have $animal")
    }


    var months = listOf<String>("january","february","march","April","may","june","july","august","september","october","november","december")
    for(month in months){
        println("Month $month")
    }


}