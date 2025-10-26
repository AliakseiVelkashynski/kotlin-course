package org.example.lessons.lesson15.homeworks

abstract class Furniture(
    val material: String,
    val color: String,
    val weight: Double,
) {

    fun showInfo() {
        println("Мебель из $material, цвет: $color, вес: $weight кг")
    }
}

open class Chair(
    material: String,
    color: String,
    weight: Double,
    val maxLoad: Int
) : Furniture(material, color, weight) {

    fun adjustHeight() {
        println("Максимальный вес стула - $maxLoad")
    }
}

class OfficeChair(
    material: String,
    color: String,
    weight: Double,
    maxLoad: Int,
    val hasWheels: Boolean) : Chair(material, color, weight, maxLoad) {

    fun roll() {
        println("Кресло перемещается на колёсиках")
    }
}

open class Table(
    material: String,
    color: String,
    weight: Double,
    val surfaceArea: Double,
    val legCount: Int
) : Furniture(material, color, weight) {

    fun extendSurface() {
        println("Поверхность стола расширена")
    }
}

class Desk (
    material: String,
    color: String,
    weight: Double,
    surfaceArea: Double,
    legCount: Int,
    val hasCablePort: Boolean
) : Table(material, color, weight, surfaceArea, legCount) {

    fun connectCables() {
        println("Все кабели подключены")
    }
}



