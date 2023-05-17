package com.example.AdvancedOOps.Inheritance3

import com.example.AdvancedOOps.scopeOfVariable1.Airplane

class Son: Father(){

    override var firstName = "Aseem"

    override fun personName() {
        super.personName()
        println("Having son $firstName $lastName")


    }
}