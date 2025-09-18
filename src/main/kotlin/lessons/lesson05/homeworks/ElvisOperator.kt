package org.example.lessons.lesson05.homeworks

    fun main() {

        val initialSoundIntensity = 0.3
        val attenuationCoefficient: Double? = 0.5
        val baseCoefficient = 0.5
        var estimatedSoundIntensity = initialSoundIntensity * (attenuationCoefficient ?: baseCoefficient)

        val deliveryPrice = 20
        val price: Int? = 60
        val standardPrice = 50
        val insurance = 0.5 * (price ?: standardPrice)
        var fullDeliveryPrice = deliveryPrice + insurance

        val pressure: String? = "80"
        val errorMessage = "показания потерялись"
        val finalExams = pressure ?: errorMessage
    }