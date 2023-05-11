package com.example.basic

import kotlin.math.roundToInt

fun main(){

    println(multiply(10))
    multiply(10.0)
    println(multiply(10,10))
    var nums = arrayListOf(2,5,9,11,45,78,90)
    println(multiply(nums))

    var people = arrayListOf("Aseem","Anu","Bullu","Didu")
    sayHello(people)
    sayHello("Rana")

    var animals = arrayListOf("dog","cat","crocodile")
    feeding("Monkey")
    feeding(animals)

    myLength("Aseem")
    myLength(4567)

    var priceOfProducts = hashMapOf<String,Int>()
    priceOfProducts.put("jeans",120)
    priceOfProducts.put("pant",100)
    priceOfProducts.put("top",50)

    calculatePrice("makup",15)
    calculatePrice(priceOfProducts)

}

fun calculatePrice(name: String, price: Int){
    println("price of product $name is ${price*1.2}")
}

fun calculatePrice(prices: HashMap<String,Int>){
    for(price in prices){
        println("price of product ${price.key} is ${price.value*1.2}")
    }
}

fun myLength(wrd : String) = println(wrd.length)
fun myLength(wrd : Int)= println(wrd.toString().length)



fun feeding(animal :String)= println("Feed $animal")

fun feeding(animals: Collection<String>){
    for(animal in animals){
        var msg = when(animal){
            "cat" -> "Feed the $animal"
            "dog" -> "Pet the $animal"
            else -> "Run from $animal"
        }
        println(msg)
    }
}

fun sayHello1(person: String) = println("Hello $person")
fun sayHello1(persons: Collection<String>) {
    for(person in persons){
        println("hello $person")
    }
}
fun multiply(num: Int) = num*2

fun multiply(num: Double) = num*num

fun multiply(num:Int,mul: Int) = num*mul

fun multiply(digits: Collection<Int>):Int{
    var mul=1
    for(digit in digits){
        mul*=digit
    }
    return mul
}

fun lifeOfAnimals(animalName: String):Int{
    var value = when(animalName){
        "cats" -> 15
        "dogs" -> 10
        "rabbit" -> 12
         else -> 20
    }
    return value
}

fun tax(price : Double) = price+(price*0.2)

fun add(num1:Int, num2: Int) = num1+num2
fun calArea(num: Int) = Math.PI*num*num

fun myGreetings(name: String): String{
    var msg = when(name){
        "Aseem" -> "Marega $name"
        "Anu" -> "Kya krri $name"
        else -> "Kya hal chal $name"
    }
    return msg
}

fun calculatedArea(radius: Int): Double{
    return Math.PI*radius*radius;
}

fun myDouble(num: Int, msg: String="My default value" ){
    println("My int is $num and my double is $msg")
}

fun sayHello(people: Collection<String>){
    for(person in people){
        println("Hello $person")
    }
}

fun doubleValue(num: Int){
    println("double of the num $num is ${num*2}")

}

fun birthday(){
    var name = readLine()?:""
    var inpAge = readLine()?:"0"
    var age = inpAge.toInt()

    println("Happy bithday $name. You are now $age")
}

fun myFun(){
    var inp = readLine()?:"0"
    var num = inp.toInt()*17
    println(num)
}
fun printHello(){
    println("Hello")
}

fun sayHello(name: String){
    println("Hello $name")
}

fun greetings(name:String){
    println("Hello! $name")
}

fun sum(a:Int,b:Int){
    var c = a+b;
    println("Sum of $a and $b is equal to $c")
}

fun diffByFive(num:Int):Int{
    return num-5
}

fun doubleNum(num:Int):Int{
    return num+num;
}



