package com.example.objectOrientedProg.gettersAndSetters


fun main(){
    var myBank = Bank()
    myBank.amount+=100
    myBank.amount+=100
    myBank.amount+=100
    println(myBank.rating)
    println(myBank.amount)
    println(myBank.rating)

}

class Bank {

    var amount = 0
    get() {
        if(rating>0)
        rating--
        return field
    }
    set(value) {
        field=value
        rating++
    }

    var rating = 0


}