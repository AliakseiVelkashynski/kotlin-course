package org.example.lessons.lesson14.homeworks

class Concert(val band: String, val placeOfEvent: String, val price: Double, val capacity: Int) {

    private var soldTickets: Int = 20

    fun getInfo() {
        println("Концерт состоится в $placeOfEvent, будет выступать группа $band, стоимость билета $price")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
        }
    }
}

fun main() {
    val concert = Concert("Би-2", "Крокус", 100.5, 10000)
    concert.getInfo()
    concert.buyTicket()
}