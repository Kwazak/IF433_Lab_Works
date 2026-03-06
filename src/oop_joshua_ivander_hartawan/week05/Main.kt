package oop_joshua_ivander_hartawan.week05

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