package oop_joshua_ivander_hartawan.week03

fun main() {
    val e = Employee("Joshua")

    e.salary = -100000
    e.salary = 10000000
    println("Gaji ${e.salary}")




    println("Pajak yang harus dibayar: ${e.tax}")
}