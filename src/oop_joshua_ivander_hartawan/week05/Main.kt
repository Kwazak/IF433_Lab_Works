package oop_joshua_ivander_hartawan.week05


// LATIHAN 2
fun main() {
    val myWallet = EWallet("Joshua E-Wallet", 50000.0)
    val myCard = CreditCard("Joshua Credit", 100000.0)

    val listPembayaran: List<PaymentMethod> = listOf(myWallet, myCard)

    println("=== PROSES PEMBAYARAN ===")

    for (metode in listPembayaran) {
        println("Memproses akun: ${metode.accountName}")

        metode.processPayment(75000.0)

        if (metode is EWallet) {
            println("-> Mendeteksi EWallet, melakkan top up otomatis...")

            metode.topUp(50000.0)

            println("-> Mencoba pembayaran ulang setelah top up...")
            metode.processPayment(75000.0)
        }
        println("-----------------------------")

    }
}
// LATIHAN 1
//fun main() {
//    val helper = MathHelper()
//
//    println("Luas Persegi: ${helper.hitungLuas(5)}")            // Memanggil versi 1
//    println("Luas Persegi Panjang: ${helper.hitungLuas(5, 10)}") // Memanggil versi 2
//    println("Luas Lingkaran: ${helper.hitungLuas(7.0)}")         // Memanggil versi 3
//}


/* //TUTORIAL POLIMORFISME
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



