package com.example.basic

fun main(args:Array<String>){
    var name :String?=null
    println(name)


    var catName:String?= "AseemPaul"
    println(catName?.length.toString())
    catName=null
    println(catName?.length.toString())

    var myNum:Int? = 4

    println(myNum?.plus(7))
    println(myNum?.minus(10))
    println(myNum?.times(10))
    println(myNum?.div(10))
    println(myNum?.mod(10))

    var myName:String?="Aseemkanamhai"
    println(myName?.substring(2,7))

    var num:Double?=23.30
    var numToDouble =num?.times(6)
    var toNumFloat=numToDouble?.toFloat()
    println("$toNumFloat")

    var nameOfUser:String?= readLine()?:""
    println(nameOfUser?.length)

    var num1 = readLine()
    var num2=num1?.toDouble()

    num2=num2?.times(7)
    println(num2)
    println(num2?.toString()?.length)


}