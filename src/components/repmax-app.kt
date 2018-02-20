package components

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.history.History

class RepMaxApp : RComponent<RProps, RState>() {

    val TITLE: String = "RepMax"

    override fun RBuilder.render() {
        div {
            header(TITLE, History.createHashHistory().location.pathname)
        }
        contentArea()
    }

}

fun RBuilder.repMaxApp() = child(RepMaxApp::class) {}