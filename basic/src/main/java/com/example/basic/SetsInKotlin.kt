package com.example.basic

fun main(args:Array<String>){
    var colors = setOf<String>("blue","yellow","red","white","peral")
    println(colors)

    val numbers = setOf<Int?>(1,5,3,7,33,89,56,null,null)//can't contain duplicate elements
    println(numbers)

    var numbers2 = setOf<Int>()
    println(numbers2)

    var numbers3 = hashSetOf(1,4,7,9,3,66)
    println(numbers3)
    numbers3.add(33)
    println(numbers3)

    var numbers5 = hashSetOf<Int>(44,0,20,60,66)

    numbers3.addAll(numbers5)
    println(numbers3)

    numbers3.remove(0)
    println(numbers3)

    numbers3.removeAll(numbers5)
    println(numbers3)

    var numbers4 = hashSetOf<Int>()
    println(numbers4)

    var colors2 = hashSetOf<String>()
    colors2.add("red")
    colors2.add("yellow")
    colors2.add("blue")
    println(colors2)
    colors2.remove("blue")
    println(colors2)

    var things = hashSetOf<String>("Speaker","Laptop","Keyboard","mouse")
    var thingsToRemove = hashSetOf("Speaker")
    things.removeAll(thingsToRemove)
    println(things)

    var customers = hashSetOf<String>("jatin","Pritam","Maddy","Carlo")
//    var customer = readLine()?:""
//    customers.add(customer)
    println(customers)
    customers.remove("jatin")
    println(customers)

    var numbers6 = setOf(3,4,null,83,56)
    println(numbers6.size)
    println(numbers6.contains(56))
    println(numbers6.contains(100))

    var haveNumber6 = setOf(3,83)
    println(numbers6.containsAll(haveNumber6))

    var numbers7 = hashSetOf(3,4,null,83,56)
    var newNumbers = hashSetOf(83,345,56)
    numbers7.retainAll(newNumbers)
    println(numbers7)
    numbers7.clear()
    println(numbers7)

    var primeNumbers = setOf(2,3,5,7,11,13,17,19,23,29)
    println(primeNumbers.contains(21))
    println(primeNumbers.contains(13))

    var myDrinks = hashSetOf("water","coke","beer","orange juice")
    var theirDrinks = hashSetOf("water","orange juice","pineapple juice", "milk")
    myDrinks.retainAll(theirDrinks)
    println(myDrinks)


    val acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")
    acceptedColors.retainAll(myColors)
    println(acceptedColors)
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println(acceptedColors)



}