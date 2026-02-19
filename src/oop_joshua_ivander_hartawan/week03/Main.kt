package oop_joshua_ivander_hartawan.week03

fun main() {
    // 1. Membuat objek Weapon
    val myWeapon = Weapon("Golden Jade Cutter ")

    println("--- Testing Damage Negatif ---")
    // Mencoba set damage ke -50 (Harus gagal & nilai tetap 0 karena nilai awal 0)
    myWeapon.dmg = -50
    println("Current Damage: ${myWeapon.dmg}")

    println("\n--- Testing Damage Overpowered ---")
    // Mencoba set damage ke 9999 (Harus dipaksa menjadi 1000)
    myWeapon.dmg = 9999
    println("Current Damage: ${myWeapon.dmg}")

    println("\n--- Final Status ---")
    // Print Tier-nya (Akan otomatis menghitung berdasarkan damage 1000)
    println("Weapon Name : ${myWeapon.name}")
    println("Final Damage: ${myWeapon.dmg}")
    println("Weapon Tier : ${myWeapon.tier}")
}