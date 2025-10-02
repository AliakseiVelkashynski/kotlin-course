package org.example.lessons.lesson08.homeworks

fun makeFunky(text: String) {
    var result = text

    // 1. Замена "невозможно"
    result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")

    // 2. Добавление при начале с "Я не уверен"
    if (result.startsWith("Я не уверен")) {
        result += ", но моя интуиция говорит об обратном"
    }

    // 3. Замена "катастрофа"
    result = result.replace("катастрофа", "интересное событие")

    // 4. Замена окончания "без проблем"
    if (result.endsWith("без проблем")) {
        result = result.replace("без проблем", "с парой интересных вызовов на пути")
    }

    // 5. Односложночные фразы
    val words = result.split(" ")
    if (words.size == 1) {
        result = "Иногда, $result, но не всегда"
    }

    return println(result)
}

fun getDateAndTime(logInfo: String) {

    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"

    // 1. Разделяем строку по "->" и берем вторую часть
    val dateTimePart = log.split("->")[1].trim()

    // 2. Разделяем дату и время по пробелу
    val (date, time) = dateTimePart.split(" ")

    // 3. Выводим результат
    println("Дата: $date")
    println("Время: $time")

}


fun maskCreditCard(number: String) {
    val parts = number.split(" ")
    var result = ""

    for (i in 0 until 4) {

        val maskedPart: String

        if (i < 3) {
            maskedPart = "****"
        } else {
            maskedPart = parts[i]
        }

        result += maskedPart

        if (i < parts.size - 1) {
            result += " " // Добавляем разделитель между частями
        }
    }

    println(result)
}

fun transformEmail(email: String) {

    val transformedEmail = email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")

    println(transformedEmail)
}

fun extractFileName(path: String) {

    val parts = path.split('/')
    println(parts[parts.size - 1])
}

fun createAcronym(phrase: String) {
    var shortCut = ""
    val splitPhrase = phrase.split(" ")

    for (word in splitPhrase) {
        shortCut += word[0]
    }

    println(shortCut.uppercase())
}



