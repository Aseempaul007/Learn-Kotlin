package com.example.objectOrientedProg.oopSeven


fun main(){
    var t1 = Table()
    var t2 = Table(10)
    var t3 = Table(10,550)

    t1.tableInfo()
    t2.tableInfo()
    t3.tableInfo()


}


class Table {

    var legs=0
    var height=0

    constructor(){
        legs=4
        height=150
    }

    constructor(legs: Int){
        this.legs=legs
    }

    constructor(height: Int,legs: Int){
        this.height=height
        this.legs=legs
    }

    fun tableInfo(){
        println("Table has height $height cm an legs : $legs")
    }

}