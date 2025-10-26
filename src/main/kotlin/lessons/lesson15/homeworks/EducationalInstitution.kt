package org.example.lessons.lesson15.homeworks

abstract class EducationalInstitution(val name: String, val address: String) {
    fun startAcademicYear() {
        println("Учебный год начался")
    }
}

open class School(name: String, address: String, gradeLevels: IntRange) : EducationalInstitution(name, address) {

    fun conductLesson() {
        println("Идёт урок в школе")
    }
}

class HighSchool(name: String, address: String, gradeLevels: IntRange, hasUniform: Boolean) : EducationalInstitution(name, address) {

    fun isEverybodyWearUniform() {
        println("Все носят униформу?")
    }
}

class ElementarySchool(name: String, address: String, gradeLevels: IntRange = 0..3, isKidsSleep: Boolean = true) : EducationalInstitution(name, address) {

    fun letsSleep() {
        println("Всем спать")
    }
}
