package org.example.lessons.lesson11.homeworks

//Задачи на сигнатуру метода

//1. Не принимает аргументов и не возвращает значения.
fun lightFunction() {}

//2. Принимает два целых числа и возвращает их сумму.
fun getSum(firstInt: Int, secondInt: Int): Int {
    return firstInt + secondInt
}

//3. Принимает строку и ничего не возвращает.
fun stringOnly(text: String) {}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun getAverage(numbers: List<Int>): Double {
    var sum: Double = 0.0
    for (index in numbers.indices) {
        sum += numbers[index]
    }
    return sum / numbers.size
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun nullableString(text: String?): Int? {
    if (text != null) {
        return text.length
    } else {
        return null
    }
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
fun getDouble(): Double {
    return 0.0
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun someFunction(numbers: List<Int?>) {}

//8. Принимает целое число и возвращает nullable строку.
fun intFun(number: Int): String? {
    return "final"
}

//9. Не принимает аргументов и возвращает список nullable строк.
fun noArgs(): List<String?> {
    return listOf()
}

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun getNullableString(text: String?, number: Int?): Boolean? {
    return true
}

//11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

//12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (number in 1..n) {
        println(number)
    }
}

//14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

//15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(strings: List<String?>) {
    for (string in strings) {
        if (string == null) {
            return
        }
        println(string)
    }
}