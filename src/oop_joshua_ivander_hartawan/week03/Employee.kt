package oop_joshua_ivander_hartawan.week03

class Employee (val name: String)   {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif. Nilai gaji di-set 0")
                field = 0
            } else {
                field = value
            }
        }
}
