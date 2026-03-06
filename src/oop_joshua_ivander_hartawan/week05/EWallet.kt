package oop_joshua_ivander_hartawan.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar Rp$amount sukses. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Pembayaran gagal: Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up sukses! Saldo sekarang: Rp$balance")
    }
}