package com.example.basic

fun main(args: Array<String>){

//    A -> 90 to 100
//    B -> 80 to 89
//    C -> 70 to 79
//    D -> 60 to 69
//    E -> 50 to 59
//    F -> everything else

    var inputMarks = readLine()?:"0"
    var mark=inputMarks.toInt()
    var grade = if(mark<=100 && mark>90){
        "Grade A"
    }else if(mark<=90 && mark>=80){
        "Grade B"
    }else if(mark<=80 && mark>=70){
        "Grade C"
    }else if(mark<=70 && mark>=60){
        "Grade D"
    }else if(mark<=60 && mark>=50){
        "Grade E"
    }else{
        "Grade F"
    }
    println(grade)


    var myResponse = 404
    var charArr2 = myResponse.toString().toCharArray()
    var msg2 = if(charArr2.get(0).equals('1')) "Information response" else if(charArr2.get(0).equals('2')) "Success" else if(charArr2.get(0).equals('3')) "Redirect" else if(charArr2.get(0).equals('4')) "Client error" else if(charArr2.get(0).equals('5')) "Server error" else "No response"
    println(msg2)

    var inputNumber = readLine()?:"0"
    var charArr = inputNumber.toCharArray()
    var msg = if(charArr.size==1) "Single digit" else "More than one digit"
    println(msg)


    var animal:String?=null
    animal = "ca"
    var action = if(animal=="dog") "pet it" else if(animal=="cat") "feed  it" else if(animal=="crocodile") "run away" else "google it"
    println(action)



    var number = readLine()?:""
    var num = number.toInt()

    var isEven = if(num?.mod(2)==0) "even number" else "odd number"
    println(isEven)

    val hasEggs = false
    val hasBacon = true
    var total = 0
    if(hasEggs){
        total +=12*5
        println("Buy 12 eggs")
        if(hasBacon){
            total+=(20*2)
            "Buy 2 packets Bacon"
        }
    }
    println(total)


    val timeInput = readLine()?:"0"
    var time = timeInput.toInt()
    if(time<12){
        println("$time AM")
    }else if(time>12){
        println("${time-12} PM")
    }else{
        println("$time PM")
    }



    var keyInput = readLine()
    var hasKey = keyInput.toBoolean()
    if(hasKey){
        println("Car starts!")
    }else{
        var ask = readLine()
        if(ask.equals("yes") || ask.equals("Yes") || ask.equals("YES")){
            println("Car starts!")
        }else{
            println("Car can't starts!")
        }
    }


    var petStore = listOf<String>("cat","dog","rabbit")
    var hasCatFood = true

        if(petStore.contains("cat")){
            if(hasCatFood){
                println("Buy cat and cat food")
            }else{
                println("Buy cat")
            }
        }else{
            println("Ask pet store to get cat")
        }

    var clientFunds = readLine()?:""
    var fund = clientFunds.toInt()
    var price = 50
    var clientProducts=0

    if(fund>price){
        clientProducts++
        fund=fund-price
        println(fund)
    }else{
        println("Insufficient balance")
    }


    var night = readLine()
    var value = night.toBoolean()
    if(value==true){
        println("Sleep")
    }else{
        println("Be active")
    }





}