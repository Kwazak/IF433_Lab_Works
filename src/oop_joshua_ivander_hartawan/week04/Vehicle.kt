package oop_joshua_ivander_hartawan.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("BEEP BEEP!")
    }
}

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand terbuka dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! MOBIL $brand membunyikan klakson.")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }


}