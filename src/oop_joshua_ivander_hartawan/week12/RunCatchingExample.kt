package oop_joshua_ivander_hartawan.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42x".toInt()
    }
}