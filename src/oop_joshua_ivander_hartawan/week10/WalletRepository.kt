package oop_joshua_ivander_hartawan.week10

class WalletRepository<T>{
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }

}