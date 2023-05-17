package com.example.AdvancedOOps.scopeOfVariables3

open class FastFood {
    protected fun mySecretFormula(): String{
        return "The formula is Chess"
    }
}

class FastFoodOne: FastFood(){
    fun theSecretFormula(): String{
       return mySecretFormula()
    }
}

fun main(){
    var f1 = FastFoodOne()
    println(f1.theSecretFormula())
}