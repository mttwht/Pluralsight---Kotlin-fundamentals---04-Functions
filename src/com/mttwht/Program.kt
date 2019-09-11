@file:JvmName("DisplayFunctions")

package com.mttwht

fun main(args: Array<String>) {
    log("Hello, World")
    println(max(1,2))
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) : Boolean {
    println("$logLevel: $message")
    return true
}

fun max(a: Int, b: Int) : Int = if(a >= b) a else b
