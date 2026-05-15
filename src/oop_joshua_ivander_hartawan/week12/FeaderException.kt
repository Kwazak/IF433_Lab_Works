package oop_joshua_ivander_hartawan.week12


// Hierarchy Exception menggunakan Sealed Class
sealed class FeederException(msg: String) : Exception(msg)

// Subclass 1: Stok kibble habis/tidak cukup
class FoodEmptyException(requested: Int, available: Int) :
    FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

// Subclass 2: Dispenser tersangkut/macet
class DispenserJamException : FeederException("Wadah dispenser tersangkut/macet!")