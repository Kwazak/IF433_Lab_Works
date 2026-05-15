package oop_joshua_ivander_hartawan.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    // Validasi hardware - cek apakah dispenser tersangkut
    if (isJammed) {
        throw DispenserJamException()
    }

    return availableGram - requestedGram


}