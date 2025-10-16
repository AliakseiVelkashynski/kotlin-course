package org.example.lessons.lesson12.homeworks

fun main() {
    checkExistingElement()
}

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
    val stringList = numbers.map { it.toString() + "ok" }
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
