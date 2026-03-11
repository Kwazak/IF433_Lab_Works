package oop_joshua_ivander_hartawan.week06

//fun processCheckout(method: PaymentMethod, amount: Double) {
//    println("=> Memulai cheakout...")
//    method.pay(amount)
//}

fun main() {
//    //val mywatch = Smartwatch()
//    mywatch.showTime()
//
//    val myPhone = Smartphone()
//    myPhone.turnOn()
//
//    val pay1 = Gopay()
//    val pay2 = CreditCard()
//
//
//    println("\n=== TESTING CHECKOUT ===")
//    processCheckout(method = pay1, amount = 1000000.0)
//    processCheckout(method = pay2, amount = 1900000.0)

    val lampuTamu = SmartLamp("L01", "Lampu Tamu")
    val nestDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val ezvizGarasi = SmartCCTV("C01", "Ezviz Garasi")


    val myHub = SmartHomeHub()
    myHub.addDevice(lampuTamu)
    myHub.addDevice(nestDapur)
    myHub.addDevice(ezvizGarasi)


    myHub.activateSecurityMode()
    myHub.turnOffAllSwitch()


}

