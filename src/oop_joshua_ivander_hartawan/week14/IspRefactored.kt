package oop_joshua_ivander_hartawan.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String)
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing security: $doc")
}
