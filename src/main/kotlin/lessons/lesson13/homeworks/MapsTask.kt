package org.example.lessons.lesson13.homeworks

fun main() {
    createCopy()
}

//1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
fun averageTestExecutionTime() {
    val testMap = mapOf("test1" to 2, "test2" to 4, "test3" to 6)
    val average = testMap.values.average()
}

//2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов,
// а значения - строка с метаданными. Выведите список всех тестовых методов.
fun getListOfTestMethods() {
    val testMap = mapOf("test1" to "metadata1", "test2" to "metadata2", "test3" to "metadata3")
    println(testMap.keys)
}

//3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
fun addNewTestToMap() {
    val testMap = mutableMapOf("test1" to 2, "test2" to 4, "test3" to 6)
    testMap["test4"] = 8
    println(testMap)
}

//4. Посчитайте количество успешных тестов в словаре с результатами
// (ключ - название, значение - результат из passed, failed, skipped).
fun countPassedTests() {
    val testMap = mapOf("test1" to "passed", "test2" to "failed", "test3" to "skipped", "test4" to "passed")
    val count = testMap.values.count { it == "passed" }
    println(count)
}

//5. Удалите из изменяемого словаря с баг-трекингом запись о баге,
// который был исправлен (ключ - название, значение - статус исправления).
fun deleteBugInfo() {
    val testMap = mutableMapOf("bug1" to "fixed", "bug2" to "not a bug", "bug3" to "won't fix")
    testMap.values.remove("fixed")
    println(testMap)
}

//6. Для словаря с результатами тестирования веб-страниц
// (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
fun getServerCodes() {
    val testResults = mapOf(
        "https://api.alfabank.ru/health" to 200,
        "https://api.alfabank.ru/users" to 204,
        "https://api.alfabank.ru/auth" to 401,
        "https://api.alfabank.ru/payments" to 503,
        "https://api.alfabank.ru/unknown" to 404
    )

    for ((url, status) in testResults) {
        println("Страница $url — статус: $status.")
    }
}

//7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
fun getSlowServices() {
    val responseTimes = mapOf(
        "auth-service" to 120,
        "payments-service" to 450,
        "profile-service" to 80,
        "notifications-service" to 600,
        "analytics-service" to 300
    )

    val slowServices = responseTimes.filter { it.value > 350 }
    println(slowServices)
}

//8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
fun getEndpointStatus() {
    val testResults = mapOf(
        "/api/v1/auth" to "200 OK",
        "/api/v1/payments" to "201 Created",
        "/api/v1/balance" to "500 Internal Server Error"
    )

    val endpointStatus = testResults.getOrDefault("/api/v1/auth", "не был протестирован")
    println(endpointStatus)
}

//9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация),
// получите значение для "browserType". Ответ не может быть null.
fun getBrowserTypeConfig() {
    val config = mapOf(
        "baseUrl" to "https://test.alfabank.ru",
        "browserType" to "chrome",
        "headless" to "true"
    )

    val browserConfig = config.getOrElse("browserType") { "firefox" }
    println(browserConfig)
}

//10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
fun createCopy() {
    val versions = mapOf(
        "android" to 14,
        "iOS" to 26
    )

    val updatedVersions = versions + ("web" to 111)
    println(updatedVersions)
}

