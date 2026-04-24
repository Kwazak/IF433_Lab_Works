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
}


