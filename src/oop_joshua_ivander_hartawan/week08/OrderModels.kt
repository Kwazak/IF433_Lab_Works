package oop_joshua_ivander_hartawan.week08

class City(val name: String)
class Address(val city: City?)
class DelivaryDetails(val address: Address?)
class Order(val deliveryDetails: DelivaryDetails?, val totalPrice: Int?)