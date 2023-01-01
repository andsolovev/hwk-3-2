class Comment(
    cid: Int = 0,
    uid: Int,
    var message: String,
    var deleted: Boolean = false
) : Entry(cid, uid) {

    override fun toString(): String {
        if (!this.deleted) return "Comment # $id from User $uid: $message" else return "Comment # $id was deleted"
    }
}
