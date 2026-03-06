package oop_joshua_ivander_hartawan.week05

class MathHelper {

    // 1. Menghitung luas persegi (1 parameter Int)
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // 2. Menghitung luas persegi panjang (2 parameter Int)
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // 3. Menghitung luas lingkaran (1 parameter Double)
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}