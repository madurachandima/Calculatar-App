package com.example.calculatar

sealed class CalculatorOperations(val symbol:String){
    object Add:CalculatorOperations("+")
    object Subtract:CalculatorOperations("-")
    object Multiply:CalculatorOperations("x")
    object Divide:CalculatorOperations("/")


}
