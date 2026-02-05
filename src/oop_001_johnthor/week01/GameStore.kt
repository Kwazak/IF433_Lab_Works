package oop_001_johnthor.week01

fun main() {
    val gameTitle: String = "Red Dead Redemption 2"
    val price: Int = 400000
    println("Nama: $gameTitle, Harga: $price")
    println("Harga Seteah Diskon: ${calculateDiscount(price)}" )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 80 / 100 else price * 90 / 100