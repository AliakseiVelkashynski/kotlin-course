package org.example.lessons.lesson12.homeworks

// Задачи на приведение коллекции к значению
// 1. Проверить, что размер коллекции больше 5 элементов.
fun checkSizeOfCollection() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
    if (numbers.count() > 5) {
        println("Размер коллекции больше 5")
    }
}

//2. Проверить, что коллекция пустая
fun checkEmptyCollection() {
    val numbers: List<Int> = listOf()

    if (numbers.isEmpty()) {
        println("Коллекция пустая")
    } else {
        println("Коллекция содержит элементы")
    }
}

//3. Проверить, что коллекция не пустая
fun checkNotEmptyCollection () {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    if (numbers.isNotEmpty()) {
        println("Коллекция содержит элементы")
    } else {
        println("Коллекция пустая")
    }
}

//4. Взять элемент по индексу или создать значение если индекса не существует
fun getElementOrCreate() {
    val numbers = listOf(-1, 2, -3, 4)
    val newElement = numbers.getOrElse(4) { 567 }
    println(newElement)
}

//5. Собрать коллекцию в строку
fun collectionToString() {
    val numbers = listOf(-1, 2, -3, 4)
    val stringList = numbers.joinToString(separator = " ; ")
    println(stringList)
}

//6. Посчитать сумму всех значений
fun getSum() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
    val sum = numbers.sum()
    println(sum)
}

//7. Посчитать среднее
fun getAverage() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
    val average = numbers.average()
    println(average)
}

//8. Взять максимальное число
fun getMax() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
    val max = numbers.max()
    println(max)
}

//9. Взять минимальное число
fun getMin() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
    val min = numbers.min()
    println(min)
}

//10. Взять первое число или null
fun getFirstOrNull() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
    val firstOrNull = numbers.firstOrNull()
    println(firstOrNull)
}

//11. Проверить что коллекция содержит элемент
fun checkExistingElement() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
    val contains = numbers.contains(9)
    println(contains)
}

//Задачи на обработку коллекций
//12. Отфильтровать коллекцию по диапазону 18-30
fun filterCollectionFirst() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 18, 25, 29, 30, 264)
    val filteredCollection = numbers.filter { it in 18..30 }
    println(filteredCollection)
}

//13. Выбрать числа, которые не делятся на 2 и 3 одновременно
fun filterCollection() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 6, 18, 25, 29, 30, 264)
    val filteredCollection = numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
    println(filteredCollection)
}

//14. Очистить текстовую коллекцию от null элементов
fun filterTextCollection() {
    val numbers = listOf("one", "two", null, "three", null)
    val filteredCollection = numbers.filterNotNull()
    println(filteredCollection)
}

//15. Преобразовать текстовую коллекцию в коллекцию длин слов
fun mapTextToLengthOfWordsCollection() {
    val numbers = listOf("one", "four", "three")
    val mappedCollection = numbers.map { it.length }
    println(mappedCollection)
}

//16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
fun associateCollection() {
    val numbers = listOf("one", "four", "three")
    val associatedCollection = numbers.associate { it.reversed() to it.length}
    println(associatedCollection)
}

//17. Отсортировать список в алфавитном порядке
fun sortListInAlphabetOrder() {
    val numbers = listOf("one", "four", "three")
    val sortedCollection = numbers.sorted()
    println(sortedCollection)
}

//18. Взять первые 3 элемента списка
fun takeSomeElements() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 6, 18, 25, 29, 30, 264)
    val filteredCollection = numbers.take(3)
    println(filteredCollection)
}

//19. Распечатать квадраты элементов списка
fun printSquares() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 6, 18, 25, 29, 30, 264)
    val mappedCollection = numbers.map { println(it * it) }
}

//20. Группировать список по первой букве слов
fun groupByList() {
    val strings = listOf("one", "four", "three", "onion", "five", "tree")
    val groupByCollection = strings.groupBy { it.first() }
    println(groupByCollection)
}

//21. Очистить список от дублей
fun distinctList() {
    val strings = listOf("one", "four", "three", "one", "four", "three")
    val distinctCollection = strings.distinct()
    println(distinctCollection)
}

//22. Отсортировать список по убыванию
fun sortDescending() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 6, 18, 25, 29, 30, 264)
    val sortedCollection = numbers.sortedDescending()
    println(sortedCollection)
}

//23. Взять последние 3 элемента списка
fun getLast() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 6, 18, 25, 29, 30, 264)
    val lastElements = numbers.takeLast(3)
    println(lastElements)
}

//24. Характеристика числовой коллекции
fun describeCollection(numbers: Collection<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.firstOrNull() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.max() < -10 -> "Отрицательная"
        numbers.min() > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

/*
fun main() {
    val emptyList = listOf<Int>()
    println(describeCollection(emptyList)) // "Пусто"

    val shortList = listOf(1, 2, 3, 4)
    println(describeCollection(shortList)) // "Короткая"

    val startsWithZero = listOf(0, 10, 20, 21, 22, 23)
    println(describeCollection(startsWithZero)) // "Стартовая"

    val largeSum = listOf(5000, 3000, 3000, 1, 2, 4)
    println(describeCollection(largeSum)) // "Массивная"

    val balanced = listOf(10, 10, 10, 10, 10, 10)
    println(describeCollection(balanced)) // "Сбалансированная"

    val sticky = listOf(1, 11, 111, 1111, 1111, 1111, 11)
    println(describeCollection(sticky)) // "Клейкая"

    val negative = listOf(-15, -14, -13, -16, -11, -12)
    println(describeCollection(negative)) // "Отрицательная"

    val positive = listOf(1001, 1002, 1003, 1005, 1006, 1007)
    println(describeCollection(positive)) // "Положительная"

    val pi = listOf(1, 2, 3, 14, 15)
    println(describeCollection(pi)) // "Пи***тая"

    val unique = listOf(5, 6, 7, 8, 9, 10)
    println(describeCollection(unique)) // "Уникальная"
}*/

//25. Анализ учебных оценок
fun analyzeGrades() {
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val filteredGrades = grades.filter { it >= 60 }.sorted().take(3)
    println(filteredGrades)
}
