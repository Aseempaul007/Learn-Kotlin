package com.example.basic

fun main(args: Array<String>){

    var usernames = hashSetOf("john", "bob", "alice")
    var exist = true
    do {
        var inputUserName = readLine()?:""
        if(!usernames.contains(inputUserName)){
            exist=false
            usernames.add(inputUserName)
        }
    }while (exist)

    println(usernames)



    do{
        var inputNum3 = readLine()?:"0"
        var num3 = inputNum3.toInt()
        var fact=1L
        while(num3!=0){
            fact*=num3
            num3--
        }
        println(fact)
    }while (fact<3000)


    do {
        var inputNum3 = readLine()?:"0"
        var num3 = inputNum3.toInt()
    }while (num3<=100)

    var i2=0
    var j2=0

    while (i2<10){
        while (j2<10){
            print("$i2$j2 ")
            j2++
        }
        println()
        i2++
        j2=0
    }

    var inputnum1 = readLine()?:"0"
    var num1 = inputnum1.toInt()
    while (num1>=0){
        if(num1%7==0) println(num1)
        num1--
    }

    var inputnum = readLine()?:"0"
    var num = inputnum.toInt()
    var fact=1L
    while (num!=0){
        fact*=num
        num--
    }
    println(fact)

    var cats = listOf<String>("Tigger","Smoky","Sassy","Patch","Sammy")
    var j = cats.size-1
    while (j>=0){
        println("Hello ${cats.get(j)}")
        j--
    }

    var i=0
    while(i<10){
        println("Hello ${i + 1}")
        i++
    }

    var puzzlePieces = 20
    var piecesPlaced =0

    while(puzzlePieces>piecesPlaced){
        println(" Pieces left : $puzzlePieces")
        puzzlePieces--
    }
}