package com.mttwht

fun main(args: Array<String>) {
    val h1 = Header("H1")
    val h2 = Header("H2")

    var h3 = h1 plus h2
    println(h3)

    var h4 = h1 + h2
    println(h4)
}

class Header(var Name: String) {}

infix operator fun Header.plus(other: Header): Header {
    return Header(this.Name + other.Name)
}