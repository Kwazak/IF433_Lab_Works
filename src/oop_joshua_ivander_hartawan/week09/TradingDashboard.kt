package oop_joshua_ivander_hartawan.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 5, 12.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 3, -8.3, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 10, 25.7, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 2, 5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 8, -15.4, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 4, 18.9, "OPEN")
    )

    println("=== TRADE HISTORY ===")
    tradeHistory.forEach { println(it) }

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    println("\n=== CLOSED TRADES ===")
    closedTrades.forEach { println(it) }

    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    println("\n=== WINNING TRADES ===")
    winningTrades.forEach { println(it) }

    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    println("\n=== LOSING TRADES ===")
    losingTrades.forEach { println(it) }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("\n=== TOP PERFORMERS ===")
    topPerformersString.forEach { println(it) }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("\n=== WORST PERFORMERS ===")
    worstPerformersString.forEach { println(it) }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("\n=== UNIQUE TRADING PAIRS ===")
    uniquePairs.forEach { println(it) }
}



