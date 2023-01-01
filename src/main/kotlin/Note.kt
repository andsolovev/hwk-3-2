class Note(
    nid: Int = 0,
    uid: Int,
    val title: String,
    val text: String,
    val comments: MutableList<Comment> = mutableListOf(),
    val privacy: Int = 0,
    val commentPrivacy: Int = 0,
    val privacyView : String = "all",
    val privacyComment : String = "all"
) : Entry(nid, uid) {

    override fun toString(): String {
        return "Note # $id by User$uid: '$title' $text (Comments (${comments.size}) ${comments.toString()})"
    }
}