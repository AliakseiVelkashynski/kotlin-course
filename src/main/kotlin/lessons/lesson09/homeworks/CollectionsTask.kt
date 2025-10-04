package org.example.lessons.lesson09.homeworks

fun main() {
    findElementInArray(arrayOfStrings, "при")
}

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





