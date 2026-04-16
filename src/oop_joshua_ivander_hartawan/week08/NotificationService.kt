package oop_joshua_ivander_hartawan.week08

class NotificationService {
    fun sendEmail(emailAdress: String) {
        println("Mengirim email ke $emailAdress")
    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {
            sendEmail(emailAdress = user.email)
        } else {

            println("User ${user.name} tidak memiliki alamat email, tidak dapat mengirim notifikasi.")
        }
    }
}