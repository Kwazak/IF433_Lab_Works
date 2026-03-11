package oop_joshua_ivander_hartawan.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Added ${device.name} to the Smart Home Hub.")
    }

    fun turnOffAllSwitch() {
        println("\n--- Mematikan Seluruh Saklar ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

}