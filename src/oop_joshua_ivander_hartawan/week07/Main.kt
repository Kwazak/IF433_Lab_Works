package oop_joshua_ivander_hartawan.week07

//fun main () {
//    println("=== TEST SINGLETON ===")
//    println("Status: ${DatabaseManager.connectionStatus}")
//    DatabaseManager.connect()
//
//    println("\n=== TEST COMPANION OBJECT ===")
//    val client = NetworkClient.createClient()
//    client.connect()
//}

fun main() {
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Bob", 30)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}