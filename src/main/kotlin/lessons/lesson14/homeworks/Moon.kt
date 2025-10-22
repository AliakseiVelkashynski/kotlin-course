package org.example.lessons.lesson14.homeworks

object Moon {
    val isVisible: Boolean = true
    val phase: String = "New Moon"
    fun showPhase() {
        if (isVisible) {
            println("Луна видна и находится в фазе $phase.")
        } else {
            println("Луна не видна")
        }
    }
}

fun main() {
    Moon.showPhase()
}