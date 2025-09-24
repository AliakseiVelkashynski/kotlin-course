package org.example.lessons.lesson07.homeworks

fun main() {

    for (number in 1..5) {
        println(number)
    }

    for (number in 1..10) {
        if (number % 2 == 0) {
            println(number)
        }
    }

    for (number in 5 downTo 1) {
        println(number)
    }

    for (number in 10 downTo 1) {
        if (number % 2 == 0) {
            println(number)
        }
    }

    for (number in 1..9 step 2) {
        println(number)
    }

    for (number in 3..20 step 3) {
        println(number)
    }

    val size: Int = 11
    for (number in 3 until size step 2) {
        println(number)
    }

    var counter = 0
    while (++counter <= 5) {
        println(counter * counter)
    }

    var counter = 10
    while (counter in 10 downTo 5) {
        println(counter--)
    }

    var counter = 5
    do {
        println(counter)
        --counter
    } while (counter in 5 downTo 1)

    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)

    for (number in 1..10) {
        if (number == 6) break
        println(number)
    }

    var number: Int = 1
    while (true) {
        println(number)
        number++
        if (number == 10) break
    }

    for (number in 1..10) {
        if (number % 2 == 0) continue
        println(number)
    }

    var number = 1
    while (number <= 10) {
        if (number % 3 == 0) {
            number++
            continue
        }
        println(number)
        number++
    }
}


