package org.example.lessons.lesson13.homeworks

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

//11. Используя словарь с настройками тестирования для различных мобильных устройств
// (ключ — модель устройства, значение - строка с настройками),
// получите настройки для конкретной модели или верните настройки по умолчанию.
fun devicesConfig() {
    val config = mapOf(
        "galaxy" to "111",
        "pixel" to "222",
        "iphone" to "333"
    )

    val pixelConfig = config.getOrDefault("pixel", "000")
    println(pixelConfig)
}

//12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки)
// определенный код ошибки.
fun checkErrors() {
    val errorsOfTesting = mapOf(400 to "bar request", 500 to "internal server error", 403 to "unauth")
    val containsKey: Boolean = errorsOfTesting.containsKey(501)
    println(containsKey)
}

//13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов,
// то-есть в ключе содержится требуемая версия.
fun getIdAndStatuses() {
    val idAndStatuses = mapOf("TestID_Version1" to "Passed", "TestID_Version2" to "Failed", "TestID_Version3" to "Skipped")
    val onlyVersion2Tests = idAndStatuses.filter { it.key.contains("version2", true) }
    println(onlyVersion2Tests)
}

//14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.
fun getModulesAndStatuses() {
    val modulesAndStatuses = mapOf("Auth" to "Passed", "Profile" to "Failed", "Payments" to "Skipped")
    val onlyFailedTests = modulesAndStatuses.filter { it.value.equals("failed", true) }
    println(onlyFailedTests)
}

//15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
fun addConfigFromAnotherMap() {
    val config = mutableMapOf(
        "galaxy" to "111",
        "pixel" to "222",
        "iphone" to "333"
    )

    val config2 = mapOf(
        "baseUrl" to "https://test.alfabank.ru",
        "browserType" to "chrome",
        "headless" to "true"
    )

    config.putAll(config2)
    println(config)
}

//16. Объедините два неизменяемых словаря с данными о багах.
fun joinTwoMaps() {
    val idAndStatuses = mapOf("TestID_Version1" to "Passed", "TestID_Version2" to "Failed", "TestID_Version3" to "Skipped")
    val modulesAndStatuses = mapOf("Auth" to "Passed", "Profile" to "Failed", "Payments" to "Skipped")
    val joinedMap = idAndStatuses + modulesAndStatuses
    println(joinedMap)
}

//17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
fun clearMap() {
    val modulesAndStatuses = mutableMapOf("Auth" to "Passed", "Profile" to "Failed", "Payments" to "Skipped")
    modulesAndStatuses.clear()
    println(modulesAndStatuses)
}

//18. Исключите из отчета по автоматизированному тестированию те случаи,
// где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
fun skippedTests() {
    val idAndStatuses = mapOf("TestID_Version1" to "Passed", "TestID_Version2" to "Failed", "TestID_Version3" to "Skipped")
    val filterNotMap = idAndStatuses.filterNot { it.value == "Skipped" }
    println(filterNotMap)
}

//19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
fun createCopyOfConfig() {
    val config = mapOf(
        "baseUrl" to "https://test.alfabank.ru",
        "browserType" to "chrome",
        "headless" to "true"
    )

    val newMap = config - "headless" - "browserType"
    println(newMap)
}

//20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
fun createTestResultReport() {
    val idAndStatuses = mapOf("TestID_Version1" to "Passed", "TestID_Version2" to "Failed", "TestID_Version3" to "Skipped")
    val trr = idAndStatuses.map { "${it.key}: ${it.value}" }
    println(trr)
}