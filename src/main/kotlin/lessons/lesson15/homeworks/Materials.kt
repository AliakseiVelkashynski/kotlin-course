package org.example.lessons.lesson15.homeworks

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }

    protected fun getMaterials(): MutableList<String> = materials
}

class BottomInsertMaterials : Materials() {
    fun addToTheBottom(someString: String) {
        val materials = getMaterials()
        materials.add(0, someString)
    }
}

class InsertMaterialsInSequence : Materials() {
    fun addMaterialsInSequence(newMaterials: List<String>) {
        val materials = getMaterials()
        val result = mutableListOf<String>()
        var i = 0
        var j = 0

        while (i < newMaterials.size || j < materials.size) {
            if (i < newMaterials.size) {
                result.add(newMaterials[i])
                i++
            }
            if (j < materials.size) {
                result.add(materials[j])
                j++
            }
        }

        materials.clear()
        materials.addAll(result)
    }
}

class SortedMaterials : Materials() {
    fun sortMaterials(someString: String) {
        val materials = getMaterials()
        materials.add(someString)
        materials.sort()
    }
}

class KeyValueMaterials : Materials() {
    fun addKeyValuePairs(pairs: Map<String, String>) {
        val materials = getMaterials()
        val keys = pairs.keys.toList().reversed()
        val values = pairs.values.toList()

        val result = mutableListOf<String>()
        result.addAll(keys)
        result.addAll(materials)
        result.addAll(values)

        materials.clear()
        materials.addAll(result)
    }
}