package components.home

import components.range.range
import react.*
import react.dom.article

interface RmInputState : RState {
    var weight: Int
    var reps: Int
}

class Home : RComponent<RProps, RmInputState>() {

    private val DEFAULT_WEIGHT: Int = 50
    private val DEFAULT_REPS: Int = 5

    override fun RmInputState.init() {
        this.weight = 50
        this.reps = 5
    }

    override fun RBuilder.render() {
        article {
            range(id = "weightRange", label = "Weight", abbr = " kg. ", min = 0, max = 200, step = 2, default = DEFAULT_WEIGHT, inputHandler = { changeWeight(it) })
            range(id = "repsRange", label = "Reps", min = 1, default = DEFAULT_REPS, inputHandler = { changeReps(it) })
        }
    }

    private fun changeWeight(w: Int) {
        setState {
            weight = w
        }
    }

    private fun changeReps(r: Int) {
        setState {
            reps = r
        }
    }
}

fun RBuilder.home() = child(Home::class) {}