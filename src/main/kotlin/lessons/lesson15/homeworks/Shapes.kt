package org.example.lessons.lesson15.homeworks

abstract class Shapes (val square: Double) {
    fun calculateSquare() {
        println("Расчёт площади фигуры")
    }
}

open class Polygon(square: Double,
              val sides: Int) : Shapes(square) {}

class Circle(square: Double, radius: Double) : Shapes(square) {}

class Triangle(square: Double, sides: Int = 3) : Polygon(square, sides) {}

class Quadrilateral(square: Double, sides: Int = 4) : Polygon(square, sides) {}