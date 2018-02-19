package components.home

import components.range.range
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.article
import react.dom.p

class Home : RComponent<RProps, RState>() {

    private val DEFAULT_WEIGHT: Int = 50
    private val DEFAULT_REPS: Int = 5

    override fun RBuilder.render() {
        article {
            p {
                +"Welcome to React with Kotlin"
            }
            range(id = "weightRange", label = "Weight", abbr = " kg. ", min = 0, max = 200, step = 2, default = DEFAULT_WEIGHT, inputHandler = { changeWeight(it) })
            range(id = "repsRange", label = "Reps", min = 1, default = DEFAULT_REPS, inputHandler = { changeReps(it) })
        }
    }

    private fun changeWeight(weight: Int) {
        console.log("Changed weight = " + weight)
    }

    private fun changeReps(reps: Int) {
        console.log("Changed reps = " + reps)
    }
}

fun RBuilder.home() = child(Home::class) {}