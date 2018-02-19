package components.repmaxapp

import components.contentarea.contentArea
import components.header.header
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

class RepMaxApp : RComponent<RProps, RState>() {

    val TITLE: String = "RepMax"

    override fun RBuilder.render() {
        div {
            header(TITLE, "")
        }
        contentArea()
    }

}

fun RBuilder.repMaxApp() = child(RepMaxApp::class) {}