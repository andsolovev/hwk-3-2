import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest {

    @Test
    fun addNote() {
        val service = NoteService()
        val result = service.add(Note(uid = 1, title = "note1", text = "text1"))
        assertTrue(result == 1)
    }

    @Test
    fun getNoteByIdExist() {
        val service = NoteService()
        val note = Note(uid = 1, title = "note1", text = "text1")
        service.add(note)
        val result = note==service.getById(1)
        assertTrue(result)
    }

    @Test
    fun getNoteByIdNotExist() {
        val service = NoteService()
        val note = Note(uid = 1, title = "note1", text = "text1")
        service.add(note)
        val result = note==service.getById(2)
        assertFalse(result)
    }

    @Test
    fun updateNoteExist() {
        val service = NoteService()
        service.add(Note(uid = 1, title = "note1", text = "text1"))
        val result = service.update(Note(nid = 1, uid = 1, title = "note1", text = "text1"))
        assertTrue(result == 1)
    }

    @Test
    fun updateNoteNotExist() {
        val service = NoteService()
        val result = service.update(Note(uid = 1, title = "note1", text = "text1"))

        assertTrue(result == 180)
    }

    @Test
    fun deleteExist(){
        val service = NoteService()
        val note = Note(uid = 1, title = "note1", text = "text1")
        service.add(note)
        val result = service.delete(1)
        assertTrue(result == 1)

    }

    @Test
    fun deleteNotExist() {
        val service = NoteService()
        val result = service.delete(0)

        assertTrue(result == 180)
    }

    @Test
    fun get() {

    }
}