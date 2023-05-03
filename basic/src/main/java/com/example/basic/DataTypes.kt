package com.example.basic

    public fun main(){


/*
Integer types :-
Byte - 8 bits  - 2^3
Short - 16 bits - 2^4
Int - 32 bits - 2^5
Long - 64 bits - 2^6
 */

        var marks1 : Int = 0;
        var marks2 : Int = 0;
        var sum : Int = 0;
        var name : String = "";

        marks1 = 60;
        marks2 = 80;
        sum = marks1+marks2;
        name = "Aseem"
        println("$name total biling amount is $sum after shooping");

/*
Floating types :-
float - 32 bits
Double - 32 bits

 */


        var guessMyType = 67;
        //println(guessMyType::class.java)


        var num = readLine()?:""
        var num2 = 10.50
        var num1=num.toInt()
        var result = num1*num2
        println(result)
        println(result::class.java)

        var type1:Byte =4;
        var type2:Short =4;
        var type3:Int =4;
        var type4:Long =4;
        var type5:Float = 4.0f;
        var type6:Double =4.0;


        println(type1::class.java)
        println(type2::class.java)
        println(type3::class.java)
        println(type4::class.java)
        println(type5::class.java)
        println(type6::class.java)


        var cat= 3
        var cats=cat.toLong()
        println(cats)
        println(cat::class.java)
        println(cats::class.java)

        var pi =3.14
        println(pi::class.java)

        var piToString = pi.toString()
        println(piToString::class.java)

        var input = readLine()?:""

        println(input::class.java)

        var inputToString=input.toString()
        println(inputToString::class.java)

        var inputToInt=input.toInt()
        println(inputToInt::class.java)

        var inputToByte=input.toByte()
        println(inputToByte::class.java)

        var inputToShort=input.toShort()
        println(inputToShort::class.java)

        var inputToLong=input.toLong()
        println(inputToLong::class.java)

        var inputToDouble=input.toDouble()
        println(inputToDouble::class.java)

        var inputToFloat=input.toFloat()
        println(inputToFloat::class.java)

        var myInput = readLine()?:""
        var myFloat = myInput.toFloat()*4.14159
        println(myFloat)
        println(myFloat::class.java)

    }

