@file:Suppress("Unused", "NOTHING_TO_INLINE", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "INLINE_EXTERNAL_DECLARATION", "WRONG_BODY_OF_EXTERNAL_DECLARATION", "NESTED_EXTERNAL_DECLARATION", "ClassName")

external interface MyI {
   companion object {
      inline val Value1 get() = MyI("value1")
      inline val Value2 get() = MyI("value2")
   }
}

inline fun MyI(value: String) = value.unsafeCast<MyI>()

fun useMyI(myI: MyI) {
   println("Using MyI = " + myI.unsafeCast<String>())
}

fun main() {
   useMyI(MyI.Value1)
}
