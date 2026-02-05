package oop_001_johnthor.week01

fun main() {
    val radius = 7.0
    val pi = 3.14

    val area: Double = pi * radius * radius

    println("Radius: $radius ,Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) = if (area > 100) "This is a Big circle" else "Tis is a Small circle"



