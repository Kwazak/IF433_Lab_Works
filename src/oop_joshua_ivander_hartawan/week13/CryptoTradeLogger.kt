package oop_joshua_ivander_hartawan.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

// Serialization (TradeRecord -> CSV)
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"
// Deserialization (CSV -> TradeRecord)
//fun fromCsvTrade(line: String): TradeRecord? {
//    val parts = line.split(",")
//    return TradeRecord(
//        id = parts[0].toInt(),
//        symbol = parts[1],
//        type = parts[2],
//        margin = parts[3].toDouble(),
//        pnl = parts[4].toDouble()
//    )

// Deserialization (CSV -> TradeRecord) dengan Error Handling
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    // Inisialisasi data trade simulasi
    val trades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 1000.0, pnl = 150.0),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 500.0, pnl = -25.0),
        TradeRecord(id = 3, symbol = "BNBUSDT", type = "Long", margin = 750.0, pnl = 89.5)
    )

    // Simpan ke file CSV
    saveTrades(trades, "crypto_trades.csv")
    println("Trade records disimpan ke crypto_trades.csv")

    // Inject malformed data untuk testing
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Malformed data injected untuk testing robustness")

    // Load dan hitung total PnL
    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== LOADED TRADES ===")
    loadedData.forEach { println(it) }
    println("\nTotal PnL: $totalPnl")
}