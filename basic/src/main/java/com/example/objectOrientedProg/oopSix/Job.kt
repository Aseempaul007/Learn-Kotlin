package com.example.objectOrientedProg.oopSix


fun main(){
    var doctor = Doctor()
    var engineer = Engineer()

    doctor.salary=50000
    engineer.salary=100000

    doctor.revenue=5000
    engineer.revenue=10000

    doctor.study()
    doctor.study()
    doctor.study()

    engineer.revenue
    engineer.revenue
    engineer.revenue

    println(doctor.salary)
    println(engineer.salary)

    println(doctor.revenue)
    println(engineer.revenue)
}
open class Job {

    var name = ""
    var revenue = 0
    var salary =0

    fun work(amount: Int){
        revenue+=amount
    }

    fun study(){
        salary+=10000
    }
}