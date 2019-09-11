package com.mttwht

import java.math.BigInteger

fun main(args: Array<String>) {
    var i = fib(10000, BigInteger("1"), BigInteger("0"))
    println(i)
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger) : BigInteger {
    return if(n==0) b else fib(n-1, a+b, a)
}
