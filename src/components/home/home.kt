package components.home

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class Home : RComponent<RProps, RState>() {

    override fun RBuilder.render() {

    }

}

fun RBuilder.home() = child(Home::class) {}