package oop_joshua_ivander_hartawan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}