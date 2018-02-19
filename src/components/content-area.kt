package components

import kroute.route
import kroute.router
import kroute.switch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.history.History

class ContentArea : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        router {
            attrs.history = History.createBrowserHistory()
            switch {
                route("/",  Home::class, exact = true)
                // route("/about",  About::class, exact = true)
            }
        }
    }

}

fun RBuilder.contentArea() = child(ContentArea::class) {}