import ind.glowingstone.MessageConstructor
import java.util.logging.Level

class PluginMain : Plugin {
    var sender: SimpleSender? = null
    var logger: SimpleLogger? = null
    /*
    This is the sample plugin of SciBot.
    Define Main class and Plugin Name in resources/plugin.yml
    use @GroupHandler to create an event handler.
    implements Plugin interface to create a main class.
     */
    override suspend fun start() {
        logger?.log("hello,World", Level.INFO)
        this.sender = sender
        this.logger = logger
        sender?.plainSend("hello,world", Sender.Type.GROUP,946085440)
    }
    @Annonations.GroupHandler(MessageConstructor.Types.PLAIN)
    fun doSomething(event: Events.MajorEvent) {
        println("MyPlugin called")
        event.msgArr.forEach { any ->
            if (any is Events.PlainMessage) {
                logger?.log("Received message: ${any.message} from ${event.sender.uid}")
            }
        }
    }
    fun getLogger(logger: SimpleLogger ){
        this.logger = logger
    }
    fun getSender(sender: SimpleSender ){
        this.sender = sender
    }
}