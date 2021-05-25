import kotlin.js.JsName

internal open class PersistentHashSetIterator<E> : Iterator<E> {

//    @JsName("_hasNext")
    private var hasNext = false

    override fun hasNext(): Boolean {
        return hasNext
    }

    override fun next(): E {
        error("")
    }
}