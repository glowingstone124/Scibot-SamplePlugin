import java.util.logging.Level

class MyPlugin : Plugin {

    override fun start(logger: SimpleLogger) {
        logger.log("hello,World", Level.INFO)
    }
    @Annonations.PlainHandler
    fun doSomething(event: Events.MajorEvent) {
        println("MyPlugin 正在做一些事情...")
        println("recived: ${event.sender.uid} ${event.sender.nickname}")
    }
}