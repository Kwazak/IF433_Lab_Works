package oop_joshua_ivander_hartawan.week10

class Mathbox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}