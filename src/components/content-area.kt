package components

import kroute.route
import kroute.switch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class ContentArea : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
            switch {
                route("/",  Home::class, exact = true)
                route("/about",  About::class, exact = true)
            }
    }

}

fun RBuilder.contentArea() = child(ContentArea::class) {}