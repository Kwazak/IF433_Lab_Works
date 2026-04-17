package oop_joshua_ivander_hartawan.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warrantyMonths = rawJson["warranty"] as? Int ?: 12
                Electronic(id = id, name = name, warrantyMonths = warrantyMonths)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id = id, name = name, size = size)
            }

            else -> null
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Transaction ID: $transactionId")
    }
}
