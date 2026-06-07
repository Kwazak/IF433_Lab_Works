package oop_joshua_ivander_hartawan.week14

import java.io.File

// Interface untuk menangani penyimpanan data (SRP)
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

// Interface untuk menangani notifikasi (SRP)
interface NotificationService {
    fun sendNotification(itemName: String)
}

// Implementasi repository khusus untuk media CSV
class CsvOrderRepository(private val fileName: String = "orders.csv") : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        val file = File(fileName)
        // Menggunakan .bufferedWriter() dan .use untuk memastikan file handling aman (AutoCloseable)
        file.bufferedWriter().use { writer ->
            writer.write("$itemName,$finalPrice,$customerType\n")
        }
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        // Logika penentuan harga (Catatan: Ke depannya ini bisa di-refactor lagi dengan Strategy Pattern untuk OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // Mendelegasikan tugas simpan data ke repository (Memenuhi SRP)
        repo.saveOrder(itemName, finalPrice, customerType)

        // Mendelegasikan tugas kirim notifikasi ke notifier service (Memenuhi SRP)
        notifier.sendNotification(itemName)
    }
}