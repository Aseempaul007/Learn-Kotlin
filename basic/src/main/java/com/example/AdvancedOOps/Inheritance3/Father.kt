package com.example.AdvancedOOps.Inheritance3

open class Father {

    open var firstName = "Suadarsan Kumar"
    open var lastName= "Paul"

    open fun personName(){
        println("My Father's name is $firstName $lastName")
    }
}