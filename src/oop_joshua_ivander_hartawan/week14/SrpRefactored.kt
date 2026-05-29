package oop_joshua_ivander_hartawan.week14

class UserValidator {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18
}

class UserRepository {
    fun saveUser(user: User) {
        println("saving user ${user.name} to Database")
    }
}

class EmailService {
    fun sendWelcome(user: User) {
        println("Welcome email -> ${user.email}")
    }
}