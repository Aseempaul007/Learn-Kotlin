package com.example.basic

const val DEVELOPER_NAME="Aseem PAUL"

fun main(args : Array<String>){

    val petName = "Crocodile"
    var pet = "My pet name is \"Fluffy\""
    println(petName.length)
    println(petName.uppercase())
    println(petName.get(5).uppercase())
    println(petName.substring(2,5))
    println("I have ${1.4+1.6} $petName")
    println(pet)
    println(pet.length)

    val client = "Mary"
    val products = 3
    val price = 30

    println("$client has to pay ${products*price} buks");

    println(DEVELOPER_NAME);

}