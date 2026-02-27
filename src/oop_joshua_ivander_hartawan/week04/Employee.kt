package oop_joshua_ivander_hartawan.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja dengan gaji dasar $baseSalary.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt() // Bonus 10% dari gaji dasar
    }
}



