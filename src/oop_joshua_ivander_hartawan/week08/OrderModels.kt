package oop_joshua_ivander_hartawan.week08

class City(val name: String)
class Address(val city: City?)
class DelivaryDetails(val adress: Address?)
class Order(val delivaryDetails: DelivaryDetails?, val totalPrice: Int?)