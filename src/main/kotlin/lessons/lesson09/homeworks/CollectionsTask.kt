package org.example.lessons.lesson09.homeworks

//Работа с массивами Array

//1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//2. Создайте пустой массив строк размером 10 элементов.
val emptyArrayOfStrings = arrayOfNulls<String>(10)

//3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
val emptyDoubleArray: Array<Double> = Array(5) { 0.0 }

fun fillEmptyDoubleArray() {
    for (i in emptyDoubleArray.indices) {
        emptyDoubleArray[i] = i * 2.0
    }
}

//4. Создайте массив из 5 элементов типа Int.
// Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
val emptyIntArray: Array<Int> = Array(5) { 0 }

fun fillEmptyIntArray() {
    for (num in emptyIntArray.indices) {
        emptyIntArray[num] = num * 3
    }
}

//5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
val arrayOfNullableStrings: Array<String?> = arrayOf(null, "first", "second")

//6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
fun copyIntArray() {
    val firstIntArray: Array<Int> = arrayOf(1, 2, 3)
    val secondIntArray: Array<Int> = Array(3) { 0 }

    for (i in firstIntArray.indices) {
        secondIntArray[i] = firstIntArray[i]
    }
}

//7. Создайте два массива целых чисел одинаковой длины.
// Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
fun createThirdIntArray() {
    val firstIntArray: Array<Int> = arrayOf(1, 2, 3)
    var secondIntArray: Array<Int> = arrayOf(4, 6, 8)
    var thirdIntArray: Array<Int> = Array(3) { 0 }

    for (i in firstIntArray.indices) {
        thirdIntArray[i] = firstIntArray[i] - secondIntArray[i]
        println(thirdIntArray[i])
    }
}

//8. Создайте массив целых чисел.
// Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1.
// Реши задачу через цикл while.
fun findFiveOrDie() {
    val randomIntArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var index = 0
    var foundIndex = -1

    while (index in randomIntArray.indices) {
        if (randomIntArray[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println(foundIndex)
}

//9. Создайте массив целых чисел.
// Используйте цикл для перебора массива и вывода каждого элемента в консоль.
// Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
fun oddOrEven() {
    val randomIntArray: Array<Int> = arrayOf(1, 2, 4, 8, 3, 9, 4, 5, 6)
    for (index in randomIntArray.indices) {
        if (randomIntArray[index] % 2 == 0) {
            println(randomIntArray[index].toString() + " чётное")
        } else {
            println(randomIntArray[index].toString() + " нечётное")
        }
    }
}

//10. Создай функцию, которая принимает массив строк и строку для поиска.
// Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
// Распечатай найденный элемент.
val arrayOfStrings: Array<String> = arrayOf("привет", "ПРИлагательное", "достойно", "завтра")

fun findElementInArray(array: Array<String>, searchString: String) {
    for (index in array.indices) {
        if (array[index].contains(searchString, true)) {
            println(array[index])
        }
    }
}

//Работа со списками List
//1. Создайте пустой неизменяемый список целых чисел.
val emptyListOfInt: List<Int> = listOf()

//2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
val unmutableListOfStrings: List<String> = listOf("Hello", "World", "Kotlin")

//3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
val mutableListOfInt: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
fun addIntToList() {
    val listOfInt: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    listOfInt.add(6)
    listOfInt.add(7)
    listOfInt.add(8)
}

//5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
fun removeStringFromList() {
    val mutableListOfString: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    mutableListOfString.remove("World")
}

//6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printIntElementsOfList() {
    val listOfInt: List<Int> = listOf(1, 2, 3, 4, 5)
    for (index in listOfInt.indices) {
        println(listOfInt[index])
    }
}

//7. Создайте список строк и получите из него второй элемент, используя его индекс.
fun getSecondElementOfStringList() {
    val listOfStrings: List<String> = listOf("Hello", "World", "Kotlin")
    listOfStrings[1]
}

//8. Имея изменяемый список чисел, измените значение элемента на определенной позиции
// (например, замените элемент с индексом 2 на новое значение).
fun editListOfInt() {
    val listOfInt: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    listOfInt[2] = 6
}

//9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
// Реши задачу с помощью циклов.
fun concatTwoListsOfString() {
    val firstListOfStrings: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    val secondListOfStrings: MutableList<String> = mutableListOf("Bye", "Earth", "Java")
    val thirdListOfStrings: MutableList<String> = mutableListOf()

    for (index in firstListOfStrings.indices) {
        thirdListOfStrings.add(index, firstListOfStrings[index])
        thirdListOfStrings.add(index, secondListOfStrings[index])
    }

    println(thirdListOfStrings)
}

//10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
fun findMinAndMax() {
    val numbers: List<Int> = listOf(10, 3, 8, 1, 15, 7, 12)

    var minValue = numbers[0]
    var maxValue = numbers[0]

    for (i in 1 until numbers.size) {
        val current = numbers[i]
        if (current < minValue) {
            minValue = current
        }
        if (current > maxValue) {
            maxValue = current
        }
    }

    println("Минимальный элемент: $minValue")
    println("Максимальный элемент: $maxValue")
}

//11. Имея список целых чисел, создайте новый список,
// содержащий только четные числа из исходного списка используя цикл.
fun createNewList() {
    val numbers: List<Int> = listOf(10, 3, 8, 1, 15, 7, 12)
    val newList: MutableList<Int> = mutableListOf()

    for (index in numbers.indices) {
        if (numbers[index] % 2 == 0) {
            newList.add(numbers[index])
        }
    }
}


