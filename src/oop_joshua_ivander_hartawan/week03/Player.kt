package oop_joshua_ivander_hartawan.week03

class Player(val username: String) {
    // Properti private agar tidak bisa diubah langsung dari luar
    private var xp: Int = 0

    // Computed Property untuk Level
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        // Hanya menerima angka positif
        if (amount <= 0) {
            println("Gagal tambah XP: Amount harus lebih dari 0.")
            return
        }

        // Simpan level lama untuk pengecekan level up
        val levelSebelumnya = level

        // Tambahkan XP
        xp += amount
        println("$username mendapatkan $amount XP. (Total XP: $xp)")

        // Cek jika level naik
        if (level > levelSebelumnya) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }

    fun status() {
        println("Player: $username | Level: $level | Total XP: $xp")
    }
}