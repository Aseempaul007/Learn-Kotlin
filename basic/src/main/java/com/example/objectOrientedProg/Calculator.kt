package com.example.objectOrientedProg


fun main(){
    var cal = Calculator()
    println(cal.total)
    cal.add(20)
    cal.add(20)
    println(cal.total)
    cal.sub(10)
    println(cal.total)
    cal.mul(10)
    println(cal.total)
    cal.div(10)
    println(cal.total)
    cal.reset()
    println(cal.total)

}

class Calculator {

    var total = 0

    fun add(num: Int){
        total+=num
    }
    fun sub(num: Int){
        total-=num
    }
    fun mul(num: Int){
        total*=num
    }
    fun div(num: Int){
        total/=num
    }
    fun reset(){
        total=0
    }


}