package com.example.AdvancedOOps.scopeOfVariable2

class EncriptionLock(private var key: Int) {

    fun unLock(publicKey: Int): Boolean{
        if(publicKey*10==key){
            return true
        }
        return false
    }

}

fun main(){
    var eL = EncriptionLock(150)
    println(eL.unLock(15))
}