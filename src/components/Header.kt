package components

import kroute.routeLink
import react.*
import react.dom.h1
import react.dom.header

interface HeaderProps : RProps {
    var title: String
    var locationPath: String
}

class Header : RComponent<HeaderProps, RState>() {
    override fun RBuilder.render() {
        header {
            if (displayBackLink()) {
                routeLink(to = "/", className = "icon back") {}
            }
            h1 {
                +props.title
            }
            routeLink(to = "/about", className = "icon about") {}
        }
    }

    private fun displayBackLink(): Boolean {
        return props.locationPath != "/"
    }
}

fun RBuilder.header(title: String, locationPath: String) = child(Header::class) {
    attrs.title = title
    attrs.locationPath = locationPath
}