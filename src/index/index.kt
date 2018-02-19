package index

import components.repmaxapp.repMaxApp
import kotlinext.js.*
import kroute.hashRouter
import kroute.route
import kroute.router
import kroute.switch
import react.dom.*
import react.history.History
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        hashRouter {
            repMaxApp()
        }

        /* router {
            attrs.history = History.createBrowserHistory()
            switch {
                route("/",  App::class, exact = true)
                //kroute("/mytable",  TableComponent::class, exact = true)
                route("/tabTest",  App::class, exact = true)
            }
        } */
    }
}
