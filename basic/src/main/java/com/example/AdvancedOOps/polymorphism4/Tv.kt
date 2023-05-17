package com.example.AdvancedOOps.polymorphism4

class Tv {

    fun channel(){
        println("Default channel")
    }

    fun channel(chnl:String,lan: String){
        println("Tv is playing $chnl in $lan language")
    }

    fun channel(time: Int){
        println("Tv is playing on $time IST")
    }

}

fun main(){
    Tv().channel()
    Tv().channel("Hungama","English")
    Tv().channel(22)
}