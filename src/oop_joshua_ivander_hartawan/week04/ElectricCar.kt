package oop_joshua_ivander_hartawan.week04

// 1. ElectricCar menjadi Child dari class Car
class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int // 2. Parameter tambahan batteryCapacity
) : Car(brand, numberOfDoors) { // 2. Constructor chaining ke class Car

    // 3 & 4. Override dengan keyword 'final' agar tidak bisa diubah lagi oleh subclass-nya
    final override fun accelerate() {
        // Tidak memanggil super.accelerate() karena ingin mengubah perilakunya secara murni
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}