package com.example.basic


fun main(){
    var myColors= listOf("red","blue","black","yellow","red")
    println(myColors)
    println(myColors.size)
    println(myColors.indexOf("red"))
    println(myColors.contains("red"))
    println(myColors.lastIndexOf("red"))
    var checkColors = listOf<String>("red","blue")
    println(myColors.containsAll(checkColors))


    var myColors2 = listOf<String>()
    println(myColors2)

    var num = listOf(1,2,2,2,3,null);
    println(num[0])
    println(num.get(2))
    println(num.size)

    //ArrayList

    var myColors3 = arrayListOf("red","blue","black","yellow")
    myColors3.add("blue")
    var myColors4= arrayListOf<String>("white","pink")
    myColors3.addAll(myColors4)
    myColors3.remove("red")
    myColors3.removeAll(myColors4)
    myColors3.removeAt(1)
    println(myColors3)

    var animals = listOf<String>("Cat","Dog","cow","Buffallow")
    println(animals)
    println(animals.size)
    println(animals.get(1))

    var customers = arrayListOf<String>("Didu","behenji","Anuradha", "Anu","Kutiya")
    println(customers)
    customers.add("Gullan")
    println(customers)
    customers.remove("Anu")
    println(customers)

    val items = arrayListOf("“laptop”", "“mouse”", "“pen”", "“paper”", "“mug”", "“phone”")
    val removedItems = listOf("“pen”", "“paper”", "“mug”", "“phone”")
    items.removeAll(removedItems)
    println(items)

    var myColors5= arrayListOf<String>("red","blue","green","yellow")
    println(myColors5)
    println(myColors5.size)
    myColors5.set(0,"marron")
    println(myColors5)
    var subColors = myColors5.subList(0,2)
    println(subColors)
    myColors5.clear()
    println(myColors5)

    var winners = listOf<String>("Usain","John","Michael","Alex","Bob")
    println(winners)
    println(winners.indexOf("Michael")+1)

    var availableColor = listOf<String>("red","blue")
    var mendatoryColors = listOf<String>("red","blue","green")
    var status= availableColor.containsAll(mendatoryColors)
    println("${status}")

    var ingredients = arrayListOf<String>("Chicken","Egg","Mozzarella","Peper")
    println(ingredients)
    ingredients.set(ingredients.indexOf("Mozzarella"),"Blue cheese")
    println(ingredients)

    val animals1 = arrayListOf("“lion”", "“zebra”", "“chimp”", "“elephant”")
    println(animals1)
    animals1.add("panda bear")
    println(animals1)
    animals1.remove("“lion”")
    println(animals1)
    var requiredAnimals1 = listOf<String>("“elephant”","girraf")
    println(animals1.containsAll(requiredAnimals1))

}


























