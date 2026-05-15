package oop_joshua_ivander_hartawan.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42x".toInt()
    }
    val safevalue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safevalue")

    val recovered = result.recover {0}.getOrNull()
    println("Recovered Value: $recovered")

}