package oop_joshua_ivander_hartawan.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Menggunakan super untuk mengambil bonus standar + 500.000
        return super.calculateBonus() + 500000
    }
}