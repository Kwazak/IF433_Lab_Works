package oop_joshua_ivander_hartawan.week03

class Employee (val name: String)   {
    var salary: Int = 0
        set(value) {
           println("Mencoba set gaji ke: $value")
            //kode salah, memanggil setter didalam setter
            this.salary = value
        }

}
