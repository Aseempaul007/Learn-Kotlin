package com.example.basic

fun main(){
    greetings("Aseem Paul")

    sum(66,55)


}

fun greetings(name:String){
    println("Hello! $name")
}

fun sum(a:Int,b:Int){
    var c = a+b;
    println("Sum of $a and $b is equal to $c")
}

fun diffByFive(num:Int):Int{
    return num-5
}

fun doubleNum(num:Int):Int{
    return num+num;
}



