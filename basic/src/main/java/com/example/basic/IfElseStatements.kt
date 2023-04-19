package com.example.basic

fun main(){

    println("Please enter yor marks: ")
    var marks : Int? = readLine()?.toInt();

    var myValue : String = if(marks!! >90){
        "Grade : A"
    }else if (marks!!>80){
        "Grade : B"
    }else if (marks!!>70){
        "Grade : C"
    }else if (marks!!>60){
        "Grade : D"
    }else if (marks!!>50){
        "Grade : E"
    }else{
        "Fail"
    }

    println(myValue)
}