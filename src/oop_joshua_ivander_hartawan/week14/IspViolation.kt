package oop_joshua_ivander_hartawan.week14

interface MultifunctionDevice {
    fun print(document: String)
    fun scan(document: String)
    fun fax(document: String)
}

class SimplePrinter : MultifunctionDevice {
    override fun print(doc: String) = println("Printing: $doc")
    override fun scan(document: String) = throw UnsupportedOperationException("No scanner")
    override fun fax(document: String) = throw UnsupportedOperationException("No fax")
}

