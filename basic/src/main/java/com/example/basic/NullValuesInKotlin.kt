package com.example.basic

import kotlin.math.cos

fun main(){

//    var name : String?=null;
//    print(name!!.length)
//
//    var catName:String? =null
//    println(catName?:"No cats")

    var cost =  99.99
    var input= readLine()
    var inputToDouble = input?.toDouble()

    println("Anserw is ${ inputToDouble?.times(cost)}")

//    var input1:String?= readLine()
//    println(input1?:"Hi there")

    var inputNum:Int? = readLine()?.toInt()
    var inputNumMul5 =
    println(inputNum?.times(5))
}