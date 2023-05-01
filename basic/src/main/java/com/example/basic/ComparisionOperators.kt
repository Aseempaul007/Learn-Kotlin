package com.example.basic

fun main(args : Array<String>){
    println(5>6)
    println(5<6)
    println(5<=6)
    println(5>=6)
    println(5==6)
    println(5!=6)


    println("is 5.374 * 9.5874 > 3.237 * 15.3726-> ${5.374 * 9.5874 > 3.237 * 15.3726}")

    println((true&&false) || (true||false))
    println(!((3>=3) && (false||(2<5))))

    var toys =2
    var brokenToys=1
    println("he will get new toy: ${(toys < 5) && (toys-brokenToys <toys )}")

    var totalCows =3
    var milkCow=1
    var familyMember =3
    println("Farmer gets funding :${((totalCows <= 5) && (milkCow>=0)) || (familyMember>=3)}")
}