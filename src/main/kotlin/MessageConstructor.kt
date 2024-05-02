package ind.glowingstone
class MessageConstructor {
    enum class Types {
        PLAIN,
        IMG,
        FACE,
        RECORD,
        VIDEO,
        AT,
        SHARE,
        REPLY
    }
    data class MsgSeg(val type: Types, val msg: String)
}
