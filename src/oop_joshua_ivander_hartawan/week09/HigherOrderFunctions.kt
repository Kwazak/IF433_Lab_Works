package oop_joshua_ivander_hartawan.week09

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("OriginalData: $numbers")
    println("\n=== HOF: FILTER ===")

    val evens = numbers.filter { it % 2 == 0 }
    println("evens only: $evens")
}