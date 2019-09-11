package com.mttwht

fun main(args: Array<String>) {
    display("Hello, World")
    println(max(1,2))
}

fun display(message: String) : Boolean {
    println(message)
    return true
}

fun max(a: Int, b: Int) : Int = if(a >= b) a else b
