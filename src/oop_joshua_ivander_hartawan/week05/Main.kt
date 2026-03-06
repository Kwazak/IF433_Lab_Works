package oop_joshua_ivander_hartawan.week05



fun main() {
    val helper = MathHelper()

    println("Luas Persegi: ${helper.hitungLuas(5)}")            // Memanggil versi 1
    println("Luas Persegi Panjang: ${helper.hitungLuas(5, 10)}") // Memanggil versi 2
    println("Luas Lingkaran: ${helper.hitungLuas(7.0)}")         // Memanggil versi 3
}

/*
fun main() {
    val dosen1 = Dosen( nama = "Pak Alex", nidn = "0123456" )
    val admin1 = Admin( nama = "Bu Sari" )

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen dengan NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------")
    }

}
*/



