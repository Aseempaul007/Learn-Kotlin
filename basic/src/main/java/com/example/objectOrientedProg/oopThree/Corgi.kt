package com.example.objectOrientedProg.oopThree

fun main(){
    var corgi = Corgi()
    corgi.size=10
    corgi.bar()
    corgi.play()
}

class Corgi : Dog() {

}