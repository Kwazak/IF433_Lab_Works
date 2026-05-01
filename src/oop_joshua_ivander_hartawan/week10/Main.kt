package oop_joshua_ivander_hartawan.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(180)
    val stringBox = Box("Generic in Kotlin")

    println("isi intBox: ${intBox.value}")
    println("isi stringBox: ${stringBox.value}")

    println("\n === TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Asset: ${itemPrice.key}, Price: ${itemPrice.value} USD")it

}