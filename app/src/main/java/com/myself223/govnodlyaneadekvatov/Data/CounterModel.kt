package com.myself223.govnodlyaneadekvatov.Data

data class CounterModel(
    var count : Int = 0

){
fun increment(){
    count++

}
    fun decrement(){
        count--
    }

}