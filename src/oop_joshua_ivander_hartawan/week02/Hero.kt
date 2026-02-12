package oop_joshua_ivander_hartawan.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default Argument sesuai spesifikasi
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        this.hp -= damage
        // Logika Wajib: HP tidak boleh minus
        if (this.hp < 0) {
            this.hp = 0
        }
    }

    fun isAlive(): Boolean {
        return this.hp > 0
    }
}