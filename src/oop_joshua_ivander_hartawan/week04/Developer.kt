package oop_joshua_ivander_hartawan.week04

// Developer mewarisi Employee
class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String // Property baru khusus Developer
) : Employee(name, baseSalary) {

    // Override work() sesuai instruksi teks spesifik
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak ditulis di sini karena
    // otomatis menggunakan implementasi dari Parent (Employee)
}