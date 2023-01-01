open class CrudService<T : Entry> {
    private var nextId = 1
    val elements = mutableListOf<T>()

    fun add(note : T) : Int {
        note.id = nextId++
        elements.add(note)
        return 1
    }

    fun update(note: T) : Int {
        for((index, element) in elements.withIndex()) if (note.id == element.id) {
            elements[index] = note
            return 1
            }
        return 180
    }

    fun getById(id: Int) : T? {
        for((index, element) in elements.withIndex()) if (id == element.id) {
            return elements[index]
        }
        return null
    }

    fun delete(noteId: Int) : Int {
        for ((index, element) in elements.withIndex()) if (noteId == element.id) {
            elements.removeAt(index)
            return 1
        }
        return 180
    }

    fun get(id: Int) : MutableList<T> {
        var result = mutableListOf<T>()
        for (element in elements) if (id == element.id) {
            result.add(element)
        }
        return result
    }

    fun showAll() {
        for (element in elements) {
            println(element)
        }
    }
}