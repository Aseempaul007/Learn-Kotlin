package com.example.objectOrientedProg


fun main(){
    var jet = JetpackKotlin()
    jet.burn(10)
    jet.stop(2)
    jet.stop(2)
    jet.stop(2)
    jet.stop(2)
    println("User's height is ${jet.userHeight}")

}


class JetpackKotlin {

    var userHeight:Int = 0

    fun burn(sec: Int){
        userHeight +=sec
    }

    fun stop(sec: Int){
        if(userHeight>3) userHeight -= sec*3 else userHeight=0
    }


}