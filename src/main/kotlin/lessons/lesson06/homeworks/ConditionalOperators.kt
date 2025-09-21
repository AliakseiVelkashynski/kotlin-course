package org.example.lessons.lesson06.homeworks

    fun printSeason(month: Int) {
        when (month) {
            1, 2, 12 -> println("Зима")
            in 3..5 -> println("Весна")
            in 6..8 -> println("Лето")
            in 9..11 -> println("Осень")
            else -> println("Некорректный номер месяца")
        }
    }

    fun convertDogAgeToHumanAge(dogAge: Int) {
        val humanAge = when {
            dogAge < 1 -> 0.0
            dogAge <= 2 -> dogAge * 10.5
            else -> 21 + (dogAge - 2) * 4.0
        }
        println("Человеческий возраст $humanAge лет")
    }





    fun main() {
    }