package oop_joshua_ivander_hartawan.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectBluetooth() {
        println("Mencari perangkat hp disekitar untuk pairing.")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}