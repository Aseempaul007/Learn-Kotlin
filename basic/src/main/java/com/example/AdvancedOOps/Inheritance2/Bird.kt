package com.example.AdvancedOOps.Inheritance2

open class Bird {

    open var color ="Orange"
    open var speed =100

    open fun fly(){
        println("A $color bird can fly at $speed kmph")
    }
}