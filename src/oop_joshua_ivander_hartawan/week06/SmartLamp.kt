package oop_joshua_ivander_hartawan.week06

class SmartLamp (
    override val id: String,
    override val name: String,

) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name dinyalakan. Cahaya putih terang")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan. Cahaya padam")
    }
}