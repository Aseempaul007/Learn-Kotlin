package com.example.basic

fun main(){

//    lambdaFun1(arrayListOf("Aseem","Anu","Didu","Bullu")) {name: String -> println("Hello $name") }
//
//    println(lambdaFun2(arrayListOf(3,6,88,56,44,7)){ nums: Int -> nums/10})
//
//    println(lambdaFun3(arrayListOf("aseem","bob","deepak","Elly","Himanshu","zahida")){name: String -> "Welcome ${name}! How are you"})

    var mynames = listOf("Aseem","ahhhab","Anu","Didu","Bullu","Anuradha","Gullusuuu")

    var randomInts = listOf<Int>(2,4,5,6,7,8,9,22,45,65,84,99)

    var randomInts2 = listOf<Int>(2,4,5,6,7,8,9,22,45,65,84,99,234,475,535,796,967)

//    mynames.forEach{ println("Hello $it") }
//    mynames.filter { it.length<5 }.forEach { println("Hello hi $it") }
//    var myNamesMap = mynames.map { it.length }
//    var sortMaps = mynames.sortedBy { it.length }
//    var maxLen = mynames.maxBy { it.length }
//    var minLen = mynames.minBy { it.length }
//    var doubleInts = randomInts.filter { (it / 10) != 0 }.forEach{ println(it) }
//
//    var sortedMyNames = mynames.sortedBy { it.get(it.length-1) }
//    println(sortedMyNames)
//
//    println(randomInts2.maxBy { it.toString().get(1).toInt() })
//

    var arrangedMaps = randomInts2.map {
        if(it%2==0)
            it/2
        else
            it*2
    }.filter { it>25 }

    println(arrangedMaps)


}




fun lambdaFun3(names: ArrayList<String>, personalMsg: (String)-> String): ArrayList<String>{
    for(i in 0..names.size-1){
        if(names[0].startsWith("a" )|| names[0].startsWith("b" )|| names[0].startsWith("c" )){
            names[i]=personalMsg(names[i])

        }else if(names[0].startsWith("d" )|| names[0].startsWith("e" )|| names[0].startsWith("f" )){
            names[i]=personalMsg(names[i])

        }else if(names[0].startsWith("i" )|| names[0].startsWith("j" )|| names[0].startsWith("k" )){
            names[i]=personalMsg(names[i])

        }else{
            names[i]=personalMsg(names[i])
        }
    }
    return names
}


fun lambdaFun2(nums: ArrayList<Int>,divByTen: (Int)-> Int): Collection<Int>{
    for(i in 0..nums.size-1){
        if(nums[i]%2==0){
            nums[i]=divByTen(nums[i])
        }
    }
    return nums
}



fun lambdaFun1(names: Collection<String>, goPerform: (String)->Unit){
    for(name in names){
        goPerform(name)
    }
}


