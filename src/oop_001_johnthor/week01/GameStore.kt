package oop_001_johnthor.week01

fun main() {
    val gameTitle: String = "Red Dead Redemption 2"
    val price: Int = 400000
    println("Nama: $gameTitle, Harga: $price")

    val hasil = calculateDiscount(price)
    println("Harga Setelah Diskon: $hasil")
    printReceipt(
        title = "Struk Belanja Toko Game Death Note",
        finalPrice = hasil,
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 80 / 100 else price * 90 / 100
fun printReceipt(title: String, finalPrice: Int) {
    println("=== $title ===")
    println("Total Harga: Rp $finalPrice")

}