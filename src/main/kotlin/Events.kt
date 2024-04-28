class Events {
    data class Sender(val uid:Long , val nickname:String, val role:String? = "private")
    data class PicMessage(val url:String)
    data class AtMessage(val target: Long)
    data class PlainMessage(val message: String)
    data class MajorEvent(val sender: Sender, val detail: Any)
}