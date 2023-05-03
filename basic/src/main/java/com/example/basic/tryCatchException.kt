package com.example.basic

fun main(args: Array<String>){
    var input = readLine()

    try {
        input?.toInt()
    }catch (e: Exception){
        println(e.localizedMessage)
    }finally {
        println("Try/catch block completed!")
    }

    var input3 = readLine()?.toInt()

    try{
        println(input3?.times(5))
    }catch(e: Exception){
        println(e.localizedMessage)
    }finally {
        println("Operation performed")
    }

    var input4: String? = readLine()

    try{
        var input4ToInt = input4?.toInt()
        println(input4ToInt?.times(10))
    }catch (e: Exception){
        println(e.message)
    }finally {
        println("Addition Operation performed")
    }

    var input5 = readLine()

    try {
        var input5ToInt = input5?.toInt()
        var result5 = input5ToInt?.times(0.62)
        println(result5)
    }catch (e: Exception){
        println("Wrong input")
        e.printStackTrace()
    }

    var input6 = readLine()
    var quantity = readLine()
    var price = 9.99

    try {
        var quantityToInt = quantity?.toInt()
        var res = quantityToInt?.times(price)
        println("${res}")
    }catch (e : Exception){
        println("Wrong values provided")
        e.printStackTrace()
    }


    var input2 = readLine()
    throw java.lang.IllegalStateException("I don't like \n this")




}