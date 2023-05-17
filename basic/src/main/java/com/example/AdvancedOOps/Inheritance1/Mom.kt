package com.example.AdvancedOOps.Inheritance1

open class Mom(nativeTounge :String) {

    open var hairColor = "brown"
    var eyeColor = "blue"

    open fun say(msg: String){
        println("Mom says $msg")
    }


}