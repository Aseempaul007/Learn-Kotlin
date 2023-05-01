package com.example.basic

fun main(){

    var name : String?=null;

    print(name!!.length)

    var catName:String? ="Pussy"

    println(catName?:"No cats")
}