package oop_joshua_ivander_hartawan.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable : SmartDevice {
    fun turnOn()
    fun turnOff()
}

interface Recordable : SmartDevice {
    fun startRecording() {
        println("Perekaman dimulai")
    }
    fun stopRecording() {
        println("Perekaan dihentikan dan disimpan ke Cloud")
    }

}