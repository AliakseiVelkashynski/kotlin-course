package org.example.lessons.lesson14.homeworks

class Emotion(private var type: String, private var intensity: Int) {

    fun express() {
        println("Испытывается эмоция $type с интенсивностью $intensity.")
    }
}

fun main() {
    val emotion = Emotion("печаль", 3)
    emotion.express()
}