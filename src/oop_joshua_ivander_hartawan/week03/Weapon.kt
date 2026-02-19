package oop_joshua_ivander_hartawan.week03

class Weapon(val name: String) { // 'name' sudah Read-only karena menggunakan 'val'
    var dmg: Int = 0
        set(value) {
            if (value < 0) {
                // Aturan: Jangan ubah nilai asli (field tetap yang lama)
                println("ERROR: Damage tidak boleh negatif! Nilai tetap: $field")
            } else if (value > 1000) {
                // Aturan: Paksa menjadi 1000 jika > 1000
                println("WARNING: $name Overpowered! Damage dipaksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Properti Tier (Computed Property)
    val tier: String
        get() {
            return when {
                dmg > 800 -> "Legendary"
                dmg > 500 -> "Epic"
                else -> "Common"
            }
        }

    fun printStatus() {
        println("Weapon: $name | Damage: $dmg | Tier: $tier")
    }
}