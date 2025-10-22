package org.example.lessons.lesson14.homeworks

class Emotion(private var type: String, private var intensity: Int) {

    fun express() {
        println("Испытывается эмоция $type с интенсивностью $intensity.")
    }
}