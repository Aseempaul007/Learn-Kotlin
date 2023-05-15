package com.example.objectOrientedProg.gettersAndSetters


fun main(){
    var bnk = BankInterest()
    bnk.amount = 5
    println(bnk.interest)

}
class BankInterest {
    var interest:Double =0.0
    var amount:Int=0
    get() {
        return field
    }
    set(value) {
        if(value<1000 && value>=10){
            interest=1.0
        }else if(value<10){
            interest=0.5
        }else if(value>1000){
            interest=2.0
        }
        field=value
    }
}