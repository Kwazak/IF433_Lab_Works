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

    println("\n---Testing ElectricCar---")
    val myEV = ElectricCar("Tesla Model 3", 4, 90)
    myEV.accelerate()
    myEV.honk() // Ini akan mengambil suara "TIN TIN!" dari class Car

}