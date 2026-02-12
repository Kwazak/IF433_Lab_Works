package oop_joshua_ivander_hartawan.week02

import oop_joshua_ivander_hartawan.week02.Hero


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- PEMBUATAN HERO ---")
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val damage = scanner.nextInt()

    // Membuat objek Hero
    val myHero = Hero(name, damage)

    // Variabel bantuan untuk Musuh
    var enemyHp = 100
    val enemyName = "Orc"

    println("\n=== PERTARUNGAN DIMULAI: ${myHero.name} vs $enemyName ===")

    // Loop selama Hero hidup DAN Musuh hidup
    while (myHero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero menyerang
            myHero.attack(enemyName)
            enemyHp -= myHero.baseDamage
            println("HP $enemyName sisa: $enemyHp")

            // Jika musuh masih hidup, dia membalas
            if (enemyHp > 0) {
                val randomDamage = (10..20).random()
                println("$enemyName menyerang balik sebesar $randomDamage damage!")
                myHero.takeDamage(randomDamage)
                println("HP ${myHero.name} sisa: ${myHero.hp}")
            }
        } else if (choice == 2) {
            println("${myHero.name} memilih kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    // Pengumuman Pemenang
    println("\n--- HASIL AKHIR ---")
    if (!myHero.isAlive()) {
        println("GAME OVER! ${myHero.name} telah gugur.")
    } else if (enemyHp <= 0) {
        println("VICTORY! $enemyName berhasil dikalahkan.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Kabur).")
    }
}