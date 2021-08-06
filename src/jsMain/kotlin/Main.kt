import androidx.compose.runtime.*
import kotlinx.serialization.json.Json
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    println(Json.encodeToString(Data.serializer(), Data("Hello from kotlinx-serialization")))
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("-")
            }

            Span({style { padding(15.px) }}) {
                Text("$count")
            }

            Button({
                onClick { count += 1 }
            }) {
                Text("+")
            }
        }

        P {
            Text(Json.encodeToString(Data.serializer(), Data("Hello from kotlinx-serialization")))
        }
    }
}
