package oop_joshua_ivander_hartawan.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar Rp$amount sukses. Limit terpakai: Rp$usedAmount")
        } else {
            println("[$accountName] Pembayaran ditolak: Melebihi limit kartu.")
        }
    }
}