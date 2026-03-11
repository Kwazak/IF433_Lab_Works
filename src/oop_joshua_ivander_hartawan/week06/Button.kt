package oop_joshua_ivander_hartawan.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Button '$name' has been clicked!")
    }
}