package org.example.lessons.lesson08.homeworks

fun makeFunky(text: String) {
    var result = text

    result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")

    if (result.startsWith("Я не уверен")) {
        result += ", но моя интуиция говорит об обратном"
    }

    result = result.replace("катастрофа", "интересное событие")

    if (result.endsWith("без проблем")) {
        result = result.replace("без проблем", "с парой интересных вызовов на пути")
    }

    val words = result.split(" ")
    if (words.size == 1) {
        result = "Иногда, $result, но не всегда"
    }

    return println(result)
}

fun getDateAndTime(logInfo: String) {

    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"

    val dateTimePart = log.split("->")[1].trim()

    val (date, time) = dateTimePart.split(" ")

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
            result += " "
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



