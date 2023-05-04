package com.example.basic

fun main(args: Array<String>){
    var count = mapOf(Pair(1,"One"),Pair(2,"Two"),Pair(3,"Three"))
    println(count)
    println(count[3])
    println(count.values)

    var count2 = mapOf<Int,String>()
    println(count2)

    var count3 = hashMapOf(Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"))
    println(count3)
    count3.put(4,"Four")
    println(count3)

    var count4 = hashMapOf(Pair(5,"Five"), Pair(6,"Six"))
    count3.putAll(count4)
    count3.remove(6)
    println(count3)


    var count5 = hashMapOf(Pair(1,"One"),Pair(2,"Two"),Pair(3,"Three"))
    count5.replace(1,"Eak")
    println(count5)

    var count6 = mapOf(Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"))
    println(count6.size)
    println(count6.containsKey(2))
    println(count6.containsKey(10))
    println(count6.containsValue("Ten"))
    println(count6.containsValue("One"))
    println("count6.isEmpty() ${count6.isEmpty()}")
    println("count6.isNotEmpty() ${count6.isNotEmpty()}")

    var count7 = hashMapOf(Pair(1,"un"), Pair(2,"dux"), Pair(3,"trois"))
    println("Two will be translated as ${count7.get(2)}")
    println("Three will be translated as ${count7.get(3)}")
    count7.put(4,"quatre")
    println(count7)

    var customers = hashMapOf(Pair("john",1), Pair("Alice",5), Pair("bob",3))
    println(customers)
    println(customers.containsKey("Alice"))
    var num = customers.get("Alice")
    println(num)
    println(customers.containsKey("Micheal"))

    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 Sept",8884)
    var total:Int? = attendance.get("25 Sept")?:0.plus(attendance.get("26 Sept")?:0)
    println(total)
    println(attendance.contains("22 Sept ${attendance.contains("22 Sept")}"))



}