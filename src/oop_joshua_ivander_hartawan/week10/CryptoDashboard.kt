package oop_joshua_ivander_hartawan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 65000.0))
    coinRepo.add(Coin("ETH", 3500.0))
    coinRepo.add(Coin("USDT", 1.0))
}