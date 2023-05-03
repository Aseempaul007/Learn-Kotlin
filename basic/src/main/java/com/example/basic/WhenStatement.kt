package com.example.basic

fun main(){

    println("Please enter yor marks: ")

    var marks : Int = readLine()!!.toInt()

    when(marks){

        100 -> println("Full Marks")
        90 -> println("Marks : $marks")
        80 -> println("Marks : $marks")
        70 -> println("Marks : $marks")
        else -> println("Not specified Marks : $marks")
    }
}