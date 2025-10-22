package org.example.lessons.lesson14.homeworks

class Party(private var location: String, private var attendees: Int) {

    fun details() {
        println("Место проведения: $location, количество гостей: $attendees")
    }
}
