package com.example.basic

fun main(args: Array<String>){
    var year = 2015
    println(year)
    println(scope())

    var parakeets = 5
    buyMoreParakeets(parakeets)
    println("You now have $parakeets parakeets")
}

fun scope(){
    var year = 1985
    println(year)
}

fun buyMoreParakeets(parakeets: Int) {
    val parakeets = 3
}
































