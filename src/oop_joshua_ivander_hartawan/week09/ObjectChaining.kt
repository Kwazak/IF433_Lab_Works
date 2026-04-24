package oop_joshua_ivander_hartawan.week09

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Alice", 3.5),
        Student("Bob", 3.8),
        Student("Charlie", 3.2),
        Student("David", 3.9)
    )

}
