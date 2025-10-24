package org.example.lessons.lesson14.homeworks

class ShelvesAndRackSystem {}

fun main() {
    val rack = Rack(maxShelves = 3)

    val shelf1 = Shelf(capacity = 20)
    val shelf2 = Shelf(capacity = 15)
    val shelf3 = Shelf(capacity = 10)

    rack.addShelf(shelf1)
    rack.addShelf(shelf2)
    rack.addShelf(shelf3)

    rack.addItem("книга")
    rack.addItem("ноутбук")
    rack.addItem("мышка")
    rack.addItem("провод")
    rack.addItem("чайник")

    rack.printContents()

    println("Есть ли 'ноутбук'? ${rack.containsItem("ноутбук")}") // true

    rack.removeItem("мышка")

    val failed = rack.advancedRemoveShelf(1)
    println("Не удалось разместить: $failed")

    rack.printContents()
}