package com.example.objectOrientedProg.oopEight



fun main(){
    var s1 = Store()
    var s2 = Store(11)
    var s3 = Store("Freeky T-shirts",200)

    s2.canAfford()

}


class Store {

    var userName = ""
    var balance = 0

    constructor()

    constructor(balance: Int){
        this.balance=balance
    }

    constructor(userName: String, balance: Int){
        this.userName=userName
        this.balance=balance
    }

    fun canAfford(){
        if(balance>20){
            println("You can buy ${balance/20} T-shirts")
        }else{
            println("Sorry! you can't afford T-shirts")
        }
    }
}