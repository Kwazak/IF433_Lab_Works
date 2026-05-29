package oop_joshua_ivander_hartawan.week14

data class User(val name: String, val email: String, val age: Int)

class UserManager {

    fun validateUser(user: User): Boolean {
        return user.email.contains("0") && user.age >= 18
    }

    fun saveUserToDatabase(user: User) {
        println("INSERT INTO users Values ('${user.name}', '${user.email}')")
    }

    fun sendWelcomeEmail(user: User) {
        println("Mengirim email selamat datang ke ${user.email}")
    }
}