package org.example.lessons.lesson14.homeworks

class Rack(private val maxShelves: Int) {
    private val shelves: MutableList<Shelf> = mutableListOf()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves) return false
        if (shelves.contains(shelf)) return false
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        return if (index in shelves.indices) {
            val shelf = shelves.removeAt(index)
            shelf.getItems()
        } else {
            emptyList()
        }
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("Содержимое стеллажа")
        shelves.forEachIndexed { index, shelf ->
            println(
                "Полка $index: " +
                        "вместимость=${shelf.capacity}, " +
                        "предметы=${shelf.getItems()}"
            )
        }
        println("============================")
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val shelfToRemove = shelves.removeAt(index)
        val itemsToRelocate = shelfToRemove.getItems().sortedByDescending { it.length }
        val failedItems = mutableListOf<String>()

        for (item in itemsToRelocate) {
            var placed = false
            for (shelf in shelves) {
                if (shelf.addItem(item)) {
                    placed = true
                    break
                }
            }
            if (!placed) {
                failedItems.add(item)
            }
        }

        return failedItems.toList()
    }
}