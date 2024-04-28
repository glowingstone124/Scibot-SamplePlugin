import ind.glowingstone.Annonations

class MyPlugin : Plugin {
    override fun start() {
        println("MyPlugin 已启动！")
    }
    @Annonations.PlainHandler
    fun doSomething(event: Events.MajorEvent) {
        println("MyPlugin 正在做一些事情...")
        println("recived: ${event.sender.uid} ${event.sender.nickname}")
    }
}