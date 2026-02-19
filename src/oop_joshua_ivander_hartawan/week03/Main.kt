package oop_joshua_ivander_hartawan.week03

fun main() {
    // 1. Membuat objek Weapon
    val myWeapon = Weapon("Golden Jade Cutter ")
    val player = Player("Joshua")

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

    println("--- Menambah 50 XP ---")
    player.addXp(50) // Level harusnya tetap 1 (XP 50 < 100)

    println("\n--- Menambah 60 XP ---")
    player.addXp(60) // Total XP jadi 110, harus muncul pesan "Level Up" ke level 2

}