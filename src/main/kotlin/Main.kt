import ind.glowingstone.MessageConstructor
import java.util.logging.Level

class PluginMain : Plugin {
    var sender: SimpleSender? = null
    var logger: SimpleLogger? = null
    /*
    This is the sample plugin of SciBot.
    Define Main class and Plugin Name in resources/plugin.yml
    use @PlainHandler to create an event handler.
    implements Plugin interface to create a main class.
     */
    override suspend fun start(logger: SimpleLogger, sender: SimpleSender) {
        logger.log("hello,World", Level.INFO)
        this.sender = sender
        this.logger = logger
        sender.plainSend("hello,world", Sender.Type.GROUP,10000)
    }
    @Annonations.PlainHandler(MessageConstructor.Types.PLAIN)
    fun doSomething(event: Events.MajorEvent) {
        println("MyPlugin called")
        for (any in event.msgArr) {
            if(any is Events.PlainMessage) {
                println("recived message: ${any.message} from ${event.sender.uid}")
            }
        }
    }
}