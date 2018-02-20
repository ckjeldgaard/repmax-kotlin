package components

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class About : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        article {
            h1 {
                +"About"
            }
            p { +"This app is a calculator developed as a web app for estimating One-repetition maximums for weight training. One rep maximum (or 1RM) is defined as the maximum weight that one can lift for a given exercise (e.g. squats, bench press, etc.)." }
            p { +"The following formulas are currently used in the app:" }
            ul {
                li { a("https://en.wikipedia.org/wiki/One-repetition_maximum#Lombardi") { +"Lombardi" } }
                li { a("https://en.wikipedia.org/wiki/One-repetition_maximum#Epley") { +"Epley" } }
                li { a("https://en.wikipedia.org/wiki/One-repetition_maximum#McGlothin") { +"McGlothin" } }
                li { a("https://en.wikipedia.org/wiki/One-repetition_maximum#Brzycki") { +"Brzycki" } }
                li { a("https://en.wikipedia.org/wiki/One-repetition_maximum#Mayhew") { +"Mayhew" } }
                li { a("https://en.wikipedia.org/wiki/One-repetition_maximum#Wathan") { +"Wathan" } }
            }
            h2 { +"Technical" }
            p { +"The app is written as an experimental web app in the React JavaScript library using Kotlin as programming language." }
        }
    }
}