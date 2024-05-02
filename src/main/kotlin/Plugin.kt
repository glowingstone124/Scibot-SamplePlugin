import ind.glowingstone.MessageConstructor
import java.util.logging.Level

interface Plugin {
    suspend fun start(Logger: SimpleLogger, sender: SimpleSender)
}
interface SimpleSender{
    suspend fun plainSend(content: String, operation: Sender.Type, id: Long)
    suspend fun send(msgArrs: MutableList<Any>, operation: Sender.Type, id: Long)
}
class Sender{
    enum class Type {
        PRIVATE,
        GROUP
    }
}