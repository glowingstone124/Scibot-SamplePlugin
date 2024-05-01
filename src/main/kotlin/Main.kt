import java.util.logging.Level

class PluginMain : Plugin {
    /*
    This is the sample plugin of SciBot.
    Define Main class and Plugin Name in resources/plugin.yml
    use @PlainHandler to create an event handler.
    implements Plugin interface to create a main class.
     */
    override fun start(logger: SimpleLogger) {
        logger.log("hello,World", Level.INFO)
    }
    @Annonations.PlainHandler
    fun doSomething(event: Events.MajorEvent) {
        println("MyPlugin 正在做一些事情...")
        println("recived: ${event.sender.uid} ${event.sender.nickname}")
    }
}