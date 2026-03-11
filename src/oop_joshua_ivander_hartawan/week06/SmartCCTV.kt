package oop_joshua_ivander_hartawan.week06

class SmartCCTV (
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable{

    override fun turnOn() {
        println("CCTV $name ON.")
        startRecording()
    }

    override fun turnOff() {
        println("CCTV $name OFF.")
        stopRecording()
    }

    override fun startRecording() {
        println("CCTV... lens $name moving and start recording.")
    }
}