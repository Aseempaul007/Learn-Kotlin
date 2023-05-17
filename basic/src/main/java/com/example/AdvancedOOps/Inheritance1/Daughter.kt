package com.example.AdvancedOOps.Inheritance1

fun main(){
    var anu = Daughter()
    println(anu.hairColor)
    anu.say("Kya kr rhe")
}

class Daughter:Mom("Hindi") {

    override var hairColor = ""

    override fun say(msg: String) {
        super.say(msg)
    }
}