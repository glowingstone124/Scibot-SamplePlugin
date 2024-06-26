import java.util.logging.Level

interface SimpleLogger{
    fun log(msg: String, level: Level? = Level.INFO)
    fun debug(msg: String)
}