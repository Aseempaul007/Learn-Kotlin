package com.example.basic

fun main(){

/*
Arithmetic operators    +, -, *, /, %
Assignment operators     =, +=, -=, *=, /=, %=
Increment/decrement operators    ++, --
Comparision operators   >, <, >=, <=, ==,
Logical operators  ||, &&, !
*/


    //Arithmetic operators

    var num1 : Int;
    var num2 : Int;
    num1 = 70;
    num2 = 30;

    var sum = num1+num2;
    var sub = num1-num2;
    var mul = num1*num2;
    var div : Float = (num1.toFloat()/num2.toFloat());

    println(sum);
    println(sub);
    println(mul);
    println(div);

    //Assignment operator

    var value = 5;

    value += 5
    var addedValue = value
    println(addedValue)

    value = 5;

    value -= 5
    var subtractedValue = value
    println(subtractedValue)


    value = 5;

    value *= 5
    var multiplieddValue = value
    println(multiplieddValue)


    value = 5;

    value /= 5
    var divideddValue = value
    println(divideddValue)


    //Increment or decrement operators

    var myValue = 20;

    println(myValue++)

    myValue = 20;

    println(myValue--)


    //Comparision operators

    var value1 = 30;

    var value2 = 50;


    if(value1==value2){
        println("$value1 is equal to $value2")
    }else{
        println("$value1 is not equal to $value2")

    }

    if(value1>=value2) {
        println("$value1 is greator than $value2")
    }else{
        println("$value1 is not greator to $value2")

    }

    if(value1<=value2) {
        println("$value1 is less than $value2")
    }else{
        println("$value1 is not less than $value2")
    }



    //Logical operators

    var money = true
    var time = true

    if(money || time){
        println("you can eat food because your money status is $money and time status is $time")
    }













    }