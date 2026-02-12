package oop_joshua_ivander_hartawan.week02

class Student (
    val name: String,
    val nim: String,
    val major: String
){
    init{
        if (nim.length != 5) {
            println("WARNINGl Objek tercipta dengan NIM ($nim) yang tidak valid")
            println("Data Mahasiswa $name mungkin akan bermasalah di sistem")

        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory")
        }
    }
    // Otomatis mewarisi gpa = 0.0 karena delegasi this() hanya mengirim 3 argumen
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}