package oop_joshua_ivander_hartawan.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    // Validasi hardware - cek apakah dispenser tersangkut
    if (isJammed) {
        throw DispenserJamException()
    }

    // Validasi stok makanan
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")

    return availableGram - requestedGram

}

fun main() {
    var currentKibbleStock = 50
    println("=== SMART PET FEEDER SYSTEM ===")
    println("Stok kibble awal: $currentKibbleStock gr")
}