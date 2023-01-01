fun main() {

    val notes = NoteService()

    notes.add(Note(uid = 1, title = "note1", text = "text1"))
    notes.add(Note(uid = 2, title = "note2", text = "text2"))
    notes.addComment(1, Comment(1, 1, "comment to text1"))
    notes.addComment(2, Comment(2, 2, "comment to text2"))
    println("Notes:")
    notes.showAll()

    println()
    println("Notes (after deleting of the comment):")
    notes.deleteComment(1,1)
    notes.showAll()

    println()
    println("Notes (after restoring of the comment):")
    notes.restoreComment(1,1)
    notes.showAll()

    println()
    println("Notes (after editing of the comment):")
    notes.editComment(1,1,1,"changed text1")
    notes.showAll()



}