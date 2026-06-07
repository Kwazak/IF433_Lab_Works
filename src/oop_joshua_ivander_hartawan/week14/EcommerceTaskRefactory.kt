package oop_joshua_ivander_hartawan.week14

import java.io.File

// Interface untuk strategi penghitungan harga (OCP)
interface PricingStrategy {
    fun calculate(price: Double): Double
}

// Implementasi strategi harga untuk pelanggan reguler
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

// Implementasi strategi harga untuk pelanggan VIP
class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}

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
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy, customerType: String) {
        // Menggunakan strategy pattern untuk menghitung harga (Sesuai OCP)
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        // Mendelegasikan tugas simpan data ke repository (Memenuhi SRP)
        repo.saveOrder(itemName, finalPrice, customerType)

        // Mendelegasikan tugas kirim notifikasi ke notifier service (Memenuhi SRP)
        notifier.sendNotification(itemName)
    }
}