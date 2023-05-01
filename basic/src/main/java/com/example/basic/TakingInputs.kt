package com.example.basic
import kotlin.random.Random;

fun main(args: Array<String>) {
    var yob = readLine()?:""
    var age = 2023-yob.toInt()
    println("Hello $age")

    var randomNumber = Random.nextInt(1,200)
    println(randomNumber)
}