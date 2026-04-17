package oop_joshua_ivander_hartawan.week08

sealed class Product(
    open val id: String,
    open val name: String
)

data class Electronic(
    override val id: String,
    override val name: String,
    val warrantyMonths: Int
) : Product(id, name)

data class Clothing(
    override val id: String,
    override val name: String,
    val size: String
) : Product(id, name)
