package com.example.objectOrientedProg

object ObjectConstruct{
    var connected = false

    fun connect(){
        connected = true
        println("Database is connected!")
    }

    fun disconnect(){
        connected = false
        println("Database is not connected!")
    }
}

fun main(){
    ObjectConstruct.connect()
}