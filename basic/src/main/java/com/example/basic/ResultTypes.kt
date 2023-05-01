package com.example.basic

fun main(args:Array<String>){
    var numFloat:Float=33.333f
    var numLong:Long=66554

    var res = numFloat*numLong

    println(res)
    println(res::class.java)

    var myNum = 10;
    myNum+=10;
    println(myNum)

    myNum-=10;
    println(myNum)
    myNum*=10;
    println(myNum)
    myNum/=10;
    println(myNum)
    myNum%=10;
    println(myNum)

    var a = 76.254
    var b = 3.867

    println("Addition is ${a + b}")
    println("Subtraction is ${a - b}")
    println("Multiplication is ${a * b}")
    println("Division is ${a / b}")
    println("Modulus is ${a % b}")

    var price = 29.99
    var portion = 1f/3f
    var amount = price*portion
    println("Person has to spend ${amount}")

}