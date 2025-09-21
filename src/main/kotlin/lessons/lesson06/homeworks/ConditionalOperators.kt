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

fun printTransportAdvice(distance: Double) {
    val advice = when {
        distance <= 1 -> "пешком"
        distance <= 5 -> "велосипед"
        else -> "автотранспорт"
    }
    println("Для маршрута длиной $distance км рекомендуется: $advice")
}

fun countBonuses(sum: Int) {
    val amountOfBonuses = when {
        sum <= 1000 -> (sum / 100) * 2
        else -> 20 + ((sum - 1000) / 100) * 3
    }
    println("За покупки стоимостью $sum рублей вы получаете следующее количество бонусов: $amountOfBonuses")
}

fun printFileType(extension: String) {

    val fileType = when (extension) {
        "txt", "doc", "docx" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif" -> "Изображение"
        "xls", "xlsx", "csv" -> "Таблица"
        else -> "Неизвестный тип"
    }

    println("Расширение .$extension: $fileType")
}


fun main() {
    printFileType("doc")
}