package oop_joshua_ivander_hartawan.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota" +
    "Tidak Diketahui"

    println("Tujuan pengitiman: $destination")
}