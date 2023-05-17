package com.example.AdvancedOOps.abstract2

abstract class Dog {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug: Dog(){

    override fun run(){
        println("Pug can run")
    }

    override fun bark(){
        println("Pug can't bark")
    }

    override fun play(){
        println("Pug can play")
    }

}

class Basset: Dog(){
    override fun run() {
        println("Basset can't run")
    }

    override fun bark() {
        println("Basset can bark")
    }

    override fun play() {
        println("Basset can play")
    }

}

class OldChihuahua: Dog(){

    override fun run() {
        println("Basset can run")
    }

    override fun bark() {
        println("Basset can bark")
    }

    override fun play() {
        println("Basset can't play")
    }

}

fun main(){

    var dog1 = Pug()
    var dog2 = Basset()
    var dog3 = OldChihuahua()

    dog1.bark()
    dog1.run()
    dog1.play()

    dog2.bark()
    dog2.run()
    dog2.play()

    dog3.bark()
    dog3.run()
    dog3.play()


}