import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class Data(val text: String)

fun main() {
    println(Json.encodeToString(Data.serializer(), Data("Hello from kotlinx-serialization")))
//    var count: Int by mutableStateOf(0)
//
//    renderComposable(rootElementId = "root") {
//        Div({ style { padding(25.px) } }) {
//            Button(attrs = {
//                onClick { count -= 1 }
//            }) {
//                Text("-")
//            }
//
//            Span({style { padding(15.px) }}) {
//                Text("$count")
//            }
//
//            Button({
//                onClick { count += 1 }
//            }) {
//                Text("+")
//            }
//        }
//
//        P {
//            Text(Json.encodeToString(Data.serializer(), Data("Hello from kotlinx-serialization")))
//        }
//    }
}
