package com.example.basic

fun main(args: Array<String>){

    greetUsers("Aseem","Anu","Didu","Bullu","","pankaj")

    println(bankBalance(mapOf<String,Int>(Pair("Aseem",50000),Pair("Anuradha",100000),Pair("Sudarsan",20000))))

    listAnimals()

    greetings(5,"aseem","anu","bullu")

    findSum(2,6,44,9)
    findSum(2,6,44,9,10,10,2,3,4,5,6)
    findSum(2,6,44,9)

    sayHello("Aseem","Anu","Budd")

    var year = 2015
    println(year)
    println(scope())

    var parakeets = 5
    buyMoreParakeets(parakeets)
    println("You now have $parakeets parakeets")


}



fun greetUsers(vararg nameOfUser: String){
    for(user in nameOfUser){
        if(user.equals("")) return else println("Hi there! $user")

    }
}

fun bankBalance(users: Map<String,Int>){
    fun doubleBalance(salary: Int): Int{
        return salary*2
    }
    for(user in users){
        println(doubleBalance(user.value))
    }
}

fun listAnimals(){
    fun listOneAnimal(animal: String){
        println("I have a $animal")
    }
    val myAnimals = arrayListOf("cat","dog","cow")
    for(animal in myAnimals){
        listOneAnimal(animal)
    }
}

fun greetings(count: Int, vararg names: String){
    for(i in 1..count){
        for(name in names){
            println("Hello $name")
        }
    }
}

fun findSum(vararg nums: Int){
    var sum = 0
    for(num in nums){
        sum+=num
    }
        println(sum)
}

fun sayHello(vararg namess: String){
    for(name in namess)
    println("Hello $name")
}
fun scope(){
    var year = 1985
    println(year)
}

fun buyMoreParakeets(parakeets: Int) {
    val parakeets = 3
}
































