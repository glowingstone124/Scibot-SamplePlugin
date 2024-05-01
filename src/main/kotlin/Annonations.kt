import ind.glowingstone.MessageConstructor


class Annonations {
    @Retention(AnnotationRetention.RUNTIME)
    @Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
    annotation class PlainHandler(val type: MessageConstructor.Types = MessageConstructor.Types.PLAIN)

    @Retention(AnnotationRetention.RUNTIME)
    @Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
    annotation class PrivateHandler(val type: MessageConstructor.Types = MessageConstructor.Types.PLAIN)
}
