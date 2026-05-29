package oop_joshua_ivander_hartawan.week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}

interface StudentDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.80
}

interface MemberDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.85
}

class SafeDiscountCalculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double) = strategy.apply(price)
}