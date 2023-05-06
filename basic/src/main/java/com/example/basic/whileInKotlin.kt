package com.example.basic

fun main(args: Array<String>){


    var inputnum = readLine()?:"0"
    var num = inputnum.toInt()
    var fact=1
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