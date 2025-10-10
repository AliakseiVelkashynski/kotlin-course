package org.example.lessons.lesson10.homeworks

fun main() {
    mapWithPairs()
}

//Задачи на работу со словарём

//1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
val emptyUnmutableMap: Map<Int, Int> = mapOf(1 to 2, 3 to 4, 5 to 6)

//2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
val doubleFloatMap: Map<Float, Double> = mapOf(
    1.0f to 1.5,
    2.5f to 3.14,
    0.0f to 0.0,
    -2.7f to 10.99,
    5.3f to 7.77
)

//3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
val mutableIntStringMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

//4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
fun addDataToMutableMap() {
    val mutableIntStringMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableIntStringMap[4] = "four"
    println(mutableIntStringMap)
}

//5. Используя словарь из предыдущего задания, извлеките значение, используя ключ.
// Попробуй получить значение с ключом, которого в словаре нет.
fun extractValueFromMutableMap() {
    val mutableIntStringMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableIntStringMap[2]
    println(mutableIntStringMap[2])
    mutableIntStringMap[5]
    println(mutableIntStringMap[5])
}

//6. Удалите определенный элемент из изменяемого словаря по его ключу.
fun deleteValueFromMutableMap() {
    val mutableIntStringMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableIntStringMap.remove(2)
    println(mutableIntStringMap)
}

//7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
fun printKeyValue() {
    val map = mapOf(
        10.0 to 2,
        15.0 to 3,
        8.0 to 0,
        -6.0 to 2,
        7.0 to 1
    )

    for ((key, value) in map) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value)
        }
    }
}

//8. Измените значение для существующего ключа в изменяемом словаре.
fun editDataToMutableMap() {
    val mutableIntStringMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableIntStringMap[1] = "first"
    println(mutableIntStringMap)
}

//9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
fun joinTwoMaps() {
    val map1 = mapOf(
        "a" to "100",
        "b" to "200",
        "c" to "300"
    )

    val map2 = mapOf(
        "d" to "400",
        "e" to "500",
        "f" to "600"
    )

    val joinedMap = mutableMapOf<String, String>()

    for ((key, value) in map1) {
        joinedMap[key] = value
    }

    for ((key, value) in map2) {
        joinedMap[key] = value
    }

    println(joinedMap)
}

//10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
// Добавьте несколько элементов в этот словарь.
fun mapWithLists() {
    val stringToIntListMap = mutableMapOf<String, List<Int>>()

    stringToIntListMap["четные"] = listOf(2, 4, 6, 8, 10)
    stringToIntListMap["нечетные"] = listOf(1, 3, 5, 7, 9)
    println(stringToIntListMap)
}

//11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
// Добавь данные в словарь.
// Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
// Распечатай полученное множество.
fun mapWithSet() {
    val intToStringSetMap = mutableMapOf<Int, MutableSet<String>>()

    intToStringSetMap[1] = mutableSetOf("one", "first")
    intToStringSetMap[2] = mutableSetOf("two", "second")

    val set = intToStringSetMap[1]
    set?.add("uno")

    println(set)
}

//12. Создай словарь, где ключами будут пары чисел.
// Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
fun mapWithPairs() {
    val map = mapOf(
        Pair(1, 2) to "Первая запись",
        Pair(5, 3) to "Вторая запись",
        Pair(4, 5) to "Третья запись",
        Pair(5, 5) to "Четвёртая запись",
        Pair(6, 7) to "Пятая запись"
    )

    for ((key, value) in map) {
        if (key.first == 5 || key.second == 5) {
            println("Key - (${key.first}, ${key.second}) → Value - $value")
        }
    }
}

//Задачи на подбор оптимального типа для словаря
//1. Словарь библиотека: Ключи - автор книги, значения - список книг
val library: Map<String, MutableList<String>> = mutableMapOf()

//2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
val flowers: Map<String, MutableList<String>> = mutableMapOf()

//3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
val championship: Map<String, Set<String>> = mapOf()

//4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
val medicine: Map<String, MutableList<String>> = mutableMapOf()

//5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
val trip: Map<String, MutableMap<String, MutableList<String>>> = mutableMapOf()