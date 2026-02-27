package oop_joshua_ivander_hartawan.week04

fun main() {
    println("---Testing Vehicle---")
    val generalVehicle = Vehicle(brand = "Joshua")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car---")
    val myCar = Car(brand = "Koenigsseg", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

}