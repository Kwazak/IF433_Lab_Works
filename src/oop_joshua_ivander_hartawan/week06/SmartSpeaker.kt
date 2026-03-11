package oop_joshua_ivander_hartawan.week06

class SmartLamp (
    override val id: String,
    override val name: String,

    ) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name standby, menunggu perintah suara.")
    }

    override fun turnOff() {
        println("Lampu $name offline")
    }

    fun playMusic(song: String) {
        println("Memutar lagu dari Spotify melalui $name.")
    }
}