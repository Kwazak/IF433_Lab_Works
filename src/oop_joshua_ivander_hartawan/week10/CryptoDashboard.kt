package oop_joshua_ivander_hartawan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 65000.0))
    coinRepo.add(Coin("ETH", 3500.0))
    coinRepo.add(Coin("USDT", 1.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Price: $${coin.balance}")
    }

    val txRepo = WalletRepository< Transactions>()
    txRepo.add(Transactions("TX001", 0.5))
    txRepo.add(Transactions("TX002", 1.2))

    println("\n--- Transaction Logs ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}