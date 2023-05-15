package com.example.objectOrientedProg

fun main(){

    var myMath = Math()
    println(myMath.add(30.5,20.5))
    println(myMath.sub(30.5,20.5))
    println(myMath.mul(30.5,20.5))
    println(myMath.div(30.5,20.5))

}


class Math {

    fun add(num1: Double, num2: Double): Double{
        return num1+num2
    }

    fun sub(num1: Double, num2: Double): Double{
        return num1-num2
    }

    fun mul(num1: Double, num2: Double): Double{
        return num1*num2
    }

    fun div(num1: Double, num2: Double): Double{
        return num1/num2
    }
}