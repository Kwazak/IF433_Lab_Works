package oop_joshua_ivander_hartawan.week04

fun main() {
    val manager = Manager(name = "Joshua", baseSalary = 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    val developer = Developer(name = "Ivander", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}