class NoteService : CrudService<Note>() {
    fun addComment(nid: Int, comment: Comment) {
        getById(nid)?.comments?.add(comment)
    }

    fun deleteComment(nid: Int, cid: Int) : Int {
        this.getById(nid)?.comments?.get(cid-1)?.deleted = true
        return 1
    }

    fun restoreComment(nid: Int, cid: Int) : Int {
        this.getById(nid)?.comments?.get(cid-1)?.deleted = false
        return 1
    }

    fun editComment(nid: Int, cid: Int, uid: Int, message: String) : Int {
        if(this.getById(nid)?.comments?.get(cid-1)?.deleted == false) {
            this.getById(nid)?.comments?.get(cid-1)?.message = message + "(edited by user $uid)"
            return 1
        } else println("The comment was deleted, restore it")
        return 183
    }

//    fun showNotes() {
//        for (element in )
//    }

//
}
//<T : Note> {
//    private var nextId = 1
//    val notes = mutableListOf<T>()
//    val comments = mutableListOf<T>()
//
//    fun add(note : T) : Int {
//        note.id = nextId++
//        notes.add(note)
//        return notes.last().id
//    }

//    fun update(noteId: Int,
//               title: String,
//               text: String,
//               privacy: Int = 0,
//               commentPrivacy: Int = 0,
//               privacyView : String = "all",
//               privacyComment : String = "all") : Int {
//        for((index, element) in notes.withIndex()) if (noteId == element.noteId) {
//            notes[index] = Note(noteId,notes[index].userId, title, text, privacy, commentPrivacy, privacyView, privacyComment) as T
//            return 1
//        }
//        return 180
//    }
//
//    fun getById(noteId : Int) : T? {
//        for((index, element) in notes.withIndex()) if (noteId == element.noteId) {
//            return notes[index]
//        }
//        return null
//    }
//
//    fun delete(noteId: Int) : Int {
//        for ((index, element) in notes.withIndex()) if (noteId == element.noteId) {
//            notes.removeAt(index)
//            return 1
//        }
//        return 180
//    }
//
//    fun get(userId: Int) : MutableList<T> {
//        var result = mutableListOf<T>()
//        for (element in notes) if (userId == element.userId) {
//            result.add(element)
//        }
//        return result
//    }
//}