internal class PersistentHashSetMutableIterator<E> :
    PersistentHashSetIterator<E>(), MutableIterator<E> {

    override fun remove() {}
}