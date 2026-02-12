package oop_joshua_ivander_hartawan.week02

import oop_joshua_ivander_hartawan.week02.Loan

fun main() {
    // Contoh 1: Menggunakan default argument (durasi jadi 1 hari)
    val pinjam1 = Loan("Laskar Pelangi", "Joshua")
    println("Denda ${pinjam1.bookTitle}: Rp ${pinjam1.calculateFine()}")

    // Contoh 2: Durasi lebih dari 3 hari

    val pinjam2 = Loan("Kotlin Dasar", "Ivander", 5)
    println("Denda ${pinjam2.bookTitle}: Rp ${pinjam2.calculateFine()}")
    // Output: (5-3) * 2000 = 4000
}