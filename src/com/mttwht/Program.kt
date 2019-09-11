@file:JvmName("DisplayFunctions")

package com.mttwht

fun main(args: Array<String>) {
//    log("Hello, World", logLevel = 2)
//    println(max(1,2))

    val text = "Text with    too much  \t whitespace"
    println(text)
    println(replaceMultipleWhitespace(text))
    println(text.replaceMultipleWhitespaceExt())
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) : Boolean {
    println("$logLevel: $message")
    return true
}

fun max(a: Int, b: Int) : Int = if(a >= b) a else b

fun replaceMultipleWhitespace(value: String): String = Regex("\\s+").replace(value, " ")
fun String.replaceMultipleWhitespaceExt(): String = Regex("\\s+").replace(this, " ")
